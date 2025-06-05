// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ListAlertsResponseAlertPb {
  @JsonProperty("condition")
  private AlertCondition condition;

  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("custom_body")
  private String customBody;

  @JsonProperty("custom_subject")
  private String customSubject;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  @JsonProperty("notify_on_ok")
  private Boolean notifyOnOk;

  @JsonProperty("owner_user_name")
  private String ownerUserName;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("seconds_to_retrigger")
  private Long secondsToRetrigger;

  @JsonProperty("state")
  private AlertState state;

  @JsonProperty("trigger_time")
  private String triggerTime;

  @JsonProperty("update_time")
  private String updateTime;

  public ListAlertsResponseAlertPb setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public ListAlertsResponseAlertPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public ListAlertsResponseAlertPb setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public ListAlertsResponseAlertPb setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public ListAlertsResponseAlertPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListAlertsResponseAlertPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListAlertsResponseAlertPb setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public ListAlertsResponseAlertPb setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public ListAlertsResponseAlertPb setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public ListAlertsResponseAlertPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public ListAlertsResponseAlertPb setSecondsToRetrigger(Long secondsToRetrigger) {
    this.secondsToRetrigger = secondsToRetrigger;
    return this;
  }

  public Long getSecondsToRetrigger() {
    return secondsToRetrigger;
  }

  public ListAlertsResponseAlertPb setState(AlertState state) {
    this.state = state;
    return this;
  }

  public AlertState getState() {
    return state;
  }

  public ListAlertsResponseAlertPb setTriggerTime(String triggerTime) {
    this.triggerTime = triggerTime;
    return this;
  }

  public String getTriggerTime() {
    return triggerTime;
  }

  public ListAlertsResponseAlertPb setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAlertsResponseAlertPb that = (ListAlertsResponseAlertPb) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(customBody, that.customBody)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(ownerUserName, that.ownerUserName)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(secondsToRetrigger, that.secondsToRetrigger)
        && Objects.equals(state, that.state)
        && Objects.equals(triggerTime, that.triggerTime)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        condition,
        createTime,
        customBody,
        customSubject,
        displayName,
        id,
        lifecycleState,
        notifyOnOk,
        ownerUserName,
        queryId,
        secondsToRetrigger,
        state,
        triggerTime,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsResponseAlertPb.class)
        .add("condition", condition)
        .add("createTime", createTime)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("displayName", displayName)
        .add("id", id)
        .add("lifecycleState", lifecycleState)
        .add("notifyOnOk", notifyOnOk)
        .add("ownerUserName", ownerUserName)
        .add("queryId", queryId)
        .add("secondsToRetrigger", secondsToRetrigger)
        .add("state", state)
        .add("triggerTime", triggerTime)
        .add("updateTime", updateTime)
        .toString();
  }
}
