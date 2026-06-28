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
   * The list of email addresses to send the notification to. A maximum of 5 email addresses is
   * supported.
   */
  @JsonProperty("email_addresses")
  private Collection<String> emailAddresses;

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
    return Objects.equals(emailAddresses, that.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(NotificationDestination.class)
        .add("emailAddresses", emailAddresses)
        .toString();
  }
}
