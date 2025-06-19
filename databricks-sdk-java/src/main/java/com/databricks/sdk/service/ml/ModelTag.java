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

@Generated
@JsonSerialize(using = ModelTag.ModelTagSerializer.class)
@JsonDeserialize(using = ModelTag.ModelTagDeserializer.class)
public class ModelTag {
  /** The tag key. */
  private String key;

  /** The tag value. */
  private String value;

  public ModelTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public ModelTag setValue(String value) {
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
    ModelTag that = (ModelTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelTag.class).add("key", key).add("value", value).toString();
  }

  ModelTagPb toPb() {
    ModelTagPb pb = new ModelTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static ModelTag fromPb(ModelTagPb pb) {
    ModelTag model = new ModelTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class ModelTagSerializer extends JsonSerializer<ModelTag> {
    @Override
    public void serialize(ModelTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelTagDeserializer extends JsonDeserializer<ModelTag> {
    @Override
    public ModelTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelTagPb pb = mapper.readValue(p, ModelTagPb.class);
      return ModelTag.fromPb(pb);
    }
  }
}
