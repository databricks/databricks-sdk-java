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

/** Create a network connectivity configuration */
@Generated
@JsonSerialize(
    using =
        CreateNetworkConnectivityConfigRequest.CreateNetworkConnectivityConfigRequestSerializer
            .class)
@JsonDeserialize(
    using =
        CreateNetworkConnectivityConfigRequest.CreateNetworkConnectivityConfigRequestDeserializer
            .class)
public class CreateNetworkConnectivityConfigRequest {
  /** Properties of the new network connectivity configuration. */
  private CreateNetworkConnectivityConfiguration networkConnectivityConfig;

  public CreateNetworkConnectivityConfigRequest setNetworkConnectivityConfig(
      CreateNetworkConnectivityConfiguration networkConnectivityConfig) {
    this.networkConnectivityConfig = networkConnectivityConfig;
    return this;
  }

  public CreateNetworkConnectivityConfiguration getNetworkConnectivityConfig() {
    return networkConnectivityConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNetworkConnectivityConfigRequest that = (CreateNetworkConnectivityConfigRequest) o;
    return Objects.equals(networkConnectivityConfig, that.networkConnectivityConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkConnectivityConfigRequest.class)
        .add("networkConnectivityConfig", networkConnectivityConfig)
        .toString();
  }

  CreateNetworkConnectivityConfigRequestPb toPb() {
    CreateNetworkConnectivityConfigRequestPb pb = new CreateNetworkConnectivityConfigRequestPb();
    pb.setNetworkConnectivityConfig(networkConnectivityConfig);

    return pb;
  }

  static CreateNetworkConnectivityConfigRequest fromPb(
      CreateNetworkConnectivityConfigRequestPb pb) {
    CreateNetworkConnectivityConfigRequest model = new CreateNetworkConnectivityConfigRequest();
    model.setNetworkConnectivityConfig(pb.getNetworkConnectivityConfig());

    return model;
  }

  public static class CreateNetworkConnectivityConfigRequestSerializer
      extends JsonSerializer<CreateNetworkConnectivityConfigRequest> {
    @Override
    public void serialize(
        CreateNetworkConnectivityConfigRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CreateNetworkConnectivityConfigRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateNetworkConnectivityConfigRequestDeserializer
      extends JsonDeserializer<CreateNetworkConnectivityConfigRequest> {
    @Override
    public CreateNetworkConnectivityConfigRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateNetworkConnectivityConfigRequestPb pb =
          mapper.readValue(p, CreateNetworkConnectivityConfigRequestPb.class);
      return CreateNetworkConnectivityConfigRequest.fromPb(pb);
    }
  }
}
