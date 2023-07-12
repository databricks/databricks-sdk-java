// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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

  public ReadResponse setBytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

  public Long getBytesRead() {
    return bytesRead;
  }

  public ReadResponse setData(String data) {
    this.data = data;
    return this;
  }

  public String getData() {
    return data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReadResponse that = (ReadResponse) o;
    return Objects.equals(bytesRead, that.bytesRead) && Objects.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesRead, data);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadResponse.class)
        .add("bytesRead", bytesRead)
        .add("data", data)
        .toString();
  }
}
