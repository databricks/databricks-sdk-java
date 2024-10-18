// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ListAlertsResponseAlert {
  /** Trigger conditions of the alert. */
  @JsonProperty("condition")
  private AlertCondition condition;

  /** The timestamp indicating when the alert was created. */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * Custom body of alert notification, if it exists. See [here] for custom templating instructions.
   *
   * <p>[here]: https://docs.databricks.com/sql/user/alerts/index.html
   */
  @JsonProperty("custom_body")
  private String customBody;

  /**
   * Custom subject of alert notification, if it exists. This can include email subject entries and
   * Slack notification headers, for example. See [here] for custom templating instructions.
   *
   * <p>[here]: https://docs.databricks.com/sql/user/alerts/index.html
   */
  @JsonProperty("custom_subject")
  private String customSubject;

  /** The display name of the alert. */
  @JsonProperty("display_name")
  private String displayName;

  /** UUID identifying the alert. */
  @JsonProperty("id")
  private String id;

  /** The workspace state of the alert. Used for tracking trashed status. */
  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  /** Whether to notify alert subscribers when alert returns back to normal. */
  @JsonProperty("notify_on_ok")
  private Boolean notifyOnOk;

  /** The owner's username. This field is set to "Unavailable" if the user has been deleted. */
  @JsonProperty("owner_user_name")
  private String ownerUserName;

  /** UUID of the query attached to the alert. */
  @JsonProperty("query_id")
  private String queryId;

  /**
   * Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it
   * can be triggered again. If 0 or not specified, the alert will not be triggered again.
   */
  @JsonProperty("seconds_to_retrigger")
  private Long secondsToRetrigger;

  /**
   * Current state of the alert's trigger status. This field is set to UNKNOWN if the alert has not
   * yet been evaluated or ran into an error during the last evaluation.
   */
  @JsonProperty("state")
  private AlertState state;

  /** Timestamp when the alert was last triggered, if the alert has been triggered before. */
  @JsonProperty("trigger_time")
  private String triggerTime;

  /** The timestamp indicating when the alert was updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public ListAlertsResponseAlert setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public ListAlertsResponseAlert setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public ListAlertsResponseAlert setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public ListAlertsResponseAlert setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public ListAlertsResponseAlert setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListAlertsResponseAlert setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListAlertsResponseAlert setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public ListAlertsResponseAlert setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public ListAlertsResponseAlert setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public ListAlertsResponseAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public ListAlertsResponseAlert setSecondsToRetrigger(Long secondsToRetrigger) {
    this.secondsToRetrigger = secondsToRetrigger;
    return this;
  }

  public Long getSecondsToRetrigger() {
    return secondsToRetrigger;
  }

  public ListAlertsResponseAlert setState(AlertState state) {
    this.state = state;
    return this;
  }

  public AlertState getState() {
    return state;
  }

  public ListAlertsResponseAlert setTriggerTime(String triggerTime) {
    this.triggerTime = triggerTime;
    return this;
  }

  public String getTriggerTime() {
    return triggerTime;
  }

  public ListAlertsResponseAlert setUpdateTime(String updateTime) {
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
    ListAlertsResponseAlert that = (ListAlertsResponseAlert) o;
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
    return new ToStringer(ListAlertsResponseAlert.class)
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
