// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class TableInfo {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The array of __ColumnInfo__ definitions of the table's columns. */
  @JsonProperty("columns")
  private Collection<ColumnInfo> columns;

  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Time at which this table was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Username of table creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Unique ID of the Data Access Configuration to use with the table data. */
  @JsonProperty("data_access_configuration_id")
  private String dataAccessConfigurationId;

  /** Data source format */
  @JsonProperty("data_source_format")
  private DataSourceFormat dataSourceFormat;

  /**
   * Time at which this table was deleted, in epoch milliseconds. Field is omitted if table is not
   * deleted.
   */
  @JsonProperty("deleted_at")
  private Long deletedAt;

  /** Information pertaining to current state of the delta table. */
  @JsonProperty("delta_runtime_properties_kvpairs")
  private Object /* MISSING TYPE */ deltaRuntimePropertiesKvpairs;

  /** */
  @JsonProperty("effective_auto_maintenance_flag")
  private EffectiveAutoMaintenanceFlag effectiveAutoMaintenanceFlag;

  /** Whether auto maintenance should be enabled for this object and objects under it. */
  @JsonProperty("enable_auto_maintenance")
  private EnableAutoMaintenance enableAutoMaintenance;

  /** Full name of table, in form of __catalog_name__.__schema_name__.__table_name__ */
  @JsonProperty("full_name")
  private String fullName;

  /** Unique identifier of parent metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Name of table, relative to parent schema. */
  @JsonProperty("name")
  private String name;

  /** Username of current owner of table. */
  @JsonProperty("owner")
  private String owner;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** */
  @JsonProperty("row_filter")
  private TableRowFilter rowFilter;

  /** Name of parent schema relative to its parent catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  /** List of schemes whose objects can be referenced without qualification. */
  @JsonProperty("sql_path")
  private String sqlPath;

  /**
   * Name of the storage credential, when a storage credential is configured for use with this
   * table.
   */
  @JsonProperty("storage_credential_name")
  private String storageCredentialName;

  /** Storage root URL for table (for **MANAGED**, **EXTERNAL** tables) */
  @JsonProperty("storage_location")
  private String storageLocation;

  /** */
  @JsonProperty("table_constraints")
  private TableConstraintList tableConstraints;

  /** Name of table, relative to parent schema. */
  @JsonProperty("table_id")
  private String tableId;

  /** */
  @JsonProperty("table_type")
  private TableType tableType;

  /** Time at which this table was last modified, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Username of user who last modified the table. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /**
   * View definition SQL (when __table_type__ is **VIEW**, **MATERIALIZED_VIEW**, or
   * **STREAMING_TABLE**)
   */
  @JsonProperty("view_definition")
  private String viewDefinition;

  /**
   * View dependencies (when table_type == **VIEW** or **MATERIALIZED_VIEW**, **STREAMING_TABLE**) -
   * when DependencyList is None, the dependency is not provided; - when DependencyList is an empty
   * list, the dependency is provided but is empty; - when DependencyList is not an empty list,
   * dependencies are provided and recorded.
   */
  @JsonProperty("view_dependencies")
  private Collection<Dependency> viewDependencies;

  public TableInfo setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public TableInfo setColumns(Collection<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<ColumnInfo> getColumns() {
    return columns;
  }

  public TableInfo setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TableInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public TableInfo setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public TableInfo setDataAccessConfigurationId(String dataAccessConfigurationId) {
    this.dataAccessConfigurationId = dataAccessConfigurationId;
    return this;
  }

  public String getDataAccessConfigurationId() {
    return dataAccessConfigurationId;
  }

  public TableInfo setDataSourceFormat(DataSourceFormat dataSourceFormat) {
    this.dataSourceFormat = dataSourceFormat;
    return this;
  }

  public DataSourceFormat getDataSourceFormat() {
    return dataSourceFormat;
  }

  public TableInfo setDeletedAt(Long deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  public Long getDeletedAt() {
    return deletedAt;
  }

  public TableInfo setDeltaRuntimePropertiesKvpairs(
      Object /* MISSING TYPE */ deltaRuntimePropertiesKvpairs) {
    this.deltaRuntimePropertiesKvpairs = deltaRuntimePropertiesKvpairs;
    return this;
  }

  public Object /* MISSING TYPE */ getDeltaRuntimePropertiesKvpairs() {
    return deltaRuntimePropertiesKvpairs;
  }

  public TableInfo setEffectiveAutoMaintenanceFlag(
      EffectiveAutoMaintenanceFlag effectiveAutoMaintenanceFlag) {
    this.effectiveAutoMaintenanceFlag = effectiveAutoMaintenanceFlag;
    return this;
  }

  public EffectiveAutoMaintenanceFlag getEffectiveAutoMaintenanceFlag() {
    return effectiveAutoMaintenanceFlag;
  }

  public TableInfo setEnableAutoMaintenance(EnableAutoMaintenance enableAutoMaintenance) {
    this.enableAutoMaintenance = enableAutoMaintenance;
    return this;
  }

  public EnableAutoMaintenance getEnableAutoMaintenance() {
    return enableAutoMaintenance;
  }

  public TableInfo setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public TableInfo setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public TableInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TableInfo setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public TableInfo setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public TableInfo setRowFilter(TableRowFilter rowFilter) {
    this.rowFilter = rowFilter;
    return this;
  }

  public TableRowFilter getRowFilter() {
    return rowFilter;
  }

  public TableInfo setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public TableInfo setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
    return this;
  }

  public String getSqlPath() {
    return sqlPath;
  }

  public TableInfo setStorageCredentialName(String storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public String getStorageCredentialName() {
    return storageCredentialName;
  }

  public TableInfo setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public TableInfo setTableConstraints(TableConstraintList tableConstraints) {
    this.tableConstraints = tableConstraints;
    return this;
  }

  public TableConstraintList getTableConstraints() {
    return tableConstraints;
  }

  public TableInfo setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public String getTableId() {
    return tableId;
  }

  public TableInfo setTableType(TableType tableType) {
    this.tableType = tableType;
    return this;
  }

  public TableType getTableType() {
    return tableType;
  }

  public TableInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public TableInfo setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public TableInfo setViewDefinition(String viewDefinition) {
    this.viewDefinition = viewDefinition;
    return this;
  }

  public String getViewDefinition() {
    return viewDefinition;
  }

  public TableInfo setViewDependencies(Collection<Dependency> viewDependencies) {
    this.viewDependencies = viewDependencies;
    return this;
  }

  public Collection<Dependency> getViewDependencies() {
    return viewDependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableInfo that = (TableInfo) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(columns, that.columns)
        && Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(dataAccessConfigurationId, that.dataAccessConfigurationId)
        && Objects.equals(dataSourceFormat, that.dataSourceFormat)
        && Objects.equals(deletedAt, that.deletedAt)
        && Objects.equals(deltaRuntimePropertiesKvpairs, that.deltaRuntimePropertiesKvpairs)
        && Objects.equals(effectiveAutoMaintenanceFlag, that.effectiveAutoMaintenanceFlag)
        && Objects.equals(enableAutoMaintenance, that.enableAutoMaintenance)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
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
        catalogName,
        columns,
        comment,
        createdAt,
        createdBy,
        dataAccessConfigurationId,
        dataSourceFormat,
        deletedAt,
        deltaRuntimePropertiesKvpairs,
        effectiveAutoMaintenanceFlag,
        enableAutoMaintenance,
        fullName,
        metastoreId,
        name,
        owner,
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
    return new ToStringer(TableInfo.class)
        .add("catalogName", catalogName)
        .add("columns", columns)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("dataAccessConfigurationId", dataAccessConfigurationId)
        .add("dataSourceFormat", dataSourceFormat)
        .add("deletedAt", deletedAt)
        .add("deltaRuntimePropertiesKvpairs", deltaRuntimePropertiesKvpairs)
        .add("effectiveAutoMaintenanceFlag", effectiveAutoMaintenanceFlag)
        .add("enableAutoMaintenance", enableAutoMaintenance)
        .add("fullName", fullName)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .add("owner", owner)
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
