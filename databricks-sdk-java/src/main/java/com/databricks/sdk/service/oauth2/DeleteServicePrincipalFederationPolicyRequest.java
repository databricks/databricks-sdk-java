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

/** Delete service principal federation policy */
@Generated
@JsonSerialize(
    using =
        DeleteServicePrincipalFederationPolicyRequest
            .DeleteServicePrincipalFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteServicePrincipalFederationPolicyRequest
            .DeleteServicePrincipalFederationPolicyRequestDeserializer.class)
public class DeleteServicePrincipalFederationPolicyRequest {
  /** The identifier for the federation policy. */
  private String policyId;

  /** The service principal id for the federation policy. */
  private Long servicePrincipalId;

  public DeleteServicePrincipalFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public DeleteServicePrincipalFederationPolicyRequest setServicePrincipalId(
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
    DeleteServicePrincipalFederationPolicyRequest that =
        (DeleteServicePrincipalFederationPolicyRequest) o;
    return Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServicePrincipalFederationPolicyRequest.class)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }

  DeleteServicePrincipalFederationPolicyRequestPb toPb() {
    DeleteServicePrincipalFederationPolicyRequestPb pb =
        new DeleteServicePrincipalFederationPolicyRequestPb();
    pb.setPolicyId(policyId);
    pb.setServicePrincipalId(servicePrincipalId);

    return pb;
  }

  static DeleteServicePrincipalFederationPolicyRequest fromPb(
      DeleteServicePrincipalFederationPolicyRequestPb pb) {
    DeleteServicePrincipalFederationPolicyRequest model =
        new DeleteServicePrincipalFederationPolicyRequest();
    model.setPolicyId(pb.getPolicyId());
    model.setServicePrincipalId(pb.getServicePrincipalId());

    return model;
  }

  public static class DeleteServicePrincipalFederationPolicyRequestSerializer
      extends JsonSerializer<DeleteServicePrincipalFederationPolicyRequest> {
    @Override
    public void serialize(
        DeleteServicePrincipalFederationPolicyRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      DeleteServicePrincipalFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteServicePrincipalFederationPolicyRequestDeserializer
      extends JsonDeserializer<DeleteServicePrincipalFederationPolicyRequest> {
    @Override
    public DeleteServicePrincipalFederationPolicyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteServicePrincipalFederationPolicyRequestPb pb =
          mapper.readValue(p, DeleteServicePrincipalFederationPolicyRequestPb.class);
      return DeleteServicePrincipalFederationPolicyRequest.fromPb(pb);
    }
  }
}
