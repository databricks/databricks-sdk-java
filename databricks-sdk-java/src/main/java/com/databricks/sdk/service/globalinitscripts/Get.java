// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

/** Get an init script */
public class Get {
  /** The ID of the global init script. */
  private String scriptId;

  public Get setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }
}
