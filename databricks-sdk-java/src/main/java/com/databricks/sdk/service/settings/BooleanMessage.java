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
import java.util.Objects;

@Generated
@JsonSerialize(using = BooleanMessage.BooleanMessageSerializer.class)
@JsonDeserialize(using = BooleanMessage.BooleanMessageDeserializer.class)
public class BooleanMessage {
  /** */
  private Boolean value;

  public BooleanMessage setValue(Boolean value) {
    this.value = value;
    return this;
  }

  public Boolean getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BooleanMessage that = (BooleanMessage) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(BooleanMessage.class).add("value", value).toString();
  }

  BooleanMessagePb toPb() {
    BooleanMessagePb pb = new BooleanMessagePb();
    pb.setValue(value);

    return pb;
  }

  static BooleanMessage fromPb(BooleanMessagePb pb) {
    BooleanMessage model = new BooleanMessage();
    model.setValue(pb.getValue());

    return model;
  }

  public static class BooleanMessageSerializer extends JsonSerializer<BooleanMessage> {
    @Override
    public void serialize(BooleanMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BooleanMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BooleanMessageDeserializer extends JsonDeserializer<BooleanMessage> {
    @Override
    public BooleanMessage deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BooleanMessagePb pb = mapper.readValue(p, BooleanMessagePb.class);
      return BooleanMessage.fromPb(pb);
    }
  }
}
