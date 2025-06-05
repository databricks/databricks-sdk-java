// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get the contents of a file */
@Generated
class ReadDbfsRequestPb {
  @JsonIgnore
  @QueryParam("length")
  private Long length;

  @JsonIgnore
  @QueryParam("offset")
  private Long offset;

  @JsonIgnore
  @QueryParam("path")
  private String path;

  public ReadDbfsRequestPb setLength(Long length) {
    this.length = length;
    return this;
  }

  public Long getLength() {
    return length;
  }

  public ReadDbfsRequestPb setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public ReadDbfsRequestPb setPath(String path) {
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
    ReadDbfsRequestPb that = (ReadDbfsRequestPb) o;
    return Objects.equals(length, that.length)
        && Objects.equals(offset, that.offset)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, offset, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadDbfsRequestPb.class)
        .add("length", length)
        .add("offset", offset)
        .add("path", path)
        .toString();
  }
}
