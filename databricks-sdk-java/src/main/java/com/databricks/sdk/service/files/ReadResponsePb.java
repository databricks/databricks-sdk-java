// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ReadResponsePb {
  @JsonProperty("bytes_read")
  private Long bytesRead;

  @JsonProperty("data")
  private String data;

  public ReadResponsePb setBytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

  public Long getBytesRead() {
    return bytesRead;
  }

  public ReadResponsePb setData(String data) {
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
    ReadResponsePb that = (ReadResponsePb) o;
    return Objects.equals(bytesRead, that.bytesRead) && Objects.equals(data, that.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesRead, data);
  }

  @Override
  public String toString() {
    return new ToStringer(ReadResponsePb.class)
        .add("bytesRead", bytesRead)
        .add("data", data)
        .toString();
  }
}
