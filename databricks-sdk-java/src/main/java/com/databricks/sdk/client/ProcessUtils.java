package com.databricks.sdk.client;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ProcessUtils {
    private static final Logger LOG = LoggerFactory.getLogger(ProcessUtils.class);
    static String getProcessStream(InputStream stream) throws IOException {
        byte[] bytes = IOUtils.toByteArray(stream);
        return new String(bytes);
    }

    static void runProcess(List<String> cmd) throws IOException, InterruptedException {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(cmd);
            Process process = processBuilder.start();
            String stdout = ProcessUtils.getProcessStream(process.getInputStream());
            String stderr = ProcessUtils.getProcessStream(process.getErrorStream());
            int exitCode = process.waitFor();
            LOG.info("Stdout: " + stdout);
            LOG.info("Stderr: " + stderr);
            LOG.info("Exit Code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            LOG.info("Failed to run the command: {} - {}", cmd, e.getMessage());
            throw e;
        }
    }
}
