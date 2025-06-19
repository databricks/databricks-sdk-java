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

/** Get service principal federation policy */
@Generated
@JsonSerialize(
    using =
        GetServicePrincipalFederationPolicyRequest
            .GetServicePrincipalFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using =
        GetServicePrincipalFederationPolicyRequest
            .GetServicePrincipalFederationPolicyRequestDeserializer.class)
public class GetServicePrincipalFederationPolicyRequest {
  /** The identifier for the federation policy. */
  private String policyId;

  /** The service principal id for the federation policy. */
  private Long servicePrincipalId;

  public GetServicePrincipalFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public GetServicePrincipalFederationPolicyRequest setServicePrincipalId(Long servicePrincipalId) {
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
    GetServicePrincipalFederationPolicyRequest that =
        (GetServicePrincipalFederationPolicyRequest) o;
    return Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServicePrincipalFederationPolicyRequest.class)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }

  GetServicePrincipalFederationPolicyRequestPb toPb() {
    GetServicePrincipalFederationPolicyRequestPb pb =
        new GetServicePrincipalFederationPolicyRequestPb();
    pb.setPolicyId(policyId);
    pb.setServicePrincipalId(servicePrincipalId);

    return pb;
  }

  static GetServicePrincipalFederationPolicyRequest fromPb(
      GetServicePrincipalFederationPolicyRequestPb pb) {
    GetServicePrincipalFederationPolicyRequest model =
        new GetServicePrincipalFederationPolicyRequest();
    model.setPolicyId(pb.getPolicyId());
    model.setServicePrincipalId(pb.getServicePrincipalId());

    return model;
  }

  public static class GetServicePrincipalFederationPolicyRequestSerializer
      extends JsonSerializer<GetServicePrincipalFederationPolicyRequest> {
    @Override
    public void serialize(
        GetServicePrincipalFederationPolicyRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetServicePrincipalFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetServicePrincipalFederationPolicyRequestDeserializer
      extends JsonDeserializer<GetServicePrincipalFederationPolicyRequest> {
    @Override
    public GetServicePrincipalFederationPolicyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetServicePrincipalFederationPolicyRequestPb pb =
          mapper.readValue(p, GetServicePrincipalFederationPolicyRequestPb.class);
      return GetServicePrincipalFederationPolicyRequest.fromPb(pb);
    }
  }
}
