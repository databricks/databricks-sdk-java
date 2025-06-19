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
@JsonSerialize(using = AlertOperandColumn.AlertOperandColumnSerializer.class)
@JsonDeserialize(using = AlertOperandColumn.AlertOperandColumnDeserializer.class)
public class AlertOperandColumn {
  /** */
  private String name;

  public AlertOperandColumn setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertOperandColumn that = (AlertOperandColumn) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertOperandColumn.class).add("name", name).toString();
  }

  AlertOperandColumnPb toPb() {
    AlertOperandColumnPb pb = new AlertOperandColumnPb();
    pb.setName(name);

    return pb;
  }

  static AlertOperandColumn fromPb(AlertOperandColumnPb pb) {
    AlertOperandColumn model = new AlertOperandColumn();
    model.setName(pb.getName());

    return model;
  }

  public static class AlertOperandColumnSerializer extends JsonSerializer<AlertOperandColumn> {
    @Override
    public void serialize(AlertOperandColumn value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertOperandColumnPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertOperandColumnDeserializer extends JsonDeserializer<AlertOperandColumn> {
    @Override
    public AlertOperandColumn deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertOperandColumnPb pb = mapper.readValue(p, AlertOperandColumnPb.class);
      return AlertOperandColumn.fromPb(pb);
    }
  }
}
