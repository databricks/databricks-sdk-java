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

/** Get account federation policy */
@Generated
@JsonSerialize(
    using = GetAccountFederationPolicyRequest.GetAccountFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using = GetAccountFederationPolicyRequest.GetAccountFederationPolicyRequestDeserializer.class)
public class GetAccountFederationPolicyRequest {
  /** The identifier for the federation policy. */
  private String policyId;

  public GetAccountFederationPolicyRequest setPolicyId(String policyId) {
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
    GetAccountFederationPolicyRequest that = (GetAccountFederationPolicyRequest) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountFederationPolicyRequest.class)
        .add("policyId", policyId)
        .toString();
  }

  GetAccountFederationPolicyRequestPb toPb() {
    GetAccountFederationPolicyRequestPb pb = new GetAccountFederationPolicyRequestPb();
    pb.setPolicyId(policyId);

    return pb;
  }

  static GetAccountFederationPolicyRequest fromPb(GetAccountFederationPolicyRequestPb pb) {
    GetAccountFederationPolicyRequest model = new GetAccountFederationPolicyRequest();
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class GetAccountFederationPolicyRequestSerializer
      extends JsonSerializer<GetAccountFederationPolicyRequest> {
    @Override
    public void serialize(
        GetAccountFederationPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAccountFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAccountFederationPolicyRequestDeserializer
      extends JsonDeserializer<GetAccountFederationPolicyRequest> {
    @Override
    public GetAccountFederationPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAccountFederationPolicyRequestPb pb =
          mapper.readValue(p, GetAccountFederationPolicyRequestPb.class);
      return GetAccountFederationPolicyRequest.fromPb(pb);
    }
  }
}
