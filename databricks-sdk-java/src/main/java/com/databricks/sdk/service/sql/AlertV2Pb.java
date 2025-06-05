// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AlertV2Pb {
  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("custom_description")
  private String customDescription;

  @JsonProperty("custom_summary")
  private String customSummary;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("evaluation")
  private AlertV2Evaluation evaluation;

  @JsonProperty("id")
  private String id;

  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  @JsonProperty("owner_user_name")
  private String ownerUserName;

  @JsonProperty("parent_path")
  private String parentPath;

  @JsonProperty("query_text")
  private String queryText;

  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  @JsonProperty("schedule")
  private CronSchedule schedule;

  @JsonProperty("update_time")
  private String updateTime;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public AlertV2Pb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public AlertV2Pb setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
    return this;
  }

  public String getCustomDescription() {
    return customDescription;
  }

  public AlertV2Pb setCustomSummary(String customSummary) {
    this.customSummary = customSummary;
    return this;
  }

  public String getCustomSummary() {
    return customSummary;
  }

  public AlertV2Pb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public AlertV2Pb setEvaluation(AlertV2Evaluation evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  public AlertV2Evaluation getEvaluation() {
    return evaluation;
  }

  public AlertV2Pb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public AlertV2Pb setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public AlertV2Pb setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public AlertV2Pb setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public AlertV2Pb setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public AlertV2Pb setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public AlertV2Pb setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public AlertV2Pb setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public AlertV2Pb setWarehouseId(String warehouseId) {
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
    AlertV2Pb that = (AlertV2Pb) o;
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
    return new ToStringer(AlertV2Pb.class)
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
}
