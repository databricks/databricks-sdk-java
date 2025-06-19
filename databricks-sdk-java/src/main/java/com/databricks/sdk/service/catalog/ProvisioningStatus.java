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
 * Detailed status of an online table. Shown if the online table is in the
 * PROVISIONING_PIPELINE_RESOURCES or the PROVISIONING_INITIAL_SNAPSHOT state.
 */
@Generated
@JsonSerialize(using = ProvisioningStatus.ProvisioningStatusSerializer.class)
@JsonDeserialize(using = ProvisioningStatus.ProvisioningStatusDeserializer.class)
public class ProvisioningStatus {
  /**
   * Details about initial data synchronization. Only populated when in the
   * PROVISIONING_INITIAL_SNAPSHOT state.
   */
  private PipelineProgress initialPipelineSyncProgress;

  public ProvisioningStatus setInitialPipelineSyncProgress(
      PipelineProgress initialPipelineSyncProgress) {
    this.initialPipelineSyncProgress = initialPipelineSyncProgress;
    return this;
  }

  public PipelineProgress getInitialPipelineSyncProgress() {
    return initialPipelineSyncProgress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProvisioningStatus that = (ProvisioningStatus) o;
    return Objects.equals(initialPipelineSyncProgress, that.initialPipelineSyncProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPipelineSyncProgress);
  }

  @Override
  public String toString() {
    return new ToStringer(ProvisioningStatus.class)
        .add("initialPipelineSyncProgress", initialPipelineSyncProgress)
        .toString();
  }

  ProvisioningStatusPb toPb() {
    ProvisioningStatusPb pb = new ProvisioningStatusPb();
    pb.setInitialPipelineSyncProgress(initialPipelineSyncProgress);

    return pb;
  }

  static ProvisioningStatus fromPb(ProvisioningStatusPb pb) {
    ProvisioningStatus model = new ProvisioningStatus();
    model.setInitialPipelineSyncProgress(pb.getInitialPipelineSyncProgress());

    return model;
  }

  public static class ProvisioningStatusSerializer extends JsonSerializer<ProvisioningStatus> {
    @Override
    public void serialize(ProvisioningStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ProvisioningStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ProvisioningStatusDeserializer extends JsonDeserializer<ProvisioningStatus> {
    @Override
    public ProvisioningStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ProvisioningStatusPb pb = mapper.readValue(p, ProvisioningStatusPb.class);
      return ProvisioningStatus.fromPb(pb);
    }
  }
}
