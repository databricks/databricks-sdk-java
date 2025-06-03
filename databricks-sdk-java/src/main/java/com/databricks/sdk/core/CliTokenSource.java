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
import java.time.ZoneOffset;
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
   * Parses an expiry time string and returns the corresponding {@link Instant}.
   *
   * <p>The expiry time string is verified to always be in UTC. Any time zone or offset information
   * present in the input is ignored, and the value is parsed as a UTC time.
   *
   * <p>The method attempts to parse the input using several common date-time formats, including
   * ISO-8601 and patterns with varying sub-second precision.
   *
   * @param expiry the expiry time string to parse, which must represent a UTC time
   * @return the parsed {@link Instant} representing the expiry time in UTC
   * @throws DateTimeParseException if the input string cannot be parsed as a valid date-time
   */
  static Instant parseExpiry(String expiry) {
    DateTimeParseException lastException = null;
    try {
      return Instant.parse(expiry);
    } catch (DateTimeParseException e) {
      lastException = e;
    }

    String multiplePrecisionPattern =
        "[SSSSSSSSS][SSSSSSSS][SSSSSSS][SSSSSS][SSSSS][SSSS][SSS][SS][S]";
    List<String> datePatterns =
        Arrays.asList(
            "yyyy-MM-dd HH:mm:ss",
            "yyyy-MM-dd HH:mm:ss." + multiplePrecisionPattern,
            "yyyy-MM-dd'T'HH:mm:ss." + multiplePrecisionPattern + "XXX");
    for (String pattern : datePatterns) {
      try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime dateTime = LocalDateTime.parse(expiry, formatter);
        return dateTime.atZone(ZoneOffset.UTC).toInstant();
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
