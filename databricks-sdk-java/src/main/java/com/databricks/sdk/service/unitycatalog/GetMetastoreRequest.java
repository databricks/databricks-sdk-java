// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get a metastore */
public class GetMetastoreRequest {
  /** Unique ID of the metastore. */
  private String id;

  public GetMetastoreRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
