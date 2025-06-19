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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PtEndpointCoreConfig.PtEndpointCoreConfigSerializer.class)
@JsonDeserialize(using = PtEndpointCoreConfig.PtEndpointCoreConfigDeserializer.class)
public class PtEndpointCoreConfig {
  /** The list of served entities under the serving endpoint config. */
  private Collection<PtServedModel> servedEntities;

  /** */
  private TrafficConfig trafficConfig;

  public PtEndpointCoreConfig setServedEntities(Collection<PtServedModel> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<PtServedModel> getServedEntities() {
    return servedEntities;
  }

  public PtEndpointCoreConfig setTrafficConfig(TrafficConfig trafficConfig) {
    this.trafficConfig = trafficConfig;
    return this;
  }

  public TrafficConfig getTrafficConfig() {
    return trafficConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PtEndpointCoreConfig that = (PtEndpointCoreConfig) o;
    return Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedEntities, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(PtEndpointCoreConfig.class)
        .add("servedEntities", servedEntities)
        .add("trafficConfig", trafficConfig)
        .toString();
  }

  PtEndpointCoreConfigPb toPb() {
    PtEndpointCoreConfigPb pb = new PtEndpointCoreConfigPb();
    pb.setServedEntities(servedEntities);
    pb.setTrafficConfig(trafficConfig);

    return pb;
  }

  static PtEndpointCoreConfig fromPb(PtEndpointCoreConfigPb pb) {
    PtEndpointCoreConfig model = new PtEndpointCoreConfig();
    model.setServedEntities(pb.getServedEntities());
    model.setTrafficConfig(pb.getTrafficConfig());

    return model;
  }

  public static class PtEndpointCoreConfigSerializer extends JsonSerializer<PtEndpointCoreConfig> {
    @Override
    public void serialize(
        PtEndpointCoreConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PtEndpointCoreConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PtEndpointCoreConfigDeserializer
      extends JsonDeserializer<PtEndpointCoreConfig> {
    @Override
    public PtEndpointCoreConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PtEndpointCoreConfigPb pb = mapper.readValue(p, PtEndpointCoreConfigPb.class);
      return PtEndpointCoreConfig.fromPb(pb);
    }
  }
}
