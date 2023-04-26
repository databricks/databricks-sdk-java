// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SqlTaskDashboard class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlTaskDashboard {
  /** Subject of the email sent to subscribers of this task. */
  @JsonProperty("custom_subject")
  private String customSubject;

  /** The canonical identifier of the SQL dashboard. */
  @JsonProperty("dashboard_id")
  private String dashboardId;

  /** If true, the dashboard snapshot is not taken, and emails are not sent to subscribers. */
  @JsonProperty("pause_subscriptions")
  private Boolean pauseSubscriptions;

  /** If specified, dashboard snapshots are sent to subscriptions. */
  @JsonProperty("subscriptions")
  private Collection<SqlTaskSubscription> subscriptions;

  /**
   * <p>Setter for the field <code>customSubject</code>.</p>
   *
   * @param customSubject a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskDashboard} object
   */
  public SqlTaskDashboard setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  /**
   * <p>Getter for the field <code>customSubject</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCustomSubject() {
    return customSubject;
  }

  /**
   * <p>Setter for the field <code>dashboardId</code>.</p>
   *
   * @param dashboardId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskDashboard} object
   */
  public SqlTaskDashboard setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dashboardId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDashboardId() {
    return dashboardId;
  }

  /**
   * <p>Setter for the field <code>pauseSubscriptions</code>.</p>
   *
   * @param pauseSubscriptions a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskDashboard} object
   */
  public SqlTaskDashboard setPauseSubscriptions(Boolean pauseSubscriptions) {
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
   * @return a {@link com.databricks.sdk.service.jobs.SqlTaskDashboard} object
   */
  public SqlTaskDashboard setSubscriptions(Collection<SqlTaskSubscription> subscriptions) {
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
    SqlTaskDashboard that = (SqlTaskDashboard) o;
    return Objects.equals(customSubject, that.customSubject)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(pauseSubscriptions, that.pauseSubscriptions)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(customSubject, dashboardId, pauseSubscriptions, subscriptions);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlTaskDashboard.class)
        .add("customSubject", customSubject)
        .add("dashboardId", dashboardId)
        .add("pauseSubscriptions", pauseSubscriptions)
        .add("subscriptions", subscriptions)
        .toString();
  }
}
