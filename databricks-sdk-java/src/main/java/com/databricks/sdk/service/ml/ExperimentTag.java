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

/** A tag for an experiment. */
@Generated
@JsonSerialize(using = ExperimentTag.ExperimentTagSerializer.class)
@JsonDeserialize(using = ExperimentTag.ExperimentTagDeserializer.class)
public class ExperimentTag {
  /** The tag key. */
  private String key;

  /** The tag value. */
  private String value;

  public ExperimentTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public ExperimentTag setValue(String value) {
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
    ExperimentTag that = (ExperimentTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(ExperimentTag.class).add("key", key).add("value", value).toString();
  }

  ExperimentTagPb toPb() {
    ExperimentTagPb pb = new ExperimentTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static ExperimentTag fromPb(ExperimentTagPb pb) {
    ExperimentTag model = new ExperimentTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class ExperimentTagSerializer extends JsonSerializer<ExperimentTag> {
    @Override
    public void serialize(ExperimentTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExperimentTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExperimentTagDeserializer extends JsonDeserializer<ExperimentTag> {
    @Override
    public ExperimentTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExperimentTagPb pb = mapper.readValue(p, ExperimentTagPb.class);
      return ExperimentTag.fromPb(pb);
    }
  }
}
