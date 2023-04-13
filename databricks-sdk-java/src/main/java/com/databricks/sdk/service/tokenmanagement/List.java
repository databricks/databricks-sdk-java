// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List all tokens */
public class List {
  /** User ID of the user that created the token. */
  @QueryParam("created_by_id")
  private String createdById;

  /** Username of the user that created the token. */
  @QueryParam("created_by_username")
  private String createdByUsername;

  public List setCreatedById(String createdById) {
    this.createdById = createdById;
    return this;
  }

  public String getCreatedById() {
    return createdById;
  }

  public List setCreatedByUsername(String createdByUsername) {
    this.createdByUsername = createdByUsername;
    return this;
  }

  public String getCreatedByUsername() {
    return createdByUsername;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    List that = (List) o;
    return Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdById, createdByUsername);
  }

  @Override
  public String toString() {
    return new ToStringer(List.class)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .toString();
  }
}
