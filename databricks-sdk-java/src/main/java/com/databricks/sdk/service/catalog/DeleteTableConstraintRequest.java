// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a table constraint */
@Generated
public class DeleteTableConstraintRequest {
  /**
   * If true, try deleting all child constraints of the current constraint. If false, reject this
   * operation if the current constraint has any child constraints.
   */
  @QueryParam("cascade")
  private Boolean cascade;

  /** The name of the constraint to delete. */
  @QueryParam("constraint_name")
  private String constraintName;

  /** Full name of the table referenced by the constraint. */
  private String fullName;

  public DeleteTableConstraintRequest setCascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

  public Boolean getCascade() {
    return cascade;
  }

  public DeleteTableConstraintRequest setConstraintName(String constraintName) {
    this.constraintName = constraintName;
    return this;
  }

  public String getConstraintName() {
    return constraintName;
  }

  public DeleteTableConstraintRequest setFullName(String fullName) {
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
    DeleteTableConstraintRequest that = (DeleteTableConstraintRequest) o;
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
    return new ToStringer(DeleteTableConstraintRequest.class)
        .add("cascade", cascade)
        .add("constraintName", constraintName)
        .add("fullName", fullName)
        .toString();
  }
}
