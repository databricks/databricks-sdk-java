// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PythonOperatorTaskParameter {
  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("value")
  private String value;

  public PythonOperatorTaskParameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PythonOperatorTaskParameter setValue(String value) {
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
    PythonOperatorTaskParameter that = (PythonOperatorTaskParameter) o;
    return Objects.equals(name, that.name) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    return new ToStringer(PythonOperatorTaskParameter.class)
        .add("name", name)
        .add("value", value)
        .toString();
  }
}
