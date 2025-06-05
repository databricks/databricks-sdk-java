// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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

@Generated
@JsonSerialize(
    using = PatchEndpointBudgetPolicyResponse.PatchEndpointBudgetPolicyResponseSerializer.class)
@JsonDeserialize(
    using = PatchEndpointBudgetPolicyResponse.PatchEndpointBudgetPolicyResponseDeserializer.class)
public class PatchEndpointBudgetPolicyResponse {
  /** The budget policy applied to the vector search endpoint. */
  private String effectiveBudgetPolicyId;

  public PatchEndpointBudgetPolicyResponse setEffectiveBudgetPolicyId(
      String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchEndpointBudgetPolicyResponse that = (PatchEndpointBudgetPolicyResponse) o;
    return Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveBudgetPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchEndpointBudgetPolicyResponse.class)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .toString();
  }

  PatchEndpointBudgetPolicyResponsePb toPb() {
    PatchEndpointBudgetPolicyResponsePb pb = new PatchEndpointBudgetPolicyResponsePb();
    pb.setEffectiveBudgetPolicyId(effectiveBudgetPolicyId);

    return pb;
  }

  static PatchEndpointBudgetPolicyResponse fromPb(PatchEndpointBudgetPolicyResponsePb pb) {
    PatchEndpointBudgetPolicyResponse model = new PatchEndpointBudgetPolicyResponse();
    model.setEffectiveBudgetPolicyId(pb.getEffectiveBudgetPolicyId());

    return model;
  }

  public static class PatchEndpointBudgetPolicyResponseSerializer
      extends JsonSerializer<PatchEndpointBudgetPolicyResponse> {
    @Override
    public void serialize(
        PatchEndpointBudgetPolicyResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PatchEndpointBudgetPolicyResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PatchEndpointBudgetPolicyResponseDeserializer
      extends JsonDeserializer<PatchEndpointBudgetPolicyResponse> {
    @Override
    public PatchEndpointBudgetPolicyResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PatchEndpointBudgetPolicyResponsePb pb =
          mapper.readValue(p, PatchEndpointBudgetPolicyResponsePb.class);
      return PatchEndpointBudgetPolicyResponse.fromPb(pb);
    }
  }
}
