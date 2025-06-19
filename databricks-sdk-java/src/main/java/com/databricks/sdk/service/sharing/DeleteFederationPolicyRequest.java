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

/** Delete recipient federation policy */
@Generated
@JsonSerialize(using = DeleteFederationPolicyRequest.DeleteFederationPolicyRequestSerializer.class)
@JsonDeserialize(
    using = DeleteFederationPolicyRequest.DeleteFederationPolicyRequestDeserializer.class)
public class DeleteFederationPolicyRequest {
  /** Name of the policy. This is the name of the policy to be deleted. */
  private String name;

  /**
   * Name of the recipient. This is the name of the recipient for which the policy is being deleted.
   */
  private String recipientName;

  public DeleteFederationPolicyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteFederationPolicyRequest setRecipientName(String recipientName) {
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
    DeleteFederationPolicyRequest that = (DeleteFederationPolicyRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFederationPolicyRequest.class)
        .add("name", name)
        .add("recipientName", recipientName)
        .toString();
  }

  DeleteFederationPolicyRequestPb toPb() {
    DeleteFederationPolicyRequestPb pb = new DeleteFederationPolicyRequestPb();
    pb.setName(name);
    pb.setRecipientName(recipientName);

    return pb;
  }

  static DeleteFederationPolicyRequest fromPb(DeleteFederationPolicyRequestPb pb) {
    DeleteFederationPolicyRequest model = new DeleteFederationPolicyRequest();
    model.setName(pb.getName());
    model.setRecipientName(pb.getRecipientName());

    return model;
  }

  public static class DeleteFederationPolicyRequestSerializer
      extends JsonSerializer<DeleteFederationPolicyRequest> {
    @Override
    public void serialize(
        DeleteFederationPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteFederationPolicyRequestDeserializer
      extends JsonDeserializer<DeleteFederationPolicyRequest> {
    @Override
    public DeleteFederationPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteFederationPolicyRequestPb pb =
          mapper.readValue(p, DeleteFederationPolicyRequestPb.class);
      return DeleteFederationPolicyRequest.fromPb(pb);
    }
  }
}
