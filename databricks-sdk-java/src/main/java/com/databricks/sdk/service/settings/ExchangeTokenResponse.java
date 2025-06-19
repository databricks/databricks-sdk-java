// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Exhanged tokens were successfully returned. */
@Generated
@JsonSerialize(using = ExchangeTokenResponse.ExchangeTokenResponseSerializer.class)
@JsonDeserialize(using = ExchangeTokenResponse.ExchangeTokenResponseDeserializer.class)
public class ExchangeTokenResponse {
  /** */
  private Collection<ExchangeToken> values;

  public ExchangeTokenResponse setValues(Collection<ExchangeToken> values) {
    this.values = values;
    return this;
  }

  public Collection<ExchangeToken> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeTokenResponse that = (ExchangeTokenResponse) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeTokenResponse.class).add("values", values).toString();
  }

  ExchangeTokenResponsePb toPb() {
    ExchangeTokenResponsePb pb = new ExchangeTokenResponsePb();
    pb.setValues(values);

    return pb;
  }

  static ExchangeTokenResponse fromPb(ExchangeTokenResponsePb pb) {
    ExchangeTokenResponse model = new ExchangeTokenResponse();
    model.setValues(pb.getValues());

    return model;
  }

  public static class ExchangeTokenResponseSerializer
      extends JsonSerializer<ExchangeTokenResponse> {
    @Override
    public void serialize(
        ExchangeTokenResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExchangeTokenResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExchangeTokenResponseDeserializer
      extends JsonDeserializer<ExchangeTokenResponse> {
    @Override
    public ExchangeTokenResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExchangeTokenResponsePb pb = mapper.readValue(p, ExchangeTokenResponsePb.class);
      return ExchangeTokenResponse.fromPb(pb);
    }
  }
}
