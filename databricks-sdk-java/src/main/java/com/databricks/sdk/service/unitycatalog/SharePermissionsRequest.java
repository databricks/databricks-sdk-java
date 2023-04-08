// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get recipient share permissions */
public class SharePermissionsRequest {
  /** The name of the Recipient. */
  private String name;

  public SharePermissionsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
