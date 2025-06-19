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
@JsonSerialize(using = SubscriptionSubscriberUser.SubscriptionSubscriberUserSerializer.class)
@JsonDeserialize(using = SubscriptionSubscriberUser.SubscriptionSubscriberUserDeserializer.class)
public class SubscriptionSubscriberUser {
  /** UserId of the subscriber. */
  private Long userId;

  public SubscriptionSubscriberUser setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionSubscriberUser that = (SubscriptionSubscriberUser) o;
    return Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }

  @Override
  public String toString() {
    return new ToStringer(SubscriptionSubscriberUser.class).add("userId", userId).toString();
  }

  SubscriptionSubscriberUserPb toPb() {
    SubscriptionSubscriberUserPb pb = new SubscriptionSubscriberUserPb();
    pb.setUserId(userId);

    return pb;
  }

  static SubscriptionSubscriberUser fromPb(SubscriptionSubscriberUserPb pb) {
    SubscriptionSubscriberUser model = new SubscriptionSubscriberUser();
    model.setUserId(pb.getUserId());

    return model;
  }

  public static class SubscriptionSubscriberUserSerializer
      extends JsonSerializer<SubscriptionSubscriberUser> {
    @Override
    public void serialize(
        SubscriptionSubscriberUser value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SubscriptionSubscriberUserPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SubscriptionSubscriberUserDeserializer
      extends JsonDeserializer<SubscriptionSubscriberUser> {
    @Override
    public SubscriptionSubscriberUser deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SubscriptionSubscriberUserPb pb = mapper.readValue(p, SubscriptionSubscriberUserPb.class);
      return SubscriptionSubscriberUser.fromPb(pb);
    }
  }
}
