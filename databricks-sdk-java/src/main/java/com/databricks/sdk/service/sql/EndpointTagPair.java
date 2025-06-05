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
@JsonSerialize(using = EndpointTagPair.EndpointTagPairSerializer.class)
@JsonDeserialize(using = EndpointTagPair.EndpointTagPairDeserializer.class)
public class EndpointTagPair {
  /** */
  private String key;

  /** */
  private String value;

  public EndpointTagPair setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public EndpointTagPair setValue(String value) {
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
    EndpointTagPair that = (EndpointTagPair) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(EndpointTagPair.class).add("key", key).add("value", value).toString();
  }

  EndpointTagPairPb toPb() {
    EndpointTagPairPb pb = new EndpointTagPairPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static EndpointTagPair fromPb(EndpointTagPairPb pb) {
    EndpointTagPair model = new EndpointTagPair();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class EndpointTagPairSerializer extends JsonSerializer<EndpointTagPair> {
    @Override
    public void serialize(EndpointTagPair value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EndpointTagPairPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EndpointTagPairDeserializer extends JsonDeserializer<EndpointTagPair> {
    @Override
    public EndpointTagPair deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EndpointTagPairPb pb = mapper.readValue(p, EndpointTagPairPb.class);
      return EndpointTagPair.fromPb(pb);
    }
  }
}
