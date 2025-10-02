// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TableSpecificConfig {
  /**
   * A list of column names to be excluded for the ingestion. When not specified, include_columns
   * fully controls what columns to be ingested. When specified, all other columns including future
   * ones will be automatically included for ingestion. This field in mutually exclusive with
   * `include_columns`.
   */
  @JsonProperty("exclude_columns")
  private Collection<String> excludeColumns;

  /**
   * A list of column names to be included for the ingestion. When not specified, all columns except
   * ones in exclude_columns will be included. Future columns will be automatically included. When
   * specified, all other future columns will be automatically excluded from ingestion. This field
   * in mutually exclusive with `exclude_columns`.
   */
  @JsonProperty("include_columns")
  private Collection<String> includeColumns;

  /** The primary key of the table used to apply changes. */
  @JsonProperty("primary_keys")
  private Collection<String> primaryKeys;

  /** */
  @JsonProperty("query_based_connector_config")
  private IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig
      queryBasedConnectorConfig;

  /**
   * (Optional, Immutable) The row filter condition to be applied to the table. It must not contain
   * the WHERE keyword, only the actual filter condition. It must be in DBSQL format.
   */
  @JsonProperty("row_filter")
  private String rowFilter;

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

  /** (Optional) Additional custom parameters for Workday Report */
  @JsonProperty("workday_report_parameters")
  private IngestionPipelineDefinitionWorkdayReportParameters workdayReportParameters;

  public TableSpecificConfig setExcludeColumns(Collection<String> excludeColumns) {
    this.excludeColumns = excludeColumns;
    return this;
  }

  public Collection<String> getExcludeColumns() {
    return excludeColumns;
  }

  public TableSpecificConfig setIncludeColumns(Collection<String> includeColumns) {
    this.includeColumns = includeColumns;
    return this;
  }

  public Collection<String> getIncludeColumns() {
    return includeColumns;
  }

  public TableSpecificConfig setPrimaryKeys(Collection<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public Collection<String> getPrimaryKeys() {
    return primaryKeys;
  }

  public TableSpecificConfig setQueryBasedConnectorConfig(
      IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig
          queryBasedConnectorConfig) {
    this.queryBasedConnectorConfig = queryBasedConnectorConfig;
    return this;
  }

  public IngestionPipelineDefinitionTableSpecificConfigQueryBasedConnectorConfig
      getQueryBasedConnectorConfig() {
    return queryBasedConnectorConfig;
  }

  public TableSpecificConfig setRowFilter(String rowFilter) {
    this.rowFilter = rowFilter;
    return this;
  }

  public String getRowFilter() {
    return rowFilter;
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

  public TableSpecificConfig setWorkdayReportParameters(
      IngestionPipelineDefinitionWorkdayReportParameters workdayReportParameters) {
    this.workdayReportParameters = workdayReportParameters;
    return this;
  }

  public IngestionPipelineDefinitionWorkdayReportParameters getWorkdayReportParameters() {
    return workdayReportParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableSpecificConfig that = (TableSpecificConfig) o;
    return Objects.equals(excludeColumns, that.excludeColumns)
        && Objects.equals(includeColumns, that.includeColumns)
        && Objects.equals(primaryKeys, that.primaryKeys)
        && Objects.equals(queryBasedConnectorConfig, that.queryBasedConnectorConfig)
        && Objects.equals(rowFilter, that.rowFilter)
        && Objects.equals(salesforceIncludeFormulaFields, that.salesforceIncludeFormulaFields)
        && Objects.equals(scdType, that.scdType)
        && Objects.equals(sequenceBy, that.sequenceBy)
        && Objects.equals(workdayReportParameters, that.workdayReportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        excludeColumns,
        includeColumns,
        primaryKeys,
        queryBasedConnectorConfig,
        rowFilter,
        salesforceIncludeFormulaFields,
        scdType,
        sequenceBy,
        workdayReportParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSpecificConfig.class)
        .add("excludeColumns", excludeColumns)
        .add("includeColumns", includeColumns)
        .add("primaryKeys", primaryKeys)
        .add("queryBasedConnectorConfig", queryBasedConnectorConfig)
        .add("rowFilter", rowFilter)
        .add("salesforceIncludeFormulaFields", salesforceIncludeFormulaFields)
        .add("scdType", scdType)
        .add("sequenceBy", sequenceBy)
        .add("workdayReportParameters", workdayReportParameters)
        .toString();
  }
}
