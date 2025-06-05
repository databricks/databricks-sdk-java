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
@JsonSerialize(using = EndpointPendingConfig.EndpointPendingConfigSerializer.class)
@JsonDeserialize(using = EndpointPendingConfig.EndpointPendingConfigDeserializer.class)
public class EndpointPendingConfig {
  /**
   * Configuration for Inference Tables which automatically logs requests and responses to Unity
   * Catalog. Note: this field is deprecated for creating new provisioned throughput endpoints, or
   * updating existing provisioned throughput endpoints that never have inference table configured;
   * in these cases please use AI Gateway to manage inference tables.
   */
  private AutoCaptureConfigOutput autoCaptureConfig;

  /** The config version that the serving endpoint is currently serving. */
  private Long configVersion;

  /** The list of served entities belonging to the last issued update to the serving endpoint. */
  private Collection<ServedEntityOutput> servedEntities;

  /**
   * (Deprecated, use served_entities instead) The list of served models belonging to the last
   * issued update to the serving endpoint.
   */
  private Collection<ServedModelOutput> servedModels;

  /** The timestamp when the update to the pending config started. */
  private Long startTime;

  /** The traffic config defining how invocations to the serving endpoint should be routed. */
  private TrafficConfig trafficConfig;

  public EndpointPendingConfig setAutoCaptureConfig(AutoCaptureConfigOutput autoCaptureConfig) {
    this.autoCaptureConfig = autoCaptureConfig;
    return this;
  }

  public AutoCaptureConfigOutput getAutoCaptureConfig() {
    return autoCaptureConfig;
  }

  public EndpointPendingConfig setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  public Long getConfigVersion() {
    return configVersion;
  }

  public EndpointPendingConfig setServedEntities(Collection<ServedEntityOutput> servedEntities) {
    this.servedEntities = servedEntities;
    return this;
  }

  public Collection<ServedEntityOutput> getServedEntities() {
    return servedEntities;
  }

  public EndpointPendingConfig setServedModels(Collection<ServedModelOutput> servedModels) {
    this.servedModels = servedModels;
    return this;
  }

  public Collection<ServedModelOutput> getServedModels() {
    return servedModels;
  }

  public EndpointPendingConfig setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public EndpointPendingConfig setTrafficConfig(TrafficConfig trafficConfig) {
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
    EndpointPendingConfig that = (EndpointPendingConfig) o;
    return Objects.equals(autoCaptureConfig, that.autoCaptureConfig)
        && Objects.equals(configVersion, that.configVersion)
        && Objects.equals(servedEntities, that.servedEntities)
        && Objects.equals(servedModels, that.servedModels)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(trafficConfig, that.trafficConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoCaptureConfig, configVersion, servedEntities, servedModels, startTime, trafficConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointPendingConfig.class)
        .add("autoCaptureConfig", autoCaptureConfig)
        .add("configVersion", configVersion)
        .add("servedEntities", servedEntities)
        .add("servedModels", servedModels)
        .add("startTime", startTime)
        .add("trafficConfig", trafficConfig)
        .toString();
  }

  EndpointPendingConfigPb toPb() {
    EndpointPendingConfigPb pb = new EndpointPendingConfigPb();
    pb.setAutoCaptureConfig(autoCaptureConfig);
    pb.setConfigVersion(configVersion);
    pb.setServedEntities(servedEntities);
    pb.setServedModels(servedModels);
    pb.setStartTime(startTime);
    pb.setTrafficConfig(trafficConfig);

    return pb;
  }

  static EndpointPendingConfig fromPb(EndpointPendingConfigPb pb) {
    EndpointPendingConfig model = new EndpointPendingConfig();
    model.setAutoCaptureConfig(pb.getAutoCaptureConfig());
    model.setConfigVersion(pb.getConfigVersion());
    model.setServedEntities(pb.getServedEntities());
    model.setServedModels(pb.getServedModels());
    model.setStartTime(pb.getStartTime());
    model.setTrafficConfig(pb.getTrafficConfig());

    return model;
  }

  public static class EndpointPendingConfigSerializer
      extends JsonSerializer<EndpointPendingConfig> {
    @Override
    public void serialize(
        EndpointPendingConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointPendingConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointPendingConfigDeserializer
      extends JsonDeserializer<EndpointPendingConfig> {
    @Override
    public EndpointPendingConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointPendingConfigPb pb = mapper.readValue(p, EndpointPendingConfigPb.class);
      return EndpointPendingConfig.fromPb(pb);
    }
  }
}
