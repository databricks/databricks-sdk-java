// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

/** Delete init script */
public class Delete {
  /** The ID of the global init script. */
  private String scriptId;

  public Delete setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }
}
