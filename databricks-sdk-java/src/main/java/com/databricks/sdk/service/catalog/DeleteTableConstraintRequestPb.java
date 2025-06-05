// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a table constraint */
@Generated
class DeleteTableConstraintRequestPb {
  @JsonIgnore
  @QueryParam("cascade")
  private Boolean cascade;

  @JsonIgnore
  @QueryParam("constraint_name")
  private String constraintName;

  @JsonIgnore private String fullName;

  public DeleteTableConstraintRequestPb setCascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

  public Boolean getCascade() {
    return cascade;
  }

  public DeleteTableConstraintRequestPb setConstraintName(String constraintName) {
    this.constraintName = constraintName;
    return this;
  }

  public String getConstraintName() {
    return constraintName;
  }

  public DeleteTableConstraintRequestPb setFullName(String fullName) {
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
    DeleteTableConstraintRequestPb that = (DeleteTableConstraintRequestPb) o;
    return Objects.equals(cascade, that.cascade)
        && Objects.equals(constraintName, that.constraintName)
        && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascade, constraintName, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTableConstraintRequestPb.class)
        .add("cascade", cascade)
        .add("constraintName", constraintName)
        .add("fullName", fullName)
        .toString();
  }
}
