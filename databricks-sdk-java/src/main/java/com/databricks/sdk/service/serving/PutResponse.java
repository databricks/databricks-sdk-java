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
@JsonSerialize(using = PutResponse.PutResponseSerializer.class)
@JsonDeserialize(using = PutResponse.PutResponseDeserializer.class)
public class PutResponse {
  /** The list of endpoint rate limits. */
  private Collection<RateLimit> rateLimits;

  public PutResponse setRateLimits(Collection<RateLimit> rateLimits) {
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
    PutResponse that = (PutResponse) o;
    return Objects.equals(rateLimits, that.rateLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimits);
  }

  @Override
  public String toString() {
    return new ToStringer(PutResponse.class).add("rateLimits", rateLimits).toString();
  }

  PutResponsePb toPb() {
    PutResponsePb pb = new PutResponsePb();
    pb.setRateLimits(rateLimits);

    return pb;
  }

  static PutResponse fromPb(PutResponsePb pb) {
    PutResponse model = new PutResponse();
    model.setRateLimits(pb.getRateLimits());

    return model;
  }

  public static class PutResponseSerializer extends JsonSerializer<PutResponse> {
    @Override
    public void serialize(PutResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutResponseDeserializer extends JsonDeserializer<PutResponse> {
    @Override
    public PutResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutResponsePb pb = mapper.readValue(p, PutResponsePb.class);
      return PutResponse.fromPb(pb);
    }
  }
}
