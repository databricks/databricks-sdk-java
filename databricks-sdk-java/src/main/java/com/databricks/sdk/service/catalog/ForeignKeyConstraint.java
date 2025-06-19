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
@JsonSerialize(using = ForeignKeyConstraint.ForeignKeyConstraintSerializer.class)
@JsonDeserialize(using = ForeignKeyConstraint.ForeignKeyConstraintDeserializer.class)
public class ForeignKeyConstraint {
  /** Column names for this constraint. */
  private Collection<String> childColumns;

  /** The name of the constraint. */
  private String name;

  /** Column names for this constraint. */
  private Collection<String> parentColumns;

  /** The full name of the parent constraint. */
  private String parentTable;

  public ForeignKeyConstraint setChildColumns(Collection<String> childColumns) {
    this.childColumns = childColumns;
    return this;
  }

  public Collection<String> getChildColumns() {
    return childColumns;
  }

  public ForeignKeyConstraint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ForeignKeyConstraint setParentColumns(Collection<String> parentColumns) {
    this.parentColumns = parentColumns;
    return this;
  }

  public Collection<String> getParentColumns() {
    return parentColumns;
  }

  public ForeignKeyConstraint setParentTable(String parentTable) {
    this.parentTable = parentTable;
    return this;
  }

  public String getParentTable() {
    return parentTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForeignKeyConstraint that = (ForeignKeyConstraint) o;
    return Objects.equals(childColumns, that.childColumns)
        && Objects.equals(name, that.name)
        && Objects.equals(parentColumns, that.parentColumns)
        && Objects.equals(parentTable, that.parentTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childColumns, name, parentColumns, parentTable);
  }

  @Override
  public String toString() {
    return new ToStringer(ForeignKeyConstraint.class)
        .add("childColumns", childColumns)
        .add("name", name)
        .add("parentColumns", parentColumns)
        .add("parentTable", parentTable)
        .toString();
  }

  ForeignKeyConstraintPb toPb() {
    ForeignKeyConstraintPb pb = new ForeignKeyConstraintPb();
    pb.setChildColumns(childColumns);
    pb.setName(name);
    pb.setParentColumns(parentColumns);
    pb.setParentTable(parentTable);

    return pb;
  }

  static ForeignKeyConstraint fromPb(ForeignKeyConstraintPb pb) {
    ForeignKeyConstraint model = new ForeignKeyConstraint();
    model.setChildColumns(pb.getChildColumns());
    model.setName(pb.getName());
    model.setParentColumns(pb.getParentColumns());
    model.setParentTable(pb.getParentTable());

    return model;
  }

  public static class ForeignKeyConstraintSerializer extends JsonSerializer<ForeignKeyConstraint> {
    @Override
    public void serialize(
        ForeignKeyConstraint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ForeignKeyConstraintPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ForeignKeyConstraintDeserializer
      extends JsonDeserializer<ForeignKeyConstraint> {
    @Override
    public ForeignKeyConstraint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ForeignKeyConstraintPb pb = mapper.readValue(p, ForeignKeyConstraintPb.class);
      return ForeignKeyConstraint.fromPb(pb);
    }
  }
}
