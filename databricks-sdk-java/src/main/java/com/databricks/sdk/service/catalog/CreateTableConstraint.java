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
@JsonSerialize(using = CreateTableConstraint.CreateTableConstraintSerializer.class)
@JsonDeserialize(using = CreateTableConstraint.CreateTableConstraintDeserializer.class)
public class CreateTableConstraint {
  /**
   * A table constraint, as defined by *one* of the following fields being set:
   * __primary_key_constraint__, __foreign_key_constraint__, __named_table_constraint__.
   */
  private TableConstraint constraint;

  /** The full name of the table referenced by the constraint. */
  private String fullNameArg;

  public CreateTableConstraint setConstraint(TableConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

  public TableConstraint getConstraint() {
    return constraint;
  }

  public CreateTableConstraint setFullNameArg(String fullNameArg) {
    this.fullNameArg = fullNameArg;
    return this;
  }

  public String getFullNameArg() {
    return fullNameArg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateTableConstraint that = (CreateTableConstraint) o;
    return Objects.equals(constraint, that.constraint)
        && Objects.equals(fullNameArg, that.fullNameArg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraint, fullNameArg);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTableConstraint.class)
        .add("constraint", constraint)
        .add("fullNameArg", fullNameArg)
        .toString();
  }

  CreateTableConstraintPb toPb() {
    CreateTableConstraintPb pb = new CreateTableConstraintPb();
    pb.setConstraint(constraint);
    pb.setFullNameArg(fullNameArg);

    return pb;
  }

  static CreateTableConstraint fromPb(CreateTableConstraintPb pb) {
    CreateTableConstraint model = new CreateTableConstraint();
    model.setConstraint(pb.getConstraint());
    model.setFullNameArg(pb.getFullNameArg());

    return model;
  }

  public static class CreateTableConstraintSerializer
      extends JsonSerializer<CreateTableConstraint> {
    @Override
    public void serialize(
        CreateTableConstraint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateTableConstraintPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateTableConstraintDeserializer
      extends JsonDeserializer<CreateTableConstraint> {
    @Override
    public CreateTableConstraint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateTableConstraintPb pb = mapper.readValue(p, CreateTableConstraintPb.class);
      return CreateTableConstraint.fromPb(pb);
    }
  }
}
