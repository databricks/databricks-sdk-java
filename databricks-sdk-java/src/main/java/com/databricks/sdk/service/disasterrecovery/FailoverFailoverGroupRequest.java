// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to failover a failover group to a new primary region. */
@Generated
public class FailoverFailoverGroupRequest {
  /**
   * Opaque version string for optimistic locking. If provided, must match the current etag. If
   * omitted, the failover proceeds regardless of current state.
   */
  @JsonProperty("etag")
  private String etag;

  /** The type of failover to perform. */
  @JsonProperty("failover_type")
  private FailoverFailoverGroupRequestFailoverType failoverType;

  /**
   * The fully qualified resource name of the failover group to failover. Format:
   * accounts/{account_id}/failover-groups/{failover_group_id}.
   */
  @JsonIgnore private String name;

  /**
   * The target primary region. Must be one of the derived regions and different from the current
   * effective_primary_region. Serves as an idempotency check.
   */
  @JsonProperty("target_primary_region")
  private String targetPrimaryRegion;

  public FailoverFailoverGroupRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public FailoverFailoverGroupRequest setFailoverType(
      FailoverFailoverGroupRequestFailoverType failoverType) {
    this.failoverType = failoverType;
    return this;
  }

  public FailoverFailoverGroupRequestFailoverType getFailoverType() {
    return failoverType;
  }

  public FailoverFailoverGroupRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FailoverFailoverGroupRequest setTargetPrimaryRegion(String targetPrimaryRegion) {
    this.targetPrimaryRegion = targetPrimaryRegion;
    return this;
  }

  public String getTargetPrimaryRegion() {
    return targetPrimaryRegion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FailoverFailoverGroupRequest that = (FailoverFailoverGroupRequest) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(failoverType, that.failoverType)
        && Objects.equals(name, that.name)
        && Objects.equals(targetPrimaryRegion, that.targetPrimaryRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, failoverType, name, targetPrimaryRegion);
  }

  @Override
  public String toString() {
    return new ToStringer(FailoverFailoverGroupRequest.class)
        .add("etag", etag)
        .add("failoverType", failoverType)
        .add("name", name)
        .add("targetPrimaryRegion", targetPrimaryRegion)
        .toString();
  }
}
