// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Header;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.util.Objects;

@Generated
class DownloadResponsePb {
  @JsonIgnore
  @Header("content-length")
  private Long contentLength;

  @JsonIgnore
  @Header("content-type")
  private String contentType;

  @JsonIgnore private InputStream contents;

  @JsonIgnore
  @Header("last-modified")
  private String lastModified;

  public DownloadResponsePb setContentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  public Long getContentLength() {
    return contentLength;
  }

  public DownloadResponsePb setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public String getContentType() {
    return contentType;
  }

  public DownloadResponsePb setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public DownloadResponsePb setLastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  public String getLastModified() {
    return lastModified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadResponsePb that = (DownloadResponsePb) o;
    return Objects.equals(contentLength, that.contentLength)
        && Objects.equals(contentType, that.contentType)
        && Objects.equals(contents, that.contents)
        && Objects.equals(lastModified, that.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, contentType, contents, lastModified);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadResponsePb.class)
        .add("contentLength", contentLength)
        .add("contentType", contentType)
        .add("contents", contents)
        .add("lastModified", lastModified)
        .toString();
  }
}
