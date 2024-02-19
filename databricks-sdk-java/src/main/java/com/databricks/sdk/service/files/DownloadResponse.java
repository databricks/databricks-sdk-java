// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.io.InputStream;
import java.util.Objects;

@Generated
public class DownloadResponse {
  /** */
  private Long contentLength;

  /** */
  private String contentType;

  /** */
  private InputStream contents;

  /** */
  private String lastModified;

  public DownloadResponse setContentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  public Long getContentLength() {
    return contentLength;
  }

  public DownloadResponse setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public String getContentType() {
    return contentType;
  }

  public DownloadResponse setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public DownloadResponse setLastModified(String lastModified) {
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
    DownloadResponse that = (DownloadResponse) o;
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
    return new ToStringer(DownloadResponse.class)
        .add("contentLength", contentLength)
        .add("contentType", contentType)
        .add("contents", contents)
        .add("lastModified", lastModified)
        .toString();
  }
}
