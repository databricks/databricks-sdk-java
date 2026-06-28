// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MonitorDestination {
  /**
   * The list of email addresses to send the notification to. A maximum of 5 email addresses is
   * supported.
   */
  @JsonProperty("email_addresses")
  private Collection<String> emailAddresses;

  public MonitorDestination setEmailAddresses(Collection<String> emailAddresses) {
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
    MonitorDestination that = (MonitorDestination) o;
    return Objects.equals(emailAddresses, that.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorDestination.class)
        .add("emailAddresses", emailAddresses)
        .toString();
  }
}
