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
 * Detailed status of an online table. Shown if the online table is in the ONLINE_CONTINUOUS_UPDATE
 * or the ONLINE_UPDATING_PIPELINE_RESOURCES state.
 */
@Generated
@JsonSerialize(using = ContinuousUpdateStatus.ContinuousUpdateStatusSerializer.class)
@JsonDeserialize(using = ContinuousUpdateStatus.ContinuousUpdateStatusDeserializer.class)
public class ContinuousUpdateStatus {
  /** Progress of the initial data synchronization. */
  private PipelineProgress initialPipelineSyncProgress;

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

  public ContinuousUpdateStatus setInitialPipelineSyncProgress(
      PipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public PipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  public ContinuousUpdateStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public ContinuousUpdateStatus setTimestamp(String timestamp) {
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
    ContinuousUpdateStatus that = (ContinuousUpdateStatus) o;
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
    return new ToStringer(ContinuousUpdateStatus.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }

  ContinuousUpdateStatusPb toPb() {
    ContinuousUpdateStatusPb pb = new ContinuousUpdateStatusPb();
    pb.setInitialPipelineSyncProgress(initialPipelineSyncProgress);
    pb.setLastProcessedCommitVersion(lastProcessedCommitVersion);
    pb.setTimestamp(timestamp);

    return pb;
  }

  static ContinuousUpdateStatus fromPb(ContinuousUpdateStatusPb pb) {
    ContinuousUpdateStatus model = new ContinuousUpdateStatus();
    model.setInitialPipelineSyncProgress(pb.getInitialPipelineSyncProgress());
    model.setLastProcessedCommitVersion(pb.getLastProcessedCommitVersion());
    model.setTimestamp(pb.getTimestamp());

    return model;
  }

  public static class ContinuousUpdateStatusSerializer
      extends JsonSerializer<ContinuousUpdateStatus> {
    @Override
    public void serialize(
        ContinuousUpdateStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ContinuousUpdateStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ContinuousUpdateStatusDeserializer
      extends JsonDeserializer<ContinuousUpdateStatus> {
    @Override
    public ContinuousUpdateStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ContinuousUpdateStatusPb pb = mapper.readValue(p, ContinuousUpdateStatusPb.class);
      return ContinuousUpdateStatus.fromPb(pb);
    }
  }
}
