// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

/** Delete a serving endpoint */
public class DeleteServingEndpointRequest {
  /** The name of the serving endpoint. This field is required. */
  private String name;

  public DeleteServingEndpointRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
