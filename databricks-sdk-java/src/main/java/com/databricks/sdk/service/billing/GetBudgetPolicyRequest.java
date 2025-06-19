// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

/** Get a budget policy */
@Generated
@JsonSerialize(using = GetBudgetPolicyRequest.GetBudgetPolicyRequestSerializer.class)
@JsonDeserialize(using = GetBudgetPolicyRequest.GetBudgetPolicyRequestDeserializer.class)
public class GetBudgetPolicyRequest {
  /** The Id of the policy. */
  private String policyId;

  public GetBudgetPolicyRequest setPolicyId(String policyId) {
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
    GetBudgetPolicyRequest that = (GetBudgetPolicyRequest) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBudgetPolicyRequest.class).add("policyId", policyId).toString();
  }

  GetBudgetPolicyRequestPb toPb() {
    GetBudgetPolicyRequestPb pb = new GetBudgetPolicyRequestPb();
    pb.setPolicyId(policyId);

    return pb;
  }

  static GetBudgetPolicyRequest fromPb(GetBudgetPolicyRequestPb pb) {
    GetBudgetPolicyRequest model = new GetBudgetPolicyRequest();
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class GetBudgetPolicyRequestSerializer
      extends JsonSerializer<GetBudgetPolicyRequest> {
    @Override
    public void serialize(
        GetBudgetPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetBudgetPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetBudgetPolicyRequestDeserializer
      extends JsonDeserializer<GetBudgetPolicyRequest> {
    @Override
    public GetBudgetPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetBudgetPolicyRequestPb pb = mapper.readValue(p, GetBudgetPolicyRequestPb.class);
      return GetBudgetPolicyRequest.fromPb(pb);
    }
  }
}
