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
@JsonSerialize(using = CreatePolicyResponse.CreatePolicyResponseSerializer.class)
@JsonDeserialize(using = CreatePolicyResponse.CreatePolicyResponseDeserializer.class)
public class CreatePolicyResponse {
  /** Canonical unique identifier for the cluster policy. */
  private String policyId;

  public CreatePolicyResponse setPolicyId(String policyId) {
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
    CreatePolicyResponse that = (CreatePolicyResponse) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePolicyResponse.class).add("policyId", policyId).toString();
  }

  CreatePolicyResponsePb toPb() {
    CreatePolicyResponsePb pb = new CreatePolicyResponsePb();
    pb.setPolicyId(policyId);

    return pb;
  }

  static CreatePolicyResponse fromPb(CreatePolicyResponsePb pb) {
    CreatePolicyResponse model = new CreatePolicyResponse();
    model.setPolicyId(pb.getPolicyId());

    return model;
  }

  public static class CreatePolicyResponseSerializer extends JsonSerializer<CreatePolicyResponse> {
    @Override
    public void serialize(
        CreatePolicyResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePolicyResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePolicyResponseDeserializer
      extends JsonDeserializer<CreatePolicyResponse> {
    @Override
    public CreatePolicyResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePolicyResponsePb pb = mapper.readValue(p, CreatePolicyResponsePb.class);
      return CreatePolicyResponse.fromPb(pb);
    }
  }
}
