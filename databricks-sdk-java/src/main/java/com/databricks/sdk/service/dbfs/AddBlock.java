// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AddBlock {
  /** The base64-encoded data to append to the stream. This has a limit of 1 MB. */
  @JsonProperty("data")
  private String data;

  /** The handle on an open stream. */
  @JsonProperty("handle")
  private Long handle;

  public AddBlock setData(String data) {
    this.data = data;
    return this;
  }

  public String getData() {
    return data;
  }

  public AddBlock setHandle(Long handle) {
    this.handle = handle;
    return this;
  }

  public Long getHandle() {
    return handle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddBlock that = (AddBlock) o;
    return Objects.equals(data, that.data) && Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, handle);
  }

  @Override
  public String toString() {
    return new ToStringer(AddBlock.class).add("data", data).add("handle", handle).toString();
  }
}
