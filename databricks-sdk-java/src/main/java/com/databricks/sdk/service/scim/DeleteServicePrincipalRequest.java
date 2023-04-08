// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

/** Delete a service principal */
public class DeleteServicePrincipalRequest {
  /** Unique ID for a service principal in the Databricks Account. */
  private String id;

  public DeleteServicePrincipalRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
