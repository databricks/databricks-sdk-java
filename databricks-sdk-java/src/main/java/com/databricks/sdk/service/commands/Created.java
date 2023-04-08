// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Created {
  /** */
  @JsonProperty("id")
  private String id;

  public Created setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
