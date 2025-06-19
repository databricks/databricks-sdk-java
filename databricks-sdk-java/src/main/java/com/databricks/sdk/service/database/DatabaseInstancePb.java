// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and storage.
 */
@Generated
class DatabaseInstancePb {
  @JsonProperty("capacity")
  private String capacity;

  @JsonProperty("creation_time")
  private String creationTime;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pg_version")
  private String pgVersion;

  @JsonProperty("read_write_dns")
  private String readWriteDns;

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

  public DatabaseInstancePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseInstancePb setPgVersion(String pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public String getPgVersion() {
    return pgVersion;
  }

  public DatabaseInstancePb setReadWriteDns(String readWriteDns) {
    this.readWriteDns = readWriteDns;
    return this;
  }

  public String getReadWriteDns() {
    return readWriteDns;
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
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(name, that.name)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(readWriteDns, that.readWriteDns)
        && Objects.equals(state, that.state)
        && Objects.equals(stopped, that.stopped)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capacity, creationTime, creator, name, pgVersion, readWriteDns, state, stopped, uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstancePb.class)
        .add("capacity", capacity)
        .add("creationTime", creationTime)
        .add("creator", creator)
        .add("name", name)
        .add("pgVersion", pgVersion)
        .add("readWriteDns", readWriteDns)
        .add("state", state)
        .add("stopped", stopped)
        .add("uid", uid)
        .toString();
  }
}
