// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.commands;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ContextStatusResponse {
  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("status")
  private ContextStatus status;

  public ContextStatusResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ContextStatusResponse setStatus(ContextStatus status) {
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
    ContextStatusResponse that = (ContextStatusResponse) o;
    return Objects.equals(id, that.id) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @Override
  public String toString() {
    return new ToStringer(ContextStatusResponse.class)
        .add("id", id)
        .add("status", status)
        .toString();
  }
}
