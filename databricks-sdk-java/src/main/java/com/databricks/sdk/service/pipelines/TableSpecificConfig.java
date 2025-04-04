// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TableSpecificConfig {
  /** The primary key of the table used to apply changes. */
  @JsonProperty("primary_keys")
  private Collection<String> primaryKeys;

  /**
   * If true, formula fields defined in the table are included in the ingestion. This setting is
   * only valid for the Salesforce connector
   */
  @JsonProperty("salesforce_include_formula_fields")
  private Boolean salesforceIncludeFormulaFields;

  /** The SCD type to use to ingest the table. */
  @JsonProperty("scd_type")
  private TableSpecificConfigScdType scdType;

  /**
   * The column names specifying the logical order of events in the source data. Delta Live Tables
   * uses this sequencing to handle change events that arrive out of order.
   */
  @JsonProperty("sequence_by")
  private Collection<String> sequenceBy;

  public TableSpecificConfig setPrimaryKeys(Collection<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public Collection<String> getPrimaryKeys() {
    return primaryKeys;
  }

  public TableSpecificConfig setSalesforceIncludeFormulaFields(
      Boolean salesforceIncludeFormulaFields) {
    this.salesforceIncludeFormulaFields = salesforceIncludeFormulaFields;
    return this;
  }

  public Boolean getSalesforceIncludeFormulaFields() {
    return salesforceIncludeFormulaFields;
  }

  public TableSpecificConfig setScdType(TableSpecificConfigScdType scdType) {
    this.scdType = scdType;
    return this;
  }

  public TableSpecificConfigScdType getScdType() {
    return scdType;
  }

  public TableSpecificConfig setSequenceBy(Collection<String> sequenceBy) {
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
    TableSpecificConfig that = (TableSpecificConfig) o;
    return Objects.equals(primaryKeys, that.primaryKeys)
        && Objects.equals(salesforceIncludeFormulaFields, that.salesforceIncludeFormulaFields)
        && Objects.equals(scdType, that.scdType)
        && Objects.equals(sequenceBy, that.sequenceBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryKeys, salesforceIncludeFormulaFields, scdType, sequenceBy);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSpecificConfig.class)
        .add("primaryKeys", primaryKeys)
        .add("salesforceIncludeFormulaFields", salesforceIncludeFormulaFields)
        .add("scdType", scdType)
        .add("sequenceBy", sequenceBy)
        .toString();
  }
}
