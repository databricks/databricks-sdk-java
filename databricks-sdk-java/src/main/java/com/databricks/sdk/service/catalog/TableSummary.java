// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TableSummary class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TableSummary {
  /** The full name of the table. */
  @JsonProperty("full_name")
  private String fullName;

  /** */
  @JsonProperty("table_type")
  private TableType tableType;

  /**
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.TableSummary} object
   */
  public TableSummary setFullName(String fullName) {
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

  /**
   * <p>Setter for the field <code>tableType</code>.</p>
   *
   * @param tableType a {@link com.databricks.sdk.service.catalog.TableType} object
   * @return a {@link com.databricks.sdk.service.catalog.TableSummary} object
   */
  public TableSummary setTableType(TableType tableType) {
    this.tableType = tableType;
    return this;
  }

  /**
   * <p>Getter for the field <code>tableType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.TableType} object
   */
  public TableType getTableType() {
    return tableType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableSummary that = (TableSummary) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(tableType, that.tableType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fullName, tableType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TableSummary.class)
        .add("fullName", fullName)
        .add("tableType", tableType)
        .toString();
  }
}
