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

/** Delete an external location */
@Generated
@JsonSerialize(using = DeleteExternalLocationRequest.DeleteExternalLocationRequestSerializer.class)
@JsonDeserialize(
    using = DeleteExternalLocationRequest.DeleteExternalLocationRequestDeserializer.class)
public class DeleteExternalLocationRequest {
  /** Force deletion even if there are dependent external tables or mounts. */
  private Boolean force;

  /** Name of the external location. */
  private String name;

  public DeleteExternalLocationRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteExternalLocationRequest setName(String name) {
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
    DeleteExternalLocationRequest that = (DeleteExternalLocationRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteExternalLocationRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }

  DeleteExternalLocationRequestPb toPb() {
    DeleteExternalLocationRequestPb pb = new DeleteExternalLocationRequestPb();
    pb.setForce(force);
    pb.setName(name);

    return pb;
  }

  static DeleteExternalLocationRequest fromPb(DeleteExternalLocationRequestPb pb) {
    DeleteExternalLocationRequest model = new DeleteExternalLocationRequest();
    model.setForce(pb.getForce());
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteExternalLocationRequestSerializer
      extends JsonSerializer<DeleteExternalLocationRequest> {
    @Override
    public void serialize(
        DeleteExternalLocationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteExternalLocationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteExternalLocationRequestDeserializer
      extends JsonDeserializer<DeleteExternalLocationRequest> {
    @Override
    public DeleteExternalLocationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteExternalLocationRequestPb pb =
          mapper.readValue(p, DeleteExternalLocationRequestPb.class);
      return DeleteExternalLocationRequest.fromPb(pb);
    }
  }
}
