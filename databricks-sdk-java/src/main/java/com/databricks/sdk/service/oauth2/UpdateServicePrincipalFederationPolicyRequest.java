// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
import java.util.Objects;

/** Update service principal federation policy */
@Generated
@JsonSerialize(
    using =
        UpdateServicePrincipalFederationPolicyRequest
            .UpdateServicePrincipalFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateServicePrincipalFederationPolicyRequest
            .UpdateServicePrincipalFederationPolicyRequestDeserializer.class)
public class UpdateServicePrincipalFederationPolicyRequest {
  /** */
  private FederationPolicy policy;

  /** The identifier for the federation policy. */
  private String policyId;

  /** The service principal id for the federation policy. */
  private Long servicePrincipalId;

  /**
   * The field mask specifies which fields of the policy to update. To specify multiple fields in
   * the field mask, use comma as the separator (no space). The special value '*' indicates that all
   * fields should be updated (full replacement). If unspecified, all fields that are set in the
   * policy provided in the update request will overwrite the corresponding fields in the existing
   * policy. Example value: 'description,oidc_policy.audiences'.
   */
  private String updateMask;

  public UpdateServicePrincipalFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public UpdateServicePrincipalFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public UpdateServicePrincipalFederationPolicyRequest setServicePrincipalId(
      Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public UpdateServicePrincipalFederationPolicyRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateServicePrincipalFederationPolicyRequest that =
        (UpdateServicePrincipalFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId, servicePrincipalId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateServicePrincipalFederationPolicyRequest.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .add("updateMask", updateMask)
        .toString();
  }

  UpdateServicePrincipalFederationPolicyRequestPb toPb() {
    UpdateServicePrincipalFederationPolicyRequestPb pb =
        new UpdateServicePrincipalFederationPolicyRequestPb();
    pb.setPolicy(policy);
    pb.setPolicyId(policyId);
    pb.setServicePrincipalId(servicePrincipalId);
    pb.setUpdateMask(updateMask);

    return pb;
  }

  static UpdateServicePrincipalFederationPolicyRequest fromPb(
      UpdateServicePrincipalFederationPolicyRequestPb pb) {
    UpdateServicePrincipalFederationPolicyRequest model =
        new UpdateServicePrincipalFederationPolicyRequest();
    model.setPolicy(pb.getPolicy());
    model.setPolicyId(pb.getPolicyId());
    model.setServicePrincipalId(pb.getServicePrincipalId());
    model.setUpdateMask(pb.getUpdateMask());

    return model;
  }

  public static class UpdateServicePrincipalFederationPolicyRequestSerializer
      extends JsonSerializer<UpdateServicePrincipalFederationPolicyRequest> {
    @Override
    public void serialize(
        UpdateServicePrincipalFederationPolicyRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateServicePrincipalFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateServicePrincipalFederationPolicyRequestDeserializer
      extends JsonDeserializer<UpdateServicePrincipalFederationPolicyRequest> {
    @Override
    public UpdateServicePrincipalFederationPolicyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateServicePrincipalFederationPolicyRequestPb pb =
          mapper.readValue(p, UpdateServicePrincipalFederationPolicyRequestPb.class);
      return UpdateServicePrincipalFederationPolicyRequest.fromPb(pb);
    }
  }
}
