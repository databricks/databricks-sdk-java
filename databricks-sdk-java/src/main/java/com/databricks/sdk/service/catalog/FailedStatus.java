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
 * Detailed status of an online table. Shown if the online table is in the OFFLINE_FAILED or the
 * ONLINE_PIPELINE_FAILED state.
 */
@Generated
@JsonSerialize(using = FailedStatus.FailedStatusSerializer.class)
@JsonDeserialize(using = FailedStatus.FailedStatusDeserializer.class)
public class FailedStatus {
  /**
   * The last source table Delta version that was synced to the online table. Note that this Delta
   * version may only be partially synced to the online table. Only populated if the table is still
   * online and available for serving.
   */
  private Long lastProcessedCommitVersion;

  /**
   * The timestamp of the last time any data was synchronized from the source table to the online
   * table. Only populated if the table is still online and available for serving.
   */
  private String timestamp;

  public FailedStatus setLastProcessedCommitVersion(Long lastProcessedCommitVersion) {
    this.lastProcessedCommitVersion = lastProcessedCommitVersion;
    return this;
  }

  public Long getLastProcessedCommitVersion() {
    return lastProcessedCommitVersion;
  }

  public FailedStatus setTimestamp(String timestamp) {
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
    FailedStatus that = (FailedStatus) o;
    return Objects.equals(lastProcessedCommitVersion, that.lastProcessedCommitVersion)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProcessedCommitVersion, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(FailedStatus.class)
        .add("lastProcessedCommitVersion", lastProcessedCommitVersion)
        .add("timestamp", timestamp)
        .toString();
  }

  FailedStatusPb toPb() {
    FailedStatusPb pb = new FailedStatusPb();
    pb.setLastProcessedCommitVersion(lastProcessedCommitVersion);
    pb.setTimestamp(timestamp);

    return pb;
  }

  static FailedStatus fromPb(FailedStatusPb pb) {
    FailedStatus model = new FailedStatus();
    model.setLastProcessedCommitVersion(pb.getLastProcessedCommitVersion());
    model.setTimestamp(pb.getTimestamp());

    return model;
  }

  public static class FailedStatusSerializer extends JsonSerializer<FailedStatus> {
    @Override
    public void serialize(FailedStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FailedStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FailedStatusDeserializer extends JsonDeserializer<FailedStatus> {
    @Override
    public FailedStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FailedStatusPb pb = mapper.readValue(p, FailedStatusPb.class);
      return FailedStatus.fromPb(pb);
    }
  }
}
