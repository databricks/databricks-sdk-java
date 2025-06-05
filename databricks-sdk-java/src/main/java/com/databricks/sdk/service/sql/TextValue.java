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
@JsonSerialize(using = TextValue.TextValueSerializer.class)
@JsonDeserialize(using = TextValue.TextValueDeserializer.class)
public class TextValue {
  /** */
  private String value;

  public TextValue setValue(String value) {
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
    TextValue that = (TextValue) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(TextValue.class).add("value", value).toString();
  }

  TextValuePb toPb() {
    TextValuePb pb = new TextValuePb();
    pb.setValue(value);

    return pb;
  }

  static TextValue fromPb(TextValuePb pb) {
    TextValue model = new TextValue();
    model.setValue(pb.getValue());

    return model;
  }

  public static class TextValueSerializer extends JsonSerializer<TextValue> {
    @Override
    public void serialize(TextValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TextValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TextValueDeserializer extends JsonDeserializer<TextValue> {
    @Override
    public TextValue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TextValuePb pb = mapper.readValue(p, TextValuePb.class);
      return TextValue.fromPb(pb);
    }
  }
}
