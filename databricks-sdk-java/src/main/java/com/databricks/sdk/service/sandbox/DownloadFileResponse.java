// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Header;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.util.Objects;

@Generated
public class DownloadFileResponse {
  /** The supported range unit: bytes. */
  @JsonIgnore
  @Header("Accept-Ranges")
  private String acceptRanges;

  /** The length of the response body in bytes. */
  @JsonIgnore
  @Header("Content-Length")
  private Long contentLength;

  /** The returned byte range and full file length, for a partial response. */
  @JsonIgnore
  @Header("Content-Range")
  private String contentRange;

  /** The media type of the response body: application/octet-stream. */
  @JsonIgnore
  @Header("Content-Type")
  private String contentType;

  /** */
  @JsonIgnore private InputStream contents;

  /** The entity tag used for conditional requests. */
  @JsonIgnore
  @Header("etag")
  private String etag;

  /** The modification time as an HTTP-date, when representable. */
  @JsonIgnore
  @Header("Last-Modified")
  private String lastModified;

  public DownloadFileResponse setAcceptRanges(String acceptRanges) {
    this.acceptRanges = acceptRanges;
    return this;
  }

  public String getAcceptRanges() {
    return acceptRanges;
  }

  public DownloadFileResponse setContentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }

  public Long getContentLength() {
    return contentLength;
  }

  public DownloadFileResponse setContentRange(String contentRange) {
    this.contentRange = contentRange;
    return this;
  }

  public String getContentRange() {
    return contentRange;
  }

  public DownloadFileResponse setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public String getContentType() {
    return contentType;
  }

  public DownloadFileResponse setContents(InputStream contents) {
    this.contents = contents;
    return this;
  }

  public InputStream getContents() {
    return contents;
  }

  public DownloadFileResponse setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DownloadFileResponse setLastModified(String lastModified) {
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
    DownloadFileResponse that = (DownloadFileResponse) o;
    return Objects.equals(acceptRanges, that.acceptRanges)
        && Objects.equals(contentLength, that.contentLength)
        && Objects.equals(contentRange, that.contentRange)
        && Objects.equals(contentType, that.contentType)
        && Objects.equals(contents, that.contents)
        && Objects.equals(etag, that.etag)
        && Objects.equals(lastModified, that.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acceptRanges, contentLength, contentRange, contentType, contents, etag, lastModified);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadFileResponse.class)
        .add("acceptRanges", acceptRanges)
        .add("contentLength", contentLength)
        .add("contentRange", contentRange)
        .add("contentType", contentType)
        .add("contents", contents)
        .add("etag", etag)
        .add("lastModified", lastModified)
        .toString();
  }
}
