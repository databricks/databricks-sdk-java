// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ContextStatusResponsePb {
  @JsonProperty("id")
  private String id;

  @JsonProperty("status")
  private ContextStatus status;

  public ContextStatusResponsePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ContextStatusResponsePb setStatus(ContextStatus status) {
    this.status = status;
    return this;
  }

  public ContextStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContextStatusResponsePb that = (ContextStatusResponsePb) o;
    return Objects.equals(id, that.id) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @Override
  public String toString() {
    return new ToStringer(ContextStatusResponsePb.class)
        .add("id", id)
        .add("status", status)
        .toString();
  }
}
