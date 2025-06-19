// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = AutoScale.AutoScaleSerializer.class)
@JsonDeserialize(using = AutoScale.AutoScaleDeserializer.class)
public class AutoScale {
  /**
   * The maximum number of workers to which the cluster can scale up when overloaded. Note that
   * `max_workers` must be strictly greater than `min_workers`.
   */
  private Long maxWorkers;

  /**
   * The minimum number of workers to which the cluster can scale down when underutilized. It is
   * also the initial number of workers the cluster will have after creation.
   */
  private Long minWorkers;

  public AutoScale setMaxWorkers(Long maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
  }

  public Long getMaxWorkers() {
    return maxWorkers;
  }

  public AutoScale setMinWorkers(Long minWorkers) {
    this.minWorkers = minWorkers;
    return this;
  }

  public Long getMinWorkers() {
    return minWorkers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoScale that = (AutoScale) o;
    return Objects.equals(maxWorkers, that.maxWorkers)
        && Objects.equals(minWorkers, that.minWorkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWorkers, minWorkers);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoScale.class)
        .add("maxWorkers", maxWorkers)
        .add("minWorkers", minWorkers)
        .toString();
  }

  AutoScalePb toPb() {
    AutoScalePb pb = new AutoScalePb();
    pb.setMaxWorkers(maxWorkers);
    pb.setMinWorkers(minWorkers);

    return pb;
  }

  static AutoScale fromPb(AutoScalePb pb) {
    AutoScale model = new AutoScale();
    model.setMaxWorkers(pb.getMaxWorkers());
    model.setMinWorkers(pb.getMinWorkers());

    return model;
  }

  public static class AutoScaleSerializer extends JsonSerializer<AutoScale> {
    @Override
    public void serialize(AutoScale value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AutoScalePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AutoScaleDeserializer extends JsonDeserializer<AutoScale> {
    @Override
    public AutoScale deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AutoScalePb pb = mapper.readValue(p, AutoScalePb.class);
      return AutoScale.fromPb(pb);
    }
  }
}
