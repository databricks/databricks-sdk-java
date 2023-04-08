// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.annotation.QueryParam;

/** Delete an external location */
public class DeleteExternalLocationRequest {
  /** Force deletion even if there are dependent external tables or mounts. */
  @QueryParam("force")
  private Boolean force;

  /** Name of the external location. */
  private String name;

  public DeleteExternalLocationRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteExternalLocationRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }
}
