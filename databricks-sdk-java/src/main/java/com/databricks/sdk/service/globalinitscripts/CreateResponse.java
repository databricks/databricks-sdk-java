// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateResponse {
  /** The global init script ID. */
  @JsonProperty("script_id")
  private String scriptId;

  public CreateResponse setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }
}
