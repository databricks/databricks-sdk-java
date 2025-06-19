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

/** Tag for a run. */
@Generated
@JsonSerialize(using = RunTag.RunTagSerializer.class)
@JsonDeserialize(using = RunTag.RunTagDeserializer.class)
public class RunTag {
  /** The tag key. */
  private String key;

  /** The tag value. */
  private String value;

  public RunTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public RunTag setValue(String value) {
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
    RunTag that = (RunTag) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(RunTag.class).add("key", key).add("value", value).toString();
  }

  RunTagPb toPb() {
    RunTagPb pb = new RunTagPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static RunTag fromPb(RunTagPb pb) {
    RunTag model = new RunTag();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class RunTagSerializer extends JsonSerializer<RunTag> {
    @Override
    public void serialize(RunTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunTagDeserializer extends JsonDeserializer<RunTag> {
    @Override
    public RunTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunTagPb pb = mapper.readValue(p, RunTagPb.class);
      return RunTag.fromPb(pb);
    }
  }
}
