// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

@Generated
@JsonSerialize(
    using =
        UpdateProvisionedThroughputEndpointConfigRequest
            .UpdateProvisionedThroughputEndpointConfigRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateProvisionedThroughputEndpointConfigRequest
            .UpdateProvisionedThroughputEndpointConfigRequestDeserializer.class)
public class UpdateProvisionedThroughputEndpointConfigRequest {
  /** */
  private PtEndpointCoreConfig config;

  /** The name of the pt endpoint to update. This field is required. */
  private String name;

  public UpdateProvisionedThroughputEndpointConfigRequest setConfig(PtEndpointCoreConfig config) {
    this.config = config;
    return this;
  }

  public PtEndpointCoreConfig getConfig() {
    return config;
  }

  public UpdateProvisionedThroughputEndpointConfigRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProvisionedThroughputEndpointConfigRequest that =
        (UpdateProvisionedThroughputEndpointConfigRequest) o;
    return Objects.equals(config, that.config) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProvisionedThroughputEndpointConfigRequest.class)
        .add("config", config)
        .add("name", name)
        .toString();
  }

  UpdateProvisionedThroughputEndpointConfigRequestPb toPb() {
    UpdateProvisionedThroughputEndpointConfigRequestPb pb =
        new UpdateProvisionedThroughputEndpointConfigRequestPb();
    pb.setConfig(config);
    pb.setName(name);

    return pb;
  }

  static UpdateProvisionedThroughputEndpointConfigRequest fromPb(
      UpdateProvisionedThroughputEndpointConfigRequestPb pb) {
    UpdateProvisionedThroughputEndpointConfigRequest model =
        new UpdateProvisionedThroughputEndpointConfigRequest();
    model.setConfig(pb.getConfig());
    model.setName(pb.getName());

    return model;
  }

  public static class UpdateProvisionedThroughputEndpointConfigRequestSerializer
      extends JsonSerializer<UpdateProvisionedThroughputEndpointConfigRequest> {
    @Override
    public void serialize(
        UpdateProvisionedThroughputEndpointConfigRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateProvisionedThroughputEndpointConfigRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateProvisionedThroughputEndpointConfigRequestDeserializer
      extends JsonDeserializer<UpdateProvisionedThroughputEndpointConfigRequest> {
    @Override
    public UpdateProvisionedThroughputEndpointConfigRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateProvisionedThroughputEndpointConfigRequestPb pb =
          mapper.readValue(p, UpdateProvisionedThroughputEndpointConfigRequestPb.class);
      return UpdateProvisionedThroughputEndpointConfigRequest.fromPb(pb);
    }
  }
}
