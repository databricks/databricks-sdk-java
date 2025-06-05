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

@Generated
@JsonSerialize(using = DeletePolicy.DeletePolicySerializer.class)
@JsonDeserialize(using = DeletePolicy.DeletePolicyDeserializer.class)
public class DeletePolicy {
  /** The ID of the policy to delete. */
  private String policyId;

  public DeletePolicy setPolicyId(String policyId) {
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
    DeletePolicy that = (DeletePolicy) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePolicy.class).add("policyId", policyId).toString();
  }

  DeletePolicyPb toPb() {
    DeletePolicyPb pb = new DeletePolicyPb();
    pb.setPolicyId(policyId);

    return pb;
  }

  static DeletePolicy fromPb(DeletePolicyPb pb) {
    DeletePolicy model = new DeletePolicy();
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class DeletePolicySerializer extends JsonSerializer<DeletePolicy> {
    @Override
    public void serialize(DeletePolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeletePolicyDeserializer extends JsonDeserializer<DeletePolicy> {
    @Override
    public DeletePolicy deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePolicyPb pb = mapper.readValue(p, DeletePolicyPb.class);
      return DeletePolicy.fromPb(pb);
    }
  }
}
