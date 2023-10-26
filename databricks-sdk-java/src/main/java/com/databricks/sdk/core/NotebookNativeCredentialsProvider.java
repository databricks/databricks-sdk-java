package com.databricks.sdk.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A CredentialsProvider that uses the API token from the command context to authenticate.
 *
 * <p>The token and hostname are read from the command context, which can be retrieved through the
 * dbutils API. As the Java SDK does not depend on DBUtils directly, reflection is used to retrieve
 * the token. This token should be available wherever the DBUtils API is accessible (i.e. in the
 * Spark driver).
 */
public class NotebookNativeCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG =
      LoggerFactory.getLogger(NotebookNativeCredentialsProvider.class);

  @Override
  public String authType() {
    return "runtime";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (System.getenv("DATABRICKS_RUNTIME_VERSION") == null) {
      LOG.debug("DBR not detected, skipping runtime auth");
      return null;
    }

    try {
      // DBUtils is not available in the Java SDK, so we have to use reflection to get the token.
      // First, we get the context by calling getContext on the notebook field of dbutils, then we
      // get the apiKey and apiUrl fields from the context. If this is successful, we set the host
      // on the config.
      Object dbutils = getDbUtils();
      if (dbutils == null) {
        LOG.debug("DBUtils is not available, skipping runtime auth");
        return null;
      }
      Object notebook = getField(dbutils, "notebook");
      TokenAndUrl testTokenAndUrl = getTokenAndUrl(notebook);
      if (testTokenAndUrl.url == null) {
        LOG.debug("Workspace URL is not available, skipping runtime auth");
      }
      config.setHost(testTokenAndUrl.url);

      return () -> {
        Map<String, String> headers = new HashMap<>();
        TokenAndUrl tokenAndUrl = getTokenAndUrl(notebook);
        headers.put("Authorization", String.format("Bearer %s", tokenAndUrl.token));
        return headers;
      };
    } catch (DatabricksException e) {
      LOG.debug("Failed to get token from command context, skipping runtime auth", e);
      return null;
    }
  }

  /** Load the dbutils object initialized by DBR. */
  private static Object getDbUtils() {
    try {
      Class<?> dbutilsHolderClass = Class.forName("com.databricks.dbutils_v1.DBUtilsHolder$");
      Object dbutilsHolder = dbutilsHolderClass.getDeclaredField("MODULE$").get(null);
      InheritableThreadLocal<Object> dbutils = getField(dbutilsHolder, "dbutils0");
      return dbutils.get();
    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
      throw new DatabricksException("failed getting DBUtils", e);
    }
  }

  /** Reflectively get a field by name from an object. */
  private static <T> T getField(Object o, String fieldName) {
    Field f;
    try {
      f = o.getClass().getDeclaredField(fieldName);
    } catch (NoSuchFieldException e) {
      throw new DatabricksException("field " + fieldName + " does not exist", e);
    }
    boolean accessible = f.isAccessible();
    try {
      f.setAccessible(true);
      return (T) f.get(o);
    } catch (IllegalAccessException e) {
      throw new DatabricksException("failed getting field " + fieldName, e);
    } finally {
      if (!accessible) {
        f.setAccessible(false);
      }
    }
  }

  private static class TokenAndUrl {
    public final String token;
    public final String url;

    TokenAndUrl(String token, String url) {
      this.token = token;
      this.url = url;
    }
  }

  /** Fetch the current command context, and read the API token and URL from it. */
  private static TokenAndUrl getTokenAndUrl(Object notebook) {
    try {
      Object testCommandContext =
          notebook.getClass().getDeclaredMethod("getContext").invoke(notebook);
      Object tokenOpt =
          testCommandContext.getClass().getDeclaredMethod("apiToken").invoke(testCommandContext);
      String token = (String) tokenOpt.getClass().getDeclaredMethod("get").invoke(tokenOpt);
      Object hostOpt =
          testCommandContext.getClass().getDeclaredMethod("apiUrl").invoke(testCommandContext);
      String host = (String) hostOpt.getClass().getDeclaredMethod("get").invoke(hostOpt);
      return new TokenAndUrl(token, host);
    } catch (InvocationTargetException
        | NoSuchMethodException
        | IllegalAccessException
        | NoSuchElementException e) {
      throw new DatabricksException("failed to get token and URL from command context", e);
    }
  }
}
