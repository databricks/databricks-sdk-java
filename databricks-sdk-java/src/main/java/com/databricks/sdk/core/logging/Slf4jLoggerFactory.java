package com.databricks.sdk.core.logging;

/** A {@link LoggerFactory} backed by SLF4J. This is the default. */
public class Slf4jLoggerFactory extends LoggerFactory {

  public static final Slf4jLoggerFactory INSTANCE = new Slf4jLoggerFactory();

  @Override
  protected Logger newInstance(Class<?> type) {
    return Slf4jLogger.create(type);
  }

  @Override
  protected Logger newInstance(String name) {
    return Slf4jLogger.create(name);
  }
}
