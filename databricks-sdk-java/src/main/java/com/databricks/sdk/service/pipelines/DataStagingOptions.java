// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Location of staged data storage */
@Generated
public class DataStagingOptions {
  /** (Required, Immutable) The name of the catalog for the connector's staging storage location. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** (Required, Immutable) The name of the schema for the connector's staging storage location. */
  @JsonProperty("schema_name")
  private String schemaName;

  /**
   * (Optional) The Unity Catalog-compatible name for the storage location. This is the volume to
   * use for the data that is extracted by the connector. Spark Declarative Pipelines system will
   * automatically create the volume under the catalog and schema. For Combined Cdc Managed
   * Ingestion pipelines default name for the volume would be :
   * __databricks_ingestion_gateway_staging_data-$pipelineId
   */
  @JsonProperty("volume_name")
  private String volumeName;

  public DataStagingOptions setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public DataStagingOptions setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public DataStagingOptions setVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  public String getVolumeName() {
    return volumeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataStagingOptions that = (DataStagingOptions) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(volumeName, that.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName, volumeName);
  }

  @Override
  public String toString() {
    return new ToStringer(DataStagingOptions.class)
        .add("catalogName", catalogName)
        .add("schemaName", schemaName)
        .add("volumeName", volumeName)
        .toString();
  }
}
