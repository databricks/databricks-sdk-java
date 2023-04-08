// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

/** Get model */
public class GetMLflowDatabrickRequest {
  /** Name of the model. */
  @QueryParam("name")
  private String name;

  public GetMLflowDatabrickRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
