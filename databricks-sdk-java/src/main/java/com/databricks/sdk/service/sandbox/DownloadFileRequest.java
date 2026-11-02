// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DownloadFileRequest {
  /** A single byte range, such as bytes=0-1023 or bytes=-1024. Equivalent to the Range header. */
  @JsonIgnore
  @QueryParam("byte_range")
  private String byteRange;

  /**
   * Entity tags or *. A mismatch returns 412 Precondition Failed. Equivalent to the If-Match
   * header.
   */
  @JsonIgnore
  @QueryParam("if_match")
  private String ifMatch;

  /**
   * An HTTP-date. Returns 304 if the file has not changed since this time. Ignored when
   * If-None-Match is present. Equivalent to the If-Modified-Since header.
   */
  @JsonIgnore
  @QueryParam("if_modified_since")
  private String ifModifiedSince;

  /** Entity tags or *. A match returns 304 Not Modified. Equivalent to the If-None-Match header. */
  @JsonIgnore
  @QueryParam("if_none_match")
  private String ifNoneMatch;

  /**
   * A strong entity tag. A mismatch, weak entity tag, or HTTP-date causes a full download.
   * Equivalent to the If-Range header.
   */
  @JsonIgnore
  @QueryParam("if_range")
  private String ifRange;

  /**
   * An HTTP-date. Returns 412 if the file has changed since this time. Ignored when If-Match is
   * present. Equivalent to the If-Unmodified-Since header.
   */
  @JsonIgnore
  @QueryParam("if_unmodified_since")
  private String ifUnmodifiedSince;

  /** The sandbox resource name, in the form sandboxes/{sandbox_id}. */
  @JsonIgnore private String parent;

  /** The absolute UTF-8 path of the file inside the sandbox. */
  @JsonIgnore
  @QueryParam("path")
  private String path;

  public DownloadFileRequest setByteRange(String byteRange) {
    this.byteRange = byteRange;
    return this;
  }

  public String getByteRange() {
    return byteRange;
  }

  public DownloadFileRequest setIfMatch(String ifMatch) {
    this.ifMatch = ifMatch;
    return this;
  }

  public String getIfMatch() {
    return ifMatch;
  }

  public DownloadFileRequest setIfModifiedSince(String ifModifiedSince) {
    this.ifModifiedSince = ifModifiedSince;
    return this;
  }

  public String getIfModifiedSince() {
    return ifModifiedSince;
  }

  public DownloadFileRequest setIfNoneMatch(String ifNoneMatch) {
    this.ifNoneMatch = ifNoneMatch;
    return this;
  }

  public String getIfNoneMatch() {
    return ifNoneMatch;
  }

  public DownloadFileRequest setIfRange(String ifRange) {
    this.ifRange = ifRange;
    return this;
  }

  public String getIfRange() {
    return ifRange;
  }

  public DownloadFileRequest setIfUnmodifiedSince(String ifUnmodifiedSince) {
    this.ifUnmodifiedSince = ifUnmodifiedSince;
    return this;
  }

  public String getIfUnmodifiedSince() {
    return ifUnmodifiedSince;
  }

  public DownloadFileRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public DownloadFileRequest setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadFileRequest that = (DownloadFileRequest) o;
    return Objects.equals(byteRange, that.byteRange)
        && Objects.equals(ifMatch, that.ifMatch)
        && Objects.equals(ifModifiedSince, that.ifModifiedSince)
        && Objects.equals(ifNoneMatch, that.ifNoneMatch)
        && Objects.equals(ifRange, that.ifRange)
        && Objects.equals(ifUnmodifiedSince, that.ifUnmodifiedSince)
        && Objects.equals(parent, that.parent)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        byteRange, ifMatch, ifModifiedSince, ifNoneMatch, ifRange, ifUnmodifiedSince, parent, path);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadFileRequest.class)
        .add("byteRange", byteRange)
        .add("ifMatch", ifMatch)
        .add("ifModifiedSince", ifModifiedSince)
        .add("ifNoneMatch", ifNoneMatch)
        .add("ifRange", ifRange)
        .add("ifUnmodifiedSince", ifUnmodifiedSince)
        .add("parent", parent)
        .add("path", path)
        .toString();
  }
}
