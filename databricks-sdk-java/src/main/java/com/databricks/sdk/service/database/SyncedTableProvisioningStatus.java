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
 * Detailed status of a synced table. Shown if the synced table is in the
 * PROVISIONING_PIPELINE_RESOURCES or the PROVISIONING_INITIAL_SNAPSHOT state.
 */
@Generated
@JsonSerialize(using = SyncedTableProvisioningStatus.SyncedTableProvisioningStatusSerializer.class)
@JsonDeserialize(
    using = SyncedTableProvisioningStatus.SyncedTableProvisioningStatusDeserializer.class)
public class SyncedTableProvisioningStatus {
  /**
   * Details about initial data synchronization. Only populated when in the
   * PROVISIONING_INITIAL_SNAPSHOT state.
   */
  private SyncedTablePipelineProgress initialPipelineSyncProgress;

  public SyncedTableProvisioningStatus setInitialPipelineSyncProgress(
      SyncedTablePipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public SyncedTablePipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableProvisioningStatus that = (SyncedTableProvisioningStatus) o;
    return Objects.equals(initialPipelineSyncProgress, that.initialPipelineSyncProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPipelineSyncProgress);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableProvisioningStatus.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .toString();
  }

  SyncedTableProvisioningStatusPb toPb() {
    SyncedTableProvisioningStatusPb pb = new SyncedTableProvisioningStatusPb();
    pb.setInitialPipelineSyncProgress(initialPipelineSyncProgress);

    return pb;
  }

  static SyncedTableProvisioningStatus fromPb(SyncedTableProvisioningStatusPb pb) {
    SyncedTableProvisioningStatus model = new SyncedTableProvisioningStatus();
    model.setInitialPipelineSyncProgress(pb.getInitialPipelineSyncProgress());

    return model;
  }

  public static class SyncedTableProvisioningStatusSerializer
      extends JsonSerializer<SyncedTableProvisioningStatus> {
    @Override
    public void serialize(
        SyncedTableProvisioningStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncedTableProvisioningStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncedTableProvisioningStatusDeserializer
      extends JsonDeserializer<SyncedTableProvisioningStatus> {
    @Override
    public SyncedTableProvisioningStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncedTableProvisioningStatusPb pb =
          mapper.readValue(p, SyncedTableProvisioningStatusPb.class);
      return SyncedTableProvisioningStatus.fromPb(pb);
    }
  }
}
