// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

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

  public JobWebhookNotifications setOnFailure(
      Collection<JobWebhookNotificationsOnFailureItem> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public Collection<JobWebhookNotificationsOnFailureItem> getOnFailure() {
    return onFailure;
  }

  public JobWebhookNotifications setOnStart(
      Collection<JobWebhookNotificationsOnStartItem> onStart) {
    this.onStart = onStart;
    return this;
  }

  public Collection<JobWebhookNotificationsOnStartItem> getOnStart() {
    return onStart;
  }

  public JobWebhookNotifications setOnSuccess(
      Collection<JobWebhookNotificationsOnSuccessItem> onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

  public Collection<JobWebhookNotificationsOnSuccessItem> getOnSuccess() {
    return onSuccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobWebhookNotifications that = (JobWebhookNotifications) o;
    return Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onStart, that.onStart)
        && Objects.equals(onSuccess, that.onSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onStart, onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(JobWebhookNotifications.class)
        .add("onFailure", onFailure)
        .add("onStart", onStart)
        .add("onSuccess", onSuccess)
        .toString();
  }
}
