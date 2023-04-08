// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public CreateTableConstraint setConstraint(TableConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

  public TableConstraint getConstraint() {
    return constraint;
  }

  public CreateTableConstraint setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  public String getFullNameArg() {
    return fullNameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTableConstraint that = (CreateTableConstraint) o;
    return Objects.equals(constraint, that.constraint)
        && Objects.equals(fullNameArg, that.fullNameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraint, fullNameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTableConstraint.class)
        .add("constraint", constraint)
        .add("fullNameArg", fullNameArg)
        .toString();
  }
}
