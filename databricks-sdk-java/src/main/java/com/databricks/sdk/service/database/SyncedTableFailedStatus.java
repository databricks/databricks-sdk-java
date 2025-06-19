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
 * Detailed status of a synced table. Shown if the synced table is in the OFFLINE_FAILED or the
 * SYNCED_PIPELINE_FAILED state.
 */
@Generated
@JsonSerialize(using = SyncedTableFailedStatus.SyncedTableFailedStatusSerializer.class)
@JsonDeserialize(using = SyncedTableFailedStatus.SyncedTableFailedStatusDeserializer.class)
public class SyncedTableFailedStatus {
  /**
   * The last source table Delta version that was synced to the synced table. Note that this Delta
   * version may only be partially synced to the synced table. Only populated if the table is still
   * synced and available for serving.
   */
  private Long lastProcessedCommitVersion;

  /**
   * The timestamp of the last time any data was synchronized from the source table to the synced
   * table. Only populated if the table is still synced and available for serving.
   */
  private String timestamp;

  public SyncedTableFailedStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public SyncedTableFailedStatus setTimestamp(String timestamp) {
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
    SyncedTableFailedStatus that = (SyncedTableFailedStatus) o;
    return Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProcessedCommitVersion, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableFailedStatus.class)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }

  SyncedTableFailedStatusPb toPb() {
    SyncedTableFailedStatusPb pb = new SyncedTableFailedStatusPb();
    pb.setLastProcessedCommitVersion(lastProcessedCommitVersion);
    pb.setTimestamp(timestamp);

    return pb;
  }

  static SyncedTableFailedStatus fromPb(SyncedTableFailedStatusPb pb) {
    SyncedTableFailedStatus model = new SyncedTableFailedStatus();
    model.setLastProcessedCommitVersion(pb.getLastProcessedCommitVersion());
    model.setTimestamp(pb.getTimestamp());

    return model;
  }

  public static class SyncedTableFailedStatusSerializer
      extends JsonSerializer<SyncedTableFailedStatus> {
    @Override
    public void serialize(
        SyncedTableFailedStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncedTableFailedStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncedTableFailedStatusDeserializer
      extends JsonDeserializer<SyncedTableFailedStatus> {
    @Override
    public SyncedTableFailedStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncedTableFailedStatusPb pb = mapper.readValue(p, SyncedTableFailedStatusPb.class);
      return SyncedTableFailedStatus.fromPb(pb);
    }
  }
}
