// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A serverless compute resource. */
@Generated
public class ServerlessCompute {
  /** Whether the calling user has ManageServerlessComputePermission on this compute. */
  @JsonProperty("can_manage")
  private Boolean canManage;

  /** Whether the calling user has UseServerlessComputePermission on this compute. */
  @JsonProperty("can_use")
  private Boolean canUse;

  /** The creation timestamp. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Whether this is the workspace default compute for its compute_type. Default computes are
   * system-provisioned and cannot be deleted or renamed.
   */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /** The display name of the serverless compute. */
  @JsonProperty("name")
  private String name;

  /** The unique identifier of the serverless compute (UUID). */
  @JsonProperty("serverless_compute_id")
  private String serverlessComputeId;

  public ServerlessCompute setCanManage(Boolean canManage) {
    this.canManage = canManage;
    return this;
  }

  public Boolean getCanManage() {
    return canManage;
  }

  public ServerlessCompute setCanUse(Boolean canUse) {
    this.canUse = canUse;
    return this;
  }

  public Boolean getCanUse() {
    return canUse;
  }

  public ServerlessCompute setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ServerlessCompute setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  public Boolean getIsDefault() {
    return isDefault;
  }

  public ServerlessCompute setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServerlessCompute setServerlessComputeId(String serverlessComputeId) {
    this.serverlessComputeId = serverlessComputeId;
    return this;
  }

  public String getServerlessComputeId() {
    return serverlessComputeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServerlessCompute that = (ServerlessCompute) o;
    return Objects.equals(canManage, that.canManage)
        && Objects.equals(canUse, that.canUse)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(name, that.name)
        && Objects.equals(serverlessComputeId, that.serverlessComputeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canManage, canUse, createTime, isDefault, name, serverlessComputeId);
  }

  @Override
  public String toString() {
    return new ToStringer(ServerlessCompute.class)
        .add("canManage", canManage)
        .add("canUse", canUse)
        .add("createTime", createTime)
        .add("isDefault", isDefault)
        .add("name", name)
        .add("serverlessComputeId", serverlessComputeId)
        .toString();
  }
}
