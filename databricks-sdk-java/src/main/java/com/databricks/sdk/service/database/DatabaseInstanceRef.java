// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * DatabaseInstanceRef is a reference to a database instance. It is used in the DatabaseInstance
 * object to refer to the parent instance of an instance and to refer the child instances of an
 * instance. To specify as a parent instance during creation of an instance, the lsn and branch_time
 * fields are optional. If not specified, the child instance will be created from the latest lsn of
 * the parent. If both lsn and branch_time are specified, the lsn will be used to create the child
 * instance.
 */
@Generated
public class DatabaseInstanceRef {
  /**
   * Branch time of the ref database instance. For a parent ref instance, this is the point in time
   * on the parent instance from which the instance was created. For a child ref instance, this is
   * the point in time on the instance from which the child instance was created. Input: For
   * specifying the point in time to create a child instance. Optional. Output: Only populated if
   * provided as input to create a child instance.
   */
  @JsonProperty("branch_time")
  private String branchTime;

  /**
   * WAL LSN of the ref database instance. For a parent ref instance, this is the LSN on the parent
   * instance from which the instance was created. For a child ref instance, this is the LSN on the
   * instance from which the child instance was created. Input: For specifying the WAL LSN to create
   * a child instance. Optional. Output: Always populated
   */
  @JsonProperty("lsn")
  private String lsn;

  /** Name of the ref database instance. */
  @JsonProperty("name")
  private String name;

  /** Id of the ref database instance. */
  @JsonProperty("uid")
  private String uid;

  public DatabaseInstanceRef setBranchTime(String branchTime) {
    this.branchTime = branchTime;
    return this;
  }

  public String getBranchTime() {
    return branchTime;
  }

  public DatabaseInstanceRef setLsn(String lsn) {
    this.lsn = lsn;
    return this;
  }

  public String getLsn() {
    return lsn;
  }

  public DatabaseInstanceRef setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseInstanceRef setUid(String uid) {
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
    DatabaseInstanceRef that = (DatabaseInstanceRef) o;
    return Objects.equals(branchTime, that.branchTime)
        && Objects.equals(lsn, that.lsn)
        && Objects.equals(name, that.name)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchTime, lsn, name, uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstanceRef.class)
        .add("branchTime", branchTime)
        .add("lsn", lsn)
        .add("name", name)
        .add("uid", uid)
        .toString();
  }
}
