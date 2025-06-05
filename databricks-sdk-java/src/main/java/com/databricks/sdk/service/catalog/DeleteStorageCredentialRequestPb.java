// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a credential */
@Generated
class DeleteStorageCredentialRequestPb {
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  @JsonIgnore private String name;

  public DeleteStorageCredentialRequestPb setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteStorageCredentialRequestPb setName(String name) {
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
    DeleteStorageCredentialRequestPb that = (DeleteStorageCredentialRequestPb) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteStorageCredentialRequestPb.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
