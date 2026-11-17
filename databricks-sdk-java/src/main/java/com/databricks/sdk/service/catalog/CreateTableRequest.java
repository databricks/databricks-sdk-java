// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class CreateTableRequest {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** The array of __ColumnInfo__ definitions of the table's columns. */
  @JsonProperty("columns")
  private Collection<ColumnInfo> columns;

  /**
   * The format of the data that backs the table, such as DELTA, PARQUET, CSV or JSON. Foreign
   * tables report the external system that holds them, for example SNOWFLAKE_FORMAT or
   * MYSQL_FORMAT.
   */
  @JsonProperty("data_source_format")
  private DataSourceFormat dataSourceFormat;

  /** Name of table, relative to parent schema. */
  @JsonProperty("name")
  private String name;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /** Name of parent schema relative to its parent catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  /**
   * The cloud storage URL under which the data files of the table are stored. For an EXTERNAL
   * table, it must be set on creation to a path within an existing external location. For a MANAGED
   * table, the server assigns a path under the managed storage location of the parent schema,
   * catalog or metastore and returns it in this field. Views have no storage location.
   */
  @JsonProperty("storage_location")
  private String storageLocation;

  /**
   * The type of the table. MANAGED tables store their data in storage that Unity Catalog manages,
   * EXTERNAL tables store it in a registered external location, FOREIGN tables mirror objects of an
   * external database through a connection, and the shallow clone types reference the data files of
   * a base table. VIEW, MATERIALIZED_VIEW, STREAMING_TABLE and METRIC_VIEW are defined by a view
   * definition. See https://docs.databricks.com/aws/en/tables/ for an overview of the table types.
   */
  @JsonProperty("table_type")
  private TableType tableType;

  public CreateTableRequest setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CreateTableRequest setColumns(Collection<ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<ColumnInfo> getColumns() {
    return columns;
  }

  public CreateTableRequest setDataSourceFormat(DataSourceFormat dataSourceFormat) {
    this.dataSourceFormat = dataSourceFormat;
    return this;
  }

  public DataSourceFormat getDataSourceFormat() {
    return dataSourceFormat;
  }

  public CreateTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateTableRequest setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateTableRequest setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public CreateTableRequest setStorageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
  }

  public String getStorageLocation() {
    return storageLocation;
  }

  public CreateTableRequest setTableType(TableType tableType) {
    this.tableType = tableType;
    return this;
  }

  public TableType getTableType() {
    return tableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTableRequest that = (CreateTableRequest) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(columns, that.columns)
        && Objects.equals(dataSourceFormat, that.dataSourceFormat)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(storageLocation, that.storageLocation)
        && Objects.equals(tableType, that.tableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        columns,
        dataSourceFormat,
        name,
        properties,
        schemaName,
        storageLocation,
        tableType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTableRequest.class)
        .add("catalogName", catalogName)
        .add("columns", columns)
        .add("dataSourceFormat", dataSourceFormat)
        .add("name", name)
        .add("properties", properties)
        .add("schemaName", schemaName)
        .add("storageLocation", storageLocation)
        .add("tableType", tableType)
        .toString();
  }
}
