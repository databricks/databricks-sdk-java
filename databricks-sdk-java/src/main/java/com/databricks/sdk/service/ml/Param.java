// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Param class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Param {
  /** Key identifying this param. */
  @JsonProperty("key")
  private String key;

  /** Value associated with this param. */
  @JsonProperty("value")
  private String value;

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Param} object
   */
  public Param setKey(String key) {
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
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.Param} object
   */
  public Param setValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Param that = (Param) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Param.class).add("key", key).add("value", value).toString();
  }
}
