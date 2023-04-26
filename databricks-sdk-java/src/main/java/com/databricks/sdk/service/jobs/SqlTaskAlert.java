// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SqlTaskAlert class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>alertId</code>.</p>
   *
   * @param alertId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskAlert} object
   */
  public SqlTaskAlert setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * <p>Getter for the field <code>alertId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAlertId() {
    return alertId;
  }

  /**
   * <p>Setter for the field <code>pauseSubscriptions</code>.</p>
   *
   * @param pauseSubscriptions a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskAlert} object
   */
  public SqlTaskAlert setPauseSubscriptions(Boolean pauseSubscriptions) {
    this.pauseSubscriptions = pauseSubscriptions;
    return this;
  }

  /**
   * <p>Getter for the field <code>pauseSubscriptions</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPauseSubscriptions() {
    return pauseSubscriptions;
  }

  /**
   * <p>Setter for the field <code>subscriptions</code>.</p>
   *
   * @param subscriptions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskAlert} object
   */
  public SqlTaskAlert setSubscriptions(Collection<SqlTaskSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  /**
   * <p>Getter for the field <code>subscriptions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SqlTaskSubscription> getSubscriptions() {
    return subscriptions;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskAlert that = (SqlTaskAlert) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(pauseSubscriptions, that.pauseSubscriptions)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(alertId, pauseSubscriptions, subscriptions);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlTaskAlert.class)
        .add("alertId", alertId)
        .add("pauseSubscriptions", pauseSubscriptions)
        .add("subscriptions", subscriptions)
        .toString();
  }
}
