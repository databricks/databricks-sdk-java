// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EnvVariable {
  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("value")
  private String value;

  /** */
  @JsonProperty("value_from")
  private String valueFrom;

  public EnvVariable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public EnvVariable setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  public EnvVariable setValueFrom(String valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  public String getValueFrom() {
    return valueFrom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnvVariable that = (EnvVariable) o;
    return Objects.equals(name, that.name)
        && Objects.equals(value, that.value)
        && Objects.equals(valueFrom, that.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, valueFrom);
  }

  @Override
  public String toString() {
    return new ToStringer(EnvVariable.class)
        .add("name", name)
        .add("value", value)
        .add("valueFrom", valueFrom)
        .toString();
  }
}
