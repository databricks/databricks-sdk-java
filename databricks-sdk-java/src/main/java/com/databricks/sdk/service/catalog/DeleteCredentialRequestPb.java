// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a credential */
@Generated
class DeleteCredentialRequestPb {
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  @JsonIgnore private String nameArg;

  public DeleteCredentialRequestPb setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteCredentialRequestPb setNameArg(String nameArg) {
    this.nameArg = nameArg;
    return this;
  }

  public String getNameArg() {
    return nameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCredentialRequestPb that = (DeleteCredentialRequestPb) o;
    return Objects.equals(force, that.force) && Objects.equals(nameArg, that.nameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, nameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCredentialRequestPb.class)
        .add("force", force)
        .add("nameArg", nameArg)
        .toString();
  }
}
