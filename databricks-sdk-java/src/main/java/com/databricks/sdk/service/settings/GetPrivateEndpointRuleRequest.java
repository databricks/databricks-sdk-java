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

/** Gets a private endpoint rule */
@Generated
@JsonSerialize(using = GetPrivateEndpointRuleRequest.GetPrivateEndpointRuleRequestSerializer.class)
@JsonDeserialize(
    using = GetPrivateEndpointRuleRequest.GetPrivateEndpointRuleRequestDeserializer.class)
public class GetPrivateEndpointRuleRequest {
  /** Your Network Connectvity Configuration ID. */
  private String networkConnectivityConfigId;

  /** Your private endpoint rule ID. */
  private String privateEndpointRuleId;

  public GetPrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public GetPrivateEndpointRuleRequest setPrivateEndpointRuleId(String privateEndpointRuleId) {
    this.privateEndpointRuleId = privateEndpointRuleId;
    return this;
  }

  public String getPrivateEndpointRuleId() {
    return privateEndpointRuleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPrivateEndpointRuleRequest that = (GetPrivateEndpointRuleRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRuleId, that.privateEndpointRuleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, privateEndpointRuleId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPrivateEndpointRuleRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRuleId", privateEndpointRuleId)
        .toString();
  }

  GetPrivateEndpointRuleRequestPb toPb() {
    GetPrivateEndpointRuleRequestPb pb = new GetPrivateEndpointRuleRequestPb();
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);
    pb.setPrivateEndpointRuleId(privateEndpointRuleId);

    return pb;
  }

  static GetPrivateEndpointRuleRequest fromPb(GetPrivateEndpointRuleRequestPb pb) {
    GetPrivateEndpointRuleRequest model = new GetPrivateEndpointRuleRequest();
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());
    model.setPrivateEndpointRuleId(pb.getPrivateEndpointRuleId());

    return model;
  }

  public static class GetPrivateEndpointRuleRequestSerializer
      extends JsonSerializer<GetPrivateEndpointRuleRequest> {
    @Override
    public void serialize(
        GetPrivateEndpointRuleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPrivateEndpointRuleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPrivateEndpointRuleRequestDeserializer
      extends JsonDeserializer<GetPrivateEndpointRuleRequest> {
    @Override
    public GetPrivateEndpointRuleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPrivateEndpointRuleRequestPb pb =
          mapper.readValue(p, GetPrivateEndpointRuleRequestPb.class);
      return GetPrivateEndpointRuleRequest.fromPb(pb);
    }
  }
}
