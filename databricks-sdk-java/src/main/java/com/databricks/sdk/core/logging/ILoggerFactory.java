package com.databricks.sdk.core.logging;

/**
 * Provides {@link Logger} instances for a specific logging backend.
 *
 * <p>Implement this interface to provide a custom logging backend, then register it via {@link
 * LoggerFactory#setDefault(ILoggerFactory)}.
 */
public interface ILoggerFactory {

  /** Returns a logger for the given class. */
  Logger getLogger(Class<?> type);

  /** Returns a logger with the given name. */
  Logger getLogger(String name);
}
