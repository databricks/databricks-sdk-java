// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get an external location */
public class GetExternalLocationRequest {
  /** Name of the external location. */
  private String name;

  public GetExternalLocationRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
