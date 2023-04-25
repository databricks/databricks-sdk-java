package com.databricks.sdk.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface ProcessUtils {

    Logger LOG = LoggerFactory.getLogger(ProcessUtils.class);

    default String getProcessStream(InputStream stream) throws IOException {
        byte[] bytes = IOUtils.toByteArray(stream);
        return new String(bytes);
    }

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
            LOG.info("Exception running command: {}", cmd);
            throw e;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOG.info("Exception running command: {}", cmd);
            throw e;
        }
    }
}
