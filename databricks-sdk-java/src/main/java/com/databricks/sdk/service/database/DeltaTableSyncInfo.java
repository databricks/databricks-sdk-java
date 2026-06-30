// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class DeltaTableSyncInfo {
  /**
   * The timestamp when the above Delta version was committed in the source Delta table. Note: This
   * is the Delta commit time, not the time the data was written to the synced table.
   */
  @JsonProperty("delta_commit_timestamp")
  private String deltaCommitTimestamp;

  /** The Delta Lake commit version that was last successfully synced. */
  @JsonProperty("delta_commit_version")
  private Long deltaCommitVersion;

  public DeltaTableSyncInfo setDeltaCommitTimestamp(String deltaCommitTimestamp) {
    this.deltaCommitTimestamp = deltaCommitTimestamp;
    return this;
  }

  public String getDeltaCommitTimestamp() {
    return deltaCommitTimestamp;
  }

  public DeltaTableSyncInfo setDeltaCommitVersion(Long deltaCommitVersion) {
    this.deltaCommitVersion = deltaCommitVersion;
    return this;
  }

  public Long getDeltaCommitVersion() {
    return deltaCommitVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaTableSyncInfo that = (DeltaTableSyncInfo) o;
    return Objects.equals(deltaCommitTimestamp, that.deltaCommitTimestamp)
        && Objects.equals(deltaCommitVersion, that.deltaCommitVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaCommitTimestamp, deltaCommitVersion);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaTableSyncInfo.class)
        .add("deltaCommitTimestamp", deltaCommitTimestamp)
        .add("deltaCommitVersion", deltaCommitVersion)
        .toString();
  }
}
