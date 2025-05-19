// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and storage.
 */
@Generated
public class DatabaseInstance {
  /** Password for admin user to create. If not provided, no user will be created. */
  @JsonProperty("admin_password")
  private String adminPassword;

  /** Name of the admin role for the instance. If not provided, defaults to 'databricks_admin'. */
  @JsonProperty("admin_rolename")
  private String adminRolename;

  /** The sku of the instance. Valid values are "CU_1", "CU_2", "CU_4". */
  @JsonProperty("capacity")
  private String capacity;

  /** The timestamp when the instance was created. */
  @JsonProperty("creation_time")
  private String creationTime;

  /** The email of the creator of the instance. */
  @JsonProperty("creator")
  private String creator;

  /** The name of the instance. This is the unique identifier for the instance. */
  @JsonProperty("name")
  private String name;

  /** The version of Postgres running on the instance. */
  @JsonProperty("pg_version")
  private String pgVersion;

  /** The DNS endpoint to connect to the instance for read+write access. */
  @JsonProperty("read_write_dns")
  private String readWriteDns;

  /** The current state of the instance. */
  @JsonProperty("state")
  private DatabaseInstanceState state;

  /** Whether the instance is stopped. */
  @JsonProperty("stopped")
  private Boolean stopped;

  /** An immutable UUID identifier for the instance. */
  @JsonProperty("uid")
  private String uid;

  public DatabaseInstance setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
    return this;
  }

  public String getAdminPassword() {
    return adminPassword;
  }

  public DatabaseInstance setAdminRolename(String adminRolename) {
    this.adminRolename = adminRolename;
    return this;
  }

  public String getAdminRolename() {
    return adminRolename;
  }

  public DatabaseInstance setCapacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  public String getCapacity() {
    return capacity;
  }

  public DatabaseInstance setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public DatabaseInstance setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public DatabaseInstance setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseInstance setPgVersion(String pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public String getPgVersion() {
    return pgVersion;
  }

  public DatabaseInstance setReadWriteDns(String readWriteDns) {
    this.readWriteDns = readWriteDns;
    return this;
  }

  public String getReadWriteDns() {
    return readWriteDns;
  }

  public DatabaseInstance setState(DatabaseInstanceState state) {
    this.state = state;
    return this;
  }

  public DatabaseInstanceState getState() {
    return state;
  }

  public DatabaseInstance setStopped(Boolean stopped) {
    this.stopped = stopped;
    return this;
  }

  public Boolean getStopped() {
    return stopped;
  }

  public DatabaseInstance setUid(String uid) {
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
    DatabaseInstance that = (DatabaseInstance) o;
    return Objects.equals(adminPassword, that.adminPassword)
        && Objects.equals(adminRolename, that.adminRolename)
        && Objects.equals(capacity, that.capacity)
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
        adminPassword,
        adminRolename,
        capacity,
        creationTime,
        creator,
        name,
        pgVersion,
        readWriteDns,
        state,
        stopped,
        uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstance.class)
        .add("adminPassword", adminPassword)
        .add("adminRolename", adminRolename)
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
