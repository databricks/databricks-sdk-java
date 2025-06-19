// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = CustomTag.CustomTagSerializer.class)
@JsonDeserialize(using = CustomTag.CustomTagDeserializer.class)
public class CustomTag {
  /** Key field for a vector search endpoint tag. */
  private String key;

  /** [Optional] Value field for a vector search endpoint tag. */
  private String value;

  public CustomTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public CustomTag setValue(String value) {
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
    CustomTag that = (CustomTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomTag.class).add("key", key).add("value", value).toString();
  }

  CustomTagPb toPb() {
    CustomTagPb pb = new CustomTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static CustomTag fromPb(CustomTagPb pb) {
    CustomTag model = new CustomTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class CustomTagSerializer extends JsonSerializer<CustomTag> {
    @Override
    public void serialize(CustomTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CustomTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CustomTagDeserializer extends JsonDeserializer<CustomTag> {
    @Override
    public CustomTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CustomTagPb pb = mapper.readValue(p, CustomTagPb.class);
      return CustomTag.fromPb(pb);
    }
  }
}
