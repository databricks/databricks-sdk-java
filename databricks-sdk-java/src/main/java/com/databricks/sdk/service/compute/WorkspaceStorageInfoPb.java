// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A storage location in Workspace Filesystem (WSFS) */
@Generated
class WorkspaceStorageInfoPb {
  @JsonProperty("destination")
  private String destination;

  public WorkspaceStorageInfoPb setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceStorageInfoPb that = (WorkspaceStorageInfoPb) o;
    return Objects.equals(destination, that.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceStorageInfoPb.class).add("destination", destination).toString();
  }
}
