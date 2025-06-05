// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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

/** Create recipient federation policy */
@Generated
@JsonSerialize(using = CreateFederationPolicyRequest.CreateFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using = CreateFederationPolicyRequest.CreateFederationPolicyRequestDeserializer.class)
public class CreateFederationPolicyRequest {
  /** */
  private FederationPolicy policy;

  /**
   * Name of the recipient. This is the name of the recipient for which the policy is being created.
   */
  private String recipientName;

  public CreateFederationPolicyRequest setPolicy(FederationPolicy policy) {
    this.policy = policy;
    return this;
  }

  public FederationPolicy getPolicy() {
    return policy;
  }

  public CreateFederationPolicyRequest setRecipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  public String getRecipientName() {
    return recipientName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFederationPolicyRequest that = (CreateFederationPolicyRequest) o;
    return Objects.equals(policy, that.policy) && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFederationPolicyRequest.class)
        .add("policy", policy)
        .add("recipientName", recipientName)
        .toString();
  }

  CreateFederationPolicyRequestPb toPb() {
    CreateFederationPolicyRequestPb pb = new CreateFederationPolicyRequestPb();
    pb.setPolicy(policy);
    pb.setRecipientName(recipientName);

    return pb;
  }

  static CreateFederationPolicyRequest fromPb(CreateFederationPolicyRequestPb pb) {
    CreateFederationPolicyRequest model = new CreateFederationPolicyRequest();
    model.setPolicy(pb.getPolicy());
    model.setRecipientName(pb.getRecipientName());

    return model;
  }

  public static class CreateFederationPolicyRequestSerializer
      extends JsonSerializer<CreateFederationPolicyRequest> {
    @Override
    public void serialize(
        CreateFederationPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateFederationPolicyRequestDeserializer
      extends JsonDeserializer<CreateFederationPolicyRequest> {
    @Override
    public CreateFederationPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateFederationPolicyRequestPb pb =
          mapper.readValue(p, CreateFederationPolicyRequestPb.class);
      return CreateFederationPolicyRequest.fromPb(pb);
    }
  }
}
