// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AiParseDocumentResponseMetadata {
  /** Describes the source file; present only for file-path input. */
  @JsonProperty("file_metadata")
  private AiParseDocumentFileMetadata fileMetadata;

  /** Unique identifier for the parse request. */
  @JsonProperty("id")
  private String id;

  /** The resolved function version. */
  @JsonProperty("version")
  private String version;

  public AiParseDocumentResponseMetadata setFileMetadata(AiParseDocumentFileMetadata fileMetadata) {
    this.fileMetadata = fileMetadata;
    return this;
  }

  public AiParseDocumentFileMetadata getFileMetadata() {
    return fileMetadata;
  }

  public AiParseDocumentResponseMetadata setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AiParseDocumentResponseMetadata setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiParseDocumentResponseMetadata that = (AiParseDocumentResponseMetadata) o;
    return Objects.equals(fileMetadata, that.fileMetadata)
        && Objects.equals(id, that.id)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileMetadata, id, version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiParseDocumentResponseMetadata.class)
        .add("fileMetadata", fileMetadata)
        .add("id", id)
        .add("version", version)
        .toString();
  }
}
