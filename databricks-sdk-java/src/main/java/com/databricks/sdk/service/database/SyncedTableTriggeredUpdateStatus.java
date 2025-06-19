// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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
 * Detailed status of a synced table. Shown if the synced table is in the SYNCED_TRIGGERED_UPDATE or
 * the SYNCED_NO_PENDING_UPDATE state.
 */
@Generated
@JsonSerialize(
    using = SyncedTableTriggeredUpdateStatus.SyncedTableTriggeredUpdateStatusSerializer.class)
@JsonDeserialize(
    using = SyncedTableTriggeredUpdateStatus.SyncedTableTriggeredUpdateStatusDeserializer.class)
public class SyncedTableTriggeredUpdateStatus {
  /**
   * The last source table Delta version that was synced to the synced table. Note that this Delta
   * version may not be completely synced to the synced table yet.
   */
  private Long lastProcessedCommitVersion;

  /**
   * The timestamp of the last time any data was synchronized from the source table to the synced
   * table.
   */
  private String timestamp;

  /** Progress of the active data synchronization pipeline. */
  private SyncedTablePipelineProgress triggeredUpdateProgress;

  public SyncedTableTriggeredUpdateStatus setLastProcessedCommitVersion(
      Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableTriggeredUpdateStatus setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public SyncedTableTriggeredUpdateStatus setTriggeredUpdateProgress(
      SyncedTablePipelineProgress triggeredUpdateProgress) {
    this.triggeredUpdateProgress = triggeredUpdateProgress;
    return this;
  }

  public SyncedTablePipelineProgress getTriggeredUpdateProgress() {
    return triggeredUpdateProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableTriggeredUpdateStatus that = (SyncedTableTriggeredUpdateStatus) o;
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
    return new ToStringer(SyncedTableTriggeredUpdateStatus.class)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .add("triggeredUpdateProgress", triggeredUpdateProgress)
        .toString();
  }

  SyncedTableTriggeredUpdateStatusPb toPb() {
    SyncedTableTriggeredUpdateStatusPb pb = new SyncedTableTriggeredUpdateStatusPb();
    pb.setLastProcessedCommitVersion(lastProcessedCommitVersion);
    pb.setTimestamp(timestamp);
    pb.setTriggeredUpdateProgress(triggeredUpdateProgress);

    return pb;
  }

  static SyncedTableTriggeredUpdateStatus fromPb(SyncedTableTriggeredUpdateStatusPb pb) {
    SyncedTableTriggeredUpdateStatus model = new SyncedTableTriggeredUpdateStatus();
    model.setLastProcessedCommitVersion(pb.getLastProcessedCommitVersion());
    model.setTimestamp(pb.getTimestamp());
    model.setTriggeredUpdateProgress(pb.getTriggeredUpdateProgress());

    return model;
  }

  public static class SyncedTableTriggeredUpdateStatusSerializer
      extends JsonSerializer<SyncedTableTriggeredUpdateStatus> {
    @Override
    public void serialize(
        SyncedTableTriggeredUpdateStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncedTableTriggeredUpdateStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncedTableTriggeredUpdateStatusDeserializer
      extends JsonDeserializer<SyncedTableTriggeredUpdateStatus> {
    @Override
    public SyncedTableTriggeredUpdateStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncedTableTriggeredUpdateStatusPb pb =
          mapper.readValue(p, SyncedTableTriggeredUpdateStatusPb.class);
      return SyncedTableTriggeredUpdateStatus.fromPb(pb);
    }
  }
}
