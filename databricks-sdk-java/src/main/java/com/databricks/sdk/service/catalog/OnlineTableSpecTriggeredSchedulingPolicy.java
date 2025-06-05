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
@JsonSerialize(
    using =
        OnlineTableSpecTriggeredSchedulingPolicy.OnlineTableSpecTriggeredSchedulingPolicySerializer
            .class)
@JsonDeserialize(
    using =
        OnlineTableSpecTriggeredSchedulingPolicy
            .OnlineTableSpecTriggeredSchedulingPolicyDeserializer.class)
public class OnlineTableSpecTriggeredSchedulingPolicy {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(OnlineTableSpecTriggeredSchedulingPolicy.class).toString();
  }

  OnlineTableSpecTriggeredSchedulingPolicyPb toPb() {
    OnlineTableSpecTriggeredSchedulingPolicyPb pb =
        new OnlineTableSpecTriggeredSchedulingPolicyPb();

    return pb;
  }

  static OnlineTableSpecTriggeredSchedulingPolicy fromPb(
      OnlineTableSpecTriggeredSchedulingPolicyPb pb) {
    OnlineTableSpecTriggeredSchedulingPolicy model = new OnlineTableSpecTriggeredSchedulingPolicy();

    return model;
  }

  public static class OnlineTableSpecTriggeredSchedulingPolicySerializer
      extends JsonSerializer<OnlineTableSpecTriggeredSchedulingPolicy> {
    @Override
    public void serialize(
        OnlineTableSpecTriggeredSchedulingPolicy value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      OnlineTableSpecTriggeredSchedulingPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OnlineTableSpecTriggeredSchedulingPolicyDeserializer
      extends JsonDeserializer<OnlineTableSpecTriggeredSchedulingPolicy> {
    @Override
    public OnlineTableSpecTriggeredSchedulingPolicy deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OnlineTableSpecTriggeredSchedulingPolicyPb pb =
          mapper.readValue(p, OnlineTableSpecTriggeredSchedulingPolicyPb.class);
      return OnlineTableSpecTriggeredSchedulingPolicy.fromPb(pb);
    }
  }
}
