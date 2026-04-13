package com.databricks.sdk.core.logging;

/** An {@link ILoggerFactory} backed by SLF4J. */
public class Slf4jLoggerFactory implements ILoggerFactory {

  public static final Slf4jLoggerFactory INSTANCE = new Slf4jLoggerFactory();

  @Override
  public Logger getLogger(Class<?> type) {
    return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(type));
  }

  @Override
  public Logger getLogger(String name) {
    return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(name));
  }
}
