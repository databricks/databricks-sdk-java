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
@JsonSerialize(
    using = SubscriptionSubscriberDestination.SubscriptionSubscriberDestinationSerializer.class)
@JsonDeserialize(
    using = SubscriptionSubscriberDestination.SubscriptionSubscriberDestinationDeserializer.class)
public class SubscriptionSubscriberDestination {
  /** The canonical identifier of the destination to receive email notification. */
  private String destinationId;

  public SubscriptionSubscriberDestination setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionSubscriberDestination that = (SubscriptionSubscriberDestination) o;
    return Objects.equals(destinationId, that.destinationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionSubscriberDestination.class)
        .add("destinationId", destinationId)
        .toString();
  }

  SubscriptionSubscriberDestinationPb toPb() {
    SubscriptionSubscriberDestinationPb pb = new SubscriptionSubscriberDestinationPb();
    pb.setDestinationId(destinationId);

    return pb;
  }

  static SubscriptionSubscriberDestination fromPb(SubscriptionSubscriberDestinationPb pb) {
    SubscriptionSubscriberDestination model = new SubscriptionSubscriberDestination();
    model.setDestinationId(pb.getDestinationId());

    return model;
  }

  public static class SubscriptionSubscriberDestinationSerializer
      extends JsonSerializer<SubscriptionSubscriberDestination> {
    @Override
    public void serialize(
        SubscriptionSubscriberDestination value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SubscriptionSubscriberDestinationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SubscriptionSubscriberDestinationDeserializer
      extends JsonDeserializer<SubscriptionSubscriberDestination> {
    @Override
    public SubscriptionSubscriberDestination deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SubscriptionSubscriberDestinationPb pb =
          mapper.readValue(p, SubscriptionSubscriberDestinationPb.class);
      return SubscriptionSubscriberDestination.fromPb(pb);
    }
  }
}
