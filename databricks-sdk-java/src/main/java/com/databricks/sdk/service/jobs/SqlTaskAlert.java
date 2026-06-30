// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SqlTaskAlert {
  /** The canonical identifier of the SQL alert. */
  @JsonProperty("alert_id")
  private String alertId;

  /** If true, the alert notifications are not sent to subscribers. */
  @JsonProperty("pause_subscriptions")
  private Boolean pauseSubscriptions;

  /** If specified, alert notifications are sent to subscribers. */
  @JsonProperty("subscriptions")
  private Collection<SqlTaskSubscription> subscriptions;

  public SqlTaskAlert setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public SqlTaskAlert setPauseSubscriptions(Boolean pauseSubscriptions) {
    this.pauseSubscriptions = pauseSubscriptions;
    return this;
  }

  public Boolean getPauseSubscriptions() {
    return pauseSubscriptions;
  }

  public SqlTaskAlert setSubscriptions(Collection<SqlTaskSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Collection<SqlTaskSubscription> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskAlert that = (SqlTaskAlert) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(pauseSubscriptions, that.pauseSubscriptions)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, pauseSubscriptions, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskAlert.class)
        .add("alertId", alertId)
        .add("pauseSubscriptions", pauseSubscriptions)
        .add("subscriptions", subscriptions)
        .toString();
  }
}
