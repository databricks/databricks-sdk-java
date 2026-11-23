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
public class CreateAlertRequestAlert {
  /**
   * Condition that triggers the alert: a column of the query result, a comparison operator, and a
   * threshold value. The value in the first row of the column is evaluated; aggregations are not
   * supported through this API.
   */
  @JsonProperty("condition")
  private AlertCondition condition;

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

  /**
   * Whether to notify subscribers when the alert state changes from `TRIGGERED` back to `OK`.
   * Defaults to true.
   */
  @JsonProperty("notify_on_ok")
  private Boolean notifyOnOk;

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

  public CreateAlertRequestAlert setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public CreateAlertRequestAlert setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public CreateAlertRequestAlert setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public CreateAlertRequestAlert setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateAlertRequestAlert setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public CreateAlertRequestAlert setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public CreateAlertRequestAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public CreateAlertRequestAlert setSecondsToRetrigger(Long secondsToRetrigger) {
    this.secondsToRetrigger = secondsToRetrigger;
    return this;
  }

  public Long getSecondsToRetrigger() {
    return secondsToRetrigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlertRequestAlert that = (CreateAlertRequestAlert) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(customBody, that.customBody)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(secondsToRetrigger, that.secondsToRetrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        condition,
        customBody,
        customSubject,
        displayName,
        notifyOnOk,
        parentPath,
        queryId,
        secondsToRetrigger);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlertRequestAlert.class)
        .add("condition", condition)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("displayName", displayName)
        .add("notifyOnOk", notifyOnOk)
        .add("parentPath", parentPath)
        .add("queryId", queryId)
        .add("secondsToRetrigger", secondsToRetrigger)
        .toString();
  }
}
