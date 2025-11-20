// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SubscriptionMode {
  /**
   * A JSON string that contains the specific topic-partitions to consume from. For example, for
   * '{"topicA":[0,1],"topicB":[2,4]}', topicA's 0'th and 1st partitions will be consumed from.
   */
  @JsonProperty("assign")
  private String assign;

  /** A comma-separated list of Kafka topics to read from. For example, 'topicA,topicB,topicC'. */
  @JsonProperty("subscribe")
  private String subscribe;

  /**
   * A regular expression matching topics to subscribe to. For example, 'topic.*' will subscribe to
   * all topics starting with 'topic'.
   */
  @JsonProperty("subscribe_pattern")
  private String subscribePattern;

  public SubscriptionMode setAssign(String assign) {
    this.assign = assign;
    return this;
  }

  public String getAssign() {
    return assign;
  }

  public SubscriptionMode setSubscribe(String subscribe) {
    this.subscribe = subscribe;
    return this;
  }

  public String getSubscribe() {
    return subscribe;
  }

  public SubscriptionMode setSubscribePattern(String subscribePattern) {
    this.subscribePattern = subscribePattern;
    return this;
  }

  public String getSubscribePattern() {
    return subscribePattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionMode that = (SubscriptionMode) o;
    return Objects.equals(assign, that.assign)
        && Objects.equals(subscribe, that.subscribe)
        && Objects.equals(subscribePattern, that.subscribePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assign, subscribe, subscribePattern);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionMode.class)
        .add("assign", assign)
        .add("subscribe", subscribe)
        .add("subscribePattern", subscribePattern)
        .toString();
  }
}
