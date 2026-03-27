package com.databricks.sdk.core.logging;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Creates and configures {@link Logger} instances for the SDK.
 *
 * <p>By default, logging goes through SLF4J. Users can override the backend programmatically
 * before creating any SDK client:
 *
 * <pre>{@code
 * LoggerFactory.setDefault(myCustomFactory);
 * WorkspaceClient ws = new WorkspaceClient();
 * }</pre>
 *
 * <p>Extend this class to provide a fully custom logging backend.
 */
public abstract class LoggerFactory {

  private static final AtomicReference<LoggerFactory> defaultFactory = new AtomicReference<>();

  /** Returns a logger for the given class, using the current default factory. */
  public static Logger getLogger(Class<?> type) {
    return getDefault().newInstance(type);
  }

  /** Returns a logger with the given name, using the current default factory. */
  public static Logger getLogger(String name) {
    return getDefault().newInstance(name);
  }

  /**
   * Overrides the logging backend used by the SDK.
   *
   * <p>Must be called before creating any SDK client or calling {@link #getLogger}. Loggers
   * already obtained will not be affected by subsequent calls.
   */
  public static void setDefault(LoggerFactory factory) {
    if (factory == null) {
      throw new IllegalArgumentException("LoggerFactory must not be null");
    }
    defaultFactory.set(factory);
  }

  static LoggerFactory getDefault() {
    LoggerFactory f = defaultFactory.get();
    if (f != null) {
      return f;
    }
    defaultFactory.compareAndSet(null, Slf4jLoggerFactory.INSTANCE);
    return defaultFactory.get();
  }

  /** Creates a new logger for the given class. */
  protected abstract Logger newInstance(Class<?> type);

  /** Creates a new logger with the given name. */
  protected abstract Logger newInstance(String name);
}
