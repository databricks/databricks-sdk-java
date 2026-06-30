// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SparkVersion {
  /**
   * Spark version key, for example "2.1.x-scala2.11". This is the value which should be provided as
   * the "spark_version" when creating a new cluster. Note that the exact Spark version may change
   * over time for a "wildcard" version (i.e., "2.1.x-scala2.11" is a "wildcard" version) with minor
   * bug fixes.
   */
  @JsonProperty("key")
  private String key;

  /** A descriptive name for this Spark version, for example "Spark 2.1". */
  @JsonProperty("name")
  private String name;

  public SparkVersion setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public SparkVersion setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkVersion that = (SparkVersion) o;
    return Objects.equals(key, that.key) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkVersion.class).add("key", key).add("name", name).toString();
  }
}
