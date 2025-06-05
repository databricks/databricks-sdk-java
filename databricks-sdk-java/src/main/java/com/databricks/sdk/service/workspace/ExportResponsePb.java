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
class ExportResponsePb {
  @JsonProperty("content")
  private String content;

  @JsonProperty("file_type")
  private String fileType;

  public ExportResponsePb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ExportResponsePb setFileType(String fileType) {
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
    ExportResponsePb that = (ExportResponsePb) o;
    return Objects.equals(content, that.content) && Objects.equals(fileType, that.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, fileType);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportResponsePb.class)
        .add("content", content)
        .add("fileType", fileType)
        .toString();
  }
}
