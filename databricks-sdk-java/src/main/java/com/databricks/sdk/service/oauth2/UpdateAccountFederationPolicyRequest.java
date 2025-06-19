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

/** Update account federation policy */
@Generated
@JsonSerialize(
    using =
        UpdateAccountFederationPolicyRequest.UpdateAccountFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateAccountFederationPolicyRequest.UpdateAccountFederationPolicyRequestDeserializer.class)
public class UpdateAccountFederationPolicyRequest {
  /** */
  private FederationPolicy policy;

  /** The identifier for the federation policy. */
  private String policyId;

  /**
   * The field mask specifies which fields of the policy to update. To specify multiple fields in
   * the field mask, use comma as the separator (no space). The special value '*' indicates that all
   * fields should be updated (full replacement). If unspecified, all fields that are set in the
   * policy provided in the update request will overwrite the corresponding fields in the existing
   * policy. Example value: 'description,oidc_policy.audiences'.
   */
  private String updateMask;

  public UpdateAccountFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public UpdateAccountFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public UpdateAccountFederationPolicyRequest setUpdateMask(String updateMask) {
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
    UpdateAccountFederationPolicyRequest that = (UpdateAccountFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAccountFederationPolicyRequest.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .add("updateMask", updateMask)
        .toString();
  }

  UpdateAccountFederationPolicyRequestPb toPb() {
    UpdateAccountFederationPolicyRequestPb pb = new UpdateAccountFederationPolicyRequestPb();
    pb.setPolicy(policy);
    pb.setPolicyId(policyId);
    pb.setUpdateMask(updateMask);

    return pb;
  }

  static UpdateAccountFederationPolicyRequest fromPb(UpdateAccountFederationPolicyRequestPb pb) {
    UpdateAccountFederationPolicyRequest model = new UpdateAccountFederationPolicyRequest();
    model.setPolicy(pb.getPolicy());
    model.setPolicyId(pb.getPolicyId());
    model.setUpdateMask(pb.getUpdateMask());

    return model;
  }

  public static class UpdateAccountFederationPolicyRequestSerializer
      extends JsonSerializer<UpdateAccountFederationPolicyRequest> {
    @Override
    public void serialize(
        UpdateAccountFederationPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateAccountFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateAccountFederationPolicyRequestDeserializer
      extends JsonDeserializer<UpdateAccountFederationPolicyRequest> {
    @Override
    public UpdateAccountFederationPolicyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateAccountFederationPolicyRequestPb pb =
          mapper.readValue(p, UpdateAccountFederationPolicyRequestPb.class);
      return UpdateAccountFederationPolicyRequest.fromPb(pb);
    }
  }
}
