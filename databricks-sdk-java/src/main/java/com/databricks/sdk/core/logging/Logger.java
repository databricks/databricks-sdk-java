package com.databricks.sdk.core.logging;

/**
 * Logging contract used throughout the SDK.
 *
 * <p>Extend this class to provide a custom logging implementation, then register it via a custom
 * {@link LoggerFactory} subclass and {@link LoggerFactory#setDefault}.
 */
public abstract class Logger {

  public abstract boolean isDebugEnabled();

  public abstract void debug(String msg);

  public abstract void debug(String format, Object... args);

  public abstract void info(String msg);

  public abstract void info(String format, Object... args);

  public abstract void warn(String msg);

  public abstract void warn(String format, Object... args);

  public abstract void error(String msg);

  public abstract void error(String format, Object... args);
}
