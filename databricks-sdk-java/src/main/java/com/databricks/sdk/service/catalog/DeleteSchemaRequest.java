// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a schema */
@Generated
public class DeleteSchemaRequest {
  /** Force deletion even if the schema is not empty. */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** Full name of the schema. */
  @JsonIgnore private String fullName;

  public DeleteSchemaRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteSchemaRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteSchemaRequest that = (DeleteSchemaRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSchemaRequest.class)
        .add("force", force)
        .add("fullName", fullName)
        .toString();
  }
}
