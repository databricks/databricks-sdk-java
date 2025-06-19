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

/** Delete a table constraint */
@Generated
@JsonSerialize(using = DeleteTableConstraintRequest.DeleteTableConstraintRequestSerializer.class)
@JsonDeserialize(
    using = DeleteTableConstraintRequest.DeleteTableConstraintRequestDeserializer.class)
public class DeleteTableConstraintRequest {
  /**
   * If true, try deleting all child constraints of the current constraint. If false, reject this
   * operation if the current constraint has any child constraints.
   */
  private Boolean cascade;

  /** The name of the constraint to delete. */
  private String constraintName;

  /** Full name of the table referenced by the constraint. */
  private String fullName;

  public DeleteTableConstraintRequest setCascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

  public Boolean getCascade() {
    return cascade;
  }

  public DeleteTableConstraintRequest setConstraintName(String constraintName) {
    this.constraintName = constraintName;
    return this;
  }

  public String getConstraintName() {
    return constraintName;
  }

  public DeleteTableConstraintRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteTableConstraintRequest that = (DeleteTableConstraintRequest) o;
    return Objects.equals(cascade, that.cascade)
        && Objects.equals(constraintName, that.constraintName)
        && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascade, constraintName, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTableConstraintRequest.class)
        .add("cascade", cascade)
        .add("constraintName", constraintName)
        .add("fullName", fullName)
        .toString();
  }

  DeleteTableConstraintRequestPb toPb() {
    DeleteTableConstraintRequestPb pb = new DeleteTableConstraintRequestPb();
    pb.setCascade(cascade);
    pb.setConstraintName(constraintName);
    pb.setFullName(fullName);

    return pb;
  }

  static DeleteTableConstraintRequest fromPb(DeleteTableConstraintRequestPb pb) {
    DeleteTableConstraintRequest model = new DeleteTableConstraintRequest();
    model.setCascade(pb.getCascade());
    model.setConstraintName(pb.getConstraintName());
    model.setFullName(pb.getFullName());

    return model;
  }

  public static class DeleteTableConstraintRequestSerializer
      extends JsonSerializer<DeleteTableConstraintRequest> {
    @Override
    public void serialize(
        DeleteTableConstraintRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteTableConstraintRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteTableConstraintRequestDeserializer
      extends JsonDeserializer<DeleteTableConstraintRequest> {
    @Override
    public DeleteTableConstraintRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteTableConstraintRequestPb pb = mapper.readValue(p, DeleteTableConstraintRequestPb.class);
      return DeleteTableConstraintRequest.fromPb(pb);
    }
  }
}
