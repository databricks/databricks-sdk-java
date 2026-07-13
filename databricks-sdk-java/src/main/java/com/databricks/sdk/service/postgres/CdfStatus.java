// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * The read-only replication status of a single Postgres table replicated under a CdfConfig. One
 * status exists per replicated table. It is created automatically and cannot be modified.
 */
@Generated
public class CdfStatus {
  /** The high-watermark Log Sequence Number (LSN) committed to Delta Lake. */
  @JsonProperty("committed_lsn")
  private String committedLsn;

  /** When replication for this table was first established. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The last time changes for this table were written to Delta Lake. */
  @JsonProperty("last_sync_time")
  private Timestamp lastSyncTime;

  /**
   * Output only. The full resource name of the CdfStatus. Format:
   * projects/{project}/branches/{branch}/databases/{database}/cdf-configs/{cdf_config}/cdf-statuses/{cdf_status}
   * The {cdf_status} segment is the Postgres table name.
   */
  @JsonProperty("name")
  private String name;

  /** The Postgres table being replicated. */
  @JsonProperty("postgres_table")
  private String postgresTable;

  /** The current replication state of this table. */
  @JsonProperty("state")
  private CdfState state;

  /**
   * Human-readable detail for the current state (e.g. the skip/error reason). Empty for healthy
   * states.
   */
  @JsonProperty("status_detail")
  private String statusDetail;

  /** The Unity Catalog table receiving replicated data. */
  @JsonProperty("uc_table")
  private String ucTable;

  public CdfStatus setCommittedLsn(String committedLsn) {
    this.committedLsn = committedLsn;
    return this;
  }

  public String getCommittedLsn() {
    return committedLsn;
  }

  public CdfStatus setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public CdfStatus setLastSyncTime(Timestamp lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
    return this;
  }

  public Timestamp getLastSyncTime() {
    return lastSyncTime;
  }

  public CdfStatus setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CdfStatus setPostgresTable(String postgresTable) {
    this.postgresTable = postgresTable;
    return this;
  }

  public String getPostgresTable() {
    return postgresTable;
  }

  public CdfStatus setState(CdfState state) {
    this.state = state;
    return this;
  }

  public CdfState getState() {
    return state;
  }

  public CdfStatus setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  public String getStatusDetail() {
    return statusDetail;
  }

  public CdfStatus setUcTable(String ucTable) {
    this.ucTable = ucTable;
    return this;
  }

  public String getUcTable() {
    return ucTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CdfStatus that = (CdfStatus) o;
    return Objects.equals(committedLsn, that.committedLsn)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(lastSyncTime, that.lastSyncTime)
        && Objects.equals(name, that.name)
        && Objects.equals(postgresTable, that.postgresTable)
        && Objects.equals(state, that.state)
        && Objects.equals(statusDetail, that.statusDetail)
        && Objects.equals(ucTable, that.ucTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        committedLsn, createTime, lastSyncTime, name, postgresTable, state, statusDetail, ucTable);
  }

  @Override
  public String toString() {
    return new ToStringer(CdfStatus.class)
        .add("committedLsn", committedLsn)
        .add("createTime", createTime)
        .add("lastSyncTime", lastSyncTime)
        .add("name", name)
        .add("postgresTable", postgresTable)
        .add("state", state)
        .add("statusDetail", statusDetail)
        .add("ucTable", ucTable)
        .toString();
  }
}
