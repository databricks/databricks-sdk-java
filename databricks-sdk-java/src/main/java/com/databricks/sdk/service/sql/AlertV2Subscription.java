// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = AlertV2Subscription.AlertV2SubscriptionSerializer.class)
@JsonDeserialize(using = AlertV2Subscription.AlertV2SubscriptionDeserializer.class)
public class AlertV2Subscription {
  /** */
  private String destinationId;

  /** */
  private String userEmail;

  public AlertV2Subscription setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public AlertV2Subscription setUserEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  public String getUserEmail() {
    return userEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2Subscription that = (AlertV2Subscription) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userEmail, that.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userEmail);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2Subscription.class)
        .add("destinationId", destinationId)
        .add("userEmail", userEmail)
        .toString();
  }

  AlertV2SubscriptionPb toPb() {
    AlertV2SubscriptionPb pb = new AlertV2SubscriptionPb();
    pb.setDestinationId(destinationId);
    pb.setUserEmail(userEmail);

    return pb;
  }

  static AlertV2Subscription fromPb(AlertV2SubscriptionPb pb) {
    AlertV2Subscription model = new AlertV2Subscription();
    model.setDestinationId(pb.getDestinationId());
    model.setUserEmail(pb.getUserEmail());

    return model;
  }

  public static class AlertV2SubscriptionSerializer extends JsonSerializer<AlertV2Subscription> {
    @Override
    public void serialize(AlertV2Subscription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertV2SubscriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertV2SubscriptionDeserializer
      extends JsonDeserializer<AlertV2Subscription> {
    @Override
    public AlertV2Subscription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertV2SubscriptionPb pb = mapper.readValue(p, AlertV2SubscriptionPb.class);
      return AlertV2Subscription.fromPb(pb);
    }
  }
}
