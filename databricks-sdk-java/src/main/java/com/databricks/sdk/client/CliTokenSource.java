package com.databricks.sdk.client;

import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.oauth.RefreshableTokenSource;
import com.databricks.sdk.client.oauth.Token;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class CliTokenSource extends RefreshableTokenSource {
  private List<String> cmd;
  private String tokenTypeField;
  private String accessTokenField;
  private String expiryField;
  private Function<String, String> getEnv;

  public CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Function<String, String > getEnv) {
    super(new CommonsHttpClient(30));
    this.cmd = cmd;
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.getEnv = getEnv;
  }

  // TODO - different for bricks vs azure
  private static LocalDateTime parseExpiry(String expiry) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
    LocalDateTime dateTime = LocalDateTime.parse(expiry, formatter);
    return dateTime;
  }

  @Override
  public Token refresh() {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder(cmd);
      Map<String, String> env = processBuilder.environment();
      String a = getEnv.toString();
      Process process = processBuilder.start();
      String stdout = new String(process.getInputStream().readAllBytes());
      String stderr = new String(process.getErrorStream().readAllBytes());
      int exitCode = process.waitFor();
      if (exitCode != 0) {
        throw new IOException(stderr);
      }
      JsonNode jsonNode = new ObjectMapper().readTree(stdout);
      String tokenType = jsonNode.get(tokenTypeField).asText();
      String accessToken = jsonNode.get(accessTokenField).asText();
      String expiry = jsonNode.get(expiryField).asText();
      LocalDateTime expiresOn = parseExpiry(expiry);
      return new Token(accessToken, tokenType, expiresOn);
    } catch (InterruptedException | IOException e) {
      throw new DatabricksException("Error executing command: " + e.getMessage(), e);
    }
  }
}
