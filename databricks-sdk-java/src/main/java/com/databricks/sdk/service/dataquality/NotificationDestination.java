// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Destination of the data quality monitoring notification. */
@Generated
public class NotificationDestination {
  /**
   * The notification-destination IDs (Slack / Teams / webhook) to send the notification to. The
   * destinations must already exist in the workspace; a workspace admin creates them. A maximum of
   * 25 destination IDs is supported. Only supported on schema monitors, via
   * `anomaly_detection_config`; rejected on table monitors.
   */
  @JsonProperty("destination_ids")
  private Collection<String> destinationIds;

  /**
   * The IDs of the workspace users to notify by email. A maximum of 25 user IDs is supported. Only
   * supported on schema monitors, via `anomaly_detection_config`; rejected on table monitors.
   */
  @JsonProperty("destination_user_ids")
  private Collection<Long> destinationUserIds;

  /**
   * The list of email addresses to send the notification to. A maximum of 5 email addresses is
   * supported.
   */
  @JsonProperty("email_addresses")
  private Collection<String> emailAddresses;

  public NotificationDestination setDestinationIds(Collection<String> destinationIds) {
    this.destinationIds = destinationIds;
    return this;
  }

  public Collection<String> getDestinationIds() {
    return destinationIds;
  }

  public NotificationDestination setDestinationUserIds(Collection<Long> destinationUserIds) {
    this.destinationUserIds = destinationUserIds;
    return this;
  }

  public Collection<Long> getDestinationUserIds() {
    return destinationUserIds;
  }

  public NotificationDestination setEmailAddresses(Collection<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Collection<String> getEmailAddresses() {
    return emailAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotificationDestination that = (NotificationDestination) o;
    return Objects.equals(destinationIds, that.destinationIds)
        && Objects.equals(destinationUserIds, that.destinationUserIds)
        && Objects.equals(emailAddresses, that.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationIds, destinationUserIds, emailAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(NotificationDestination.class)
        .add("destinationIds", destinationIds)
        .add("destinationUserIds", destinationUserIds)
        .add("emailAddresses", emailAddresses)
        .toString();
  }
}
