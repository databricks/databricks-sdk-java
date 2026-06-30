// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Header;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetMetadataResponse {
  /** The length of the HTTP response body in bytes. */
  @JsonIgnore
  @Header("content-length")
  private Long contentLength;

  /** */
  @JsonIgnore
  @Header("content-type")
  private String contentType;

  /** The last modified time of the file in HTTP-date (RFC 7231) format. */
  @JsonIgnore
  @Header("last-modified")
  private String lastModified;

  public GetMetadataResponse setContentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  public Long getContentLength() {
    return contentLength;
  }

  public GetMetadataResponse setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public String getContentType() {
    return contentType;
  }

  public GetMetadataResponse setLastModified(String lastModified) {
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
    GetMetadataResponse that = (GetMetadataResponse) o;
    return Objects.equals(contentLength, that.contentLength)
        && Objects.equals(contentType, that.contentType)
        && Objects.equals(lastModified, that.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, contentType, lastModified);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetadataResponse.class)
        .add("contentLength", contentLength)
        .add("contentType", contentType)
        .add("lastModified", lastModified)
        .toString();
  }
}
