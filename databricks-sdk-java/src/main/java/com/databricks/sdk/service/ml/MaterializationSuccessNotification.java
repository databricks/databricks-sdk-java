// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Recipients to notify when a materialization run succeeds. */
@Generated
public class MaterializationSuccessNotification {
  /**
   * IDs of the notification destinations (for example Slack, Microsoft Teams, PagerDuty, or a
   * generic webhook) to notify. Not supported for streaming materialized features.
   */
  @JsonProperty("destination_ids")
  private Collection<String> destinationIds;

  /** Email addresses to notify. */
  @JsonProperty("email_addresses")
  private Collection<String> emailAddresses;

  public MaterializationSuccessNotification setDestinationIds(Collection<String> destinationIds) {
    this.destinationIds = destinationIds;
    return this;
  }

  public Collection<String> getDestinationIds() {
    return destinationIds;
  }

  public MaterializationSuccessNotification setEmailAddresses(Collection<String> emailAddresses) {
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
    MaterializationSuccessNotification that = (MaterializationSuccessNotification) o;
    return Objects.equals(destinationIds, that.destinationIds)
        && Objects.equals(emailAddresses, that.emailAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationIds, emailAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationSuccessNotification.class)
        .add("destinationIds", destinationIds)
        .add("emailAddresses", emailAddresses)
        .toString();
  }
}
