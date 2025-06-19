// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

/** Publicly visible central clean room details. */
@Generated
@JsonSerialize(using = CleanRoomRemoteDetail.CleanRoomRemoteDetailSerializer.class)
@JsonDeserialize(using = CleanRoomRemoteDetail.CleanRoomRemoteDetailDeserializer.class)
public class CleanRoomRemoteDetail {
  /** Central clean room ID. */
  private String centralCleanRoomId;

  /** Cloud vendor (aws,azure,gcp) of the central clean room. */
  private String cloudVendor;

  /**
   * Collaborators in the central clean room. There should one and only one collaborator in the list
   * that satisfies the owner condition:
   *
   * <p>1. It has the creator's global_metastore_id (determined by caller of CreateCleanRoom).
   *
   * <p>2. Its invite_recipient_email is empty.
   */
  private Collection<CleanRoomCollaborator> collaborators;

  /**
   * The compliance security profile used to process regulated data following compliance standards.
   */
  private ComplianceSecurityProfile complianceSecurityProfile;

  /** Collaborator who creates the clean room. */
  private CleanRoomCollaborator creator;

  /** Egress network policy to apply to the central clean room workspace. */
  private com.databricks.sdk.service.settings.EgressNetworkPolicy egressNetworkPolicy;

  /** Region of the central clean room. */
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

  CleanRoomRemoteDetailPb toPb() {
    CleanRoomRemoteDetailPb pb = new CleanRoomRemoteDetailPb();
    pb.setCentralCleanRoomId(centralCleanRoomId);
    pb.setCloudVendor(cloudVendor);
    pb.setCollaborators(collaborators);
    pb.setComplianceSecurityProfile(complianceSecurityProfile);
    pb.setCreator(creator);
    pb.setEgressNetworkPolicy(egressNetworkPolicy);
    pb.setRegion(region);

    return pb;
  }

  static CleanRoomRemoteDetail fromPb(CleanRoomRemoteDetailPb pb) {
    CleanRoomRemoteDetail model = new CleanRoomRemoteDetail();
    model.setCentralCleanRoomId(pb.getCentralCleanRoomId());
    model.setCloudVendor(pb.getCloudVendor());
    model.setCollaborators(pb.getCollaborators());
    model.setComplianceSecurityProfile(pb.getComplianceSecurityProfile());
    model.setCreator(pb.getCreator());
    model.setEgressNetworkPolicy(pb.getEgressNetworkPolicy());
    model.setRegion(pb.getRegion());

    return model;
  }

  public static class CleanRoomRemoteDetailSerializer
      extends JsonSerializer<CleanRoomRemoteDetail> {
    @Override
    public void serialize(
        CleanRoomRemoteDetail value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomRemoteDetailPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomRemoteDetailDeserializer
      extends JsonDeserializer<CleanRoomRemoteDetail> {
    @Override
    public CleanRoomRemoteDetail deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomRemoteDetailPb pb = mapper.readValue(p, CleanRoomRemoteDetailPb.class);
      return CleanRoomRemoteDetail.fromPb(pb);
    }
  }
}
