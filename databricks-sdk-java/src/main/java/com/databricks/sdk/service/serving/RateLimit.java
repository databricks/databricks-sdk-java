// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(using = RateLimit.RateLimitSerializer.class)
@JsonDeserialize(using = RateLimit.RateLimitDeserializer.class)
public class RateLimit {
  /** Used to specify how many calls are allowed for a key within the renewal_period. */
  private Long calls;

  /**
   * Key field for a serving endpoint rate limit. Currently, only 'user' and 'endpoint' are
   * supported, with 'endpoint' being the default if not specified.
   */
  private RateLimitKey key;

  /**
   * Renewal period field for a serving endpoint rate limit. Currently, only 'minute' is supported.
   */
  private RateLimitRenewalPeriod renewalPeriod;

  public RateLimit setCalls(Long calls) {
    this.calls = calls;
    return this;
  }

  public Long getCalls() {
    return calls;
  }

  public RateLimit setKey(RateLimitKey key) {
    this.key = key;
    return this;
  }

  public RateLimitKey getKey() {
    return key;
  }

  public RateLimit setRenewalPeriod(RateLimitRenewalPeriod renewalPeriod) {
    this.renewalPeriod = renewalPeriod;
    return this;
  }

  public RateLimitRenewalPeriod getRenewalPeriod() {
    return renewalPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RateLimit that = (RateLimit) o;
    return Objects.equals(calls, that.calls)
        && Objects.equals(key, that.key)
        && Objects.equals(renewalPeriod, that.renewalPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls, key, renewalPeriod);
  }

  @Override
  public String toString() {
    return new ToStringer(RateLimit.class)
        .add("calls", calls)
        .add("key", key)
        .add("renewalPeriod", renewalPeriod)
        .toString();
  }

  RateLimitPb toPb() {
    RateLimitPb pb = new RateLimitPb();
    pb.setCalls(calls);
    pb.setKey(key);
    pb.setRenewalPeriod(renewalPeriod);

    return pb;
  }

  static RateLimit fromPb(RateLimitPb pb) {
    RateLimit model = new RateLimit();
    model.setCalls(pb.getCalls());
    model.setKey(pb.getKey());
    model.setRenewalPeriod(pb.getRenewalPeriod());

    return model;
  }

  public static class RateLimitSerializer extends JsonSerializer<RateLimit> {
    @Override
    public void serialize(RateLimit value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RateLimitPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RateLimitDeserializer extends JsonDeserializer<RateLimit> {
    @Override
    public RateLimit deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RateLimitPb pb = mapper.readValue(p, RateLimitPb.class);
      return RateLimit.fromPb(pb);
    }
  }
}
