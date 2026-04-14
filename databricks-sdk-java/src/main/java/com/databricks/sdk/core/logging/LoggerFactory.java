package com.databricks.sdk.core.logging;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Static entry point for obtaining {@link Logger} instances.
 *
 * <p>By default, logging goes through SLF4J. Users can override the backend programmatically before
 * creating any SDK client:
 *
 * <pre>{@code
 * LoggerFactory.setDefault(JulLoggerFactory.INSTANCE);
 * WorkspaceClient ws = new WorkspaceClient();
 * }</pre>
 *
 * <p>Implement {@link ILoggerFactory} to provide a fully custom logging backend.
 */
public final class LoggerFactory {

  private static final AtomicReference<ILoggerFactory> defaultFactory = new AtomicReference<>();

  private LoggerFactory() {}

  /** Returns a logger for the given class, using the current default factory. */
  public static Logger getLogger(Class<?> type) {
    return getDefault().getLogger(type);
  }

  /** Returns a logger with the given name, using the current default factory. */
  public static Logger getLogger(String name) {
    return getDefault().getLogger(name);
  }

  /**
   * Overrides the logging backend used by the SDK.
   *
   * <p>Must be called before creating any SDK client or calling {@link #getLogger}. Loggers already
   * obtained will not be affected by subsequent calls.
   */
  public static void setDefault(ILoggerFactory factory) {
    if (factory == null) {
      throw new IllegalArgumentException("ILoggerFactory must not be null");
    }
    defaultFactory.set(factory);
  }

  static ILoggerFactory getDefault() {
    ILoggerFactory f = defaultFactory.get();
    if (f != null) {
      return f;
    }
    defaultFactory.compareAndSet(null, Slf4jLoggerFactory.INSTANCE);
    return defaultFactory.get();
  }
}
