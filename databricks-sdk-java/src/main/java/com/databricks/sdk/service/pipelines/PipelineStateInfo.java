// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PipelineStateInfo.PipelineStateInfoSerializer.class)
@JsonDeserialize(using = PipelineStateInfo.PipelineStateInfoDeserializer.class)
public class PipelineStateInfo {
  /** The unique identifier of the cluster running the pipeline. */
  private String clusterId;

  /** The username of the pipeline creator. */
  private String creatorUserName;

  /** The health of a pipeline. */
  private PipelineStateInfoHealth health;

  /** Status of the latest updates for the pipeline. Ordered with the newest update first. */
  private Collection<UpdateStateInfo> latestUpdates;

  /** The user-friendly name of the pipeline. */
  private String name;

  /** The unique identifier of the pipeline. */
  private String pipelineId;

  /**
   * The username that the pipeline runs as. This is a read only value derived from the pipeline
   * owner.
   */
  private String runAsUserName;

  /** The pipeline state. */
  private PipelineState state;

  public PipelineStateInfo setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public PipelineStateInfo setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public PipelineStateInfo setHealth(PipelineStateInfoHealth health) {
    this.health = health;
    return this;
  }

  public PipelineStateInfoHealth getHealth() {
    return health;
  }

  public PipelineStateInfo setLatestUpdates(Collection<UpdateStateInfo> latestUpdates) {
    this.latestUpdates = latestUpdates;
    return this;
  }

  public Collection<UpdateStateInfo> getLatestUpdates() {
    return latestUpdates;
  }

  public PipelineStateInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PipelineStateInfo setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public PipelineStateInfo setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public PipelineStateInfo setState(PipelineState state) {
    this.state = state;
    return this;
  }

  public PipelineState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineStateInfo that = (PipelineStateInfo) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(health, that.health)
        && Objects.equals(latestUpdates, that.latestUpdates)
        && Objects.equals(name, that.name)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusterId, creatorUserName, health, latestUpdates, name, pipelineId, runAsUserName, state);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineStateInfo.class)
        .add("clusterId", clusterId)
        .add("creatorUserName", creatorUserName)
        .add("health", health)
        .add("latestUpdates", latestUpdates)
        .add("name", name)
        .add("pipelineId", pipelineId)
        .add("runAsUserName", runAsUserName)
        .add("state", state)
        .toString();
  }

  PipelineStateInfoPb toPb() {
    PipelineStateInfoPb pb = new PipelineStateInfoPb();
    pb.setClusterId(clusterId);
    pb.setCreatorUserName(creatorUserName);
    pb.setHealth(health);
    pb.setLatestUpdates(latestUpdates);
    pb.setName(name);
    pb.setPipelineId(pipelineId);
    pb.setRunAsUserName(runAsUserName);
    pb.setState(state);

    return pb;
  }

  static PipelineStateInfo fromPb(PipelineStateInfoPb pb) {
    PipelineStateInfo model = new PipelineStateInfo();
    model.setClusterId(pb.getClusterId());
    model.setCreatorUserName(pb.getCreatorUserName());
    model.setHealth(pb.getHealth());
    model.setLatestUpdates(pb.getLatestUpdates());
    model.setName(pb.getName());
    model.setPipelineId(pb.getPipelineId());
    model.setRunAsUserName(pb.getRunAsUserName());
    model.setState(pb.getState());

    return model;
  }

  public static class PipelineStateInfoSerializer extends JsonSerializer<PipelineStateInfo> {
    @Override
    public void serialize(PipelineStateInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineStateInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineStateInfoDeserializer extends JsonDeserializer<PipelineStateInfo> {
    @Override
    public PipelineStateInfo deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineStateInfoPb pb = mapper.readValue(p, PipelineStateInfoPb.class);
      return PipelineStateInfo.fromPb(pb);
    }
  }
}
