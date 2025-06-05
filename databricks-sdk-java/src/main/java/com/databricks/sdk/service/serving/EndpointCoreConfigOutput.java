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
@JsonSerialize(using = EndpointCoreConfigOutput.EndpointCoreConfigOutputSerializer.class)
@JsonDeserialize(using = EndpointCoreConfigOutput.EndpointCoreConfigOutputDeserializer.class)
public class EndpointCoreConfigOutput {
  /**
   * Configuration for Inference Tables which automatically logs requests and responses to Unity
   * Catalog. Note: this field is deprecated for creating new provisioned throughput endpoints, or
   * updating existing provisioned throughput endpoints that never have inference table configured;
   * in these cases please use AI Gateway to manage inference tables.
   */
  private AutoCaptureConfigOutput autoCaptureConfig;

  /** The config version that the serving endpoint is currently serving. */
  private Long configVersion;

  /** The list of served entities under the serving endpoint config. */
  private Collection<ServedEntityOutput> servedEntities;

  /**
   * (Deprecated, use served_entities instead) The list of served models under the serving endpoint
   * config.
   */
  private Collection<ServedModelOutput> servedModels;

  /** The traffic configuration associated with the serving endpoint config. */
  private TrafficConfig trafficConfig;

  public EndpointCoreConfigOutput setAutoCaptureConfig(AutoCaptureConfigOutput autoCaptureConfig) {
    this.autoCaptureConfig = autoCaptureConfig;
    return this;
  }

  public AutoCaptureConfigOutput getAutoCaptureConfig() {
    return autoCaptureConfig;
  }

  public EndpointCoreConfigOutput setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  public Long getConfigVersion() {
    return configVersion;
  }

  public EndpointCoreConfigOutput setServedEntities(Collection<ServedEntityOutput> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntityOutput> getServedEntities() {
    return servedEntities;
  }

  public EndpointCoreConfigOutput setServedModels(Collection<ServedModelOutput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelOutput> getServedModels() {
    return servedModels;
  }

  public EndpointCoreConfigOutput setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointCoreConfigOutput that = (EndpointCoreConfigOutput) o;
    return Objects.equals(autoCaptureConfig, that.autoCaptureConfig)
        && Objects.equals(configVersion, that.configVersion)
        && Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoCaptureConfig, configVersion, servedEntities, servedModels, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointCoreConfigOutput.class)
        .add("autoCaptureConfig", autoCaptureConfig)
        .add("configVersion", configVersion)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .add("trafficConfig", trafficConfig)
        .toString();
  }

  EndpointCoreConfigOutputPb toPb() {
    EndpointCoreConfigOutputPb pb = new EndpointCoreConfigOutputPb();
    pb.setAutoCaptureConfig(autoCaptureConfig);
    pb.setConfigVersion(configVersion);
    pb.setServedEntities(servedEntities);
    pb.setServedModels(servedModels);
    pb.setTrafficConfig(trafficConfig);

    return pb;
  }

  static EndpointCoreConfigOutput fromPb(EndpointCoreConfigOutputPb pb) {
    EndpointCoreConfigOutput model = new EndpointCoreConfigOutput();
    model.setAutoCaptureConfig(pb.getAutoCaptureConfig());
    model.setConfigVersion(pb.getConfigVersion());
    model.setServedEntities(pb.getServedEntities());
    model.setServedModels(pb.getServedModels());
    model.setTrafficConfig(pb.getTrafficConfig());

    return model;
  }

  public static class EndpointCoreConfigOutputSerializer
      extends JsonSerializer<EndpointCoreConfigOutput> {
    @Override
    public void serialize(
        EndpointCoreConfigOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointCoreConfigOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointCoreConfigOutputDeserializer
      extends JsonDeserializer<EndpointCoreConfigOutput> {
    @Override
    public EndpointCoreConfigOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointCoreConfigOutputPb pb = mapper.readValue(p, EndpointCoreConfigOutputPb.class);
      return EndpointCoreConfigOutput.fromPb(pb);
    }
  }
}
