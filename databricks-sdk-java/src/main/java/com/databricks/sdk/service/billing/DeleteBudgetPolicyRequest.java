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

/** Delete a budget policy */
@Generated
@JsonSerialize(using = DeleteBudgetPolicyRequest.DeleteBudgetPolicyRequestSerializer.class)
@JsonDeserialize(using = DeleteBudgetPolicyRequest.DeleteBudgetPolicyRequestDeserializer.class)
public class DeleteBudgetPolicyRequest {
  /** The Id of the policy. */
  private String policyId;

  public DeleteBudgetPolicyRequest setPolicyId(String policyId) {
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
    DeleteBudgetPolicyRequest that = (DeleteBudgetPolicyRequest) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteBudgetPolicyRequest.class).add("policyId", policyId).toString();
  }

  DeleteBudgetPolicyRequestPb toPb() {
    DeleteBudgetPolicyRequestPb pb = new DeleteBudgetPolicyRequestPb();
    pb.setPolicyId(policyId);

    return pb;
  }

  static DeleteBudgetPolicyRequest fromPb(DeleteBudgetPolicyRequestPb pb) {
    DeleteBudgetPolicyRequest model = new DeleteBudgetPolicyRequest();
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class DeleteBudgetPolicyRequestSerializer
      extends JsonSerializer<DeleteBudgetPolicyRequest> {
    @Override
    public void serialize(
        DeleteBudgetPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteBudgetPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteBudgetPolicyRequestDeserializer
      extends JsonDeserializer<DeleteBudgetPolicyRequest> {
    @Override
    public DeleteBudgetPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteBudgetPolicyRequestPb pb = mapper.readValue(p, DeleteBudgetPolicyRequestPb.class);
      return DeleteBudgetPolicyRequest.fromPb(pb);
    }
  }
}
