// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A table constraint, as defined by *one* of the following fields being set:
 * __primary_key_constraint__, __foreign_key_constraint__, __named_table_constraint__.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TableConstraint {
  /** */
  @JsonProperty("foreign_key_constraint")
  private ForeignKeyConstraint foreignKeyConstraint;

  /** */
  @JsonProperty("named_table_constraint")
  private NamedTableConstraint namedTableConstraint;

  /** */
  @JsonProperty("primary_key_constraint")
  private PrimaryKeyConstraint primaryKeyConstraint;

  /**
   * <p>Setter for the field <code>foreignKeyConstraint</code>.</p>
   *
   * @param foreignKeyConstraint a {@link com.databricks.sdk.service.catalog.ForeignKeyConstraint} object
   * @return a {@link com.databricks.sdk.service.catalog.TableConstraint} object
   */
  public TableConstraint setForeignKeyConstraint(ForeignKeyConstraint foreignKeyConstraint) {
    this.foreignKeyConstraint = foreignKeyConstraint;
    return this;
  }

  /**
   * <p>Getter for the field <code>foreignKeyConstraint</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.ForeignKeyConstraint} object
   */
  public ForeignKeyConstraint getForeignKeyConstraint() {
    return foreignKeyConstraint;
  }

  /**
   * <p>Setter for the field <code>namedTableConstraint</code>.</p>
   *
   * @param namedTableConstraint a {@link com.databricks.sdk.service.catalog.NamedTableConstraint} object
   * @return a {@link com.databricks.sdk.service.catalog.TableConstraint} object
   */
  public TableConstraint setNamedTableConstraint(NamedTableConstraint namedTableConstraint) {
    this.namedTableConstraint = namedTableConstraint;
    return this;
  }

  /**
   * <p>Getter for the field <code>namedTableConstraint</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.NamedTableConstraint} object
   */
  public NamedTableConstraint getNamedTableConstraint() {
    return namedTableConstraint;
  }

  /**
   * <p>Setter for the field <code>primaryKeyConstraint</code>.</p>
   *
   * @param primaryKeyConstraint a {@link com.databricks.sdk.service.catalog.PrimaryKeyConstraint} object
   * @return a {@link com.databricks.sdk.service.catalog.TableConstraint} object
   */
  public TableConstraint setPrimaryKeyConstraint(PrimaryKeyConstraint primaryKeyConstraint) {
    this.primaryKeyConstraint = primaryKeyConstraint;
    return this;
  }

  /**
   * <p>Getter for the field <code>primaryKeyConstraint</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.PrimaryKeyConstraint} object
   */
  public PrimaryKeyConstraint getPrimaryKeyConstraint() {
    return primaryKeyConstraint;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableConstraint that = (TableConstraint) o;
    return Objects.equals(foreignKeyConstraint, that.foreignKeyConstraint)
        && Objects.equals(namedTableConstraint, that.namedTableConstraint)
        && Objects.equals(primaryKeyConstraint, that.primaryKeyConstraint);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(foreignKeyConstraint, namedTableConstraint, primaryKeyConstraint);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TableConstraint.class)
        .add("foreignKeyConstraint", foreignKeyConstraint)
        .add("namedTableConstraint", namedTableConstraint)
        .add("primaryKeyConstraint", primaryKeyConstraint)
        .toString();
  }
}
