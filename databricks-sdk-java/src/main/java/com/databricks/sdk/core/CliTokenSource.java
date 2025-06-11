package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.RefreshableTokenSource;
import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class CliTokenSource extends RefreshableTokenSource {
  private List<String> cmd;
  private String tokenTypeField;
  private String accessTokenField;
  private String expiryField;
  private Environment env;

  public CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Environment env) {
    super();
    this.cmd = OSUtils.get(env).getCliExecutableCommand(cmd);
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.env = env;
  }

  /**
   * Parses an expiry string in RFC 3339/ISO 8601 format (with or without offset) and returns the
   * corresponding {@link Instant}. Any specified time zone or offset is converted to UTC.
   *
   * @param expiry expiry time string in RFC 3339/ISO 8601 format
   * @return the parsed {@link Instant}
   * @throws DateTimeParseException if the input string cannot be parsed
   */
  static Instant parseExpiry(String expiry) {
    DateTimeParseException parseException;
    try {
      return OffsetDateTime.parse(expiry).toInstant();
    } catch (DateTimeParseException e) {
      parseException = e;
    }

    String multiplePrecisionPattern =
        "[SSSSSSSSS][SSSSSSSS][SSSSSSS][SSSSSS][SSSSS][SSSS][SSS][SS][S]";
    List<String> datePatterns =
        Arrays.asList("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss." + multiplePrecisionPattern);
    for (String pattern : datePatterns) {
      try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime dateTime = LocalDateTime.parse(expiry, formatter);
        return dateTime.atZone(ZoneId.systemDefault()).toInstant();
      } catch (DateTimeParseException e) {
        parseException.addSuppressed(e);
      }
    }

    throw parseException;
  }

  private String getProcessStream(InputStream stream) throws IOException {
    byte[] bytes = IOUtils.toByteArray(stream);
    return new String(bytes);
  }

  @Override
  protected Token refresh() {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder(cmd);
      processBuilder.environment().putAll(env.getEnv());
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
      Instant expiresOn = parseExpiry(expiry);
      return new Token(accessToken, tokenType, expiresOn);
    } catch (DatabricksException e) {
      throw e;
    } catch (InterruptedException | IOException e) {
      throw new DatabricksException("cannot get access token: " + e.getMessage(), e);
    }
  }
}
