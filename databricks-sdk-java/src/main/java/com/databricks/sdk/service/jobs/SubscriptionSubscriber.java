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
import java.util.Objects;

@Generated
@JsonSerialize(using = SubscriptionSubscriber.SubscriptionSubscriberSerializer.class)
@JsonDeserialize(using = SubscriptionSubscriber.SubscriptionSubscriberDeserializer.class)
public class SubscriptionSubscriber {
  /**
   * A snapshot of the dashboard will be sent to the destination when the `destination_id` field is
   * present.
   */
  private String destinationId;

  /**
   * A snapshot of the dashboard will be sent to the user's email when the `user_name` field is
   * present.
   */
  private String userName;

  public SubscriptionSubscriber setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public SubscriptionSubscriber setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionSubscriber that = (SubscriptionSubscriber) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionSubscriber.class)
        .add("destinationId", destinationId)
        .add("userName", userName)
        .toString();
  }

  SubscriptionSubscriberPb toPb() {
    SubscriptionSubscriberPb pb = new SubscriptionSubscriberPb();
    pb.setDestinationId(destinationId);
    pb.setUserName(userName);

    return pb;
  }

  static SubscriptionSubscriber fromPb(SubscriptionSubscriberPb pb) {
    SubscriptionSubscriber model = new SubscriptionSubscriber();
    model.setDestinationId(pb.getDestinationId());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class SubscriptionSubscriberSerializer
      extends JsonSerializer<SubscriptionSubscriber> {
    @Override
    public void serialize(
        SubscriptionSubscriber value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SubscriptionSubscriberPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SubscriptionSubscriberDeserializer
      extends JsonDeserializer<SubscriptionSubscriber> {
    @Override
    public SubscriptionSubscriber deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SubscriptionSubscriberPb pb = mapper.readValue(p, SubscriptionSubscriberPb.class);
      return SubscriptionSubscriber.fromPb(pb);
    }
  }
}
