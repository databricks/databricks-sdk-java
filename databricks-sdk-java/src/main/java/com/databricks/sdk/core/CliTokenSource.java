package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.RefreshableTokenSource;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.OSUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;

public class CliTokenSource extends RefreshableTokenSource {
  private List<String> cmd;
  private String tokenTypeField;
  private String accessTokenField;
  private String expiryField;
  private Supplier<Map<String, String>> getAllEnv;

  public CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Supplier<Map<String, String>> getAllEnv) {
    super();
    this.cmd = OSUtils.get().getCliExecutableCommand(cmd);
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.getAllEnv = getAllEnv;
  }

  static LocalDateTime parseExpiry(String expiry) {
    String multiplePrecisionPattern =
        "[SSSSSSSSS][SSSSSSSS][SSSSSSS][SSSSSS][SSSSS][SSSS][SSS][SS][S]";
    List<String> datePatterns =
        Arrays.asList(
            "yyyy-MM-dd HH:mm:ss",
            "yyyy-MM-dd HH:mm:ss." + multiplePrecisionPattern,
            "yyyy-MM-dd'T'HH:mm:ss." + multiplePrecisionPattern + "XXX",
            "yyyy-MM-dd'T'HH:mm:ss." + multiplePrecisionPattern + "'Z'");
    DateTimeParseException lastException = null;
    for (String pattern : datePatterns) {
      try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime dateTime = LocalDateTime.parse(expiry, formatter);
        return dateTime;
      } catch (DateTimeParseException e) {
        lastException = e;
      }
    }
    throw lastException;
  }

  private String getProcessStream(InputStream stream) throws IOException {
    byte[] bytes = IOUtils.toByteArray(stream);
    return new String(bytes);
  }

  @Override
  protected Token refresh() {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder(cmd);
      processBuilder.environment().putAll(getAllEnv.get());
      Process process = processBuilder.start();
      String stdout = getProcessStream(process.getInputStream());
      String stderr = getProcessStream(process.getErrorStream());
      int exitCode = process.waitFor();
      if (exitCode != 0) {
        if (stderr.contains("not found")) {
          throw new DatabricksException(stderr);
        } else {
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
    } catch (InterruptedException | IOException e) {
      throw new DatabricksException("cannot get access token: " + e.getMessage(), e);
    }
  }
}
