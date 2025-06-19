// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = Subscription.SubscriptionSerializer.class)
@JsonDeserialize(using = Subscription.SubscriptionDeserializer.class)
public class Subscription {
  /** Optional: Allows users to specify a custom subject line on the email sent to subscribers. */
  private String customSubject;

  /** When true, the subscription will not send emails. */
  private Boolean paused;

  /** The list of subscribers to send the snapshot of the dashboard to. */
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

  SubscriptionPb toPb() {
    SubscriptionPb pb = new SubscriptionPb();
    pb.setCustomSubject(customSubject);
    pb.setPaused(paused);
    pb.setSubscribers(subscribers);

    return pb;
  }

  static Subscription fromPb(SubscriptionPb pb) {
    Subscription model = new Subscription();
    model.setCustomSubject(pb.getCustomSubject());
    model.setPaused(pb.getPaused());
    model.setSubscribers(pb.getSubscribers());

    return model;
  }

  public static class SubscriptionSerializer extends JsonSerializer<Subscription> {
    @Override
    public void serialize(Subscription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SubscriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SubscriptionDeserializer extends JsonDeserializer<Subscription> {
    @Override
    public Subscription deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SubscriptionPb pb = mapper.readValue(p, SubscriptionPb.class);
      return Subscription.fromPb(pb);
    }
  }
}
