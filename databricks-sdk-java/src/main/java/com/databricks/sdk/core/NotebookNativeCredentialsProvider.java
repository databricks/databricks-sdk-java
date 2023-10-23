package com.databricks.sdk.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class NotebookNativeCredentialsProvider implements CredentialsProvider {
  private static final Logger LOG = LoggerFactory.getLogger(NotebookNativeCredentialsProvider.class);
  private static final ObjectMapper MAPPER = new ObjectMapper();

  @Override
  public String authType() {
    return "runtime";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (System.getenv("DATABRICKS_RUNTIME_VERSION") == null) {
      return null;
    }

    // DBUtils is not available in the Java SDK, so we have to use reflection to get the token.
    // First, we get the context by calling getContext on the notebook field of dbutils, then we get the apiKey and
    // apiUrl fields from the context.
    try {
      Object dbutils = getDbUtils();
      Object notebook = getField(dbutils, "notebook");
      TokenAndUrl testTokenAndUrl = getTokenAndUrl(notebook);
      if (testTokenAndUrl.url == null) {
        LOG.debug("Workspace URL is not available, skipping runtime auth");
      }
      config.setHost(testTokenAndUrl.url);

      return () -> {
        Map<String, String> headers = new HashMap<>();
        TokenAndUrl tokenAndUrl;
        try {
          tokenAndUrl = getTokenAndUrl(notebook);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | JsonProcessingException e) {
          throw new RuntimeException(e);
        }
        headers.put("Authorization", String.format("Bearer %s", tokenAndUrl.token));
        return headers;
      };
    } catch (Exception e) {
      return null;
    }
  }

  public static Object getDbUtils() {
    try {
      Class<?> dbutilsHolderClass = Class.forName("com.databricks.dbutils_v1.DBUtilsHolder$");
      Object dbutilsHolder = dbutilsHolderClass.getDeclaredField("MODULE$").get(null);
      InheritableThreadLocal<Object> dbutils = getField(dbutilsHolder, "dbutils0");
      return dbutils.get();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> T getField(Object o, String fieldName) {
    Field f;
    try {
      f = o.getClass().getDeclaredField(fieldName);
    } catch (NoSuchFieldException e) {
      throw new RuntimeException(e);
    }
    boolean accessible = f.isAccessible();
    try {
      f.setAccessible(true);
      return (T) f.get(o);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } finally {
      if (!accessible) {
        f.setAccessible(false);
      }
    }
  }

  public static class TokenAndUrl {
    public final String token;
    public final String url;

    public TokenAndUrl(String token, String url) {
      this.token = token;
      this.url = url;
    }
  }

  public static class CommandContext {
    public Map<String, String> attributes;
  }

  public static TokenAndUrl getTokenAndUrl(Object notebook) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, JsonProcessingException {
    Object testCommandContext = notebook.getClass().getDeclaredMethod("getContext").invoke(notebook);
    String json = (String) testCommandContext.getClass().getDeclaredMethod("safeToJson").invoke(testCommandContext);
    CommandContext deserialized = MAPPER.readValue(json, CommandContext.class);
    String token = deserialized.attributes.get("api_token");
    String host = deserialized.attributes.get("api_url");
    return new TokenAndUrl(token, host);
  }
}
