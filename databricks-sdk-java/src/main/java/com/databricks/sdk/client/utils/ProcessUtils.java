package com.databricks.sdk.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ProcessUtils is an interface that provides utility methods for running processes and capturing
 * their output.
 */
public interface ProcessUtils {

  Logger LOG = LoggerFactory.getLogger(ProcessUtils.class);

  /**
   * Reads the output from an input stream and returns it as a string.
   *
   * @param stream the input stream to read from.
   * @return the output from the input stream as a string.
   * @throws IOException if there is an error reading from the input stream.
   */
  default String getProcessStream(InputStream stream) throws IOException {
    byte[] bytes = IOUtils.toByteArray(stream);
    return new String(bytes);
  }

  /**
   * Runs a process with the specified command and logs its output and exit code.
   *
   * @param cmd the command to run as a list of strings.
   * @throws IOException if there is an error running the process.
   * @throws InterruptedException if the thread is interrupted while waiting for the process to
   *     complete.
   */
  default void runProcess(List<String> cmd) throws IOException, InterruptedException {
    try {
      ProcessBuilder processBuilder = new ProcessBuilder(cmd);
      Process process = processBuilder.start();
      String stdout = getProcessStream(process.getInputStream());
      String stderr = getProcessStream(process.getErrorStream());
      int exitCode = process.waitFor();
      LOG.info("Stdout: " + stdout);
      LOG.info("Stderr: " + stderr);
      LOG.info("Exit Code: " + exitCode);
    } catch (IOException e) {
      LOG.warn("Exception running command: {}", cmd);
      throw e;
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      LOG.warn("Exception running command: {}", cmd);
      throw e;
    }
  }
}
