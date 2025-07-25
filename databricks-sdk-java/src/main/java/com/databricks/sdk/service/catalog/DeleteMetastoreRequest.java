// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteMetastoreRequest {
  /** Force deletion even if the metastore is not empty. Default is false. */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** Unique ID of the metastore. */
  @JsonIgnore private String id;

  public DeleteMetastoreRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteMetastoreRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteMetastoreRequest that = (DeleteMetastoreRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteMetastoreRequest.class)
        .add("force", force)
        .add("id", id)
        .toString();
  }
}
