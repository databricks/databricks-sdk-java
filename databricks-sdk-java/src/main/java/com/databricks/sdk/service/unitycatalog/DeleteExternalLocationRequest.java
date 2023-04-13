// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteExternalLocationRequest that = (DeleteExternalLocationRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteExternalLocationRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
