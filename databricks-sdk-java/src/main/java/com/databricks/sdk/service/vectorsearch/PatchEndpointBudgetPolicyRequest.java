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
    using = PatchEndpointBudgetPolicyRequest.PatchEndpointBudgetPolicyRequestSerializer.class)
@JsonDeserialize(
    using = PatchEndpointBudgetPolicyRequest.PatchEndpointBudgetPolicyRequestDeserializer.class)
public class PatchEndpointBudgetPolicyRequest {
  /** The budget policy id to be applied */
  private String budgetPolicyId;

  /** Name of the vector search endpoint */
  private String endpointName;

  public PatchEndpointBudgetPolicyRequest setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public PatchEndpointBudgetPolicyRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchEndpointBudgetPolicyRequest that = (PatchEndpointBudgetPolicyRequest) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(endpointName, that.endpointName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetPolicyId, endpointName);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchEndpointBudgetPolicyRequest.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("endpointName", endpointName)
        .toString();
  }

  PatchEndpointBudgetPolicyRequestPb toPb() {
    PatchEndpointBudgetPolicyRequestPb pb = new PatchEndpointBudgetPolicyRequestPb();
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setEndpointName(endpointName);

    return pb;
  }

  static PatchEndpointBudgetPolicyRequest fromPb(PatchEndpointBudgetPolicyRequestPb pb) {
    PatchEndpointBudgetPolicyRequest model = new PatchEndpointBudgetPolicyRequest();
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setEndpointName(pb.getEndpointName());

    return model;
  }

  public static class PatchEndpointBudgetPolicyRequestSerializer
      extends JsonSerializer<PatchEndpointBudgetPolicyRequest> {
    @Override
    public void serialize(
        PatchEndpointBudgetPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PatchEndpointBudgetPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PatchEndpointBudgetPolicyRequestDeserializer
      extends JsonDeserializer<PatchEndpointBudgetPolicyRequest> {
    @Override
    public PatchEndpointBudgetPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PatchEndpointBudgetPolicyRequestPb pb =
          mapper.readValue(p, PatchEndpointBudgetPolicyRequestPb.class);
      return PatchEndpointBudgetPolicyRequest.fromPb(pb);
    }
  }
}
