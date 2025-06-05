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

/** Delete account federation policy */
@Generated
@JsonSerialize(
    using =
        DeleteAccountFederationPolicyRequest.DeleteAccountFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using =
        DeleteAccountFederationPolicyRequest.DeleteAccountFederationPolicyRequestDeserializer.class)
public class DeleteAccountFederationPolicyRequest {
  /** The identifier for the federation policy. */
  private String policyId;

  public DeleteAccountFederationPolicyRequest setPolicyId(String policyId) {
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
    DeleteAccountFederationPolicyRequest that = (DeleteAccountFederationPolicyRequest) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountFederationPolicyRequest.class)
        .add("policyId", policyId)
        .toString();
  }

  DeleteAccountFederationPolicyRequestPb toPb() {
    DeleteAccountFederationPolicyRequestPb pb = new DeleteAccountFederationPolicyRequestPb();
    pb.setPolicyId(policyId);

    return pb;
  }

  static DeleteAccountFederationPolicyRequest fromPb(DeleteAccountFederationPolicyRequestPb pb) {
    DeleteAccountFederationPolicyRequest model = new DeleteAccountFederationPolicyRequest();
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class DeleteAccountFederationPolicyRequestSerializer
      extends JsonSerializer<DeleteAccountFederationPolicyRequest> {
    @Override
    public void serialize(
        DeleteAccountFederationPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAccountFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountFederationPolicyRequestDeserializer
      extends JsonDeserializer<DeleteAccountFederationPolicyRequest> {
    @Override
    public DeleteAccountFederationPolicyRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountFederationPolicyRequestPb pb =
          mapper.readValue(p, DeleteAccountFederationPolicyRequestPb.class);
      return DeleteAccountFederationPolicyRequest.fromPb(pb);
    }
  }
}
