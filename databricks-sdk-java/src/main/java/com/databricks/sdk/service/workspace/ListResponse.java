// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListResponse {
  /** List of objects. */
  @JsonProperty("objects")
  private java.util.List<ObjectInfo> objects;

  public ListResponse setObjects(java.util.List<ObjectInfo> objects) {
    this.objects = objects;
    return this;
  }

  public java.util.List<ObjectInfo> getObjects() {
    return objects;
  }
}
