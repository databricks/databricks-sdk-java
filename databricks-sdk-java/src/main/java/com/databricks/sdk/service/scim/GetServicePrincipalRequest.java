// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

/** Get service principal details */
public class GetServicePrincipalRequest {
  /** Unique ID for a service principal in the Databricks Account. */
  private String id;

  public GetServicePrincipalRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
