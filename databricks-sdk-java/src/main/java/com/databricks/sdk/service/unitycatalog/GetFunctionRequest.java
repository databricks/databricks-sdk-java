// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

/** Get a function */
public class GetFunctionRequest {
  /**
   * The fully-qualified name of the function (of the form
   * __catalog_name__.__schema_name__.__function__name__).
   */
  private String name;

  public GetFunctionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
