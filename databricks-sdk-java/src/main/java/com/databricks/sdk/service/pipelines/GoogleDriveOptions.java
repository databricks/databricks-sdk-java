// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GoogleDriveOptions {
  /** */
  @JsonProperty("entity_type")
  private GoogleDriveOptionsGoogleDriveEntityType entityType;

  /** */
  @JsonProperty("file_ingestion_options")
  private FileIngestionOptions fileIngestionOptions;

  /** Google Drive URL. */
  @JsonProperty("url")
  private String url;

  public GoogleDriveOptions setEntityType(GoogleDriveOptionsGoogleDriveEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  public GoogleDriveOptionsGoogleDriveEntityType getEntityType() {
    return entityType;
  }

  public GoogleDriveOptions setFileIngestionOptions(FileIngestionOptions fileIngestionOptions) {
    this.fileIngestionOptions = fileIngestionOptions;
    return this;
  }

  public FileIngestionOptions getFileIngestionOptions() {
    return fileIngestionOptions;
  }

  public GoogleDriveOptions setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GoogleDriveOptions that = (GoogleDriveOptions) o;
    return Objects.equals(entityType, that.entityType)
        && Objects.equals(fileIngestionOptions, that.fileIngestionOptions)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, fileIngestionOptions, url);
  }

  @Override
  public String toString() {
    return new ToStringer(GoogleDriveOptions.class)
        .add("entityType", entityType)
        .add("fileIngestionOptions", fileIngestionOptions)
        .add("url", url)
        .toString();
  }
}
