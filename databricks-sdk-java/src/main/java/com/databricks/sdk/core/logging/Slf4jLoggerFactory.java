package com.databricks.sdk.core.logging;

/** A {@link LoggerFactory} backed by SLF4J. */
public class Slf4jLoggerFactory extends LoggerFactory {

  public static final Slf4jLoggerFactory INSTANCE = new Slf4jLoggerFactory();

  @Override
  protected Logger createLogger(Class<?> type) {
    return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(type));
  }

  @Override
  protected Logger createLogger(String name) {
    return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(name));
  }
}
