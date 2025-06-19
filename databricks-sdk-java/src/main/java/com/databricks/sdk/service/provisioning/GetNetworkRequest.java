// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Get a network configuration */
@Generated
@JsonSerialize(using = GetNetworkRequest.GetNetworkRequestSerializer.class)
@JsonDeserialize(using = GetNetworkRequest.GetNetworkRequestDeserializer.class)
public class GetNetworkRequest {
  /** Databricks Account API network configuration ID. */
  private String networkId;

  public GetNetworkRequest setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetNetworkRequest that = (GetNetworkRequest) o;
    return Objects.equals(networkId, that.networkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetNetworkRequest.class).add("networkId", networkId).toString();
  }

  GetNetworkRequestPb toPb() {
    GetNetworkRequestPb pb = new GetNetworkRequestPb();
    pb.setNetworkId(networkId);

    return pb;
  }

  static GetNetworkRequest fromPb(GetNetworkRequestPb pb) {
    GetNetworkRequest model = new GetNetworkRequest();
    model.setNetworkId(pb.getNetworkId());

    return model;
  }

  public static class GetNetworkRequestSerializer extends JsonSerializer<GetNetworkRequest> {
    @Override
    public void serialize(GetNetworkRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetNetworkRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetNetworkRequestDeserializer extends JsonDeserializer<GetNetworkRequest> {
    @Override
    public GetNetworkRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetNetworkRequestPb pb = mapper.readValue(p, GetNetworkRequestPb.class);
      return GetNetworkRequest.fromPb(pb);
    }
  }
}
