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

/** Delete a schema */
@Generated
@JsonSerialize(using = DeleteSchemaRequest.DeleteSchemaRequestSerializer.class)
@JsonDeserialize(using = DeleteSchemaRequest.DeleteSchemaRequestDeserializer.class)
public class DeleteSchemaRequest {
  /** Force deletion even if the schema is not empty. */
  private Boolean force;

  /** Full name of the schema. */
  private String fullName;

  public DeleteSchemaRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteSchemaRequest setFullName(String fullName) {
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
    DeleteSchemaRequest that = (DeleteSchemaRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSchemaRequest.class)
        .add("force", force)
        .add("fullName", fullName)
        .toString();
  }

  DeleteSchemaRequestPb toPb() {
    DeleteSchemaRequestPb pb = new DeleteSchemaRequestPb();
    pb.setForce(force);
    pb.setFullName(fullName);

    return pb;
  }

  static DeleteSchemaRequest fromPb(DeleteSchemaRequestPb pb) {
    DeleteSchemaRequest model = new DeleteSchemaRequest();
    model.setForce(pb.getForce());
    model.setFullName(pb.getFullName());

    return model;
  }

  public static class DeleteSchemaRequestSerializer extends JsonSerializer<DeleteSchemaRequest> {
    @Override
    public void serialize(DeleteSchemaRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteSchemaRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteSchemaRequestDeserializer
      extends JsonDeserializer<DeleteSchemaRequest> {
    @Override
    public DeleteSchemaRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteSchemaRequestPb pb = mapper.readValue(p, DeleteSchemaRequestPb.class);
      return DeleteSchemaRequest.fromPb(pb);
    }
  }
}
