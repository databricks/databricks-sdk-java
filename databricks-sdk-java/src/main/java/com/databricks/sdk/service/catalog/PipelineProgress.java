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

/** Progress information of the Online Table data synchronization pipeline. */
@Generated
@JsonSerialize(using = PipelineProgress.PipelineProgressSerializer.class)
@JsonDeserialize(using = PipelineProgress.PipelineProgressDeserializer.class)
public class PipelineProgress {
  /** The estimated time remaining to complete this update in seconds. */
  private Double estimatedCompletionTimeSeconds;

  /**
   * The source table Delta version that was last processed by the pipeline. The pipeline may not
   * have completely processed this version yet.
   */
  private Long latestVersionCurrentlyProcessing;

  /** The completion ratio of this update. This is a number between 0 and 1. */
  private Double syncProgressCompletion;

  /** The number of rows that have been synced in this update. */
  private Long syncedRowCount;

  /**
   * The total number of rows that need to be synced in this update. This number may be an estimate.
   */
  private Long totalRowCount;

  public PipelineProgress setEstimatedCompletionTimeSeconds(Double estimatedCompletionTimeSeconds) {
    this.estimatedCompletionTimeSeconds = estimatedCompletionTimeSeconds;
    return this;
  }

  public Double getEstimatedCompletionTimeSeconds() {
    return estimatedCompletionTimeSeconds;
  }

  public PipelineProgress setLatestVersionCurrentlyProcessing(
      Long latestVersionCurrentlyProcessing) {
    this.latestVersionCurrentlyProcessing = latestVersionCurrentlyProcessing;
    return this;
  }

  public Long getLatestVersionCurrentlyProcessing() {
    return latestVersionCurrentlyProcessing;
  }

  public PipelineProgress setSyncProgressCompletion(Double syncProgressCompletion) {
    this.syncProgressCompletion = syncProgressCompletion;
    return this;
  }

  public Double getSyncProgressCompletion() {
    return syncProgressCompletion;
  }

  public PipelineProgress setSyncedRowCount(Long syncedRowCount) {
    this.syncedRowCount = syncedRowCount;
    return this;
  }

  public Long getSyncedRowCount() {
    return syncedRowCount;
  }

  public PipelineProgress setTotalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  public Long getTotalRowCount() {
    return totalRowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineProgress that = (PipelineProgress) o;
    return Objects.equals(estimatedCompletionTimeSeconds, that.estimatedCompletionTimeSeconds)
        && Objects.equals(latestVersionCurrentlyProcessing, that.latestVersionCurrentlyProcessing)
        && Objects.equals(syncProgressCompletion, that.syncProgressCompletion)
        && Objects.equals(syncedRowCount, that.syncedRowCount)
        && Objects.equals(totalRowCount, that.totalRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        estimatedCompletionTimeSeconds,
        latestVersionCurrentlyProcessing,
        syncProgressCompletion,
        syncedRowCount,
        totalRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineProgress.class)
        .add("estimatedCompletionTimeSeconds", estimatedCompletionTimeSeconds)
        .add("latestVersionCurrentlyProcessing", latestVersionCurrentlyProcessing)
        .add("syncProgressCompletion", syncProgressCompletion)
        .add("syncedRowCount", syncedRowCount)
        .add("totalRowCount", totalRowCount)
        .toString();
  }

  PipelineProgressPb toPb() {
    PipelineProgressPb pb = new PipelineProgressPb();
    pb.setEstimatedCompletionTimeSeconds(estimatedCompletionTimeSeconds);
    pb.setLatestVersionCurrentlyProcessing(latestVersionCurrentlyProcessing);
    pb.setSyncProgressCompletion(syncProgressCompletion);
    pb.setSyncedRowCount(syncedRowCount);
    pb.setTotalRowCount(totalRowCount);

    return pb;
  }

  static PipelineProgress fromPb(PipelineProgressPb pb) {
    PipelineProgress model = new PipelineProgress();
    model.setEstimatedCompletionTimeSeconds(pb.getEstimatedCompletionTimeSeconds());
    model.setLatestVersionCurrentlyProcessing(pb.getLatestVersionCurrentlyProcessing());
    model.setSyncProgressCompletion(pb.getSyncProgressCompletion());
    model.setSyncedRowCount(pb.getSyncedRowCount());
    model.setTotalRowCount(pb.getTotalRowCount());

    return model;
  }

  public static class PipelineProgressSerializer extends JsonSerializer<PipelineProgress> {
    @Override
    public void serialize(PipelineProgress value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineProgressPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineProgressDeserializer extends JsonDeserializer<PipelineProgress> {
    @Override
    public PipelineProgress deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineProgressPb pb = mapper.readValue(p, PipelineProgressPb.class);
      return PipelineProgress.fromPb(pb);
    }
  }
}
