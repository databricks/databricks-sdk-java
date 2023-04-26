// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a table constraint
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteTableConstraintRequest {
  /**
   * If true, try deleting all child constraints of the current constraint.
   *
   * <p>If false, reject this operation if the current constraint has any child constraints.
   */
  @QueryParam("cascade")
  private Boolean cascade;

  /** The name of the constraint to delete. */
  @QueryParam("constraint_name")
  private String constraintName;

  /** Full name of the table referenced by the constraint. */
  private String fullName;

  /**
   * <p>Setter for the field <code>cascade</code>.</p>
   *
   * @param cascade a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteTableConstraintRequest} object
   */
  public DeleteTableConstraintRequest setCascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

  /**
   * <p>Getter for the field <code>cascade</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getCascade() {
    return cascade;
  }

  /**
   * <p>Setter for the field <code>constraintName</code>.</p>
   *
   * @param constraintName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteTableConstraintRequest} object
   */
  public DeleteTableConstraintRequest setConstraintName(String constraintName) {
    this.constraintName = constraintName;
    return this;
  }

  /**
   * <p>Getter for the field <code>constraintName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getConstraintName() {
    return constraintName;
  }

  /**
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteTableConstraintRequest} object
   */
  public DeleteTableConstraintRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullName() {
    return fullName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteTableConstraintRequest that = (DeleteTableConstraintRequest) o;
    return Objects.equals(cascade, that.cascade)
        && Objects.equals(constraintName, that.constraintName)
        && Objects.equals(fullName, that.fullName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(cascade, constraintName, fullName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteTableConstraintRequest.class)
        .add("cascade", cascade)
        .add("constraintName", constraintName)
        .add("fullName", fullName)
        .toString();
  }
}
