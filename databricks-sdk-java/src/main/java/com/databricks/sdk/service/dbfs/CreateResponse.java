// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dbfs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateResponse {
  /**
   * Handle which should subsequently be passed into the AddBlock and Close calls when writing to a
   * file through a stream.
   */
  @JsonProperty("handle")
  private Long handle;

  public CreateResponse setHandle(Long handle) {
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
    CreateResponse that = (CreateResponse) o;
    return Objects.equals(handle, that.handle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateResponse.class).add("handle", handle).toString();
  }
}
