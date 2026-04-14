package com.databricks.sdk.core.logging;

/**
 * An {@link ILoggerFactory} backed by {@code java.util.logging}. Always available on any JRE.
 *
 * <p>Use this when SLF4J is not desirable:
 *
 * <pre>{@code
 * LoggerFactory.setDefault(JulLoggerFactory.INSTANCE);
 * }</pre>
 */
public class JulLoggerFactory implements ILoggerFactory {

  public static final JulLoggerFactory INSTANCE = new JulLoggerFactory();

  @Override
  public Logger getLogger(Class<?> type) {
    return new JulLogger(java.util.logging.Logger.getLogger(type.getName()));
  }

  @Override
  public Logger getLogger(String name) {
    return new JulLogger(java.util.logging.Logger.getLogger(name));
  }
}
