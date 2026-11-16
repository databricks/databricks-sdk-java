// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A compute endpoint of a Lakebase Postgres branch. An endpoint provides the compute that runs
 * Postgres for the branch's data and the hostnames that clients connect to. Each branch has one
 * read-write endpoint, created together with the branch, and can have additional read-only
 * endpoints (read replicas).
 */
@Generated
public class Endpoint {
  /** A timestamp indicating when the compute endpoint was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The endpoint ID chosen when the endpoint was created. It is the final segment of `name`. */
  @JsonProperty("endpoint_id")
  private String endpointId;

  /**
   * Output only. The full resource path of the endpoint. Format:
   * projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}
   */
  @JsonProperty("name")
  private String name;

  /**
   * The branch containing this endpoint (API resource hierarchy). Format:
   * projects/{project_id}/branches/{branch_id}
   */
  @JsonProperty("parent")
  private String parent;

  /**
   * The desired configuration of the endpoint. Every field under `spec` except `endpoint_type` can
   * be changed after creation. See `status` for the configuration that is currently in effect.
   *
   * <p>Read the resource's current values from `status`, rather than `spec`. `spec` tracks field
   * ownership for infrastructure-as-code tools and may omit unmanaged fields.
   */
  @JsonProperty("spec")
  private EndpointSpec spec;

  /**
   * The configuration and state of the endpoint that are currently in effect, as reported by the
   * system, including the hostnames to connect to.
   */
  @JsonProperty("status")
  private EndpointStatus status;

  /**
   * A system-generated ID that identifies the endpoint. Unlike `name`, it is not derived from the
   * user-chosen endpoint ID. The endpoint's connection hostnames are based on this ID.
   */
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

  public Endpoint setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
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
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, endpointId, name, parent, spec, status, uid, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Endpoint.class)
        .add("createTime", createTime)
        .add("endpointId", endpointId)
        .add("name", name)
        .add("parent", parent)
        .add("spec", spec)
        .add("status", status)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }
}
