// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Delete a share recipient */
public class DeleteRecipientRequest {
  /** Name of the recipient. */
  private String name;

  public DeleteRecipientRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
