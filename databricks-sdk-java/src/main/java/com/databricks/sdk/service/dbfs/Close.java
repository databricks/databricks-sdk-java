// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Close {
  /** The handle on an open stream. */
  @JsonProperty("handle")
  private Long handle;

  public Close setHandle(Long handle) {
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
    Close that = (Close) o;
    return Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle);
  }

  @Override
  public String toString() {
    return new ToStringer(Close.class).add("handle", handle).toString();
  }
}
