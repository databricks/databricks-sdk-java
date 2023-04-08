// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NotebookLibrary {
  /** The absolute path of the notebook. */
  @JsonProperty("path")
  private String path;

  public NotebookLibrary setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
