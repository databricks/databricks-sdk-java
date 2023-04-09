// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class RegisteredModelTag {
  /** The tag key. */
  @JsonProperty("key")
  private String key;

  /** The tag value. */
  @JsonProperty("value")
  private String value;

  public RegisteredModelTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public RegisteredModelTag setValue(String value) {
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
    RegisteredModelTag that = (RegisteredModelTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelTag.class).add("key", key).add("value", value).toString();
  }
}
