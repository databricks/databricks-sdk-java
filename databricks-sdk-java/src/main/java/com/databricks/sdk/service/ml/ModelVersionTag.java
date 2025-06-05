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
@JsonSerialize(using = ModelVersionTag.ModelVersionTagSerializer.class)
@JsonDeserialize(using = ModelVersionTag.ModelVersionTagDeserializer.class)
public class ModelVersionTag {
  /** The tag key. */
  private String key;

  /** The tag value. */
  private String value;

  public ModelVersionTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public ModelVersionTag setValue(String value) {
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
    ModelVersionTag that = (ModelVersionTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelVersionTag.class).add("key", key).add("value", value).toString();
  }

  ModelVersionTagPb toPb() {
    ModelVersionTagPb pb = new ModelVersionTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static ModelVersionTag fromPb(ModelVersionTagPb pb) {
    ModelVersionTag model = new ModelVersionTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class ModelVersionTagSerializer extends JsonSerializer<ModelVersionTag> {
    @Override
    public void serialize(ModelVersionTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ModelVersionTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ModelVersionTagDeserializer extends JsonDeserializer<ModelVersionTag> {
    @Override
    public ModelVersionTag deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ModelVersionTagPb pb = mapper.readValue(p, ModelVersionTagPb.class);
      return ModelVersionTag.fromPb(pb);
    }
  }
}
