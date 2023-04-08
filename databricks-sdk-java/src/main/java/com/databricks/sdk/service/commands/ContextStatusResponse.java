// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContextStatusResponse {
  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("status")
  private ContextStatus status;

  public ContextStatusResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ContextStatusResponse setStatus(ContextStatus status) {
    this.status = status;
    return this;
  }

  public ContextStatus getStatus() {
    return status;
  }
}
