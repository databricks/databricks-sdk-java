// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = TagKeyValue.TagKeyValueSerializer.class)
@JsonDeserialize(using = TagKeyValue.TagKeyValueDeserializer.class)
public class TagKeyValue {
  /** name of the tag */
  private String key;

  /** value of the tag associated with the key, could be optional */
  private String value;

  public TagKeyValue setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public TagKeyValue setValue(String value) {
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
    TagKeyValue that = (TagKeyValue) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(TagKeyValue.class).add("key", key).add("value", value).toString();
  }

  TagKeyValuePb toPb() {
    TagKeyValuePb pb = new TagKeyValuePb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static TagKeyValue fromPb(TagKeyValuePb pb) {
    TagKeyValue model = new TagKeyValue();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class TagKeyValueSerializer extends JsonSerializer<TagKeyValue> {
    @Override
    public void serialize(TagKeyValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TagKeyValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TagKeyValueDeserializer extends JsonDeserializer<TagKeyValue> {
    @Override
    public TagKeyValue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TagKeyValuePb pb = mapper.readValue(p, TagKeyValuePb.class);
      return TagKeyValue.fromPb(pb);
    }
  }
}
