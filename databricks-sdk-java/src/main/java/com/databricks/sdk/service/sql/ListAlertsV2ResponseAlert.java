// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ListAlertsV2ResponseAlert {
  /** The timestamp indicating when the alert was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** Custom description for the alert. support mustache template. */
  @JsonProperty("custom_description")
  private String customDescription;

  /** Custom summary for the alert. support mustache template. */
  @JsonProperty("custom_summary")
  private String customSummary;

  /** The display name of the alert. */
  @JsonProperty("display_name")
  private String displayName;

  /** */
  @JsonProperty("evaluation")
  private AlertV2Evaluation evaluation;

  /** UUID identifying the alert. */
  @JsonProperty("id")
  private String id;

  /** Indicates whether the query is trashed. */
  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  /** The owner's username. This field is set to "Unavailable" if the user has been deleted. */
  @JsonProperty("owner_user_name")
  private String ownerUserName;

  /** Text of the query to be run. */
  @JsonProperty("query_text")
  private String queryText;

  /** The run as username. This field is set to "Unavailable" if the user has been deleted. */
  @JsonProperty("run_as_user_name")
  private String runAsUserName;

  /** */
  @JsonProperty("schedule")
  private CronSchedule schedule;

  /** The timestamp indicating when the alert was updated. */
  @JsonProperty("update_time")
  private String updateTime;

  /** ID of the SQL warehouse attached to the alert. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public ListAlertsV2ResponseAlert setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public ListAlertsV2ResponseAlert setCustomDescription(String customDescription) {
    this.customDescription = customDescription;
    return this;
  }

  public String getCustomDescription() {
    return customDescription;
  }

  public ListAlertsV2ResponseAlert setCustomSummary(String customSummary) {
    this.customSummary = customSummary;
    return this;
  }

  public String getCustomSummary() {
    return customSummary;
  }

  public ListAlertsV2ResponseAlert setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListAlertsV2ResponseAlert setEvaluation(AlertV2Evaluation evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  public AlertV2Evaluation getEvaluation() {
    return evaluation;
  }

  public ListAlertsV2ResponseAlert setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListAlertsV2ResponseAlert setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public ListAlertsV2ResponseAlert setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public ListAlertsV2ResponseAlert setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public ListAlertsV2ResponseAlert setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public String getRunAsUserName() {
    return runAsUserName;
  }

  public ListAlertsV2ResponseAlert setSchedule(CronSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public CronSchedule getSchedule() {
    return schedule;
  }

  public ListAlertsV2ResponseAlert setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public ListAlertsV2ResponseAlert setWarehouseId(String warehouseId) {
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
    ListAlertsV2ResponseAlert that = (ListAlertsV2ResponseAlert) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(customDescription, that.customDescription)
        && Objects.equals(customSummary, that.customSummary)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(evaluation, that.evaluation)
        && Objects.equals(id, that.id)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(ownerUserName, that.ownerUserName)
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
        queryText,
        runAsUserName,
        schedule,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsV2ResponseAlert.class)
        .add("createTime", createTime)
        .add("customDescription", customDescription)
        .add("customSummary", customSummary)
        .add("displayName", displayName)
        .add("evaluation", evaluation)
        .add("id", id)
        .add("lifecycleState", lifecycleState)
        .add("ownerUserName", ownerUserName)
        .add("queryText", queryText)
        .add("runAsUserName", runAsUserName)
        .add("schedule", schedule)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
