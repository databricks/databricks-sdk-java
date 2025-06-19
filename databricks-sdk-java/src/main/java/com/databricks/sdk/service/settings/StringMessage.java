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
@JsonSerialize(using = StringMessage.StringMessageSerializer.class)
@JsonDeserialize(using = StringMessage.StringMessageDeserializer.class)
public class StringMessage {
  /** Represents a generic string value. */
  private String value;

  public StringMessage setValue(String value) {
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
    StringMessage that = (StringMessage) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(StringMessage.class).add("value", value).toString();
  }

  StringMessagePb toPb() {
    StringMessagePb pb = new StringMessagePb();
    pb.setValue(value);

    return pb;
  }

  static StringMessage fromPb(StringMessagePb pb) {
    StringMessage model = new StringMessage();
    model.setValue(pb.getValue());

    return model;
  }

  public static class StringMessageSerializer extends JsonSerializer<StringMessage> {
    @Override
    public void serialize(StringMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StringMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StringMessageDeserializer extends JsonDeserializer<StringMessage> {
    @Override
    public StringMessage deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StringMessagePb pb = mapper.readValue(p, StringMessagePb.class);
      return StringMessage.fromPb(pb);
    }
  }
}
