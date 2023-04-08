// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Create {
  /** The flag that specifies whether to overwrite existing file/files. */
  @JsonProperty("overwrite")
  private Boolean overwrite;

  /** The path of the new file. The path should be the absolute DBFS path. */
  @JsonProperty("path")
  private String path;

  public Create setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  public Create setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }
}
