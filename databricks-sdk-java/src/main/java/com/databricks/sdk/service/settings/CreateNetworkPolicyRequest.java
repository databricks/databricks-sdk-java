// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Create a network policy */
@Generated
@JsonSerialize(using = CreateNetworkPolicyRequest.CreateNetworkPolicyRequestSerializer.class)
@JsonDeserialize(using = CreateNetworkPolicyRequest.CreateNetworkPolicyRequestDeserializer.class)
public class CreateNetworkPolicyRequest {
  /** */
  private AccountNetworkPolicy networkPolicy;

  public CreateNetworkPolicyRequest setNetworkPolicy(AccountNetworkPolicy networkPolicy) {
    this.networkPolicy = networkPolicy;
    return this;
  }

  public AccountNetworkPolicy getNetworkPolicy() {
    return networkPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNetworkPolicyRequest that = (CreateNetworkPolicyRequest) o;
    return Objects.equals(networkPolicy, that.networkPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkPolicyRequest.class)
        .add("networkPolicy", networkPolicy)
        .toString();
  }

  CreateNetworkPolicyRequestPb toPb() {
    CreateNetworkPolicyRequestPb pb = new CreateNetworkPolicyRequestPb();
    pb.setNetworkPolicy(networkPolicy);

    return pb;
  }

  static CreateNetworkPolicyRequest fromPb(CreateNetworkPolicyRequestPb pb) {
    CreateNetworkPolicyRequest model = new CreateNetworkPolicyRequest();
    model.setNetworkPolicy(pb.getNetworkPolicy());

    return model;
  }

  public static class CreateNetworkPolicyRequestSerializer
      extends JsonSerializer<CreateNetworkPolicyRequest> {
    @Override
    public void serialize(
        CreateNetworkPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateNetworkPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateNetworkPolicyRequestDeserializer
      extends JsonDeserializer<CreateNetworkPolicyRequest> {
    @Override
    public CreateNetworkPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateNetworkPolicyRequestPb pb = mapper.readValue(p, CreateNetworkPolicyRequestPb.class);
      return CreateNetworkPolicyRequest.fromPb(pb);
    }
  }
}
