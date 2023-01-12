// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class TableInfo {
    /**
     * Name of parent Catalog.
     */
    @JsonProperty("catalog_name")
    private String catalogName;
    
    /**
     * This name ('columns') is what the client actually sees as the field name
     * in messages that include PropertiesKVPairs using 'json_inline' (e.g.,
     * TableInfo).
     */
    @JsonProperty("columns")
    private java.util.List<ColumnInfo> columns;
    
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this Table was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of Table creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Unique ID of the data_access_configuration to use.
     */
    @JsonProperty("data_access_configuration_id")
    private String dataAccessConfigurationId;
    
    /**
     * Data source format
     */
    @JsonProperty("data_source_format")
    private DataSourceFormat dataSourceFormat;
    
    /**
     * Full name of Table, in form of <catalog_name>.<schema_name>.<table_name>
     */
    @JsonProperty("full_name")
    private String fullName;
    
    /**
     * Unique identifier of parent Metastore.
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * Name of Table, relative to parent Schema.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of Table.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    /**
     * Name of parent Schema relative to its parent Catalog.
     */
    @JsonProperty("schema_name")
    private String schemaName;
    
    /**
     * List of schemes whose objects can be referenced without qualification.
     */
    @JsonProperty("sql_path")
    private String sqlPath;
    
    /**
     * Name of the storage credential this table used
     */
    @JsonProperty("storage_credential_name")
    private String storageCredentialName;
    
    /**
     * Storage root URL for table (for MANAGED, EXTERNAL tables)
     */
    @JsonProperty("storage_location")
    private String storageLocation;
    
    /**
     * Name of Table, relative to parent Schema.
     */
    @JsonProperty("table_id")
    private String tableId;
    
    /**
     
     */
    @JsonProperty("table_type")
    private TableType tableType;
    
    /**
     * Time at which this Table was last modified, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of user who last modified the Table.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    /**
     * View definition SQL (when table_type == "VIEW")
     */
    @JsonProperty("view_definition")
    private String viewDefinition;
    
    public TableInfo setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    public String getCatalogName() {
        return catalogName;
    }
    
    public TableInfo setColumns(java.util.List<ColumnInfo> columns) {
        this.columns = columns;
        return this;
    }

    public java.util.List<ColumnInfo> getColumns() {
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
    
    public TableInfo setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
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
    
}
