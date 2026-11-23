// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A legacy Databricks SQL alert. An alert runs a saved query, compares a column of the result
 * against a threshold, and notifies its subscribers when the condition is met. See
 * https://docs.databricks.com/aws/en/sql/user/alerts/legacy for details.
 */
@Generated
public class Alert {
  /**
   * Condition that triggers the alert: a column of the query result, a comparison operator, and a
   * threshold value. The value in the first row of the column is evaluated; aggregations are not
   * supported through this API.
   */
  @JsonProperty("condition")
  private AlertCondition condition;

  /** The timestamp indicating when the alert was created. */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * Custom body of the alert notification. It can use the template variables and HTML described at
   * https://docs.databricks.com/aws/en/sql/user/alerts/legacy. If omitted, the default notification
   * body is used.
   */
  @JsonProperty("custom_body")
  private String customBody;

  /**
   * Custom subject of the alert notification, used as the email subject or the Slack message
   * header. It can use the template variables described at
   * https://docs.databricks.com/aws/en/sql/user/alerts/legacy. If omitted, the default subject is
   * used.
   */
  @JsonProperty("custom_subject")
  private String customSubject;

  /** Display name of the alert, shown in list views and notifications. It must not be empty. */
  @JsonProperty("display_name")
  private String displayName;

  /** UUID identifying the alert. */
  @JsonProperty("id")
  private String id;

  /** Lifecycle state of the alert: `ACTIVE`, or `TRASHED` after it has been moved to the trash. */
  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  /**
   * Whether to notify subscribers when the alert state changes from `TRIGGERED` back to `OK`.
   * Defaults to true.
   */
  @JsonProperty("notify_on_ok")
  private Boolean notifyOnOk;

  /** The owner's username. This field is set to "Unavailable" if the user has been deleted. */
  @JsonProperty("owner_user_name")
  private String ownerUserName;

  /**
   * Workspace path of the folder containing the alert. Defaults to the creator's home folder when
   * omitted on create. It cannot be changed after creation.
   */
  @JsonProperty("parent_path")
  private String parentPath;

  /**
   * UUID of the saved query whose result the alert evaluates. The caller must have permission to
   * view the query.
   */
  @JsonProperty("query_id")
  private String queryId;

  /**
   * Number of seconds the alert waits after a notification before it can notify again while its
   * state stays `TRIGGERED`. If 0 or not specified, the alert notifies once when its state changes
   * to `TRIGGERED` and does not notify again until its state has changed.
   */
  @JsonProperty("seconds_to_retrigger")
  private Long secondsToRetrigger;

  /**
   * Current state of the alert's trigger status: `TRIGGERED` if the condition was met on the last
   * evaluation, `OK` if it was not, and `UNKNOWN` if the alert has not yet been evaluated or ran
   * into an error during the last evaluation.
   */
  @JsonProperty("state")
  private AlertState state;

  /** Timestamp when the alert was last triggered, if the alert has been triggered before. */
  @JsonProperty("trigger_time")
  private String triggerTime;

  /** The timestamp indicating when the alert was updated. */
  @JsonProperty("update_time")
  private String updateTime;

  public Alert setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public Alert setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Alert setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public Alert setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public Alert setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Alert setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Alert setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public Alert setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public Alert setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public Alert setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public Alert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public Alert setSecondsToRetrigger(Long secondsToRetrigger) {
    this.secondsToRetrigger = secondsToRetrigger;
    return this;
  }

  public Long getSecondsToRetrigger() {
    return secondsToRetrigger;
  }

  public Alert setState(AlertState state) {
    this.state = state;
    return this;
  }

  public AlertState getState() {
    return state;
  }

  public Alert setTriggerTime(String triggerTime) {
    this.triggerTime = triggerTime;
    return this;
  }

  public String getTriggerTime() {
    return triggerTime;
  }

  public Alert setUpdateTime(String updateTime) {
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
    Alert that = (Alert) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(customBody, that.customBody)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(ownerUserName, that.ownerUserName)
        && Objects.equals(parentPath, that.parentPath)
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
        parentPath,
        queryId,
        secondsToRetrigger,
        state,
        triggerTime,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Alert.class)
        .add("condition", condition)
        .add("createTime", createTime)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("displayName", displayName)
        .add("id", id)
        .add("lifecycleState", lifecycleState)
        .add("notifyOnOk", notifyOnOk)
        .add("ownerUserName", ownerUserName)
        .add("parentPath", parentPath)
        .add("queryId", queryId)
        .add("secondsToRetrigger", secondsToRetrigger)
        .add("state", state)
        .add("triggerTime", triggerTime)
        .add("updateTime", updateTime)
        .toString();
  }
}
