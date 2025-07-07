// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Lineage response containing lineage information of a data asset. */
@Generated
public class ExternalLineageInfo {
  /** Information about the edge metadata of the external lineage relationship. */
  @JsonProperty("external_lineage_info")
  private ExternalLineageRelationshipInfo externalLineageInfo;

  /** Information about external metadata involved in the lineage relationship. */
  @JsonProperty("external_metadata_info")
  private ExternalLineageExternalMetadataInfo externalMetadataInfo;

  /** Information about the file involved in the lineage relationship. */
  @JsonProperty("file_info")
  private ExternalLineageFileInfo fileInfo;

  /** Information about the model version involved in the lineage relationship. */
  @JsonProperty("model_info")
  private ExternalLineageModelVersionInfo modelInfo;

  /** Information about the table involved in the lineage relationship. */
  @JsonProperty("table_info")
  private ExternalLineageTableInfo tableInfo;

  public ExternalLineageInfo setExternalLineageInfo(
      ExternalLineageRelationshipInfo externalLineageInfo) {
    this.externalLineageInfo = externalLineageInfo;
    return this;
  }

  public ExternalLineageRelationshipInfo getExternalLineageInfo() {
    return externalLineageInfo;
  }

  public ExternalLineageInfo setExternalMetadataInfo(
      ExternalLineageExternalMetadataInfo externalMetadataInfo) {
    this.externalMetadataInfo = externalMetadataInfo;
    return this;
  }

  public ExternalLineageExternalMetadataInfo getExternalMetadataInfo() {
    return externalMetadataInfo;
  }

  public ExternalLineageInfo setFileInfo(ExternalLineageFileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

  public ExternalLineageFileInfo getFileInfo() {
    return fileInfo;
  }

  public ExternalLineageInfo setModelInfo(ExternalLineageModelVersionInfo modelInfo) {
    this.modelInfo = modelInfo;
    return this;
  }

  public ExternalLineageModelVersionInfo getModelInfo() {
    return modelInfo;
  }

  public ExternalLineageInfo setTableInfo(ExternalLineageTableInfo tableInfo) {
    this.tableInfo = tableInfo;
    return this;
  }

  public ExternalLineageTableInfo getTableInfo() {
    return tableInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLineageInfo that = (ExternalLineageInfo) o;
    return Objects.equals(externalLineageInfo, that.externalLineageInfo)
        && Objects.equals(externalMetadataInfo, that.externalMetadataInfo)
        && Objects.equals(fileInfo, that.fileInfo)
        && Objects.equals(modelInfo, that.modelInfo)
        && Objects.equals(tableInfo, that.tableInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLineageInfo, externalMetadataInfo, fileInfo, modelInfo, tableInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageInfo.class)
        .add("externalLineageInfo", externalLineageInfo)
        .add("externalMetadataInfo", externalMetadataInfo)
        .add("fileInfo", fileInfo)
        .add("modelInfo", modelInfo)
        .add("tableInfo", tableInfo)
        .toString();
  }
}
