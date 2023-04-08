// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndpointConfPair {
  /** */
  @JsonProperty("key")
  private String key;

  /** */
  @JsonProperty("value")
  private String value;

  public EndpointConfPair setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public EndpointConfPair setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }
}
