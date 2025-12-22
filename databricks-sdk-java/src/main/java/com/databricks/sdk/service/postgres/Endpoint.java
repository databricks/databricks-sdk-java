// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class Endpoint {
  /** A timestamp indicating when the compute endpoint was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * The resource name of the endpoint. Format:
   * projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}
   */
  @JsonProperty("name")
  private String name;

  /** The branch containing this endpoint. Format: projects/{project_id}/branches/{branch_id} */
  @JsonProperty("parent")
  private String parent;

  /** The desired state of an Endpoint. */
  @JsonProperty("spec")
  private EndpointSpec spec;

  /** */
  @JsonProperty("status")
  private EndpointStatus status;

  /** System generated unique ID for the endpoint. */
  @JsonProperty("uid")
  private String uid;

  /** A timestamp indicating when the compute endpoint was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Endpoint setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Endpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Endpoint setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public Endpoint setSpec(EndpointSpec spec) {
    this.spec = spec;
    return this;
  }

  public EndpointSpec getSpec() {
    return spec;
  }

  public Endpoint setStatus(EndpointStatus status) {
    this.status = status;
    return this;
  }

  public EndpointStatus getStatus() {
    return status;
  }

  public Endpoint setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public Endpoint setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Endpoint that = (Endpoint) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, name, parent, spec, status, uid, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Endpoint.class)
        .add("createTime", createTime)
        .add("name", name)
        .add("parent", parent)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
