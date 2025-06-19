// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Get a cluster policy */
@Generated
@JsonSerialize(using = GetClusterPolicyRequest.GetClusterPolicyRequestSerializer.class)
@JsonDeserialize(using = GetClusterPolicyRequest.GetClusterPolicyRequestDeserializer.class)
public class GetClusterPolicyRequest {
  /** Canonical unique identifier for the Cluster Policy. */
  private String policyId;

  public GetClusterPolicyRequest setPolicyId(String policyId) {
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
    GetClusterPolicyRequest that = (GetClusterPolicyRequest) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPolicyRequest.class).add("policyId", policyId).toString();
  }

  GetClusterPolicyRequestPb toPb() {
    GetClusterPolicyRequestPb pb = new GetClusterPolicyRequestPb();
    pb.setPolicyId(policyId);

    return pb;
  }

  static GetClusterPolicyRequest fromPb(GetClusterPolicyRequestPb pb) {
    GetClusterPolicyRequest model = new GetClusterPolicyRequest();
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class GetClusterPolicyRequestSerializer
      extends JsonSerializer<GetClusterPolicyRequest> {
    @Override
    public void serialize(
        GetClusterPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterPolicyRequestDeserializer
      extends JsonDeserializer<GetClusterPolicyRequest> {
    @Override
    public GetClusterPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterPolicyRequestPb pb = mapper.readValue(p, GetClusterPolicyRequestPb.class);
      return GetClusterPolicyRequest.fromPb(pb);
    }
  }
}
