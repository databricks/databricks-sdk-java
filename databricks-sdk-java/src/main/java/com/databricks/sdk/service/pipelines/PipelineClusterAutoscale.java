// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = PipelineClusterAutoscale.PipelineClusterAutoscaleSerializer.class)
@JsonDeserialize(using = PipelineClusterAutoscale.PipelineClusterAutoscaleDeserializer.class)
public class PipelineClusterAutoscale {
  /**
   * The maximum number of workers to which the cluster can scale up when overloaded. `max_workers`
   * must be strictly greater than `min_workers`.
   */
  private Long maxWorkers;

  /**
   * The minimum number of workers the cluster can scale down to when underutilized. It is also the
   * initial number of workers the cluster will have after creation.
   */
  private Long minWorkers;

  /**
   * Databricks Enhanced Autoscaling optimizes cluster utilization by automatically allocating
   * cluster resources based on workload volume, with minimal impact to the data processing latency
   * of your pipelines. Enhanced Autoscaling is available for `updates` clusters only. The legacy
   * autoscaling feature is used for `maintenance` clusters.
   */
  private PipelineClusterAutoscaleMode mode;

  public PipelineClusterAutoscale setMaxWorkers(Long maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  public Long getMaxWorkers() {
    return maxWorkers;
  }

  public PipelineClusterAutoscale setMinWorkers(Long minWorkers) {
    this.minWorkers = minWorkers;
    return this;
  }

  public Long getMinWorkers() {
    return minWorkers;
  }

  public PipelineClusterAutoscale setMode(PipelineClusterAutoscaleMode mode) {
    this.mode = mode;
    return this;
  }

  public PipelineClusterAutoscaleMode getMode() {
    return mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineClusterAutoscale that = (PipelineClusterAutoscale) o;
    return Objects.equals(maxWorkers, that.maxWorkers)
        && Objects.equals(minWorkers, that.minWorkers)
        && Objects.equals(mode, that.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWorkers, minWorkers, mode);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineClusterAutoscale.class)
        .add("maxWorkers", maxWorkers)
        .add("minWorkers", minWorkers)
        .add("mode", mode)
        .toString();
  }

  PipelineClusterAutoscalePb toPb() {
    PipelineClusterAutoscalePb pb = new PipelineClusterAutoscalePb();
    pb.setMaxWorkers(maxWorkers);
    pb.setMinWorkers(minWorkers);
    pb.setMode(mode);

    return pb;
  }

  static PipelineClusterAutoscale fromPb(PipelineClusterAutoscalePb pb) {
    PipelineClusterAutoscale model = new PipelineClusterAutoscale();
    model.setMaxWorkers(pb.getMaxWorkers());
    model.setMinWorkers(pb.getMinWorkers());
    model.setMode(pb.getMode());

    return model;
  }

  public static class PipelineClusterAutoscaleSerializer
      extends JsonSerializer<PipelineClusterAutoscale> {
    @Override
    public void serialize(
        PipelineClusterAutoscale value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineClusterAutoscalePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineClusterAutoscaleDeserializer
      extends JsonDeserializer<PipelineClusterAutoscale> {
    @Override
    public PipelineClusterAutoscale deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineClusterAutoscalePb pb = mapper.readValue(p, PipelineClusterAutoscalePb.class);
      return PipelineClusterAutoscale.fromPb(pb);
    }
  }
}
