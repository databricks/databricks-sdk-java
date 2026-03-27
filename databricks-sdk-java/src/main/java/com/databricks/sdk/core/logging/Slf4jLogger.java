package com.databricks.sdk.core.logging;

/** Delegates all logging calls to an SLF4J {@code Logger}. */
class Slf4jLogger extends Logger {

  private final org.slf4j.Logger delegate;

  private Slf4jLogger(org.slf4j.Logger delegate) {
    this.delegate = delegate;
  }

  static Logger create(Class<?> type) {
    return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(type));
  }

  static Logger create(String name) {
    return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(name));
  }

  @Override
  public boolean isDebugEnabled() {
    return delegate.isDebugEnabled();
  }

  @Override
  public void debug(String msg) {
    delegate.debug(msg);
  }

  @Override
  public void debug(String format, Object... args) {
    delegate.debug(format, args);
  }

  @Override
  public void info(String msg) {
    delegate.info(msg);
  }

  @Override
  public void info(String format, Object... args) {
    delegate.info(format, args);
  }

  @Override
  public void warn(String msg) {
    delegate.warn(msg);
  }

  @Override
  public void warn(String format, Object... args) {
    delegate.warn(format, args);
  }

  @Override
  public void error(String msg) {
    delegate.error(msg);
  }

  @Override
  public void error(String format, Object... args) {
    delegate.error(format, args);
  }
}
