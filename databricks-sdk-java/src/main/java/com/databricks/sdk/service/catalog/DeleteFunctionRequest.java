// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a function */
@Generated
public class DeleteFunctionRequest {
  /** Force deletion even if the function is notempty. */
  @QueryParam("force")
  private Boolean force;

  /**
   * The fully-qualified name of the function (of the form
   * __catalog_name__.__schema_name__.__function__name__).
   */
  private String name;

  public DeleteFunctionRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteFunctionRequest setName(String name) {
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
    DeleteFunctionRequest that = (DeleteFunctionRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFunctionRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
