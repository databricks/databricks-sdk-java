// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update a table owner. */
@Generated
public class UpdateTableRequest {
  /** Full name of the table. */
  private String fullName;

  /** */
  @JsonProperty("owner")
  private String owner;

  public UpdateTableRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public UpdateTableRequest setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateTableRequest that = (UpdateTableRequest) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, owner);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateTableRequest.class)
        .add("fullName", fullName)
        .add("owner", owner)
        .toString();
  }
}
