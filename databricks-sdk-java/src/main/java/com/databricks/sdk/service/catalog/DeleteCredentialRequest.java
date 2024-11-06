// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a credential */
@Generated
public class DeleteCredentialRequest {
  /** Force deletion even if there are dependent services. */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** Name of the credential. */
  @JsonIgnore private String nameArg;

  public DeleteCredentialRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteCredentialRequest setNameArg(String nameArg) {
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
    DeleteCredentialRequest that = (DeleteCredentialRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(nameArg, that.nameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, nameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCredentialRequest.class)
        .add("force", force)
        .add("nameArg", nameArg)
        .toString();
  }
}
