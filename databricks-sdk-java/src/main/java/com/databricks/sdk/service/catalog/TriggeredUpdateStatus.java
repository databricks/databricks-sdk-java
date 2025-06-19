// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/**
 * Detailed status of an online table. Shown if the online table is in the ONLINE_TRIGGERED_UPDATE
 * or the ONLINE_NO_PENDING_UPDATE state.
 */
@Generated
@JsonSerialize(using = TriggeredUpdateStatus.TriggeredUpdateStatusSerializer.class)
@JsonDeserialize(using = TriggeredUpdateStatus.TriggeredUpdateStatusDeserializer.class)
public class TriggeredUpdateStatus {
  /**
   * The last source table Delta version that was synced to the online table. Note that this Delta
   * version may not be completely synced to the online table yet.
   */
  private Long lastProcessedCommitVersion;

  /**
   * The timestamp of the last time any data was synchronized from the source table to the online
   * table.
   */
  private String timestamp;

  /** Progress of the active data synchronization pipeline. */
  private PipelineProgress triggeredUpdateProgress;

  public TriggeredUpdateStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public TriggeredUpdateStatus setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public TriggeredUpdateStatus setTriggeredUpdateProgress(
      PipelineProgress triggeredUpdateProgress) {
    this.triggeredUpdateProgress = triggeredUpdateProgress;
    return this;
  }

  public PipelineProgress getTriggeredUpdateProgress() {
    return triggeredUpdateProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggeredUpdateStatus that = (TriggeredUpdateStatus) o;
    return Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(triggeredUpdateProgress, that.triggeredUpdateProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProcessedCommitVersion, timestamp, triggeredUpdateProgress);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggeredUpdateStatus.class)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .add("triggeredUpdateProgress", triggeredUpdateProgress)
        .toString();
  }

  TriggeredUpdateStatusPb toPb() {
    TriggeredUpdateStatusPb pb = new TriggeredUpdateStatusPb();
    pb.setLastProcessedCommitVersion(lastProcessedCommitVersion);
    pb.setTimestamp(timestamp);
    pb.setTriggeredUpdateProgress(triggeredUpdateProgress);

    return pb;
  }

  static TriggeredUpdateStatus fromPb(TriggeredUpdateStatusPb pb) {
    TriggeredUpdateStatus model = new TriggeredUpdateStatus();
    model.setLastProcessedCommitVersion(pb.getLastProcessedCommitVersion());
    model.setTimestamp(pb.getTimestamp());
    model.setTriggeredUpdateProgress(pb.getTriggeredUpdateProgress());

    return model;
  }

  public static class TriggeredUpdateStatusSerializer
      extends JsonSerializer<TriggeredUpdateStatus> {
    @Override
    public void serialize(
        TriggeredUpdateStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TriggeredUpdateStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TriggeredUpdateStatusDeserializer
      extends JsonDeserializer<TriggeredUpdateStatus> {
    @Override
    public TriggeredUpdateStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TriggeredUpdateStatusPb pb = mapper.readValue(p, TriggeredUpdateStatusPb.class);
      return TriggeredUpdateStatus.fromPb(pb);
    }
  }
}
