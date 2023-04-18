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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CliTokenSource extends RefreshableTokenSource {
  private List<String> cmd;
  private String tokenTypeField;
  private String accessTokenField;
  private String expiryField;
  private Supplier<Map<String,String>> getAllEnv;

  public CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Supplier<Map<String,String>> getAllEnv) {
    super(new CommonsHttpClient(30));

    // TODO: check if it's Windows and set "cmd.exe", "/c" instead of "/bin/sh", "-c"
    // See: https://stackoverflow.com/a/34061154/16597007
    this.cmd = Arrays.asList("/bin/sh", "-c", cmd.stream().collect(Collectors.joining(" ")));
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.getAllEnv = getAllEnv;
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
      processBuilder.environment().putAll(getAllEnv.get());
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
