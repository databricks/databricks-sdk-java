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
@JsonSerialize(using = EndpointConfPair.EndpointConfPairSerializer.class)
@JsonDeserialize(using = EndpointConfPair.EndpointConfPairDeserializer.class)
public class EndpointConfPair {
  /** */
  private String key;

  /** */
  private String value;

  public EndpointConfPair setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public EndpointConfPair setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointConfPair that = (EndpointConfPair) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointConfPair.class).add("key", key).add("value", value).toString();
  }

  EndpointConfPairPb toPb() {
    EndpointConfPairPb pb = new EndpointConfPairPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static EndpointConfPair fromPb(EndpointConfPairPb pb) {
    EndpointConfPair model = new EndpointConfPair();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class EndpointConfPairSerializer extends JsonSerializer<EndpointConfPair> {
    @Override
    public void serialize(EndpointConfPair value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointConfPairPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointConfPairDeserializer extends JsonDeserializer<EndpointConfPair> {
    @Override
    public EndpointConfPair deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointConfPairPb pb = mapper.readValue(p, EndpointConfPairPb.class);
      return EndpointConfPair.fromPb(pb);
    }
  }
}
