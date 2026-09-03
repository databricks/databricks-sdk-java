// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A Sandbox resource representing an execution environment. */
@Generated
public class Sandbox {
  /** Output only. The creation time of the sandbox. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Customer-supplied display label. Mutable via UpdateSandbox. Bounds enforced at the RPC boundary
   * (<=256 bytes, mirrors lakebox MAX_SANDBOX_NAME_LEN).
   */
  @JsonProperty("display_name")
  private String displayName;

  /** The AIP-compliant resource name, such as "sandboxes/my-sandbox". */
  @JsonProperty("name")
  private String name;

  /** The desired configuration of the sandbox, supplied by the caller at creation time. */
  @JsonProperty("spec")
  private SandboxSpec spec;

  /** The observed runtime state of the sandbox, populated by the server. */
  @JsonProperty("status")
  private SandboxStatus status;

  /** Output only. The last update time of the sandbox metadata and spec. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Sandbox setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Sandbox setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Sandbox setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Sandbox setSpec(SandboxSpec spec) {
    this.spec = spec;
    return this;
  }

  public SandboxSpec getSpec() {
    return spec;
  }

  public Sandbox setStatus(SandboxStatus status) {
    this.status = status;
    return this;
  }

  public SandboxStatus getStatus() {
    return status;
  }

  public Sandbox setUpdateTime(Timestamp updateTime) {
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
    Sandbox that = (Sandbox) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(name, that.name)
        && Objects.equals(spec, that.spec)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, displayName, name, spec, status, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Sandbox.class)
        .add("createTime", createTime)
        .add("displayName", displayName)
        .add("name", name)
        .add("spec", spec)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
