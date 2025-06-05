// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List all tokens */
@Generated
class ListTokenManagementRequestPb {
  @JsonIgnore
  @QueryParam("created_by_id")
  private Long createdById;

  @JsonIgnore
  @QueryParam("created_by_username")
  private String createdByUsername;

  public ListTokenManagementRequestPb setCreatedById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

  public Long getCreatedById() {
    return createdById;
  }

  public ListTokenManagementRequestPb setCreatedByUsername(String createdByUsername) {
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
    ListTokenManagementRequestPb that = (ListTokenManagementRequestPb) o;
    return Objects.equals(createdById, that.createdById)
        && Objects.equals(createdByUsername, that.createdByUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdById, createdByUsername);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTokenManagementRequestPb.class)
        .add("createdById", createdById)
        .add("createdByUsername", createdByUsername)
        .toString();
  }
}
