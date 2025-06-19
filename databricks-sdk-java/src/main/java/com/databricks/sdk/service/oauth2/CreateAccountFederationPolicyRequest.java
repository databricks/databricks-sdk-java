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

/** Create account federation policy */
@Generated
@JsonSerialize(
    using =
        CreateAccountFederationPolicyRequest.CreateAccountFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using =
        CreateAccountFederationPolicyRequest.CreateAccountFederationPolicyRequestDeserializer.class)
public class CreateAccountFederationPolicyRequest {
  /** */
  private FederationPolicy policy;

  /**
   * The identifier for the federation policy. The identifier must contain only lowercase
   * alphanumeric characters, numbers, hyphens, and slashes. If unspecified, the id will be assigned
   * by Databricks.
   */
  private String policyId;

  public CreateAccountFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateAccountFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAccountFederationPolicyRequest that = (CreateAccountFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy) && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccountFederationPolicyRequest.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .toString();
  }

  CreateAccountFederationPolicyRequestPb toPb() {
    CreateAccountFederationPolicyRequestPb pb = new CreateAccountFederationPolicyRequestPb();
    pb.setPolicy(policy);
    pb.setPolicyId(policyId);

    return pb;
  }

  static CreateAccountFederationPolicyRequest fromPb(CreateAccountFederationPolicyRequestPb pb) {
    CreateAccountFederationPolicyRequest model = new CreateAccountFederationPolicyRequest();
    model.setPolicy(pb.getPolicy());
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class CreateAccountFederationPolicyRequestSerializer
      extends JsonSerializer<CreateAccountFederationPolicyRequest> {
    @Override
    public void serialize(
        CreateAccountFederationPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateAccountFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateAccountFederationPolicyRequestDeserializer
      extends JsonDeserializer<CreateAccountFederationPolicyRequest> {
    @Override
    public CreateAccountFederationPolicyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateAccountFederationPolicyRequestPb pb =
          mapper.readValue(p, CreateAccountFederationPolicyRequestPb.class);
      return CreateAccountFederationPolicyRequest.fromPb(pb);
    }
  }
}
