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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InternalApi
public class CliTokenSource implements TokenSource {
  private static final Logger LOG = LoggerFactory.getLogger(CliTokenSource.class);

  /**
   * Describes a CLI command with an optional warning message emitted when falling through to the
   * next command in the chain.
   */
  static class CliCommand {
    final List<String> cmd;

    // Flags used by this command (e.g. "--force-refresh", "--profile"). Used to distinguish
    // "unknown flag" errors (which trigger fallback) from real auth errors (which propagate).
    final List<String> usedFlags;

    final String fallbackMessage;

    CliCommand(List<String> cmd, List<String> usedFlags, String fallbackMessage) {
      this.cmd = cmd;
      this.usedFlags = usedFlags != null ? usedFlags : Collections.emptyList();
      this.fallbackMessage = fallbackMessage;
    }
  }

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

  private final List<CliCommand> commands;

  // Index of the CLI command known to work, or -1 if not yet resolved. Once
  // resolved it never changes — older CLIs don't gain new flags. We use
  // AtomicInteger instead of synchronization because probing must be retryable
  // on transient errors: concurrent callers may redundantly probe, but all
  // converge to the same index.
  private final AtomicInteger activeCommandIndex = new AtomicInteger(-1);

  private final String tokenTypeField;
  private final String accessTokenField;
  private final String expiryField;
  private final Environment env;

  /** Constructs a single-attempt source. Used by Azure CLI and simple callers. */
  public CliTokenSource(
      List<String> cmd,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Environment env) {
    this(cmd, null, tokenTypeField, accessTokenField, expiryField, env);
  }

  /** Creates a CliTokenSource from a pre-built command chain. */
  static CliTokenSource fromCommands(
      List<CliCommand> commands,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Environment env) {
    return new CliTokenSource(null, commands, tokenTypeField, accessTokenField, expiryField, env);
  }

  private CliTokenSource(
      List<String> cmd,
      List<CliCommand> commands,
      String tokenTypeField,
      String accessTokenField,
      String expiryField,
      Environment env) {
    if (commands != null && !commands.isEmpty()) {
      this.commands =
          commands.stream()
              .map(
                  a ->
                      new CliCommand(
                          OSUtils.get(env).getCliExecutableCommand(a.cmd),
                          a.usedFlags,
                          a.fallbackMessage))
              .collect(Collectors.toList());
    } else if (cmd != null) {
      if (commands != null && commands.isEmpty()) {
        LOG.warn("No CLI commands configured. Falling back to the default command.");
      }
      this.commands =
          Collections.singletonList(
              new CliCommand(
                  OSUtils.get(env).getCliExecutableCommand(cmd), Collections.emptyList(), null));
    } else {
      throw new DatabricksException("cannot get access token: no CLI commands configured");
    }
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.env = env;
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
        // getMessage() carries the clean stderr message for user-facing errors;
        // getFullOutput() includes both streams so isUnknownFlagError can detect
        // "unknown flag:" regardless of which stream the CLI wrote it to.
        throw new CliCommandException("cannot get access token: " + stderr, stdout + "\n" + stderr);
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

  private static String getErrorText(IOException e) {
    return e instanceof CliCommandException
        ? ((CliCommandException) e).getFullOutput()
        : e.getMessage();
  }

  private static boolean isUnknownFlagError(String errorText, List<String> flags) {
    if (errorText == null) {
      return false;
    }
    for (String flag : flags) {
      if (errorText.contains("unknown flag: " + flag)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Token getToken() {
    int idx = activeCommandIndex.get();
    if (idx >= 0) {
      try {
        return execCliCommand(commands.get(idx).cmd);
      } catch (IOException e) {
        throw new DatabricksException(e.getMessage(), e);
      }
    }
    return probeAndExec();
  }

  /**
   * Walks the command list from most-featured to simplest, looking for a CLI command that succeeds.
   * When a command fails with "unknown flag" for one of its {@link CliCommand#usedFlags}, it logs a
   * warning and tries the next. On success, {@link #activeCommandIndex} is stored so future calls
   * skip probing.
   */
  private Token probeAndExec() {
    for (int i = 0; i < commands.size(); i++) {
      CliCommand command = commands.get(i);
      try {
        Token token = execCliCommand(command.cmd);
        activeCommandIndex.set(i);
        return token;
      } catch (IOException e) {
        if (i + 1 < commands.size() && isUnknownFlagError(getErrorText(e), command.usedFlags)) {
          if (command.fallbackMessage != null) {
            LOG.warn(command.fallbackMessage);
          }
          continue;
        }
        throw new DatabricksException(e.getMessage(), e);
      }
    }

    throw new DatabricksException("cannot get access token: all CLI commands failed");
  }
}
