// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Publicly visible central clean room details. */
@Generated
public class CleanRoomRemoteDetail {
  /** Central clean room ID. */
  @JsonProperty("central_clean_room_id")
  private String centralCleanRoomId;

  /** Cloud vendor (aws,azure,gcp) of the central clean room. */
  @JsonProperty("cloud_vendor")
  private String cloudVendor;

  /**
   * Collaborators in the central clean room. There should one and only one collaborator in the list
   * that satisfies the owner condition:
   *
   * <p>1. It has the creator's global_metastore_id (determined by caller of CreateCleanRoom).
   *
   * <p>2. Its invite_recipient_email is empty.
   */
  @JsonProperty("collaborators")
  private Collection<CleanRoomCollaborator> collaborators;

  /**
   * The compliance security profile used to process regulated data following compliance standards.
   */
  @JsonProperty("compliance_security_profile")
  private ComplianceSecurityProfile complianceSecurityProfile;

  /** Collaborator who creates the clean room. */
  @JsonProperty("creator")
  private CleanRoomCollaborator creator;

  /** Egress network policy to apply to the central clean room workspace. */
  @JsonProperty("egress_network_policy")
  private com.databricks.sdk.service.settings.EgressNetworkPolicy egressNetworkPolicy;

  /** Region of the central clean room. */
  @JsonProperty("region")
  private String region;

  public CleanRoomRemoteDetail setCentralCleanRoomId(String centralCleanRoomId) {
    this.centralCleanRoomId = centralCleanRoomId;
    return this;
  }

  public String getCentralCleanRoomId() {
    return centralCleanRoomId;
  }

  public CleanRoomRemoteDetail setCloudVendor(String cloudVendor) {
    this.cloudVendor = cloudVendor;
    return this;
  }

  public String getCloudVendor() {
    return cloudVendor;
  }

  public CleanRoomRemoteDetail setCollaborators(Collection<CleanRoomCollaborator> collaborators) {
    this.collaborators = collaborators;
    return this;
  }

  public Collection<CleanRoomCollaborator> getCollaborators() {
    return collaborators;
  }

  public CleanRoomRemoteDetail setComplianceSecurityProfile(
      ComplianceSecurityProfile complianceSecurityProfile) {
    this.complianceSecurityProfile = complianceSecurityProfile;
    return this;
  }

  public ComplianceSecurityProfile getComplianceSecurityProfile() {
    return complianceSecurityProfile;
  }

  public CleanRoomRemoteDetail setCreator(CleanRoomCollaborator creator) {
    this.creator = creator;
    return this;
  }

  public CleanRoomCollaborator getCreator() {
    return creator;
  }

  public CleanRoomRemoteDetail setEgressNetworkPolicy(
      com.databricks.sdk.service.settings.EgressNetworkPolicy egressNetworkPolicy) {
    this.egressNetworkPolicy = egressNetworkPolicy;
    return this;
  }

  public com.databricks.sdk.service.settings.EgressNetworkPolicy getEgressNetworkPolicy() {
    return egressNetworkPolicy;
  }

  public CleanRoomRemoteDetail setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomRemoteDetail that = (CleanRoomRemoteDetail) o;
    return Objects.equals(centralCleanRoomId, that.centralCleanRoomId)
        && Objects.equals(cloudVendor, that.cloudVendor)
        && Objects.equals(collaborators, that.collaborators)
        && Objects.equals(complianceSecurityProfile, that.complianceSecurityProfile)
        && Objects.equals(creator, that.creator)
        && Objects.equals(egressNetworkPolicy, that.egressNetworkPolicy)
        && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        centralCleanRoomId,
        cloudVendor,
        collaborators,
        complianceSecurityProfile,
        creator,
        egressNetworkPolicy,
        region);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomRemoteDetail.class)
        .add("centralCleanRoomId", centralCleanRoomId)
        .add("cloudVendor", cloudVendor)
        .add("collaborators", collaborators)
        .add("complianceSecurityProfile", complianceSecurityProfile)
        .add("creator", creator)
        .add("egressNetworkPolicy", egressNetworkPolicy)
        .add("region", region)
        .toString();
  }
}
