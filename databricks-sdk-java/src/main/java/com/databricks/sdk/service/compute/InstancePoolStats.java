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
@JsonSerialize(using = InstancePoolStats.InstancePoolStatsSerializer.class)
@JsonDeserialize(using = InstancePoolStats.InstancePoolStatsDeserializer.class)
public class InstancePoolStats {
  /** Number of active instances in the pool that are NOT part of a cluster. */
  private Long idleCount;

  /** Number of pending instances in the pool that are NOT part of a cluster. */
  private Long pendingIdleCount;

  /** Number of pending instances in the pool that are part of a cluster. */
  private Long pendingUsedCount;

  /** Number of active instances in the pool that are part of a cluster. */
  private Long usedCount;

  public InstancePoolStats setIdleCount(Long idleCount) {
    this.idleCount = idleCount;
    return this;
  }

  public Long getIdleCount() {
    return idleCount;
  }

  public InstancePoolStats setPendingIdleCount(Long pendingIdleCount) {
    this.pendingIdleCount = pendingIdleCount;
    return this;
  }

  public Long getPendingIdleCount() {
    return pendingIdleCount;
  }

  public InstancePoolStats setPendingUsedCount(Long pendingUsedCount) {
    this.pendingUsedCount = pendingUsedCount;
    return this;
  }

  public Long getPendingUsedCount() {
    return pendingUsedCount;
  }

  public InstancePoolStats setUsedCount(Long usedCount) {
    this.usedCount = usedCount;
    return this;
  }

  public Long getUsedCount() {
    return usedCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolStats that = (InstancePoolStats) o;
    return Objects.equals(idleCount, that.idleCount)
        && Objects.equals(pendingIdleCount, that.pendingIdleCount)
        && Objects.equals(pendingUsedCount, that.pendingUsedCount)
        && Objects.equals(usedCount, that.usedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idleCount, pendingIdleCount, pendingUsedCount, usedCount);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolStats.class)
        .add("idleCount", idleCount)
        .add("pendingIdleCount", pendingIdleCount)
        .add("pendingUsedCount", pendingUsedCount)
        .add("usedCount", usedCount)
        .toString();
  }

  InstancePoolStatsPb toPb() {
    InstancePoolStatsPb pb = new InstancePoolStatsPb();
    pb.setIdleCount(idleCount);
    pb.setPendingIdleCount(pendingIdleCount);
    pb.setPendingUsedCount(pendingUsedCount);
    pb.setUsedCount(usedCount);

    return pb;
  }

  static InstancePoolStats fromPb(InstancePoolStatsPb pb) {
    InstancePoolStats model = new InstancePoolStats();
    model.setIdleCount(pb.getIdleCount());
    model.setPendingIdleCount(pb.getPendingIdleCount());
    model.setPendingUsedCount(pb.getPendingUsedCount());
    model.setUsedCount(pb.getUsedCount());

    return model;
  }

  public static class InstancePoolStatsSerializer extends JsonSerializer<InstancePoolStats> {
    @Override
    public void serialize(InstancePoolStats value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolStatsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolStatsDeserializer extends JsonDeserializer<InstancePoolStats> {
    @Override
    public InstancePoolStats deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolStatsPb pb = mapper.readValue(p, InstancePoolStatsPb.class);
      return InstancePoolStats.fromPb(pb);
    }
  }
}
