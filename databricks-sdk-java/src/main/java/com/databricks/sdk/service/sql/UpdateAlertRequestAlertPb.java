// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateAlertRequestAlertPb {
  @JsonProperty("condition")
  private AlertCondition condition;

  @JsonProperty("custom_body")
  private String customBody;

  @JsonProperty("custom_subject")
  private String customSubject;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("notify_on_ok")
  private Boolean notifyOnOk;

  @JsonProperty("owner_user_name")
  private String ownerUserName;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("seconds_to_retrigger")
  private Long secondsToRetrigger;

  public UpdateAlertRequestAlertPb setCondition(AlertCondition condition) {
    this.condition = condition;
    return this;
  }

  public AlertCondition getCondition() {
    return condition;
  }

  public UpdateAlertRequestAlertPb setCustomBody(String customBody) {
    this.customBody = customBody;
    return this;
  }

  public String getCustomBody() {
    return customBody;
  }

  public UpdateAlertRequestAlertPb setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public UpdateAlertRequestAlertPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateAlertRequestAlertPb setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public UpdateAlertRequestAlertPb setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public UpdateAlertRequestAlertPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public UpdateAlertRequestAlertPb setSecondsToRetrigger(Long secondsToRetrigger) {
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
    UpdateAlertRequestAlertPb that = (UpdateAlertRequestAlertPb) o;
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
    return new ToStringer(UpdateAlertRequestAlertPb.class)
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
