// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and storage.
 */
@Generated
class DatabaseInstancePb {
  @JsonProperty("capacity")
  private String capacity;

  @JsonProperty("child_instance_refs")
  private Collection<DatabaseInstanceRef> childInstanceRefs;

  @JsonProperty("creation_time")
  private String creationTime;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("enable_readable_secondaries")
  private Boolean enableReadableSecondaries;

  @JsonProperty("name")
  private String name;

  @JsonProperty("node_count")
  private Long nodeCount;

  @JsonProperty("parent_instance_ref")
  private DatabaseInstanceRef parentInstanceRef;

  @JsonProperty("pg_version")
  private String pgVersion;

  @JsonProperty("read_only_dns")
  private String readOnlyDns;

  @JsonProperty("read_write_dns")
  private String readWriteDns;

  @JsonProperty("retention_window_in_days")
  private Long retentionWindowInDays;

  @JsonProperty("state")
  private DatabaseInstanceState state;

  @JsonProperty("stopped")
  private Boolean stopped;

  @JsonProperty("uid")
  private String uid;

  public DatabaseInstancePb setCapacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  public String getCapacity() {
    return capacity;
  }

  public DatabaseInstancePb setChildInstanceRefs(
      Collection<DatabaseInstanceRef> childInstanceRefs) {
    this.childInstanceRefs = childInstanceRefs;
    return this;
  }

  public Collection<DatabaseInstanceRef> getChildInstanceRefs() {
    return childInstanceRefs;
  }

  public DatabaseInstancePb setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public DatabaseInstancePb setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public DatabaseInstancePb setEnableReadableSecondaries(Boolean enableReadableSecondaries) {
    this.enableReadableSecondaries = enableReadableSecondaries;
    return this;
  }

  public Boolean getEnableReadableSecondaries() {
    return enableReadableSecondaries;
  }

  public DatabaseInstancePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseInstancePb setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  public Long getNodeCount() {
    return nodeCount;
  }

  public DatabaseInstancePb setParentInstanceRef(DatabaseInstanceRef parentInstanceRef) {
    this.parentInstanceRef = parentInstanceRef;
    return this;
  }

  public DatabaseInstanceRef getParentInstanceRef() {
    return parentInstanceRef;
  }

  public DatabaseInstancePb setPgVersion(String pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public String getPgVersion() {
    return pgVersion;
  }

  public DatabaseInstancePb setReadOnlyDns(String readOnlyDns) {
    this.readOnlyDns = readOnlyDns;
    return this;
  }

  public String getReadOnlyDns() {
    return readOnlyDns;
  }

  public DatabaseInstancePb setReadWriteDns(String readWriteDns) {
    this.readWriteDns = readWriteDns;
    return this;
  }

  public String getReadWriteDns() {
    return readWriteDns;
  }

  public DatabaseInstancePb setRetentionWindowInDays(Long retentionWindowInDays) {
    this.retentionWindowInDays = retentionWindowInDays;
    return this;
  }

  public Long getRetentionWindowInDays() {
    return retentionWindowInDays;
  }

  public DatabaseInstancePb setState(DatabaseInstanceState state) {
    this.state = state;
    return this;
  }

  public DatabaseInstanceState getState() {
    return state;
  }

  public DatabaseInstancePb setStopped(Boolean stopped) {
    this.stopped = stopped;
    return this;
  }

  public Boolean getStopped() {
    return stopped;
  }

  public DatabaseInstancePb setUid(String uid) {
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
    DatabaseInstancePb that = (DatabaseInstancePb) o;
    return Objects.equals(capacity, that.capacity)
        && Objects.equals(childInstanceRefs, that.childInstanceRefs)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(enableReadableSecondaries, that.enableReadableSecondaries)
        && Objects.equals(name, that.name)
        && Objects.equals(nodeCount, that.nodeCount)
        && Objects.equals(parentInstanceRef, that.parentInstanceRef)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(readOnlyDns, that.readOnlyDns)
        && Objects.equals(readWriteDns, that.readWriteDns)
        && Objects.equals(retentionWindowInDays, that.retentionWindowInDays)
        && Objects.equals(state, that.state)
        && Objects.equals(stopped, that.stopped)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capacity,
        childInstanceRefs,
        creationTime,
        creator,
        enableReadableSecondaries,
        name,
        nodeCount,
        parentInstanceRef,
        pgVersion,
        readOnlyDns,
        readWriteDns,
        retentionWindowInDays,
        state,
        stopped,
        uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstancePb.class)
        .add("capacity", capacity)
        .add("childInstanceRefs", childInstanceRefs)
        .add("creationTime", creationTime)
        .add("creator", creator)
        .add("enableReadableSecondaries", enableReadableSecondaries)
        .add("name", name)
        .add("nodeCount", nodeCount)
        .add("parentInstanceRef", parentInstanceRef)
        .add("pgVersion", pgVersion)
        .add("readOnlyDns", readOnlyDns)
        .add("readWriteDns", readWriteDns)
        .add("retentionWindowInDays", retentionWindowInDays)
        .add("state", state)
        .add("stopped", stopped)
        .add("uid", uid)
        .toString();
  }
}
