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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = Struct.StructSerializer.class)
@JsonDeserialize(using = Struct.StructDeserializer.class)
public class Struct {
  /** Data entry, corresponding to a row in a vector index. */
  private Collection<MapStringValueEntry> fields;

  public Struct setFields(Collection<MapStringValueEntry> fields) {
    this.fields = fields;
    return this;
  }

  public Collection<MapStringValueEntry> getFields() {
    return fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Struct that = (Struct) o;
    return Objects.equals(fields, that.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    return new ToStringer(Struct.class).add("fields", fields).toString();
  }

  StructPb toPb() {
    StructPb pb = new StructPb();
    pb.setFields(fields);

    return pb;
  }

  static Struct fromPb(StructPb pb) {
    Struct model = new Struct();
    model.setFields(pb.getFields());

    return model;
  }

  public static class StructSerializer extends JsonSerializer<Struct> {
    @Override
    public void serialize(Struct value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StructPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StructDeserializer extends JsonDeserializer<Struct> {
    @Override
    public Struct deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StructPb pb = mapper.readValue(p, StructPb.class);
      return Struct.fromPb(pb);
    }
  }
}
