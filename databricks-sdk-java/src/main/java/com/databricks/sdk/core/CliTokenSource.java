package com.databricks.sdk.core;

import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.oauth.TokenSource;
import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtils;
import com.databricks.sdk.support.InternalApi;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InternalApi
public class CliTokenSource implements TokenSource {
  private static final Logger LOG = LoggerFactory.getLogger(CliTokenSource.class);

  private List<String> cmd;
  private String tokenTypeField;
  private String accessTokenField;
  private String expiryField;
  private Environment env;
  // fallbackCmd is tried when the primary command fails with "unknown flag: --profile",
  // indicating the CLI is too old to support --profile. Can be removed once support
  // for CLI versions predating --profile is dropped.
  // See: https://github.com/databricks/databricks-sdk-go/pull/1497
  private List<String> fallbackCmd;

  /**
   * Internal exception that carries the clean stderr message but exposes full output for checks.
   */
  static class CliCommandException extends IOException {
    private final String fullOutput;

    CliCommandException(String message, String fullOutput) {
      super(message);
      this.fullOutput = fullOutput;
    }

    String getFullOutput() {
      return fullOutput;
    }
  }

  public CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Environment env) {
    this(cmd, tokenTypeField, accessTokenField, expiryField, env, null);
  }

  public CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Environment env,
      List<String> fallbackCmd) {
    super();
    this.cmd = OSUtils.get(env).getCliExecutableCommand(cmd);
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.env = env;
    this.fallbackCmd =
        fallbackCmd != null ? OSUtils.get(env).getCliExecutableCommand(fallbackCmd) : null;
  }

  /**
   * Parses an expiry time string and returns the corresponding {@link Instant}. The method attempts
   * to parse the input in the following order: 1. RFC 3339/ISO 8601 format with offset (e.g.
   * "2024-03-20T10:30:00Z") - If the timestamp is compliant with ISO 8601 and RFC 3339, the
   * timezone indicator (Z or +/-HH:mm) is used as part of the conversion process to UTC 2. Local
   * date-time format "yyyy-MM-dd HH:mm:ss" (e.g. "2024-03-20 10:30:00") 3. Local date-time format
   * with optional fractional seconds of varying precision (e.g. "2024-03-20 10:30:00.123")
   *
   * <p>For timestamps without a timezone indicator (formats 2 and 3), the system's default time
   * zone is assumed and used for the conversion to UTC.
   *
   * @param expiry expiry time string in one of the supported formats
   * @return the parsed {@link Instant}
   * @throws DateTimeParseException if the input string cannot be parsed in any of the supported
   *     formats
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

  private Token execCliCommand(List<String> cmdToRun) throws IOException {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder(cmdToRun);
      processBuilder.environment().putAll(env.getEnv());
      Process process = processBuilder.start();
      String stdout = getProcessStream(process.getInputStream());
      String stderr = getProcessStream(process.getErrorStream());
      int exitCode = process.waitFor();
      if (exitCode != 0) {
        if (stderr.contains("not found")) {
          throw new DatabricksException(stderr);
        }
        // getMessage() returns the clean stderr-based message; getFullOutput() exposes
        // both streams so the caller can check for "unknown flag: --profile" in either.
        throw new CliCommandException(
            "cannot get access token: " + stderr, stdout + "\n" + stderr);
      }
      JsonNode jsonNode = new ObjectMapper().readTree(stdout);
      String tokenType = jsonNode.get(tokenTypeField).asText();
      String accessToken = jsonNode.get(accessTokenField).asText();
      String expiry = jsonNode.get(expiryField).asText();
      Instant expiresOn = parseExpiry(expiry);
      return new Token(accessToken, tokenType, expiresOn);
    } catch (DatabricksException e) {
      throw e;
    } catch (InterruptedException e) {
      throw new IOException("cannot get access token: " + e.getMessage(), e);
    }
  }

  @Override
  public Token getToken() {
    try {
      return execCliCommand(this.cmd);
    } catch (IOException e) {
      String textToCheck =
          e instanceof CliCommandException
              ? ((CliCommandException) e).getFullOutput()
              : e.getMessage();
      if (fallbackCmd != null
          && textToCheck != null
          && textToCheck.contains("unknown flag: --profile")) {
        LOG.warn(
            "Databricks CLI does not support --profile flag. Falling back to --host. "
                + "Please upgrade your CLI to the latest version.");
        try {
          return execCliCommand(this.fallbackCmd);
        } catch (IOException fallbackException) {
          throw new DatabricksException(fallbackException.getMessage(), fallbackException);
        }
      }
      throw new DatabricksException(e.getMessage(), e);
    }
  }
}
