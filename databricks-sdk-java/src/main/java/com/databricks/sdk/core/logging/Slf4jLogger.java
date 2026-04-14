package com.databricks.sdk.core.logging;

import java.util.function.Supplier;

/** Delegates all logging calls to an SLF4J {@code Logger}. */
class Slf4jLogger extends Logger {

  private final org.slf4j.Logger delegate;

  Slf4jLogger(org.slf4j.Logger delegate) {
    this.delegate = delegate;
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
  public void debug(Supplier<String> msgSupplier) {
    if (delegate.isDebugEnabled()) {
      delegate.debug(msgSupplier.get());
    }
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
  public void info(Supplier<String> msgSupplier) {
    if (delegate.isInfoEnabled()) {
      delegate.info(msgSupplier.get());
    }
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
  public void warn(Supplier<String> msgSupplier) {
    if (delegate.isWarnEnabled()) {
      delegate.warn(msgSupplier.get());
    }
  }

  @Override
  public void error(String msg) {
    delegate.error(msg);
  }

  @Override
  public void error(String format, Object... args) {
    delegate.error(format, args);
  }

  @Override
  public void error(Supplier<String> msgSupplier) {
    if (delegate.isErrorEnabled()) {
      delegate.error(msgSupplier.get());
    }
  }
}
