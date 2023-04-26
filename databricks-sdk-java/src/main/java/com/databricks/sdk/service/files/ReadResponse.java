// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ReadResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ReadResponse {
  /**
   * The number of bytes read (could be less than `length` if we hit end of file). This refers to
   * number of bytes read in unencoded version (response data is base64-encoded).
   */
  @JsonProperty("bytes_read")
  private Long bytesRead;

  /** The base64-encoded contents of the file read. */
  @JsonProperty("data")
  private String data;

  /**
   * <p>Setter for the field <code>bytesRead</code>.</p>
   *
   * @param bytesRead a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.files.ReadResponse} object
   */
  public ReadResponse setBytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

  /**
   * <p>Getter for the field <code>bytesRead</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getBytesRead() {
    return bytesRead;
  }

  /**
   * <p>Setter for the field <code>data</code>.</p>
   *
   * @param data a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.files.ReadResponse} object
   */
  public ReadResponse setData(String data) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadResponse that = (ReadResponse) o;
    return Objects.equals(bytesRead, that.bytesRead) && Objects.equals(data, that.data);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(bytesRead, data);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ReadResponse.class)
        .add("bytesRead", bytesRead)
        .add("data", data)
        .toString();
  }
}
