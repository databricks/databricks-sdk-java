// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Subscription {
  /**
   * Optional: The configuration for the files attached to the dashboard snapshot notification. It
   * controls the underlying data of dashboard widgets that is attached as data files and which
   * pages are included in the attached PDF. If not specified, the notification is sent with only
   * the default snapshot.
   */
  @JsonProperty("attachment")
  private SubscriptionAttachment attachment;

  /** Optional: Allows users to specify a custom subject line on the email sent to subscribers. */
  @JsonProperty("custom_subject")
  private String customSubject;

  /** When true, the subscription will not send emails. */
  @JsonProperty("paused")
  private Boolean paused;

  /** The list of subscribers to send the snapshot of the dashboard to. */
  @JsonProperty("subscribers")
  private Collection<SubscriptionSubscriber> subscribers;

  public Subscription setAttachment(SubscriptionAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

  public SubscriptionAttachment getAttachment() {
    return attachment;
  }

  public Subscription setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public Subscription setPaused(Boolean paused) {
    this.paused = paused;
    return this;
  }

  public Boolean getPaused() {
    return paused;
  }

  public Subscription setSubscribers(Collection<SubscriptionSubscriber> subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  public Collection<SubscriptionSubscriber> getSubscribers() {
    return subscribers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Subscription that = (Subscription) o;
    return Objects.equals(attachment, that.attachment)
        && Objects.equals(customSubject, that.customSubject)
        && Objects.equals(paused, that.paused)
        && Objects.equals(subscribers, that.subscribers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, customSubject, paused, subscribers);
  }

  @Override
  public String toString() {
    return new ToStringer(Subscription.class)
        .add("attachment", attachment)
        .add("customSubject", customSubject)
        .add("paused", paused)
        .add("subscribers", subscribers)
        .toString();
  }
}
