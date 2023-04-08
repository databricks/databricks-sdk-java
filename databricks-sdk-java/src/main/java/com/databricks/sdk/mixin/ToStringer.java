package com.databricks.sdk.mixin;

import java.util.StringJoiner;

public class ToStringer {
  private final StringJoiner joiner;

  public ToStringer(Class<?> klass) {
    joiner = new StringJoiner(", ", klass.getSimpleName() + "[", "]");
  }

  public ToStringer add(String field, String value) {
    if (value == null) {
      return this;
    }
    joiner.add(String.format("%s='%s'", field, value));
    return this;
  }

  public ToStringer add(String field, Object value) {
    if (value == null) {
      return this;
    }
    joiner.add(String.format("%s=%s", field, value));
    return this;
  }

  @Override
  public String toString() {
    return joiner.toString();
  }
}
