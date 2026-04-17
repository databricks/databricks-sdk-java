// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class SyncedTable {
  /** */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Output only. The Full resource name of the synced table in Postgres where (catalog, schema,
   * table) are the UC entity names.
   *
   * <p>Format "synced_tables/{catalog}.{schema}.{table}"
   *
   * <p>For the corresponding source table in the Unity catalog look for the
   * "source_table_full_name" attribute.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Configuration details of the synced table, such as the source table, scheduling policy, etc.
   * This attribute is specified at creation time and most fields are returned as is on subsequent
   * queries.
   */
  @JsonProperty("spec")
  private SyncedTableSyncedTableSpec spec;

  /** Synced Table data synchronization status. */
  @JsonProperty("status")
  private SyncedTableSyncedTableStatus status;

  /** The Unity Catalog table ID for this synced table. */
  @JsonProperty("uid")
  private String uid;

  public SyncedTable setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public SyncedTable setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SyncedTable setSpec(SyncedTableSyncedTableSpec spec) {
    this.spec = spec;
    return this;
  }

  public SyncedTableSyncedTableSpec getSpec() {
    return spec;
  }

  public SyncedTable setStatus(SyncedTableSyncedTableStatus status) {
    this.status = status;
    return this;
  }

  public SyncedTableSyncedTableStatus getStatus() {
    return status;
  }

  public SyncedTable setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTable that = (SyncedTable) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, spec, status, uid);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTable.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .toString();
  }
}
