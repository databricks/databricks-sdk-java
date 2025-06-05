// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class NotificationsPb {
  @JsonProperty("alerts")
  private Collection<String> alerts;

  @JsonProperty("email_recipients")
  private Collection<String> emailRecipients;

  public NotificationsPb setAlerts(Collection<String> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Collection<String> getAlerts() {
    return alerts;
  }

  public NotificationsPb setEmailRecipients(Collection<String> emailRecipients) {
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
    NotificationsPb that = (NotificationsPb) o;
    return Objects.equals(alerts, that.alerts)
        && Objects.equals(emailRecipients, that.emailRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts, emailRecipients);
  }

  @Override
  public String toString() {
    return new ToStringer(NotificationsPb.class)
        .add("alerts", alerts)
        .add("emailRecipients", emailRecipients)
        .toString();
  }
}
