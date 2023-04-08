// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** List shares by Provider */
public class ListSharesRequest {
  /** Name of the provider in which to list shares. */
  private String name;

  public ListSharesRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
