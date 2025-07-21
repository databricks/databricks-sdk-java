// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SecurableNotificationDestinations {
  /** The access request destinations for the securable. */
  @JsonProperty("notification_destinations")
  private NotificationDestination notificationDestinations;

  /** The securable for which the access request destinations are being retrieved. */
  @JsonProperty("securable")
  private Securable securable;

  public SecurableNotificationDestinations setNotificationDestinations(
      NotificationDestination notificationDestinations) {
    this.notificationDestinations = notificationDestinations;
    return this;
  }

  public NotificationDestination getNotificationDestinations() {
    return notificationDestinations;
  }

  public SecurableNotificationDestinations setSecurable(Securable securable) {
    this.securable = securable;
    return this;
  }

  public Securable getSecurable() {
    return securable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SecurableNotificationDestinations that = (SecurableNotificationDestinations) o;
    return Objects.equals(notificationDestinations, that.notificationDestinations)
        && Objects.equals(securable, that.securable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationDestinations, securable);
  }

  @Override
  public String toString() {
    return new ToStringer(SecurableNotificationDestinations.class)
        .add("notificationDestinations", notificationDestinations)
        .add("securable", securable)
        .toString();
  }
}
