// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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

/** Tag for a dataset input. */
@Generated
@JsonSerialize(using = InputTag.InputTagSerializer.class)
@JsonDeserialize(using = InputTag.InputTagDeserializer.class)
public class InputTag {
  /** The tag key. */
  private String key;

  /** The tag value. */
  private String value;

  public InputTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public InputTag setValue(String value) {
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
    InputTag that = (InputTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(InputTag.class).add("key", key).add("value", value).toString();
  }

  InputTagPb toPb() {
    InputTagPb pb = new InputTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static InputTag fromPb(InputTagPb pb) {
    InputTag model = new InputTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class InputTagSerializer extends JsonSerializer<InputTag> {
    @Override
    public void serialize(InputTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InputTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InputTagDeserializer extends JsonDeserializer<InputTag> {
    @Override
    public InputTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InputTagPb pb = mapper.readValue(p, InputTagPb.class);
      return InputTag.fromPb(pb);
    }
  }
}
