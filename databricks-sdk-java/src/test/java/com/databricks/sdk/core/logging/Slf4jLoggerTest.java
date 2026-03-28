package com.databricks.sdk.core.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Slf4jLoggerTest {

  @Test
  void createReturnsSlf4jLogger() {
    Logger logger = Slf4jLogger.create(Slf4jLoggerTest.class);
    assertNotNull(logger);
    assertTrue(logger instanceof Slf4jLogger);
  }

  @Test
  void slf4jLoggerOperations() {
    Logger logger = Slf4jLogger.create(Slf4jLoggerTest.class);
    logger.debug("debug");
    logger.debug("debug {}", "arg");
    logger.info("info");
    logger.info("info {}", "arg");
    logger.warn("warn");
    logger.warn("warn {}", "arg");
    logger.error("error");
    logger.error("error {}", "arg");
    logger.error("error {} failed", "op", new RuntimeException("cause"));
    logger.isDebugEnabled();
  }

}
