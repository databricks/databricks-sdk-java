// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>JobWebhookNotifications class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class JobWebhookNotifications {
  /**
   * An optional list of system notification IDs to call when the run fails. A maximum of 3
   * destinations can be specified for the `on_failure` property.
   */
  @JsonProperty("on_failure")
  private Collection<JobWebhookNotificationsOnFailureItem> onFailure;

  /**
   * An optional list of system notification IDs to call when the run starts. A maximum of 3
   * destinations can be specified for the `on_start` property.
   */
  @JsonProperty("on_start")
  private Collection<JobWebhookNotificationsOnStartItem> onStart;

  /**
   * An optional list of system notification IDs to call when the run completes successfully. A
   * maximum of 3 destinations can be specified for the `on_success` property.
   */
  @JsonProperty("on_success")
  private Collection<JobWebhookNotificationsOnSuccessItem> onSuccess;

  /**
   * <p>Setter for the field <code>onFailure</code>.</p>
   *
   * @param onFailure a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.JobWebhookNotifications} object
   */
  public JobWebhookNotifications setOnFailure(
      Collection<JobWebhookNotificationsOnFailureItem> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  /**
   * <p>Getter for the field <code>onFailure</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<JobWebhookNotificationsOnFailureItem> getOnFailure() {
    return onFailure;
  }

  /**
   * <p>Setter for the field <code>onStart</code>.</p>
   *
   * @param onStart a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.JobWebhookNotifications} object
   */
  public JobWebhookNotifications setOnStart(
      Collection<JobWebhookNotificationsOnStartItem> onStart) {
    this.onStart = onStart;
    return this;
  }

  /**
   * <p>Getter for the field <code>onStart</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<JobWebhookNotificationsOnStartItem> getOnStart() {
    return onStart;
  }

  /**
   * <p>Setter for the field <code>onSuccess</code>.</p>
   *
   * @param onSuccess a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.JobWebhookNotifications} object
   */
  public JobWebhookNotifications setOnSuccess(
      Collection<JobWebhookNotificationsOnSuccessItem> onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

  /**
   * <p>Getter for the field <code>onSuccess</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<JobWebhookNotificationsOnSuccessItem> getOnSuccess() {
    return onSuccess;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobWebhookNotifications that = (JobWebhookNotifications) o;
    return Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onStart, that.onStart)
        && Objects.equals(onSuccess, that.onSuccess);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onStart, onSuccess);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(JobWebhookNotifications.class)
        .add("onFailure", onFailure)
        .add("onStart", onStart)
        .add("onSuccess", onSuccess)
        .toString();
  }
}
