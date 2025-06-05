// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TableSpecificConfigPb {
  @JsonProperty("exclude_columns")
  private Collection<String> excludeColumns;

  @JsonProperty("include_columns")
  private Collection<String> includeColumns;

  @JsonProperty("primary_keys")
  private Collection<String> primaryKeys;

  @JsonProperty("salesforce_include_formula_fields")
  private Boolean salesforceIncludeFormulaFields;

  @JsonProperty("scd_type")
  private TableSpecificConfigScdType scdType;

  @JsonProperty("sequence_by")
  private Collection<String> sequenceBy;

  public TableSpecificConfigPb setExcludeColumns(Collection<String> excludeColumns) {
    this.excludeColumns = excludeColumns;
    return this;
  }

  public Collection<String> getExcludeColumns() {
    return excludeColumns;
  }

  public TableSpecificConfigPb setIncludeColumns(Collection<String> includeColumns) {
    this.includeColumns = includeColumns;
    return this;
  }

  public Collection<String> getIncludeColumns() {
    return includeColumns;
  }

  public TableSpecificConfigPb setPrimaryKeys(Collection<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public Collection<String> getPrimaryKeys() {
    return primaryKeys;
  }

  public TableSpecificConfigPb setSalesforceIncludeFormulaFields(
      Boolean salesforceIncludeFormulaFields) {
    this.salesforceIncludeFormulaFields = salesforceIncludeFormulaFields;
    return this;
  }

  public Boolean getSalesforceIncludeFormulaFields() {
    return salesforceIncludeFormulaFields;
  }

  public TableSpecificConfigPb setScdType(TableSpecificConfigScdType scdType) {
    this.scdType = scdType;
    return this;
  }

  public TableSpecificConfigScdType getScdType() {
    return scdType;
  }

  public TableSpecificConfigPb setSequenceBy(Collection<String> sequenceBy) {
    this.sequenceBy = sequenceBy;
    return this;
  }

  public Collection<String> getSequenceBy() {
    return sequenceBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableSpecificConfigPb that = (TableSpecificConfigPb) o;
    return Objects.equals(excludeColumns, that.excludeColumns)
        && Objects.equals(includeColumns, that.includeColumns)
        && Objects.equals(primaryKeys, that.primaryKeys)
        && Objects.equals(salesforceIncludeFormulaFields, that.salesforceIncludeFormulaFields)
        && Objects.equals(scdType, that.scdType)
        && Objects.equals(sequenceBy, that.sequenceBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        excludeColumns,
        includeColumns,
        primaryKeys,
        salesforceIncludeFormulaFields,
        scdType,
        sequenceBy);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSpecificConfigPb.class)
        .add("excludeColumns", excludeColumns)
        .add("includeColumns", includeColumns)
        .add("primaryKeys", primaryKeys)
        .add("salesforceIncludeFormulaFields", salesforceIncludeFormulaFields)
        .add("scdType", scdType)
        .add("sequenceBy", sequenceBy)
        .toString();
  }
}
