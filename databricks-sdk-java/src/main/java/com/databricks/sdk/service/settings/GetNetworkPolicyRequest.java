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

/** Get a network policy */
@Generated
@JsonSerialize(using = GetNetworkPolicyRequest.GetNetworkPolicyRequestSerializer.class)
@JsonDeserialize(using = GetNetworkPolicyRequest.GetNetworkPolicyRequestDeserializer.class)
public class GetNetworkPolicyRequest {
  /** The unique identifier of the network policy to retrieve. */
  private String networkPolicyId;

  public GetNetworkPolicyRequest setNetworkPolicyId(String networkPolicyId) {
    this.networkPolicyId = networkPolicyId;
    return this;
  }

  public String getNetworkPolicyId() {
    return networkPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetNetworkPolicyRequest that = (GetNetworkPolicyRequest) o;
    return Objects.equals(networkPolicyId, that.networkPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetNetworkPolicyRequest.class)
        .add("networkPolicyId", networkPolicyId)
        .toString();
  }

  GetNetworkPolicyRequestPb toPb() {
    GetNetworkPolicyRequestPb pb = new GetNetworkPolicyRequestPb();
    pb.setNetworkPolicyId(networkPolicyId);

    return pb;
  }

  static GetNetworkPolicyRequest fromPb(GetNetworkPolicyRequestPb pb) {
    GetNetworkPolicyRequest model = new GetNetworkPolicyRequest();
    model.setNetworkPolicyId(pb.getNetworkPolicyId());

    return model;
  }

  public static class GetNetworkPolicyRequestSerializer
      extends JsonSerializer<GetNetworkPolicyRequest> {
    @Override
    public void serialize(
        GetNetworkPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetNetworkPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetNetworkPolicyRequestDeserializer
      extends JsonDeserializer<GetNetworkPolicyRequest> {
    @Override
    public GetNetworkPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetNetworkPolicyRequestPb pb = mapper.readValue(p, GetNetworkPolicyRequestPb.class);
      return GetNetworkPolicyRequest.fromPb(pb);
    }
  }
}
