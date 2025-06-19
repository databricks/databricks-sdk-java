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

/** Get a network connectivity configuration */
@Generated
@JsonSerialize(
    using =
        GetNetworkConnectivityConfigurationRequest
            .GetNetworkConnectivityConfigurationRequestSerializer.class)
@JsonDeserialize(
    using =
        GetNetworkConnectivityConfigurationRequest
            .GetNetworkConnectivityConfigurationRequestDeserializer.class)
public class GetNetworkConnectivityConfigurationRequest {
  /** Your Network Connectivity Configuration ID. */
  private String networkConnectivityConfigId;

  public GetNetworkConnectivityConfigurationRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetNetworkConnectivityConfigurationRequest that =
        (GetNetworkConnectivityConfigurationRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetNetworkConnectivityConfigurationRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .toString();
  }

  GetNetworkConnectivityConfigurationRequestPb toPb() {
    GetNetworkConnectivityConfigurationRequestPb pb =
        new GetNetworkConnectivityConfigurationRequestPb();
    pb.setNetworkConnectivityConfigId(networkConnectivityConfigId);

    return pb;
  }

  static GetNetworkConnectivityConfigurationRequest fromPb(
      GetNetworkConnectivityConfigurationRequestPb pb) {
    GetNetworkConnectivityConfigurationRequest model =
        new GetNetworkConnectivityConfigurationRequest();
    model.setNetworkConnectivityConfigId(pb.getNetworkConnectivityConfigId());

    return model;
  }

  public static class GetNetworkConnectivityConfigurationRequestSerializer
      extends JsonSerializer<GetNetworkConnectivityConfigurationRequest> {
    @Override
    public void serialize(
        GetNetworkConnectivityConfigurationRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetNetworkConnectivityConfigurationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetNetworkConnectivityConfigurationRequestDeserializer
      extends JsonDeserializer<GetNetworkConnectivityConfigurationRequest> {
    @Override
    public GetNetworkConnectivityConfigurationRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetNetworkConnectivityConfigurationRequestPb pb =
          mapper.readValue(p, GetNetworkConnectivityConfigurationRequestPb.class);
      return GetNetworkConnectivityConfigurationRequest.fromPb(pb);
    }
  }
}
