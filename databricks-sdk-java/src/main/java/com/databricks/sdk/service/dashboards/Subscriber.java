// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = Subscriber.SubscriberSerializer.class)
@JsonDeserialize(using = Subscriber.SubscriberDeserializer.class)
public class Subscriber {
  /**
   * The destination to receive the subscription email. This parameter is mutually exclusive with
   * `user_subscriber`.
   */
  private SubscriptionSubscriberDestination destinationSubscriber;

  /**
   * The user to receive the subscription email. This parameter is mutually exclusive with
   * `destination_subscriber`.
   */
  private SubscriptionSubscriberUser userSubscriber;

  public Subscriber setDestinationSubscriber(
      SubscriptionSubscriberDestination destinationSubscriber) {
    this.destinationSubscriber = destinationSubscriber;
    return this;
  }

  public SubscriptionSubscriberDestination getDestinationSubscriber() {
    return destinationSubscriber;
  }

  public Subscriber setUserSubscriber(SubscriptionSubscriberUser userSubscriber) {
    this.userSubscriber = userSubscriber;
    return this;
  }

  public SubscriptionSubscriberUser getUserSubscriber() {
    return userSubscriber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Subscriber that = (Subscriber) o;
    return Objects.equals(destinationSubscriber, that.destinationSubscriber)
        && Objects.equals(userSubscriber, that.userSubscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationSubscriber, userSubscriber);
  }

  @Override
  public String toString() {
    return new ToStringer(Subscriber.class)
        .add("destinationSubscriber", destinationSubscriber)
        .add("userSubscriber", userSubscriber)
        .toString();
  }

  SubscriberPb toPb() {
    SubscriberPb pb = new SubscriberPb();
    pb.setDestinationSubscriber(destinationSubscriber);
    pb.setUserSubscriber(userSubscriber);

    return pb;
  }

  static Subscriber fromPb(SubscriberPb pb) {
    Subscriber model = new Subscriber();
    model.setDestinationSubscriber(pb.getDestinationSubscriber());
    model.setUserSubscriber(pb.getUserSubscriber());

    return model;
  }

  public static class SubscriberSerializer extends JsonSerializer<Subscriber> {
    @Override
    public void serialize(Subscriber value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SubscriberPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SubscriberDeserializer extends JsonDeserializer<Subscriber> {
    @Override
    public Subscriber deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SubscriberPb pb = mapper.readValue(p, SubscriberPb.class);
      return Subscriber.fromPb(pb);
    }
  }
}
