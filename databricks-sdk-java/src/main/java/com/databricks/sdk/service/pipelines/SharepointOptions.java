// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SharepointOptions {
  /** (Optional) The type of SharePoint entity to ingest. If not specified, defaults to FILE. */
  @JsonProperty("entity_type")
  private SharepointOptionsSharepointEntityType entityType;

  /** (Optional) File ingestion options for processing files. */
  @JsonProperty("file_ingestion_options")
  private FileIngestionOptions fileIngestionOptions;

  /** Required. The SharePoint URL. */
  @JsonProperty("url")
  private String url;

  public SharepointOptions setEntityType(SharepointOptionsSharepointEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  public SharepointOptionsSharepointEntityType getEntityType() {
    return entityType;
  }

  public SharepointOptions setFileIngestionOptions(FileIngestionOptions fileIngestionOptions) {
    this.fileIngestionOptions = fileIngestionOptions;
    return this;
  }

  public FileIngestionOptions getFileIngestionOptions() {
    return fileIngestionOptions;
  }

  public SharepointOptions setUrl(String url) {
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
    SharepointOptions that = (SharepointOptions) o;
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
    return new ToStringer(SharepointOptions.class)
        .add("entityType", entityType)
        .add("fileIngestionOptions", fileIngestionOptions)
        .add("url", url)
        .toString();
  }
}
