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
@JsonSerialize(using = UpdateInfo.UpdateInfoSerializer.class)
@JsonDeserialize(using = UpdateInfo.UpdateInfoDeserializer.class)
public class UpdateInfo {
  /** What triggered this update. */
  private UpdateInfoCause cause;

  /** The ID of the cluster that the update is running on. */
  private String clusterId;

  /**
   * The pipeline configuration with system defaults applied where unspecified by the user. Not
   * returned by ListUpdates.
   */
  private PipelineSpec config;

  /** The time when this update was created. */
  private Long creationTime;

  /** If true, this update will reset all tables before running. */
  private Boolean fullRefresh;

  /**
   * A list of tables to update with fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  private Collection<String> fullRefreshSelection;

  /** The ID of the pipeline. */
  private String pipelineId;

  /**
   * A list of tables to update without fullRefresh. If both refresh_selection and
   * full_refresh_selection are empty, this is a full graph update. Full Refresh on a table means
   * that the states of the table will be reset before the refresh.
   */
  private Collection<String> refreshSelection;

  /** The update state. */
  private UpdateInfoState state;

  /** The ID of this update. */
  private String updateId;

  /**
   * If true, this update only validates the correctness of pipeline source code but does not
   * materialize or publish any datasets.
   */
  private Boolean validateOnly;

  public UpdateInfo setCause(UpdateInfoCause cause) {
    this.cause = cause;
    return this;
  }

  public UpdateInfoCause getCause() {
    return cause;
  }

  public UpdateInfo setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public UpdateInfo setConfig(PipelineSpec config) {
    this.config = config;
    return this;
  }

  public PipelineSpec getConfig() {
    return config;
  }

  public UpdateInfo setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public UpdateInfo setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  public UpdateInfo setFullRefreshSelection(Collection<String> fullRefreshSelection) {
    this.fullRefreshSelection = fullRefreshSelection;
    return this;
  }

  public Collection<String> getFullRefreshSelection() {
    return fullRefreshSelection;
  }

  public UpdateInfo setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public UpdateInfo setRefreshSelection(Collection<String> refreshSelection) {
    this.refreshSelection = refreshSelection;
    return this;
  }

  public Collection<String> getRefreshSelection() {
    return refreshSelection;
  }

  public UpdateInfo setState(UpdateInfoState state) {
    this.state = state;
    return this;
  }

  public UpdateInfoState getState() {
    return state;
  }

  public UpdateInfo setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public String getUpdateId() {
    return updateId;
  }

  public UpdateInfo setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

  public Boolean getValidateOnly() {
    return validateOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateInfo that = (UpdateInfo) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(clusterId, that.clusterId)
        && Objects.equals(config, that.config)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(fullRefresh, that.fullRefresh)
        && Objects.equals(fullRefreshSelection, that.fullRefreshSelection)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(refreshSelection, that.refreshSelection)
        && Objects.equals(state, that.state)
        && Objects.equals(updateId, that.updateId)
        && Objects.equals(validateOnly, that.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause,
        clusterId,
        config,
        creationTime,
        fullRefresh,
        fullRefreshSelection,
        pipelineId,
        refreshSelection,
        state,
        updateId,
        validateOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateInfo.class)
        .add("cause", cause)
        .add("clusterId", clusterId)
        .add("config", config)
        .add("creationTime", creationTime)
        .add("fullRefresh", fullRefresh)
        .add("fullRefreshSelection", fullRefreshSelection)
        .add("pipelineId", pipelineId)
        .add("refreshSelection", refreshSelection)
        .add("state", state)
        .add("updateId", updateId)
        .add("validateOnly", validateOnly)
        .toString();
  }

  UpdateInfoPb toPb() {
    UpdateInfoPb pb = new UpdateInfoPb();
    pb.setCause(cause);
    pb.setClusterId(clusterId);
    pb.setConfig(config);
    pb.setCreationTime(creationTime);
    pb.setFullRefresh(fullRefresh);
    pb.setFullRefreshSelection(fullRefreshSelection);
    pb.setPipelineId(pipelineId);
    pb.setRefreshSelection(refreshSelection);
    pb.setState(state);
    pb.setUpdateId(updateId);
    pb.setValidateOnly(validateOnly);

    return pb;
  }

  static UpdateInfo fromPb(UpdateInfoPb pb) {
    UpdateInfo model = new UpdateInfo();
    model.setCause(pb.getCause());
    model.setClusterId(pb.getClusterId());
    model.setConfig(pb.getConfig());
    model.setCreationTime(pb.getCreationTime());
    model.setFullRefresh(pb.getFullRefresh());
    model.setFullRefreshSelection(pb.getFullRefreshSelection());
    model.setPipelineId(pb.getPipelineId());
    model.setRefreshSelection(pb.getRefreshSelection());
    model.setState(pb.getState());
    model.setUpdateId(pb.getUpdateId());
    model.setValidateOnly(pb.getValidateOnly());

    return model;
  }

  public static class UpdateInfoSerializer extends JsonSerializer<UpdateInfo> {
    @Override
    public void serialize(UpdateInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateInfoDeserializer extends JsonDeserializer<UpdateInfo> {
    @Override
    public UpdateInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateInfoPb pb = mapper.readValue(p, UpdateInfoPb.class);
      return UpdateInfo.fromPb(pb);
    }
  }
}
