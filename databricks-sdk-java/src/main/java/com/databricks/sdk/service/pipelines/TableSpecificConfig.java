// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class TableSpecificConfig {
  /**
   * (Optional, Mutable) Policy for auto full refresh, if enabled pipeline will automatically try to
   * fix issues by doing a full refresh on the table in the retry run. auto_full_refresh_policy in
   * table configuration will override the above level auto_full_refresh_policy. For example, {
   * "auto_full_refresh_policy": { "enabled": true, "min_interval_hours": 23, } } If unspecified,
   * auto full refresh is disabled.
   */
  @JsonProperty("auto_full_refresh_policy")
  private AutoFullRefreshPolicy autoFullRefreshPolicy;

  /**
   * List of column names to use for clustering the destination table. When specified, the
   * destination Delta table will be clustered by these columns. This can improve query performance
   * when filtering on these columns. Note: clustering_columns in table specific configuration will
   * override the pipeline definition. Note: we can only provide enable_auto_clustering or
   * clustering_columns, added as separate fields as we cannot have repeated field in oneof.
   */
  @JsonProperty("clustering_columns")
  private Collection<String> clusteringColumns;

  /**
   * Whether to enable auto clustering on the destination table. When enabled, Delta will
   * automatically optimize the data layout based on the clustering columns for improved query
   * performance. Note: enable_auto_clustering in table specific configuration will override the
   * pipeline definition. Note: we can only provide enable_auto_clustering or clustering_columns,
   * added as separate fields as we cannot have repeated field in oneof.
   */
  @JsonProperty("enable_auto_clustering")
  private Boolean enableAutoClustering;

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

  /** */
  @JsonProperty("scd_type")
  private TableSpecificConfigScdType scdType;

  /**
   * The column names specifying the logical order of events in the source data. Spark Declarative
   * Pipelines uses this sequencing to handle change events that arrive out of order.
   */
  @JsonProperty("sequence_by")
  private Collection<String> sequenceBy;

  /**
   * Table properties to set on the destination table. These are key-value pairs that configure
   * various Delta table behaviors or any user defined properties. Example:
   * {"delta.feature.variantType": "supported", "delta.enableTypeWidening": "true"} Note:
   * table_properties in table specific configuration will override the table_properties of the
   * pipeline definition.
   */
  @JsonProperty("table_properties")
  private Map<String, String> tableProperties;

  /** (Optional) Additional custom parameters for Workday Report */
  @JsonProperty("workday_report_parameters")
  private IngestionPipelineDefinitionWorkdayReportParameters workdayReportParameters;

  public TableSpecificConfig setAutoFullRefreshPolicy(AutoFullRefreshPolicy autoFullRefreshPolicy) {
    this.autoFullRefreshPolicy = autoFullRefreshPolicy;
    return this;
  }

  public AutoFullRefreshPolicy getAutoFullRefreshPolicy() {
    return autoFullRefreshPolicy;
  }

  public TableSpecificConfig setClusteringColumns(Collection<String> clusteringColumns) {
    this.clusteringColumns = clusteringColumns;
    return this;
  }

  public Collection<String> getClusteringColumns() {
    return clusteringColumns;
  }

  public TableSpecificConfig setEnableAutoClustering(Boolean enableAutoClustering) {
    this.enableAutoClustering = enableAutoClustering;
    return this;
  }

  public Boolean getEnableAutoClustering() {
    return enableAutoClustering;
  }

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

  public TableSpecificConfig setTableProperties(Map<String, String> tableProperties) {
    this.tableProperties = tableProperties;
    return this;
  }

  public Map<String, String> getTableProperties() {
    return tableProperties;
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
    return Objects.equals(autoFullRefreshPolicy, that.autoFullRefreshPolicy)
        && Objects.equals(clusteringColumns, that.clusteringColumns)
        && Objects.equals(enableAutoClustering, that.enableAutoClustering)
        && Objects.equals(excludeColumns, that.excludeColumns)
        && Objects.equals(includeColumns, that.includeColumns)
        && Objects.equals(primaryKeys, that.primaryKeys)
        && Objects.equals(queryBasedConnectorConfig, that.queryBasedConnectorConfig)
        && Objects.equals(rowFilter, that.rowFilter)
        && Objects.equals(salesforceIncludeFormulaFields, that.salesforceIncludeFormulaFields)
        && Objects.equals(scdType, that.scdType)
        && Objects.equals(sequenceBy, that.sequenceBy)
        && Objects.equals(tableProperties, that.tableProperties)
        && Objects.equals(workdayReportParameters, that.workdayReportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoFullRefreshPolicy,
        clusteringColumns,
        enableAutoClustering,
        excludeColumns,
        includeColumns,
        primaryKeys,
        queryBasedConnectorConfig,
        rowFilter,
        salesforceIncludeFormulaFields,
        scdType,
        sequenceBy,
        tableProperties,
        workdayReportParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(TableSpecificConfig.class)
        .add("autoFullRefreshPolicy", autoFullRefreshPolicy)
        .add("clusteringColumns", clusteringColumns)
        .add("enableAutoClustering", enableAutoClustering)
        .add("excludeColumns", excludeColumns)
        .add("includeColumns", includeColumns)
        .add("primaryKeys", primaryKeys)
        .add("queryBasedConnectorConfig", queryBasedConnectorConfig)
        .add("rowFilter", rowFilter)
        .add("salesforceIncludeFormulaFields", salesforceIncludeFormulaFields)
        .add("scdType", scdType)
        .add("sequenceBy", sequenceBy)
        .add("tableProperties", tableProperties)
        .add("workdayReportParameters", workdayReportParameters)
        .toString();
  }
}
