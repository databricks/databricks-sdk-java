// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Subscription {
  /** Optional: Allows users to specify a custom subject line on the email sent to subscribers. */
  @JsonProperty("custom_subject")
  private String customSubject;

  /** When true, the subscription will not send emails. */
  @JsonProperty("paused")
  private Boolean paused;

  /** */
  @JsonProperty("subscribers")
  private Collection<SubscriptionSubscriber> subscribers;

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
    return Objects.equals(customSubject, that.customSubject)
        && Objects.equals(paused, that.paused)
        && Objects.equals(subscribers, that.subscribers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customSubject, paused, subscribers);
  }

  @Override
  public String toString() {
    return new ToStringer(Subscription.class)
        .add("customSubject", customSubject)
        .add("paused", paused)
        .add("subscribers", subscribers)
        .toString();
  }
}
