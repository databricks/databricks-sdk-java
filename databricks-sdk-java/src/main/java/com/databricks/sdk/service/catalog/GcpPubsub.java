// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = GcpPubsub.GcpPubsubSerializer.class)
@JsonDeserialize(using = GcpPubsub.GcpPubsubDeserializer.class)
public class GcpPubsub {
  /** Unique identifier included in the name of file events managed cloud resources. */
  private String managedResourceId;

  /**
   * The Pub/Sub subscription name in the format projects/{project}/subscriptions/{subscription
   * name} REQUIRED for provided_pubsub.
   */
  private String subscriptionName;

  public GcpPubsub setManagedResourceId(String managedResourceId) {
    this.managedResourceId = managedResourceId;
    return this;
  }

  public String getManagedResourceId() {
    return managedResourceId;
  }

  public GcpPubsub setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
    return this;
  }

  public String getSubscriptionName() {
    return subscriptionName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GcpPubsub that = (GcpPubsub) o;
    return Objects.equals(managedResourceId, that.managedResourceId)
        && Objects.equals(subscriptionName, that.subscriptionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedResourceId, subscriptionName);
  }

  @Override
  public String toString() {
    return new ToStringer(GcpPubsub.class)
        .add("managedResourceId", managedResourceId)
        .add("subscriptionName", subscriptionName)
        .toString();
  }

  GcpPubsubPb toPb() {
    GcpPubsubPb pb = new GcpPubsubPb();
    pb.setManagedResourceId(managedResourceId);
    pb.setSubscriptionName(subscriptionName);

    return pb;
  }

  static GcpPubsub fromPb(GcpPubsubPb pb) {
    GcpPubsub model = new GcpPubsub();
    model.setManagedResourceId(pb.getManagedResourceId());
    model.setSubscriptionName(pb.getSubscriptionName());

    return model;
  }

  public static class GcpPubsubSerializer extends JsonSerializer<GcpPubsub> {
    @Override
    public void serialize(GcpPubsub value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GcpPubsubPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GcpPubsubDeserializer extends JsonDeserializer<GcpPubsub> {
    @Override
    public GcpPubsub deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GcpPubsubPb pb = mapper.readValue(p, GcpPubsubPb.class);
      return GcpPubsub.fromPb(pb);
    }
  }
}
