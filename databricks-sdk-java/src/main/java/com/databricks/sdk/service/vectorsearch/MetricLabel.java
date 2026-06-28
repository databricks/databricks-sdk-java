// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Label for a metric */
@Generated
public class MetricLabel {
  /** Label name */
  @JsonProperty("name")
  private String name;

  /** Label value */
  @JsonProperty("value")
  private String value;

  public MetricLabel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public MetricLabel setValue(String value) {
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
    MetricLabel that = (MetricLabel) o;
    return Objects.equals(name, that.name) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    return new ToStringer(MetricLabel.class).add("name", name).add("value", value).toString();
  }
}
