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

/**
 * A table constraint, as defined by *one* of the following fields being set:
 * __primary_key_constraint__, __foreign_key_constraint__, __named_table_constraint__.
 */
@Generated
@JsonSerialize(using = TableConstraint.TableConstraintSerializer.class)
@JsonDeserialize(using = TableConstraint.TableConstraintDeserializer.class)
public class TableConstraint {
  /** */
  private ForeignKeyConstraint foreignKeyConstraint;

  /** */
  private NamedTableConstraint namedTableConstraint;

  /** */
  private PrimaryKeyConstraint primaryKeyConstraint;

  public TableConstraint setForeignKeyConstraint(ForeignKeyConstraint foreignKeyConstraint) {
    this.foreignKeyConstraint = foreignKeyConstraint;
    return this;
  }

  public ForeignKeyConstraint getForeignKeyConstraint() {
    return foreignKeyConstraint;
  }

  public TableConstraint setNamedTableConstraint(NamedTableConstraint namedTableConstraint) {
    this.namedTableConstraint = namedTableConstraint;
    return this;
  }

  public NamedTableConstraint getNamedTableConstraint() {
    return namedTableConstraint;
  }

  public TableConstraint setPrimaryKeyConstraint(PrimaryKeyConstraint primaryKeyConstraint) {
    this.primaryKeyConstraint = primaryKeyConstraint;
    return this;
  }

  public PrimaryKeyConstraint getPrimaryKeyConstraint() {
    return primaryKeyConstraint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableConstraint that = (TableConstraint) o;
    return Objects.equals(foreignKeyConstraint, that.foreignKeyConstraint)
        && Objects.equals(namedTableConstraint, that.namedTableConstraint)
        && Objects.equals(primaryKeyConstraint, that.primaryKeyConstraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignKeyConstraint, namedTableConstraint, primaryKeyConstraint);
  }

  @Override
  public String toString() {
    return new ToStringer(TableConstraint.class)
        .add("foreignKeyConstraint", foreignKeyConstraint)
        .add("namedTableConstraint", namedTableConstraint)
        .add("primaryKeyConstraint", primaryKeyConstraint)
        .toString();
  }

  TableConstraintPb toPb() {
    TableConstraintPb pb = new TableConstraintPb();
    pb.setForeignKeyConstraint(foreignKeyConstraint);
    pb.setNamedTableConstraint(namedTableConstraint);
    pb.setPrimaryKeyConstraint(primaryKeyConstraint);

    return pb;
  }

  static TableConstraint fromPb(TableConstraintPb pb) {
    TableConstraint model = new TableConstraint();
    model.setForeignKeyConstraint(pb.getForeignKeyConstraint());
    model.setNamedTableConstraint(pb.getNamedTableConstraint());
    model.setPrimaryKeyConstraint(pb.getPrimaryKeyConstraint());

    return model;
  }

  public static class TableConstraintSerializer extends JsonSerializer<TableConstraint> {
    @Override
    public void serialize(TableConstraint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableConstraintPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableConstraintDeserializer extends JsonDeserializer<TableConstraint> {
    @Override
    public TableConstraint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableConstraintPb pb = mapper.readValue(p, TableConstraintPb.class);
      return TableConstraint.fromPb(pb);
    }
  }
}
