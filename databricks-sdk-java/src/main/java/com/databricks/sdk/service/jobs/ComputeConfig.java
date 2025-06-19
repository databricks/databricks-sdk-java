// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = ComputeConfig.ComputeConfigSerializer.class)
@JsonDeserialize(using = ComputeConfig.ComputeConfigDeserializer.class)
public class ComputeConfig {
  /** IDof the GPU pool to use. */
  private String gpuNodePoolId;

  /** GPU type. */
  private String gpuType;

  /** Number of GPUs. */
  private Long numGpus;

  public ComputeConfig setGpuNodePoolId(String gpuNodePoolId) {
    this.gpuNodePoolId = gpuNodePoolId;
    return this;
  }

  public String getGpuNodePoolId() {
    return gpuNodePoolId;
  }

  public ComputeConfig setGpuType(String gpuType) {
    this.gpuType = gpuType;
    return this;
  }

  public String getGpuType() {
    return gpuType;
  }

  public ComputeConfig setNumGpus(Long numGpus) {
    this.numGpus = numGpus;
    return this;
  }

  public Long getNumGpus() {
    return numGpus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputeConfig that = (ComputeConfig) o;
    return Objects.equals(gpuNodePoolId, that.gpuNodePoolId)
        && Objects.equals(gpuType, that.gpuType)
        && Objects.equals(numGpus, that.numGpus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuNodePoolId, gpuType, numGpus);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeConfig.class)
        .add("gpuNodePoolId", gpuNodePoolId)
        .add("gpuType", gpuType)
        .add("numGpus", numGpus)
        .toString();
  }

  ComputeConfigPb toPb() {
    ComputeConfigPb pb = new ComputeConfigPb();
    pb.setGpuNodePoolId(gpuNodePoolId);
    pb.setGpuType(gpuType);
    pb.setNumGpus(numGpus);

    return pb;
  }

  static ComputeConfig fromPb(ComputeConfigPb pb) {
    ComputeConfig model = new ComputeConfig();
    model.setGpuNodePoolId(pb.getGpuNodePoolId());
    model.setGpuType(pb.getGpuType());
    model.setNumGpus(pb.getNumGpus());

    return model;
  }

  public static class ComputeConfigSerializer extends JsonSerializer<ComputeConfig> {
    @Override
    public void serialize(ComputeConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ComputeConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ComputeConfigDeserializer extends JsonDeserializer<ComputeConfig> {
    @Override
    public ComputeConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ComputeConfigPb pb = mapper.readValue(p, ComputeConfigPb.class);
      return ComputeConfig.fromPb(pb);
    }
  }
}
