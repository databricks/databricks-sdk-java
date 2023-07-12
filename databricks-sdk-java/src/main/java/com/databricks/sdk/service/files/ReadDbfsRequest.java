// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get the contents of a file
 */
@Generated
public class ReadDbfsRequest {
  /**
   * The number of bytes to read starting from the offset. This has a limit of 1
   * MB, and a default value of 0.5 MB.
   */
  @QueryParam("length")
  private Long length;
  
  /**
   * The offset to read from in bytes.
   */
  @QueryParam("offset")
  private Long offset;
  
  /**
   * The path of the file to read. The path should be the absolute DBFS path.
   */
  @QueryParam("path")
  private String path;
  
  public ReadDbfsRequest setLength(Long length) {
    this.length = length;
    return this;
  }

  public Long getLength() {
    return length;
  }
  
  public ReadDbfsRequest setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }
  
  public ReadDbfsRequest setPath(String path) {
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
    ReadDbfsRequest that = (ReadDbfsRequest) o;
    return Objects.equals(length, that.length)
    && Objects.equals(offset, that.offset)
    && Objects.equals(path, that.path)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, offset, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadDbfsRequest.class)
      .add("length", length)
      .add("offset", offset)
      .add("path", path).toString();
  }
}
