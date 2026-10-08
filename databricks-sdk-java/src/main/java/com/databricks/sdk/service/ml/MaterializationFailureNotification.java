// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Recipients to notify when a materialization run fails. */
@Generated
public class MaterializationFailureNotification {
  /**
   * IDs of the notification destinations (for example Slack, Microsoft Teams, PagerDuty, or a
   * generic webhook) to notify. Not supported for streaming materialized features.
   */
  @JsonProperty("destination_ids")
  private Collection<String> destinationIds;

  /** Email addresses to notify. */
  @JsonProperty("email_addresses")
  private Collection<String> emailAddresses;

  /**
   * If true, notify only when the final attempt of a run fails. If false or unset, notify on every
   * failed attempt, including attempts that will be retried.
   *
   * <p>Batch materialization does not retry failures that need a fix on your side, such as missing
   * permissions or invalid configuration, so the first attempt is the final one. Other batch
   * failures are retried up to twice.
   *
   * <p>Streaming materialization restarts a failed update indefinitely unless the error cannot be
   * retried. With this set, a streaming materialized feature notifies only on errors that cannot be
   * retried, and never on failures that are restarted.
   */
  @JsonProperty("final_attempt_only")
  private Boolean finalAttemptOnly;

  public MaterializationFailureNotification setDestinationIds(Collection<String> destinationIds) {
    this.destinationIds = destinationIds;
    return this;
  }

  public Collection<String> getDestinationIds() {
    return destinationIds;
  }

  public MaterializationFailureNotification setEmailAddresses(Collection<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Collection<String> getEmailAddresses() {
    return emailAddresses;
  }

  public MaterializationFailureNotification setFinalAttemptOnly(Boolean finalAttemptOnly) {
    this.finalAttemptOnly = finalAttemptOnly;
    return this;
  }

  public Boolean getFinalAttemptOnly() {
    return finalAttemptOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaterializationFailureNotification that = (MaterializationFailureNotification) o;
    return Objects.equals(destinationIds, that.destinationIds)
        && Objects.equals(emailAddresses, that.emailAddresses)
        && Objects.equals(finalAttemptOnly, that.finalAttemptOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationIds, emailAddresses, finalAttemptOnly);
  }

  @Override
  public String toString() {
    return new ToStringer(MaterializationFailureNotification.class)
        .add("destinationIds", destinationIds)
        .add("emailAddresses", emailAddresses)
        .add("finalAttemptOnly", finalAttemptOnly)
        .toString();
  }
}
