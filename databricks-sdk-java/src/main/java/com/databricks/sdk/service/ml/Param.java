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

/** Param associated with a run. */
@Generated
@JsonSerialize(using = Param.ParamSerializer.class)
@JsonDeserialize(using = Param.ParamDeserializer.class)
public class Param {
  /** Key identifying this param. */
  private String key;

  /** Value associated with this param. */
  private String value;

  public Param setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public Param setValue(String value) {
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
    Param that = (Param) o;
    return Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Param.class).add("key", key).add("value", value).toString();
  }

  ParamPb toPb() {
    ParamPb pb = new ParamPb();
    pb.setKey(key);
    pb.setValue(value);

    return pb;
  }

  static Param fromPb(ParamPb pb) {
    Param model = new Param();
    model.setKey(pb.getKey());
    model.setValue(pb.getValue());

    return model;
  }

  public static class ParamSerializer extends JsonSerializer<Param> {
    @Override
    public void serialize(Param value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ParamPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ParamDeserializer extends JsonDeserializer<Param> {
    @Override
    public Param deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ParamPb pb = mapper.readValue(p, ParamPb.class);
      return Param.fromPb(pb);
    }
  }
}
