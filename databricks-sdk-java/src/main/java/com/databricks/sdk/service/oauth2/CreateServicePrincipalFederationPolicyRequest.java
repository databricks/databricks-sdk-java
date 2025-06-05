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

/** Create service principal federation policy */
@Generated
@JsonSerialize(
    using =
        CreateServicePrincipalFederationPolicyRequest
            .CreateServicePrincipalFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using =
        CreateServicePrincipalFederationPolicyRequest
            .CreateServicePrincipalFederationPolicyRequestDeserializer.class)
public class CreateServicePrincipalFederationPolicyRequest {
  /** */
  private FederationPolicy policy;

  /**
   * The identifier for the federation policy. The identifier must contain only lowercase
   * alphanumeric characters, numbers, hyphens, and slashes. If unspecified, the id will be assigned
   * by Databricks.
   */
  private String policyId;

  /** The service principal id for the federation policy. */
  private Long servicePrincipalId;

  public CreateServicePrincipalFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateServicePrincipalFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public CreateServicePrincipalFederationPolicyRequest setServicePrincipalId(
      Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServicePrincipalFederationPolicyRequest that =
        (CreateServicePrincipalFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, policyId, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServicePrincipalFederationPolicyRequest.class)
        .add("policy", policy)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }

  CreateServicePrincipalFederationPolicyRequestPb toPb() {
    CreateServicePrincipalFederationPolicyRequestPb pb =
        new CreateServicePrincipalFederationPolicyRequestPb();
    pb.setPolicy(policy);
    pb.setPolicyId(policyId);
    pb.setServicePrincipalId(servicePrincipalId);

    return pb;
  }

  static CreateServicePrincipalFederationPolicyRequest fromPb(
      CreateServicePrincipalFederationPolicyRequestPb pb) {
    CreateServicePrincipalFederationPolicyRequest model =
        new CreateServicePrincipalFederationPolicyRequest();
    model.setPolicy(pb.getPolicy());
    model.setPolicyId(pb.getPolicyId());
    model.setServicePrincipalId(pb.getServicePrincipalId());

    return model;
  }

  public static class CreateServicePrincipalFederationPolicyRequestSerializer
      extends JsonSerializer<CreateServicePrincipalFederationPolicyRequest> {
    @Override
    public void serialize(
        CreateServicePrincipalFederationPolicyRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CreateServicePrincipalFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateServicePrincipalFederationPolicyRequestDeserializer
      extends JsonDeserializer<CreateServicePrincipalFederationPolicyRequest> {
    @Override
    public CreateServicePrincipalFederationPolicyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateServicePrincipalFederationPolicyRequestPb pb =
          mapper.readValue(p, CreateServicePrincipalFederationPolicyRequestPb.class);
      return CreateServicePrincipalFederationPolicyRequest.fromPb(pb);
    }
  }
}
