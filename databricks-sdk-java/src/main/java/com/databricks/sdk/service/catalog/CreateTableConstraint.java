// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateTableConstraint class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateTableConstraint {
  /**
   * A table constraint, as defined by *one* of the following fields being set:
   * __primary_key_constraint__, __foreign_key_constraint__, __named_table_constraint__.
   */
  @JsonProperty("constraint")
  private TableConstraint constraint;

  /** The full name of the table referenced by the constraint. */
  @JsonProperty("full_name_arg")
  private String fullNameArg;

  /**
   * <p>Setter for the field <code>constraint</code>.</p>
   *
   * @param constraint a {@link com.databricks.sdk.service.catalog.TableConstraint} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateTableConstraint} object
   */
  public CreateTableConstraint setConstraint(TableConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

  /**
   * <p>Getter for the field <code>constraint</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.TableConstraint} object
   */
  public TableConstraint getConstraint() {
    return constraint;
  }

  /**
   * <p>Setter for the field <code>fullNameArg</code>.</p>
   *
   * @param fullNameArg a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateTableConstraint} object
   */
  public CreateTableConstraint setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullNameArg</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullNameArg() {
    return fullNameArg;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTableConstraint that = (CreateTableConstraint) o;
    return Objects.equals(constraint, that.constraint)
        && Objects.equals(fullNameArg, that.fullNameArg);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(constraint, fullNameArg);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateTableConstraint.class)
        .add("constraint", constraint)
        .add("fullNameArg", fullNameArg)
        .toString();
  }
}
