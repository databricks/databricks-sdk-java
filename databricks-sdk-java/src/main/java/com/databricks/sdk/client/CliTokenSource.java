package com.databricks.sdk.client;

import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.oauth.RefreshableTokenSource;
import com.databricks.sdk.client.oauth.Token;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
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
    if(System.getProperty("os.name").toLowerCase().startsWith("win")) {
      this.cmd = Arrays.asList("cmd.exe", "/c", cmd.stream().collect(Collectors.joining(" ")));
    } else {
      this.cmd = Arrays.asList("/bin/sh", "-c", cmd.stream().collect(Collectors.joining(" ")));
    }
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.getAllEnv = getAllEnv;
  }

  // tanmayTODO - different for bricks vs azure
  private static LocalDateTime parseExpiry(String expiry) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime dateTime = LocalDateTime.parse(expiry, formatter);
    return dateTime;
  }

  @Override
  public Token refresh() {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder(cmd);
      processBuilder.environment().putAll(getAllEnv.get());
      Process process = processBuilder.start();
      String stdout = new String(process.getInputStream().readAllBytes());  // readAllBytes -- set language level to 9
      String stderr = new String(process.getErrorStream().readAllBytes());
      int exitCode = process.waitFor();
      if (exitCode != 0) {
        if (stderr.contains("command not found")) {
          // Log file not found
          throw new DatabricksException(stderr);
        } else{
          throw new IOException(stderr);
        }
      }
      JsonNode jsonNode = new ObjectMapper().readTree(stdout);
      String tokenType = jsonNode.get(tokenTypeField).asText();
      String accessToken = jsonNode.get(accessTokenField).asText();
      String expiry = jsonNode.get(expiryField).asText();
      LocalDateTime expiresOn = parseExpiry(expiry);
      return new Token(accessToken, tokenType, expiresOn);
    } catch (DatabricksException e) {
      throw e;
    }
    catch (InterruptedException | IOException e) {
      throw new DatabricksException("cannot get access token: " + e.getMessage(), e);
    }
  }
}
