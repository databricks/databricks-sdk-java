// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class InstancePoolStatus {
  /**
   * List of errors for pending instances that failed to launch, most recent first. The list holds
   * at most `min_idle_instances` entries, and never more than 20, and is emptied once the pool has
   * at least `min_idle_instances` available instances and no pending ones.
   */
  @JsonProperty("pending_instance_errors")
  private Collection<PendingInstanceError> pendingInstanceErrors;

  public InstancePoolStatus setPendingInstanceErrors(
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
    InstancePoolStatus that = (InstancePoolStatus) o;
    return Objects.equals(pendingInstanceErrors, that.pendingInstanceErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingInstanceErrors);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolStatus.class)
        .add("pendingInstanceErrors", pendingInstanceErrors)
        .toString();
  }
}
