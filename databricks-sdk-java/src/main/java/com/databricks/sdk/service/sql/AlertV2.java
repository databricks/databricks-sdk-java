// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = AlertV2.AlertV2Serializer.class)
@JsonDeserialize(using = AlertV2.AlertV2Deserializer.class)
public class AlertV2 {
  /** The timestamp indicating when the alert was created. */
  private String createTime;

  /** Custom description for the alert. support mustache template. */
  private String customDescription;

  /** Custom summary for the alert. support mustache template. */
  private String customSummary;

  /** The display name of the alert. */
  private String displayName;

  /** */
  private AlertV2Evaluation evaluation;

  /** UUID identifying the alert. */
  private String id;

  /** Indicates whether the query is trashed. */
  private LifecycleState lifecycleState;

  /** The owner's username. This field is set to "Unavailable" if the user has been deleted. */
  private String ownerUserName;

  /**
   * The workspace path of the folder containing the alert. Can only be set on create, and cannot be
   * updated.
   */
  private String parentPath;

  /** Text of the query to be run. */
  private String queryText;

  /** The run as username. This field is set to "Unavailable" if the user has been deleted. */
  private String runAsUserName;

  /** */
  private CronSchedule schedule;

  /** The timestamp indicating when the alert was updated. */
  private String updateTime;

  /** ID of the SQL warehouse attached to the alert. */
  private String warehouseId;

  public AlertV2 setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public AlertV2 setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
    return this;
  }

  public String getCustomDescription() {
    return customDescription;
  }

  public AlertV2 setCustomSummary(String customSummary) {
    this.customSummary = customSummary;
    return this;
  }

  public String getCustomSummary() {
    return customSummary;
  }

  public AlertV2 setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public AlertV2 setEvaluation(AlertV2Evaluation evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  public AlertV2Evaluation getEvaluation() {
    return evaluation;
  }

  public AlertV2 setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AlertV2 setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public AlertV2 setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public AlertV2 setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public AlertV2 setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public AlertV2 setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public AlertV2 setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public AlertV2 setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public AlertV2 setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2 that = (AlertV2) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(customDescription, that.customDescription)
        && Objects.equals(customSummary, that.customSummary)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(evaluation, that.evaluation)
        && Objects.equals(id, that.id)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(ownerUserName, that.ownerUserName)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(runAsUserName, that.runAsUserName)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        customDescription,
        customSummary,
        displayName,
        evaluation,
        id,
        lifecycleState,
        ownerUserName,
        parentPath,
        queryText,
        runAsUserName,
        schedule,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2.class)
        .add("createTime", createTime)
        .add("customDescription", customDescription)
        .add("customSummary", customSummary)
        .add("displayName", displayName)
        .add("evaluation", evaluation)
        .add("id", id)
        .add("lifecycleState", lifecycleState)
        .add("ownerUserName", ownerUserName)
        .add("parentPath", parentPath)
        .add("queryText", queryText)
        .add("runAsUserName", runAsUserName)
        .add("schedule", schedule)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }

  AlertV2Pb toPb() {
    AlertV2Pb pb = new AlertV2Pb();
    pb.setCreateTime(createTime);
    pb.setCustomDescription(customDescription);
    pb.setCustomSummary(customSummary);
    pb.setDisplayName(displayName);
    pb.setEvaluation(evaluation);
    pb.setId(id);
    pb.setLifecycleState(lifecycleState);
    pb.setOwnerUserName(ownerUserName);
    pb.setParentPath(parentPath);
    pb.setQueryText(queryText);
    pb.setRunAsUserName(runAsUserName);
    pb.setSchedule(schedule);
    pb.setUpdateTime(updateTime);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static AlertV2 fromPb(AlertV2Pb pb) {
    AlertV2 model = new AlertV2();
    model.setCreateTime(pb.getCreateTime());
    model.setCustomDescription(pb.getCustomDescription());
    model.setCustomSummary(pb.getCustomSummary());
    model.setDisplayName(pb.getDisplayName());
    model.setEvaluation(pb.getEvaluation());
    model.setId(pb.getId());
    model.setLifecycleState(pb.getLifecycleState());
    model.setOwnerUserName(pb.getOwnerUserName());
    model.setParentPath(pb.getParentPath());
    model.setQueryText(pb.getQueryText());
    model.setRunAsUserName(pb.getRunAsUserName());
    model.setSchedule(pb.getSchedule());
    model.setUpdateTime(pb.getUpdateTime());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class AlertV2Serializer extends JsonSerializer<AlertV2> {
    @Override
    public void serialize(AlertV2 value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertV2Pb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertV2Deserializer extends JsonDeserializer<AlertV2> {
    @Override
    public AlertV2 deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertV2Pb pb = mapper.readValue(p, AlertV2Pb.class);
      return AlertV2.fromPb(pb);
    }
  }
}
