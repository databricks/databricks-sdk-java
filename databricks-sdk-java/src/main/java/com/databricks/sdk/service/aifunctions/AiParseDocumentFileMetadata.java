// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metadata about the source file; present only for file-path input. */
@Generated
public class AiParseDocumentFileMetadata {
  /** Last-modified timestamp of the source file, as an HTTP date string. */
  @JsonProperty("file_modification_time")
  private String fileModificationTime;

  /** Base name of the source file. */
  @JsonProperty("file_name")
  private String fileName;

  /** Unity Catalog volume path of the source file. */
  @JsonProperty("file_path")
  private String filePath;

  /** Size of the source file in bytes. */
  @JsonProperty("file_size")
  private Long fileSize;

  public AiParseDocumentFileMetadata setFileModificationTime(String fileModificationTime) {
    this.fileModificationTime = fileModificationTime;
    return this;
  }

  public String getFileModificationTime() {
    return fileModificationTime;
  }

  public AiParseDocumentFileMetadata setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public String getFileName() {
    return fileName;
  }

  public AiParseDocumentFileMetadata setFilePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  public String getFilePath() {
    return filePath;
  }

  public AiParseDocumentFileMetadata setFileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  public Long getFileSize() {
    return fileSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiParseDocumentFileMetadata that = (AiParseDocumentFileMetadata) o;
    return Objects.equals(fileModificationTime, that.fileModificationTime)
        && Objects.equals(fileName, that.fileName)
        && Objects.equals(filePath, that.filePath)
        && Objects.equals(fileSize, that.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileModificationTime, fileName, filePath, fileSize);
  }

  @Override
  public String toString() {
    return new ToStringer(AiParseDocumentFileMetadata.class)
        .add("fileModificationTime", fileModificationTime)
        .add("fileName", fileName)
        .add("filePath", filePath)
        .add("fileSize", fileSize)
        .toString();
  }
}
