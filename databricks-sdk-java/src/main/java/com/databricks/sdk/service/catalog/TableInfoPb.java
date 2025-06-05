// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class TableInfoPb {
  @JsonProperty("access_point")
  private String accessPoint;

  @JsonProperty("browse_only")
  private Boolean browseOnly;

  @JsonProperty("catalog_name")
  private String catalogName;

  @JsonProperty("columns")
  private Collection<ColumnInfo> columns;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("data_access_configuration_id")
  private String dataAccessConfigurationId;

  @JsonProperty("data_source_format")
  private DataSourceFormat dataSourceFormat;

  @JsonProperty("deleted_at")
  private Long deletedAt;

  @JsonProperty("delta_runtime_properties_kvpairs")
  private DeltaRuntimePropertiesKvPairs deltaRuntimePropertiesKvpairs;

  @JsonProperty("effective_predictive_optimization_flag")
  private EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag;

  @JsonProperty("enable_predictive_optimization")
  private EnablePredictiveOptimization enablePredictiveOptimization;

  @JsonProperty("encryption_details")
  private EncryptionDetails encryptionDetails;

  @JsonProperty("full_name")
  private String fullName;

  @JsonProperty("metastore_id")
  private String metastoreId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("pipeline_id")
  private String pipelineId;

  @JsonProperty("properties")
  private Map<String, String> properties;

  @JsonProperty("row_filter")
  private TableRowFilter rowFilter;

  @JsonProperty("schema_name")
  private String schemaName;

  @JsonProperty("sql_path")
  private String sqlPath;

  @JsonProperty("storage_credential_name")
  private String storageCredentialName;

  @JsonProperty("storage_location")
  private String storageLocation;

  @JsonProperty("table_constraints")
  private Collection<TableConstraint> tableConstraints;

  @JsonProperty("table_id")
  private String tableId;

  @JsonProperty("table_type")
  private TableType tableType;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private String updatedBy;

  @JsonProperty("view_definition")
  private String viewDefinition;

  @JsonProperty("view_dependencies")
  private DependencyList viewDependencies;

  public TableInfoPb setAccessPoint(String accessPoint) {
    this.accessPoint = accessPoint;
    return this;
  }

  public String getAccessPoint() {
    return accessPoint;
  }

  public TableInfoPb setBrowseOnly(Boolean browseOnly) {
    this.browseOnly = browseOnly;
    return this;
  }

  public Boolean getBrowseOnly() {
    return browseOnly;
  }

  public TableInfoPb setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public TableInfoPb setColumns(Collection<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<ColumnInfo> getColumns() {
    return columns;
  }

  public TableInfoPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TableInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public TableInfoPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public TableInfoPb setDataAccessConfigurationId(String dataAccessConfigurationId) {
    this.dataAccessConfigurationId = dataAccessConfigurationId;
    return this;
  }

  public String getDataAccessConfigurationId() {
    return dataAccessConfigurationId;
  }

  public TableInfoPb setDataSourceFormat(DataSourceFormat dataSourceFormat) {
    this.dataSourceFormat = dataSourceFormat;
    return this;
  }

  public DataSourceFormat getDataSourceFormat() {
    return dataSourceFormat;
  }

  public TableInfoPb setDeletedAt(Long deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  public Long getDeletedAt() {
    return deletedAt;
  }

  public TableInfoPb setDeltaRuntimePropertiesKvpairs(
      DeltaRuntimePropertiesKvPairs deltaRuntimePropertiesKvpairs) {
    this.deltaRuntimePropertiesKvpairs = deltaRuntimePropertiesKvpairs;
    return this;
  }

  public DeltaRuntimePropertiesKvPairs getDeltaRuntimePropertiesKvpairs() {
    return deltaRuntimePropertiesKvpairs;
  }

  public TableInfoPb setEffectivePredictiveOptimizationFlag(
      EffectivePredictiveOptimizationFlag effectivePredictiveOptimizationFlag) {
    this.effectivePredictiveOptimizationFlag = effectivePredictiveOptimizationFlag;
    return this;
  }

  public EffectivePredictiveOptimizationFlag getEffectivePredictiveOptimizationFlag() {
    return effectivePredictiveOptimizationFlag;
  }

  public TableInfoPb setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public TableInfoPb setEncryptionDetails(EncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

  public EncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public TableInfoPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public TableInfoPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public TableInfoPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TableInfoPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public TableInfoPb setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public TableInfoPb setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public TableInfoPb setRowFilter(TableRowFilter rowFilter) {
    this.rowFilter = rowFilter;
    return this;
  }

  public TableRowFilter getRowFilter() {
    return rowFilter;
  }

  public TableInfoPb setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public TableInfoPb setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
    return this;
  }

  public String getSqlPath() {
    return sqlPath;
  }

  public TableInfoPb setStorageCredentialName(String storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public String getStorageCredentialName() {
    return storageCredentialName;
  }

  public TableInfoPb setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public TableInfoPb setTableConstraints(Collection<TableConstraint> tableConstraints) {
    this.tableConstraints = tableConstraints;
    return this;
  }

  public Collection<TableConstraint> getTableConstraints() {
    return tableConstraints;
  }

  public TableInfoPb setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public String getTableId() {
    return tableId;
  }

  public TableInfoPb setTableType(TableType tableType) {
    this.tableType = tableType;
    return this;
  }

  public TableType getTableType() {
    return tableType;
  }

  public TableInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public TableInfoPb setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public TableInfoPb setViewDefinition(String viewDefinition) {
    this.viewDefinition = viewDefinition;
    return this;
  }

  public String getViewDefinition() {
    return viewDefinition;
  }

  public TableInfoPb setViewDependencies(DependencyList viewDependencies) {
    this.viewDependencies = viewDependencies;
    return this;
  }

  public DependencyList getViewDependencies() {
    return viewDependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableInfoPb that = (TableInfoPb) o;
    return Objects.equals(accessPoint, that.accessPoint)
        && Objects.equals(browseOnly, that.browseOnly)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(columns, that.columns)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(dataAccessConfigurationId, that.dataAccessConfigurationId)
        && Objects.equals(dataSourceFormat, that.dataSourceFormat)
        && Objects.equals(deletedAt, that.deletedAt)
        && Objects.equals(deltaRuntimePropertiesKvpairs, that.deltaRuntimePropertiesKvpairs)
        && Objects.equals(
            effectivePredictiveOptimizationFlag, that.effectivePredictiveOptimizationFlag)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(encryptionDetails, that.encryptionDetails)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(properties, that.properties)
        && Objects.equals(rowFilter, that.rowFilter)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(sqlPath, that.sqlPath)
        && Objects.equals(storageCredentialName, that.storageCredentialName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(tableConstraints, that.tableConstraints)
        && Objects.equals(tableId, that.tableId)
        && Objects.equals(tableType, that.tableType)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(viewDefinition, that.viewDefinition)
        && Objects.equals(viewDependencies, that.viewDependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessPoint,
        browseOnly,
        catalogName,
        columns,
        comment,
        createdAt,
        createdBy,
        dataAccessConfigurationId,
        dataSourceFormat,
        deletedAt,
        deltaRuntimePropertiesKvpairs,
        effectivePredictiveOptimizationFlag,
        enablePredictiveOptimization,
        encryptionDetails,
        fullName,
        metastoreId,
        name,
        owner,
        pipelineId,
        properties,
        rowFilter,
        schemaName,
        sqlPath,
        storageCredentialName,
        storageLocation,
        tableConstraints,
        tableId,
        tableType,
        updatedAt,
        updatedBy,
        viewDefinition,
        viewDependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(TableInfoPb.class)
        .add("accessPoint", accessPoint)
        .add("browseOnly", browseOnly)
        .add("catalogName", catalogName)
        .add("columns", columns)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("dataAccessConfigurationId", dataAccessConfigurationId)
        .add("dataSourceFormat", dataSourceFormat)
        .add("deletedAt", deletedAt)
        .add("deltaRuntimePropertiesKvpairs", deltaRuntimePropertiesKvpairs)
        .add("effectivePredictiveOptimizationFlag", effectivePredictiveOptimizationFlag)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("encryptionDetails", encryptionDetails)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
        .add("pipelineId", pipelineId)
        .add("properties", properties)
        .add("rowFilter", rowFilter)
        .add("schemaName", schemaName)
        .add("sqlPath", sqlPath)
        .add("storageCredentialName", storageCredentialName)
        .add("storageLocation", storageLocation)
        .add("tableConstraints", tableConstraints)
        .add("tableId", tableId)
        .add("tableType", tableType)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("viewDefinition", viewDefinition)
        .add("viewDependencies", viewDependencies)
        .toString();
  }
}
