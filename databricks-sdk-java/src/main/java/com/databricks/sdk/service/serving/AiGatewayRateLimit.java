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
@JsonSerialize(using = AiGatewayRateLimit.AiGatewayRateLimitSerializer.class)
@JsonDeserialize(using = AiGatewayRateLimit.AiGatewayRateLimitDeserializer.class)
public class AiGatewayRateLimit {
  /** Used to specify how many calls are allowed for a key within the renewal_period. */
  private Long calls;

  /**
   * Key field for a rate limit. Currently, only 'user' and 'endpoint' are supported, with
   * 'endpoint' being the default if not specified.
   */
  private AiGatewayRateLimitKey key;

  /** Renewal period field for a rate limit. Currently, only 'minute' is supported. */
  private AiGatewayRateLimitRenewalPeriod renewalPeriod;

  public AiGatewayRateLimit setCalls(Long calls) {
    this.calls = calls;
    return this;
  }

  public Long getCalls() {
    return calls;
  }

  public AiGatewayRateLimit setKey(AiGatewayRateLimitKey key) {
    this.key = key;
    return this;
  }

  public AiGatewayRateLimitKey getKey() {
    return key;
  }

  public AiGatewayRateLimit setRenewalPeriod(AiGatewayRateLimitRenewalPeriod renewalPeriod) {
    this.renewalPeriod = renewalPeriod;
    return this;
  }

  public AiGatewayRateLimitRenewalPeriod getRenewalPeriod() {
    return renewalPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiGatewayRateLimit that = (AiGatewayRateLimit) o;
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
    return new ToStringer(AiGatewayRateLimit.class)
        .add("calls", calls)
        .add("key", key)
        .add("renewalPeriod", renewalPeriod)
        .toString();
  }

  AiGatewayRateLimitPb toPb() {
    AiGatewayRateLimitPb pb = new AiGatewayRateLimitPb();
    pb.setCalls(calls);
    pb.setKey(key);
    pb.setRenewalPeriod(renewalPeriod);

    return pb;
  }

  static AiGatewayRateLimit fromPb(AiGatewayRateLimitPb pb) {
    AiGatewayRateLimit model = new AiGatewayRateLimit();
    model.setCalls(pb.getCalls());
    model.setKey(pb.getKey());
    model.setRenewalPeriod(pb.getRenewalPeriod());

    return model;
  }

  public static class AiGatewayRateLimitSerializer extends JsonSerializer<AiGatewayRateLimit> {
    @Override
    public void serialize(AiGatewayRateLimit value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AiGatewayRateLimitPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AiGatewayRateLimitDeserializer extends JsonDeserializer<AiGatewayRateLimit> {
    @Override
    public AiGatewayRateLimit deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AiGatewayRateLimitPb pb = mapper.readValue(p, AiGatewayRateLimitPb.class);
      return AiGatewayRateLimit.fromPb(pb);
    }
  }
}
