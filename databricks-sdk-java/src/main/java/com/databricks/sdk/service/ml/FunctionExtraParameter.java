// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FunctionExtraParameter {
  /** The name of the parameter. */
  @JsonProperty("key")
  private String key;

  /** The value of the parameter. */
  @JsonProperty("value")
  private String value;

  public FunctionExtraParameter setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public FunctionExtraParameter setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionExtraParameter that = (FunctionExtraParameter) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionExtraParameter.class)
        .add("key", key)
        .add("value", value)
        .toString();
  }
}
