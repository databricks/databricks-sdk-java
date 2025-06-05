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
 * Detailed status of a synced table. Shown if the synced table is in the SYNCED_CONTINUOUS_UPDATE
 * or the SYNCED_UPDATING_PIPELINE_RESOURCES state.
 */
@Generated
@JsonSerialize(
    using = SyncedTableContinuousUpdateStatus.SyncedTableContinuousUpdateStatusSerializer.class)
@JsonDeserialize(
    using = SyncedTableContinuousUpdateStatus.SyncedTableContinuousUpdateStatusDeserializer.class)
public class SyncedTableContinuousUpdateStatus {
  /** Progress of the initial data synchronization. */
  private SyncedTablePipelineProgress initialPipelineSyncProgress;

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

  public SyncedTableContinuousUpdateStatus setInitialPipelineSyncProgress(
      SyncedTablePipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public SyncedTablePipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  public SyncedTableContinuousUpdateStatus setLastProcessedCommitVersion(
      Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableContinuousUpdateStatus setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableContinuousUpdateStatus that = (SyncedTableContinuousUpdateStatus) o;
    return Objects.equals(initialPipelineSyncProgress, that.initialPipelineSyncProgress)
        && Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPipelineSyncProgress, lastProcessedCommitVersion, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableContinuousUpdateStatus.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }

  SyncedTableContinuousUpdateStatusPb toPb() {
    SyncedTableContinuousUpdateStatusPb pb = new SyncedTableContinuousUpdateStatusPb();
    pb.setInitialPipelineSyncProgress(initialPipelineSyncProgress);
    pb.setLastProcessedCommitVersion(lastProcessedCommitVersion);
    pb.setTimestamp(timestamp);

    return pb;
  }

  static SyncedTableContinuousUpdateStatus fromPb(SyncedTableContinuousUpdateStatusPb pb) {
    SyncedTableContinuousUpdateStatus model = new SyncedTableContinuousUpdateStatus();
    model.setInitialPipelineSyncProgress(pb.getInitialPipelineSyncProgress());
    model.setLastProcessedCommitVersion(pb.getLastProcessedCommitVersion());
    model.setTimestamp(pb.getTimestamp());

    return model;
  }

  public static class SyncedTableContinuousUpdateStatusSerializer
      extends JsonSerializer<SyncedTableContinuousUpdateStatus> {
    @Override
    public void serialize(
        SyncedTableContinuousUpdateStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncedTableContinuousUpdateStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncedTableContinuousUpdateStatusDeserializer
      extends JsonDeserializer<SyncedTableContinuousUpdateStatus> {
    @Override
    public SyncedTableContinuousUpdateStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncedTableContinuousUpdateStatusPb pb =
          mapper.readValue(p, SyncedTableContinuousUpdateStatusPb.class);
      return SyncedTableContinuousUpdateStatus.fromPb(pb);
    }
  }
}
