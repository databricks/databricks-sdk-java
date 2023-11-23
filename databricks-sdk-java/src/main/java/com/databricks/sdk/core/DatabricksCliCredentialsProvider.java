package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.Token;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import com.databricks.sdk.core.utils.OSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabricksCliCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(DatabricksCliCredentialsProvider.class);

  public static final String DATABRICKS_CLI = "databricks-cli";

  @Override
  public String authType() {
    return DATABRICKS_CLI;
  }

  private CliTokenSource getDatabricksCliTokenSource(DatabricksConfig config) {
    String cliPath = config.getDatabricksCliPath();
    if (cliPath == null) {
      cliPath = OSUtils.get().getDatabricksCliFileName();
    }
    // If the path is unqualified, look it up in PATH.
    if (!cliPath.contains("/")) {
      cliPath = findExecutable(cliPath);
    }
    if (cliPath == null) {
      LOG.debug("Databricks CLI could not be found");
      return null;
    }
    List<String> cmd =
        new ArrayList<>(Arrays.asList(cliPath, "auth", "token", "--host", config.getHost()));
    if (config.isAccountClient()) {
      cmd.add("--account-id");
      cmd.add(config.getAccountId());
    }
    return new CliTokenSource(cmd, "token_type", "access_token", "expiry", config::getAllEnv);
  }

  private static String findExecutable(String name) {
    String pathVal = System.getenv("PATH");
    StringTokenizer stringTokenizer = new StringTokenizer(pathVal, File.pathSeparator);
    while (stringTokenizer.hasMoreTokens()) {
      Path path = Paths.get(stringTokenizer.nextToken(), name).toAbsolutePath().normalize();
      if (!Files.isRegularFile(path)) {
        continue;
      }
      long size;
      try {
        size = Files.size(path);
      } catch (IOException e) {
        LOG.warn("Unable to get size of databricks cli: " + e.getMessage());
        return null;
      }
      if (size < 1024 * 1024) {
        LOG.info("Databricks CLI version <0.100.0 detected");
        return null;
      }
      return path.toString();
    }
    LOG.debug("Most likely the databricks CLI is not installed");
    return null;
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    String host = config.getHost();
    if (host == null || !config.isAws()) {
      return null;
    }

    try {
      CliTokenSource tokenSource = getDatabricksCliTokenSource(config);
      if (tokenSource == null) {
        return null;
      }
      tokenSource.getToken(); // We need this for checking if databricks CLI is installed.
      return () -> {
        Token token = tokenSource.getToken();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
        return headers;
      };
    } catch (DatabricksException e) {
      String stderr = e.getMessage();
      if (stderr.contains("not found")) {
        LOG.warn("Most likely databricks CLI is not installed");
        return null;
      }
      if (stderr.contains("databricks OAuth is not")) {
        LOG.info("OAuth not configured or not available");
        return null;
      }
      throw e;
    }
  }
}
