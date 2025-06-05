// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A table constraint, as defined by *one* of the following fields being set:
 * __primary_key_constraint__, __foreign_key_constraint__, __named_table_constraint__.
 */
@Generated
class TableConstraintPb {
  @JsonProperty("foreign_key_constraint")
  private ForeignKeyConstraint foreignKeyConstraint;

  @JsonProperty("named_table_constraint")
  private NamedTableConstraint namedTableConstraint;

  @JsonProperty("primary_key_constraint")
  private PrimaryKeyConstraint primaryKeyConstraint;

  public TableConstraintPb setForeignKeyConstraint(ForeignKeyConstraint foreignKeyConstraint) {
    this.foreignKeyConstraint = foreignKeyConstraint;
    return this;
  }

  public ForeignKeyConstraint getForeignKeyConstraint() {
    return foreignKeyConstraint;
  }

  public TableConstraintPb setNamedTableConstraint(NamedTableConstraint namedTableConstraint) {
    this.namedTableConstraint = namedTableConstraint;
    return this;
  }

  public NamedTableConstraint getNamedTableConstraint() {
    return namedTableConstraint;
  }

  public TableConstraintPb setPrimaryKeyConstraint(PrimaryKeyConstraint primaryKeyConstraint) {
    this.primaryKeyConstraint = primaryKeyConstraint;
    return this;
  }

  public PrimaryKeyConstraint getPrimaryKeyConstraint() {
    return primaryKeyConstraint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableConstraintPb that = (TableConstraintPb) o;
    return Objects.equals(foreignKeyConstraint, that.foreignKeyConstraint)
        && Objects.equals(namedTableConstraint, that.namedTableConstraint)
        && Objects.equals(primaryKeyConstraint, that.primaryKeyConstraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignKeyConstraint, namedTableConstraint, primaryKeyConstraint);
  }

  @Override
  public String toString() {
    return new ToStringer(TableConstraintPb.class)
        .add("foreignKeyConstraint", foreignKeyConstraint)
        .add("namedTableConstraint", namedTableConstraint)
        .add("primaryKeyConstraint", primaryKeyConstraint)
        .toString();
  }
}
