// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteProjectRequest {
  /** The full resource path of the project to delete. Format: projects/{project_id} */
  @JsonIgnore private String name;

  /**
   * If true, permanently deletes the project (hard delete). If false or unset, performs a soft
   * delete.
   */
  @JsonIgnore
  @QueryParam("purge")
  private Boolean purge;

  public DeleteProjectRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteProjectRequest setPurge(Boolean purge) {
    this.purge = purge;
    return this;
  }

  public Boolean getPurge() {
    return purge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteProjectRequest that = (DeleteProjectRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(purge, that.purge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, purge);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteProjectRequest.class)
        .add("name", name)
        .add("purge", purge)
        .toString();
  }
}
