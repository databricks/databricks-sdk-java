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

/** Get recipient federation policy */
@Generated
@JsonSerialize(using = GetFederationPolicyRequest.GetFederationPolicyRequestSerializer.class)
@JsonDeserialize(using = GetFederationPolicyRequest.GetFederationPolicyRequestDeserializer.class)
public class GetFederationPolicyRequest {
  /** Name of the policy. This is the name of the policy to be retrieved. */
  private String name;

  /**
   * Name of the recipient. This is the name of the recipient for which the policy is being
   * retrieved.
   */
  private String recipientName;

  public GetFederationPolicyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetFederationPolicyRequest setRecipientName(String recipientName) {
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
    GetFederationPolicyRequest that = (GetFederationPolicyRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(recipientName, that.recipientName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recipientName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFederationPolicyRequest.class)
        .add("name", name)
        .add("recipientName", recipientName)
        .toString();
  }

  GetFederationPolicyRequestPb toPb() {
    GetFederationPolicyRequestPb pb = new GetFederationPolicyRequestPb();
    pb.setName(name);
    pb.setRecipientName(recipientName);

    return pb;
  }

  static GetFederationPolicyRequest fromPb(GetFederationPolicyRequestPb pb) {
    GetFederationPolicyRequest model = new GetFederationPolicyRequest();
    model.setName(pb.getName());
    model.setRecipientName(pb.getRecipientName());

    return model;
  }

  public static class GetFederationPolicyRequestSerializer
      extends JsonSerializer<GetFederationPolicyRequest> {
    @Override
    public void serialize(
        GetFederationPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetFederationPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetFederationPolicyRequestDeserializer
      extends JsonDeserializer<GetFederationPolicyRequest> {
    @Override
    public GetFederationPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetFederationPolicyRequestPb pb = mapper.readValue(p, GetFederationPolicyRequestPb.class);
      return GetFederationPolicyRequest.fromPb(pb);
    }
  }
}
