// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Metadata related to Disaster Recovery. */
@Generated
public class DrReplicationInfo {
  /** */
  @JsonProperty("status")
  private DrReplicationStatus status;

  public DrReplicationInfo setStatus(DrReplicationStatus status) {
    this.status = status;
    return this;
  }

  public DrReplicationStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DrReplicationInfo that = (DrReplicationInfo) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(DrReplicationInfo.class).add("status", status).toString();
  }
}
