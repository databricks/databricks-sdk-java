// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class InstancePoolStatusPb {
  @JsonProperty("pending_instance_errors")
  private Collection<PendingInstanceError> pendingInstanceErrors;

  public InstancePoolStatusPb setPendingInstanceErrors(
      Collection<PendingInstanceError> pendingInstanceErrors) {
    this.pendingInstanceErrors = pendingInstanceErrors;
    return this;
  }

  public Collection<PendingInstanceError> getPendingInstanceErrors() {
    return pendingInstanceErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolStatusPb that = (InstancePoolStatusPb) o;
    return Objects.equals(pendingInstanceErrors, that.pendingInstanceErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingInstanceErrors);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolStatusPb.class)
        .add("pendingInstanceErrors", pendingInstanceErrors)
        .toString();
  }
}
