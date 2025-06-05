// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Publicly visible central clean room details. */
@Generated
class CleanRoomRemoteDetailPb {
  @JsonProperty("central_clean_room_id")
  private String centralCleanRoomId;

  @JsonProperty("cloud_vendor")
  private String cloudVendor;

  @JsonProperty("collaborators")
  private Collection<CleanRoomCollaborator> collaborators;

  @JsonProperty("compliance_security_profile")
  private ComplianceSecurityProfile complianceSecurityProfile;

  @JsonProperty("creator")
  private CleanRoomCollaborator creator;

  @JsonProperty("egress_network_policy")
  private com.databricks.sdk.service.settings.EgressNetworkPolicy egressNetworkPolicy;

  @JsonProperty("region")
  private String region;

  public CleanRoomRemoteDetailPb setCentralCleanRoomId(String centralCleanRoomId) {
    this.centralCleanRoomId = centralCleanRoomId;
    return this;
  }

  public String getCentralCleanRoomId() {
    return centralCleanRoomId;
  }

  public CleanRoomRemoteDetailPb setCloudVendor(String cloudVendor) {
    this.cloudVendor = cloudVendor;
    return this;
  }

  public String getCloudVendor() {
    return cloudVendor;
  }

  public CleanRoomRemoteDetailPb setCollaborators(Collection<CleanRoomCollaborator> collaborators) {
    this.collaborators = collaborators;
    return this;
  }

  public Collection<CleanRoomCollaborator> getCollaborators() {
    return collaborators;
  }

  public CleanRoomRemoteDetailPb setComplianceSecurityProfile(
      ComplianceSecurityProfile complianceSecurityProfile) {
    this.complianceSecurityProfile = complianceSecurityProfile;
    return this;
  }

  public ComplianceSecurityProfile getComplianceSecurityProfile() {
    return complianceSecurityProfile;
  }

  public CleanRoomRemoteDetailPb setCreator(CleanRoomCollaborator creator) {
    this.creator = creator;
    return this;
  }

  public CleanRoomCollaborator getCreator() {
    return creator;
  }

  public CleanRoomRemoteDetailPb setEgressNetworkPolicy(
      com.databricks.sdk.service.settings.EgressNetworkPolicy egressNetworkPolicy) {
    this.egressNetworkPolicy = egressNetworkPolicy;
    return this;
  }

  public com.databricks.sdk.service.settings.EgressNetworkPolicy getEgressNetworkPolicy() {
    return egressNetworkPolicy;
  }

  public CleanRoomRemoteDetailPb setRegion(String region) {
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
    CleanRoomRemoteDetailPb that = (CleanRoomRemoteDetailPb) o;
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
    return new ToStringer(CleanRoomRemoteDetailPb.class)
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
