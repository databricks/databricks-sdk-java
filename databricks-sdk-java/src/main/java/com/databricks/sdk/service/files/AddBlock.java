// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AddBlock class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AddBlock {
  /** The base64-encoded data to append to the stream. This has a limit of 1 MB. */
  @JsonProperty("data")
  private String data;

  /** The handle on an open stream. */
  @JsonProperty("handle")
  private Long handle;

  /**
   * <p>Setter for the field <code>data</code>.</p>
   *
   * @param data a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.AddBlock} object
   */
  public AddBlock setData(String data) {
    this.data = data;
    return this;
  }

  /**
   * <p>Getter for the field <code>data</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getData() {
    return data;
  }

  /**
   * <p>Setter for the field <code>handle</code>.</p>
   *
   * @param handle a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.files.AddBlock} object
   */
  public AddBlock setHandle(Long handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>Getter for the field <code>handle</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getHandle() {
    return handle;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddBlock that = (AddBlock) o;
    return Objects.equals(data, that.data) && Objects.equals(handle, that.handle);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(data, handle);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AddBlock.class).add("data", data).add("handle", handle).toString();
  }
}
