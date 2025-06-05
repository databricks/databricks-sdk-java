// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = ConsistencyToken.ConsistencyTokenSerializer.class)
@JsonDeserialize(using = ConsistencyToken.ConsistencyTokenDeserializer.class)
public class ConsistencyToken {
  /** */
  private String value;

  public ConsistencyToken setValue(String value) {
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
    ConsistencyToken that = (ConsistencyToken) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(ConsistencyToken.class).add("value", value).toString();
  }

  ConsistencyTokenPb toPb() {
    ConsistencyTokenPb pb = new ConsistencyTokenPb();
    pb.setValue(value);

    return pb;
  }

  static ConsistencyToken fromPb(ConsistencyTokenPb pb) {
    ConsistencyToken model = new ConsistencyToken();
    model.setValue(pb.getValue());

    return model;
  }

  public static class ConsistencyTokenSerializer extends JsonSerializer<ConsistencyToken> {
    @Override
    public void serialize(ConsistencyToken value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ConsistencyTokenPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ConsistencyTokenDeserializer extends JsonDeserializer<ConsistencyToken> {
    @Override
    public ConsistencyToken deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ConsistencyTokenPb pb = mapper.readValue(p, ConsistencyTokenPb.class);
      return ConsistencyToken.fromPb(pb);
    }
  }
}
