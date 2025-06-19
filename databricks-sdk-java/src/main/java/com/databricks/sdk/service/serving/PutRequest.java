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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PutRequest.PutRequestSerializer.class)
@JsonDeserialize(using = PutRequest.PutRequestDeserializer.class)
public class PutRequest {
  /**
   * The name of the serving endpoint whose rate limits are being updated. This field is required.
   */
  private String name;

  /** The list of endpoint rate limits. */
  private Collection<RateLimit> rateLimits;

  public PutRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PutRequest setRateLimits(Collection<RateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<RateLimit> getRateLimits() {
    return rateLimits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PutRequest that = (PutRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(rateLimits, that.rateLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rateLimits);
  }

  @Override
  public String toString() {
    return new ToStringer(PutRequest.class)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .toString();
  }

  PutRequestPb toPb() {
    PutRequestPb pb = new PutRequestPb();
    pb.setName(name);
    pb.setRateLimits(rateLimits);

    return pb;
  }

  static PutRequest fromPb(PutRequestPb pb) {
    PutRequest model = new PutRequest();
    model.setName(pb.getName());
    model.setRateLimits(pb.getRateLimits());

    return model;
  }

  public static class PutRequestSerializer extends JsonSerializer<PutRequest> {
    @Override
    public void serialize(PutRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutRequestDeserializer extends JsonDeserializer<PutRequest> {
    @Override
    public PutRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutRequestPb pb = mapper.readValue(p, PutRequestPb.class);
      return PutRequest.fromPb(pb);
    }
  }
}
