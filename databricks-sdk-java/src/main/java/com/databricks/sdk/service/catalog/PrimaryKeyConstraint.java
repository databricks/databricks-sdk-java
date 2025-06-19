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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PrimaryKeyConstraint.PrimaryKeyConstraintSerializer.class)
@JsonDeserialize(using = PrimaryKeyConstraint.PrimaryKeyConstraintDeserializer.class)
public class PrimaryKeyConstraint {
  /** Column names for this constraint. */
  private Collection<String> childColumns;

  /** The name of the constraint. */
  private String name;

  /** Column names that represent a timeseries. */
  private Collection<String> timeseriesColumns;

  public PrimaryKeyConstraint setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public Collection<String> getChildColumns() {
    return childColumns;
  }

  public PrimaryKeyConstraint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PrimaryKeyConstraint setTimeseriesColumns(Collection<String> timeseriesColumns) {
    this.timeseriesColumns = timeseriesColumns;
    return this;
  }

  public Collection<String> getTimeseriesColumns() {
    return timeseriesColumns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrimaryKeyConstraint that = (PrimaryKeyConstraint) o;
    return Objects.equals(childColumns, that.childColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(timeseriesColumns, that.timeseriesColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name, timeseriesColumns);
  }

  @Override
  public String toString() {
    return new ToStringer(PrimaryKeyConstraint.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .add("timeseriesColumns", timeseriesColumns)
        .toString();
  }

  PrimaryKeyConstraintPb toPb() {
    PrimaryKeyConstraintPb pb = new PrimaryKeyConstraintPb();
    pb.setChildColumns(childColumns);
    pb.setName(name);
    pb.setTimeseriesColumns(timeseriesColumns);

    return pb;
  }

  static PrimaryKeyConstraint fromPb(PrimaryKeyConstraintPb pb) {
    PrimaryKeyConstraint model = new PrimaryKeyConstraint();
    model.setChildColumns(pb.getChildColumns());
    model.setName(pb.getName());
    model.setTimeseriesColumns(pb.getTimeseriesColumns());

    return model;
  }

  public static class PrimaryKeyConstraintSerializer extends JsonSerializer<PrimaryKeyConstraint> {
    @Override
    public void serialize(
        PrimaryKeyConstraint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PrimaryKeyConstraintPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PrimaryKeyConstraintDeserializer
      extends JsonDeserializer<PrimaryKeyConstraint> {
    @Override
    public PrimaryKeyConstraint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PrimaryKeyConstraintPb pb = mapper.readValue(p, PrimaryKeyConstraintPb.class);
      return PrimaryKeyConstraint.fromPb(pb);
    }
  }
}
