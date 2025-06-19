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
        OnlineTableSpecContinuousSchedulingPolicy
            .OnlineTableSpecContinuousSchedulingPolicySerializer.class)
@JsonDeserialize(
    using =
        OnlineTableSpecContinuousSchedulingPolicy
            .OnlineTableSpecContinuousSchedulingPolicyDeserializer.class)
public class OnlineTableSpecContinuousSchedulingPolicy {

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
    return new ToStringer(OnlineTableSpecContinuousSchedulingPolicy.class).toString();
  }

  OnlineTableSpecContinuousSchedulingPolicyPb toPb() {
    OnlineTableSpecContinuousSchedulingPolicyPb pb =
        new OnlineTableSpecContinuousSchedulingPolicyPb();

    return pb;
  }

  static OnlineTableSpecContinuousSchedulingPolicy fromPb(
      OnlineTableSpecContinuousSchedulingPolicyPb pb) {
    OnlineTableSpecContinuousSchedulingPolicy model =
        new OnlineTableSpecContinuousSchedulingPolicy();

    return model;
  }

  public static class OnlineTableSpecContinuousSchedulingPolicySerializer
      extends JsonSerializer<OnlineTableSpecContinuousSchedulingPolicy> {
    @Override
    public void serialize(
        OnlineTableSpecContinuousSchedulingPolicy value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      OnlineTableSpecContinuousSchedulingPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OnlineTableSpecContinuousSchedulingPolicyDeserializer
      extends JsonDeserializer<OnlineTableSpecContinuousSchedulingPolicy> {
    @Override
    public OnlineTableSpecContinuousSchedulingPolicy deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OnlineTableSpecContinuousSchedulingPolicyPb pb =
          mapper.readValue(p, OnlineTableSpecContinuousSchedulingPolicyPb.class);
      return OnlineTableSpecContinuousSchedulingPolicy.fromPb(pb);
    }
  }
}
