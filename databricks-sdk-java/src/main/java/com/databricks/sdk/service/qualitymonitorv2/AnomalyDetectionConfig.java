// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

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
@JsonSerialize(using = AnomalyDetectionConfig.AnomalyDetectionConfigSerializer.class)
@JsonDeserialize(using = AnomalyDetectionConfig.AnomalyDetectionConfigDeserializer.class)
public class AnomalyDetectionConfig {
  /** Run id of the last run of the workflow */
  private String lastRunId;

  /** The status of the last run of the workflow. */
  private AnomalyDetectionRunStatus latestRunStatus;

  public AnomalyDetectionConfig setLastRunId(String lastRunId) {
    this.lastRunId = lastRunId;
    return this;
  }

  public String getLastRunId() {
    return lastRunId;
  }

  public AnomalyDetectionConfig setLatestRunStatus(AnomalyDetectionRunStatus latestRunStatus) {
    this.latestRunStatus = latestRunStatus;
    return this;
  }

  public AnomalyDetectionRunStatus getLatestRunStatus() {
    return latestRunStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnomalyDetectionConfig that = (AnomalyDetectionConfig) o;
    return Objects.equals(lastRunId, that.lastRunId)
        && Objects.equals(latestRunStatus, that.latestRunStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastRunId, latestRunStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(AnomalyDetectionConfig.class)
        .add("lastRunId", lastRunId)
        .add("latestRunStatus", latestRunStatus)
        .toString();
  }

  AnomalyDetectionConfigPb toPb() {
    AnomalyDetectionConfigPb pb = new AnomalyDetectionConfigPb();
    pb.setLastRunId(lastRunId);
    pb.setLatestRunStatus(latestRunStatus);

    return pb;
  }

  static AnomalyDetectionConfig fromPb(AnomalyDetectionConfigPb pb) {
    AnomalyDetectionConfig model = new AnomalyDetectionConfig();
    model.setLastRunId(pb.getLastRunId());
    model.setLatestRunStatus(pb.getLatestRunStatus());

    return model;
  }

  public static class AnomalyDetectionConfigSerializer
      extends JsonSerializer<AnomalyDetectionConfig> {
    @Override
    public void serialize(
        AnomalyDetectionConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AnomalyDetectionConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AnomalyDetectionConfigDeserializer
      extends JsonDeserializer<AnomalyDetectionConfig> {
    @Override
    public AnomalyDetectionConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AnomalyDetectionConfigPb pb = mapper.readValue(p, AnomalyDetectionConfigPb.class);
      return AnomalyDetectionConfig.fromPb(pb);
    }
  }
}
