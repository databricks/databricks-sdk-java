// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Param {
  /** Key identifying this param. */
  @JsonProperty("key")
  private String key;

  /** Value associated with this param. */
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
}
