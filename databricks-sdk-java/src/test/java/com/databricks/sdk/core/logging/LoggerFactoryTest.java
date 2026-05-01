package com.databricks.sdk.core.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class LoggerFactoryTest {

  @AfterEach
  void resetFactory() {
    LoggerFactory.setDefault(Slf4jLoggerFactory.INSTANCE);
  }

  @Test
  void defaultFactoryIsSLF4J() {
    Logger logger = LoggerFactory.getLogger(LoggerFactoryTest.class);
    assertNotNull(logger);
    logger.info("LoggerFactory defaultFactoryIsSLF4J test message");
  }

  @Test
  void setDefaultRejectsNull() {
    assertThrows(IllegalArgumentException.class, () -> LoggerFactory.setDefault(null));
  }

  @Test
  void getLoggerByNameWorks() {
    Logger logger = LoggerFactory.getLogger("com.example.Test");
    assertNotNull(logger);
    logger.info("getLoggerByNameWorks test message");
  }
}
