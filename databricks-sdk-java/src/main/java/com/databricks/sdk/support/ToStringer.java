package com.databricks.sdk.support;

import java.util.StringJoiner;

/**
 * <p>ToStringer class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ToStringer {
  private final StringJoiner joiner;

  /**
   * <p>Constructor for ToStringer.</p>
   *
   * @param klass a {@link java.lang.Class} object
   */
  public ToStringer(Class<?> klass) {
    joiner = new StringJoiner(", ", klass.getSimpleName() + "[", "]");
  }

  /**
   * <p>add.</p>
   *
   * @param field a {@link java.lang.String} object
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.support.ToStringer} object
   */
  public ToStringer add(String field, String value) {
    if (value == null) {
      return this;
    }
    joiner.add(String.format("%s='%s'", field, value));
    return this;
  }

  /**
   * <p>add.</p>
   *
   * @param field a {@link java.lang.String} object
   * @param value a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.support.ToStringer} object
   */
  public ToStringer add(String field, Object value) {
    if (value == null) {
      return this;
    }
    joiner.add(String.format("%s=%s", field, value));
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return joiner.toString();
  }
}
