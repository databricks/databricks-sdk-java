// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AlertV2Notification {
  /** Whether to notify alert subscribers when alert returns back to normal. */
  @JsonProperty("notify_on_ok")
  private Boolean notifyOnOk;

  /**
   * Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it
   * can be triggered again. If 0 or not specified, the alert will not be triggered again.
   */
  @JsonProperty("retrigger_seconds")
  private Long retriggerSeconds;

  /** */
  @JsonProperty("subscriptions")
  private Collection<AlertV2Subscription> subscriptions;

  public AlertV2Notification setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public AlertV2Notification setRetriggerSeconds(Long retriggerSeconds) {
    this.retriggerSeconds = retriggerSeconds;
    return this;
  }

  public Long getRetriggerSeconds() {
    return retriggerSeconds;
  }

  public AlertV2Notification setSubscriptions(Collection<AlertV2Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Collection<AlertV2Subscription> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2Notification that = (AlertV2Notification) o;
    return Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(retriggerSeconds, that.retriggerSeconds)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyOnOk, retriggerSeconds, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2Notification.class)
        .add("notifyOnOk", notifyOnOk)
        .add("retriggerSeconds", retriggerSeconds)
        .add("subscriptions", subscriptions)
        .toString();
  }
}
