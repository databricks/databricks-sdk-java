// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Progress of the initial replication of all in-scope assets (Unity Catalog and workspace assets)
 * of a FailoverGroup. Populated only while the FailoverGroup is in INITIAL_REPLICATION.
 */
@Generated
public class InitialReplicationProgress {
  /** Percent complete, 0-100. */
  @JsonProperty("completed")
  private Long completed;

  public InitialReplicationProgress setCompleted(Long completed) {
    this.completed = completed;
    return this;
  }

  public Long getCompleted() {
    return completed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitialReplicationProgress that = (InitialReplicationProgress) o;
    return Objects.equals(completed, that.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed);
  }

  @Override
  public String toString() {
    return new ToStringer(InitialReplicationProgress.class).add("completed", completed).toString();
  }
}
