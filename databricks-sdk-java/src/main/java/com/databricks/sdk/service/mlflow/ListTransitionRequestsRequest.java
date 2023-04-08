// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

/** List transition requests */
public class ListTransitionRequestsRequest {
  /** Name of the model. */
  @QueryParam("name")
  private String name;

  /** Version of the model. */
  @QueryParam("version")
  private String version;

  public ListTransitionRequestsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListTransitionRequestsRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }
}
