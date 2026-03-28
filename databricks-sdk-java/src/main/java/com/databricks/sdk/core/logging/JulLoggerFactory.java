package com.databricks.sdk.core.logging;

/**
 * A {@link LoggerFactory} backed by {@code java.util.logging}. Always available on any JRE.
 *
 * <p>Use this when SLF4J is not desirable:
 *
 * <pre>{@code
 * LoggerFactory.setDefault(JulLoggerFactory.INSTANCE);
 * }</pre>
 */
public class JulLoggerFactory extends LoggerFactory {

  public static final JulLoggerFactory INSTANCE = new JulLoggerFactory();

  @Override
  protected Logger newInstance(Class<?> type) {
    return JulLogger.create(type);
  }

  @Override
  protected Logger newInstance(String name) {
    return JulLogger.create(name);
  }
}
