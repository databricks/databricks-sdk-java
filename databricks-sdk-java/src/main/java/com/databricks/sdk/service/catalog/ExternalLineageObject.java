// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalLineageObject {
  /** */
  @JsonProperty("external_metadata")
  private ExternalLineageExternalMetadata externalMetadata;

  /** */
  @JsonProperty("model_version")
  private ExternalLineageModelVersion modelVersion;

  /** */
  @JsonProperty("path")
  private ExternalLineagePath path;

  /** */
  @JsonProperty("table")
  private ExternalLineageTable table;

  public ExternalLineageObject setExternalMetadata(
      ExternalLineageExternalMetadata externalMetadata) {
    this.externalMetadata = externalMetadata;
    return this;
  }

  public ExternalLineageExternalMetadata getExternalMetadata() {
    return externalMetadata;
  }

  public ExternalLineageObject setModelVersion(ExternalLineageModelVersion modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  public ExternalLineageModelVersion getModelVersion() {
    return modelVersion;
  }

  public ExternalLineageObject setPath(ExternalLineagePath path) {
    this.path = path;
    return this;
  }

  public ExternalLineagePath getPath() {
    return path;
  }

  public ExternalLineageObject setTable(ExternalLineageTable table) {
    this.table = table;
    return this;
  }

  public ExternalLineageTable getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLineageObject that = (ExternalLineageObject) o;
    return Objects.equals(externalMetadata, that.externalMetadata)
        && Objects.equals(modelVersion, that.modelVersion)
        && Objects.equals(path, that.path)
        && Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalMetadata, modelVersion, path, table);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLineageObject.class)
        .add("externalMetadata", externalMetadata)
        .add("modelVersion", modelVersion)
        .add("path", path)
        .add("table", table)
        .toString();
  }
}
