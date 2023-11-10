// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Notifications {
  /**
   * A list of alerts that trigger the sending of notifications to the configured destinations. The
   * supported alerts are:
   *
   * <p>* `on-update-success`: A pipeline update completes successfully. * `on-update-failure`: Each
   * time a pipeline update fails. * `on-update-fatal-failure`: A pipeline update fails with a
   * non-retryable (fatal) error. * `on-flow-failure`: A single data flow fails.
   */
  @JsonProperty("alerts")
  private Collection<String> alerts;

  /** A list of email addresses notified when a configured alert is triggered. */
  @JsonProperty("email_recipients")
  private Collection<String> emailRecipients;

  public Notifications setAlerts(Collection<String> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Collection<String> getAlerts() {
    return alerts;
  }

  public Notifications setEmailRecipients(Collection<String> emailRecipients) {
    this.emailRecipients = emailRecipients;
    return this;
  }

  public Collection<String> getEmailRecipients() {
    return emailRecipients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Notifications that = (Notifications) o;
    return Objects.equals(alerts, that.alerts)
        && Objects.equals(emailRecipients, that.emailRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts, emailRecipients);
  }

  @Override
  public String toString() {
    return new ToStringer(Notifications.class)
        .add("alerts", alerts)
        .add("emailRecipients", emailRecipients)
        .toString();
  }
}
