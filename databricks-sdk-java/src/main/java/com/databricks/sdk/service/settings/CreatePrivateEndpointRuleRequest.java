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

/** Create a private endpoint rule */
@Generated
@JsonSerialize(
    using = CreatePrivateEndpointRuleRequest.CreatePrivateEndpointRuleRequestSerializer.class)
@JsonDeserialize(
    using = CreatePrivateEndpointRuleRequest.CreatePrivateEndpointRuleRequestDeserializer.class)
public class CreatePrivateEndpointRuleRequest {
  /** Your Network Connectivity Configuration ID. */
  private String networkConnectivityConfigId;

  /**
   * Properties of the new private endpoint rule. Note that you must approve the endpoint in Azure
   * portal after initialization.
   */
  private CreatePrivateEndpointRule privateEndpointRule;

  public CreatePrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public CreatePrivateEndpointRuleRequest setPrivateEndpointRule(
      CreatePrivateEndpointRule privateEndpointRule) {
    this.privateEndpointRule = privateEndpointRule;
    return this;
  }

  public CreatePrivateEndpointRule getPrivateEndpointRule() {
    return privateEndpointRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePrivateEndpointRuleRequest that = (CreatePrivateEndpointRuleRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRule, that.privateEndpointRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, privateEndpointRule);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePrivateEndpointRuleRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRule", privateEndpointRule)
        .toString();
  }

  CreatePrivateEndpointRuleRequestPb toPb() {
    CreatePrivateEndpointRuleRequestPb pb = new CreatePrivateEndpointRuleRequestPb();
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);
    pb.setPrivateEndpointRule(privateEndpointRule);

    return pb;
  }

  static CreatePrivateEndpointRuleRequest fromPb(CreatePrivateEndpointRuleRequestPb pb) {
    CreatePrivateEndpointRuleRequest model = new CreatePrivateEndpointRuleRequest();
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());
    model.setPrivateEndpointRule(pb.getPrivateEndpointRule());

    return model;
  }

  public static class CreatePrivateEndpointRuleRequestSerializer
      extends JsonSerializer<CreatePrivateEndpointRuleRequest> {
    @Override
    public void serialize(
        CreatePrivateEndpointRuleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePrivateEndpointRuleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePrivateEndpointRuleRequestDeserializer
      extends JsonDeserializer<CreatePrivateEndpointRuleRequest> {
    @Override
    public CreatePrivateEndpointRuleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePrivateEndpointRuleRequestPb pb =
          mapper.readValue(p, CreatePrivateEndpointRuleRequestPb.class);
      return CreatePrivateEndpointRuleRequest.fromPb(pb);
    }
  }
}
