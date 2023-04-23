package com.databricks.sdk.client;

import com.databricks.sdk.client.oauth.RefreshableTokenSource;
import com.databricks.sdk.client.oauth.Token;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CliTokenSource extends RefreshableTokenSource {
  private static final Logger LOG = LoggerFactory.getLogger(CliTokenSource.class);
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
    if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
      this.cmd = Arrays.asList("cmd.exe", "/c", cmd.stream().collect(Collectors.joining(" ")));
    } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
//      this.cmd = Arrays.asList("/bin/bash", "-c", cmd.stream().collect(Collectors.joining(" ")));
      this.cmd = Stream.concat(Arrays.asList("/bin/bash", "-c").stream(), cmd.stream()).collect(Collectors.toList());

    } else {
      this.cmd = cmd;
    }
    this.tokenTypeField = tokenTypeField;
    this.accessTokenField = accessTokenField;
    this.expiryField = expiryField;
    this.getAllEnv = getAllEnv;
  }

  private static LocalDateTime parseExpiry(String expiry) {
    List<String> datePatterns =
        Arrays.asList(
            "yyyy-MM-dd HH:mm:ss.SSSSSS", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX");
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

  // Testing
  private void printEnv() throws IOException, InterruptedException {
    List<String> cmdTest;
    if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
      cmdTest = Arrays.asList("cmd.exe", "/c", "SET");
    } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
      cmdTest = Arrays.asList("/bin/bash", "-c", "cat", "/Users/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata/az");
    } else {
      cmdTest = Arrays.asList("/bin/bash", "-c", "/home/tanmay.rustagi/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata/az");
    }
    ProcessBuilder processBuilder = new ProcessBuilder(cmdTest);
    LOG.info("tanmay -- map values -- " + getAllEnv.get().toString());
    LOG.info("tanmay -- process env values before -- " + processBuilder.environment().toString());
    processBuilder.environment().putAll(getAllEnv.get());
    LOG.info("tanmay -- process env values after -- " + processBuilder.environment().toString());
    Process process = processBuilder.start();
    String stdout = getProcessStream(process.getInputStream());
    String stderr = getProcessStream(process.getErrorStream());
    int exitCode = process.waitFor();
    LOG.info("tanmay -- stdout = " + stdout);
    LOG.info("tanmay -- stderr = " + stderr);
    LOG.info("tanmay -- exitCode = " + exitCode);
  }

  @Override
  protected Token refresh() {
    try {
      printEnv();
      ProcessBuilder processBuilder = new ProcessBuilder(cmd);
      processBuilder.environment().putAll(getAllEnv.get());
      Process process = processBuilder.start();
      String stdout = getProcessStream(process.getInputStream());
      String stderr = getProcessStream(process.getErrorStream());
      int exitCode = process.waitFor();
      if (exitCode != 0) {
        if (stderr.contains("not found")
            || stderr.contains("not recognized as an internal or external command")) {
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
