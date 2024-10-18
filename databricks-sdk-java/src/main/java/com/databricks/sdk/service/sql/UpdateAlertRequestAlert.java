// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateAlertRequestAlert {
  /** Trigger conditions of the alert. */
  @JsonProperty("condition")
  private AlertCondition condition;

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

  public UpdateAlertRequestAlert setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public UpdateAlertRequestAlert setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public UpdateAlertRequestAlert setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public UpdateAlertRequestAlert setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateAlertRequestAlert setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public UpdateAlertRequestAlert setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public UpdateAlertRequestAlert setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public UpdateAlertRequestAlert setSecondsToRetrigger(Long secondsToRetrigger) {
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
    UpdateAlertRequestAlert that = (UpdateAlertRequestAlert) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(customBody, that.customBody)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(ownerUserName, that.ownerUserName)
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
        ownerUserName,
        queryId,
        secondsToRetrigger);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAlertRequestAlert.class)
        .add("condition", condition)
        .add("customBody", customBody)
        .add("customSubject", customSubject)
        .add("displayName", displayName)
        .add("notifyOnOk", notifyOnOk)
        .add("ownerUserName", ownerUserName)
        .add("queryId", queryId)
        .add("secondsToRetrigger", secondsToRetrigger)
        .toString();
  }
}
