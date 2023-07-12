// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Param {
  /**
   * Key identifying this param.
   */
  @JsonProperty("key")
  private String key;
  
  /**
   * Value associated with this param.
   */
  @JsonProperty("value")
  private String value;
  
  public Param setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }
  
  public Param setValue(String value) {
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
    Param that = (Param) o;
    return Objects.equals(key, that.key)
    && Objects.equals(value, that.value)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Param.class)
      .add("key", key)
      .add("value", value).toString();
  }
}
