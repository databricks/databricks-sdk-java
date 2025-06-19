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
@JsonSerialize(using = NamedTableConstraint.NamedTableConstraintSerializer.class)
@JsonDeserialize(using = NamedTableConstraint.NamedTableConstraintDeserializer.class)
public class NamedTableConstraint {
  /** The name of the constraint. */
  private String name;

  public NamedTableConstraint setName(String name) {
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
    NamedTableConstraint that = (NamedTableConstraint) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(NamedTableConstraint.class).add("name", name).toString();
  }

  NamedTableConstraintPb toPb() {
    NamedTableConstraintPb pb = new NamedTableConstraintPb();
    pb.setName(name);

    return pb;
  }

  static NamedTableConstraint fromPb(NamedTableConstraintPb pb) {
    NamedTableConstraint model = new NamedTableConstraint();
    model.setName(pb.getName());

    return model;
  }

  public static class NamedTableConstraintSerializer extends JsonSerializer<NamedTableConstraint> {
    @Override
    public void serialize(
        NamedTableConstraint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NamedTableConstraintPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NamedTableConstraintDeserializer
      extends JsonDeserializer<NamedTableConstraint> {
    @Override
    public NamedTableConstraint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NamedTableConstraintPb pb = mapper.readValue(p, NamedTableConstraintPb.class);
      return NamedTableConstraint.fromPb(pb);
    }
  }
}
