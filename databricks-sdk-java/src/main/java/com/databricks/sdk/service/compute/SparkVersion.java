// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SparkVersion class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.SparkVersion} object
   */
  public SparkVersion setKey(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Getter for the field <code>key</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.SparkVersion} object
   */
  public SparkVersion setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkVersion that = (SparkVersion) o;
    return Objects.equals(key, that.key) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SparkVersion.class).add("key", key).add("name", name).toString();
  }
}
