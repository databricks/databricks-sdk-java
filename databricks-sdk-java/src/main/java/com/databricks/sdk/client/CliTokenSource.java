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

public class CliTokenSource extends RefreshableTokenSource {

  public static class Builder {
    private List<String> cmd;
    private String tokenTypeField;
    private String accessTokenField;
    private String expiryField;
    private HttpClient hc = new CommonsHttpClient(30);

    public Builder withCmd(List<String> cmd) {
      this.cmd = cmd;
      return this;
    }

    public Builder withTokenTypeField(String tokenTypeField) {
      this.tokenTypeField = tokenTypeField;
      return this;
    }

    public Builder withAccessTokenField(String accessTokenField) {
      this.accessTokenField = accessTokenField;
      return this;
    }

    public Builder withExpiryField(String expiryField) {
      this.expiryField = expiryField;
      return this;
    }

    public Builder withHttpClient(HttpClient hc) {
      this.hc = hc;
      return this;
    }

    public CliTokenSource build() {
      return new CliTokenSource(cmd, tokenTypeField, accessTokenField, expiryField, hc);
    }
  }

  private List<String> cmd;
  private String tokenTypeField;
  private String accessTokenField;
  private String expiryField;

  private CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      HttpClient hc) {
    super(hc);
    this.cmd = cmd;
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
  }

  private static LocalDateTime parseExpiry(String expiry) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
    LocalDateTime dateTime = LocalDateTime.parse(expiry, formatter);
    return dateTime;
  }

  @Override
  public Token refresh() {
    try {
      Process process = new ProcessBuilder(cmd).start();
      String output = new String(process.getInputStream().readAllBytes());
      int exitCode = process.waitFor();
      if (exitCode != 0) {
        throw new IOException("Command returned non-zero exit code");
      }
      JsonNode jsonNode = new ObjectMapper().readTree(output);
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
