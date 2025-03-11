// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The request field `direct_download` determines whether a JSON response or binary contents are
 * returned by this endpoint.
 */
@Generated
public class ExportResponse {
  /**
   * The base64-encoded content. If the limit (10MB) is exceeded, exception with error code
   * **MAX_NOTEBOOK_SIZE_EXCEEDED** is thrown.
   */
  @JsonProperty("content")
  private String content;

  /** The file type of the exported file. */
  @JsonProperty("file_type")
  private String fileType;

  public ExportResponse setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ExportResponse setFileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  public String getFileType() {
    return fileType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportResponse that = (ExportResponse) o;
    return Objects.equals(content, that.content) && Objects.equals(fileType, that.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, fileType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportResponse.class)
        .add("content", content)
        .add("fileType", fileType)
        .toString();
  }
}
