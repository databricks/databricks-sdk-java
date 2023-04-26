// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get the contents of a file
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ReadDbfsRequest {
  /**
   * The number of bytes to read starting from the offset. This has a limit of 1 MB, and a default
   * value of 0.5 MB.
   */
  @QueryParam("length")
  private Long length;

  /** The offset to read from in bytes. */
  @QueryParam("offset")
  private Long offset;

  /** The path of the file to read. The path should be the absolute DBFS path. */
  @QueryParam("path")
  private String path;

  /**
   * <p>Setter for the field <code>length</code>.</p>
   *
   * @param length a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.files.ReadDbfsRequest} object
   */
  public ReadDbfsRequest setLength(Long length) {
    this.length = length;
    return this;
  }

  /**
   * <p>Getter for the field <code>length</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getLength() {
    return length;
  }

  /**
   * <p>Setter for the field <code>offset</code>.</p>
   *
   * @param offset a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.files.ReadDbfsRequest} object
   */
  public ReadDbfsRequest setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <p>Getter for the field <code>offset</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.ReadDbfsRequest} object
   */
  public ReadDbfsRequest setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadDbfsRequest that = (ReadDbfsRequest) o;
    return Objects.equals(length, that.length)
        && Objects.equals(offset, that.offset)
        && Objects.equals(path, that.path);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(length, offset, path);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ReadDbfsRequest.class)
        .add("length", length)
        .add("offset", offset)
        .add("path", path)
        .toString();
  }
}
