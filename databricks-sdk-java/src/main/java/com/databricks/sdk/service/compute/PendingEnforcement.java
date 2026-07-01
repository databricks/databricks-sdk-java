// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * Represents a pending enforcement on a cluster, which contains the changes to make to the cluster
 * configuration when the cluster is next terminated or restarted.
 */
@Generated
public class PendingEnforcement {
  /**
   * Whether the pending enforcement will be applied. A pending enforcement begins in `ACTIVE`
   * state. If the enforcement fails to apply too many times, the state transitions to `INACTIVE`.
   * Afterwards, the enforcement must be re-scheduled to become `ACTIVE` again.
   */
  @JsonProperty("enforcement_status")
  private PendingEnforcementEnforcementStatus enforcementStatus;

  /** The time the pending enforcement was initiated. */
  @JsonProperty("initiate_time")
  private Timestamp initiateTime;

  /** The user who initiated the pending enforcement. */
  @JsonProperty("initiator_user")
  private String initiatorUser;

  /**
   * A list of changes that will be made to the cluster configuration when the pending enforcement
   * is applied.
   */
  @JsonProperty("target_changes")
  private Collection<ClusterSettingsChange> targetChanges;

  /** The new configuration to apply upon cluster termination or restart. */
  @JsonProperty("target_spec")
  private EnforcePolicyComplianceForClusterResponseClusterSettings targetSpec;

  public PendingEnforcement setEnforcementStatus(
      PendingEnforcementEnforcementStatus enforcementStatus) {
    this.enforcementStatus = enforcementStatus;
    return this;
  }

  public PendingEnforcementEnforcementStatus getEnforcementStatus() {
    return enforcementStatus;
  }

  public PendingEnforcement setInitiateTime(Timestamp initiateTime) {
    this.initiateTime = initiateTime;
    return this;
  }

  public Timestamp getInitiateTime() {
    return initiateTime;
  }

  public PendingEnforcement setInitiatorUser(String initiatorUser) {
    this.initiatorUser = initiatorUser;
    return this;
  }

  public String getInitiatorUser() {
    return initiatorUser;
  }

  public PendingEnforcement setTargetChanges(Collection<ClusterSettingsChange> targetChanges) {
    this.targetChanges = targetChanges;
    return this;
  }

  public Collection<ClusterSettingsChange> getTargetChanges() {
    return targetChanges;
  }

  public PendingEnforcement setTargetSpec(
      EnforcePolicyComplianceForClusterResponseClusterSettings targetSpec) {
    this.targetSpec = targetSpec;
    return this;
  }

  public EnforcePolicyComplianceForClusterResponseClusterSettings getTargetSpec() {
    return targetSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PendingEnforcement that = (PendingEnforcement) o;
    return Objects.equals(enforcementStatus, that.enforcementStatus)
        && Objects.equals(initiateTime, that.initiateTime)
        && Objects.equals(initiatorUser, that.initiatorUser)
        && Objects.equals(targetChanges, that.targetChanges)
        && Objects.equals(targetSpec, that.targetSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enforcementStatus, initiateTime, initiatorUser, targetChanges, targetSpec);
  }

  @Override
  public String toString() {
    return new ToStringer(PendingEnforcement.class)
        .add("enforcementStatus", enforcementStatus)
        .add("initiateTime", initiateTime)
        .add("initiatorUser", initiatorUser)
        .add("targetChanges", targetChanges)
        .add("targetSpec", targetSpec)
        .toString();
  }
}
