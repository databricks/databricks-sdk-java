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

/** Delete a function */
@Generated
@JsonSerialize(using = DeleteFunctionRequest.DeleteFunctionRequestSerializer.class)
@JsonDeserialize(using = DeleteFunctionRequest.DeleteFunctionRequestDeserializer.class)
public class DeleteFunctionRequest {
  /** Force deletion even if the function is notempty. */
  private Boolean force;

  /**
   * The fully-qualified name of the function (of the form
   * __catalog_name__.__schema_name__.__function__name__).
   */
  private String name;

  public DeleteFunctionRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteFunctionRequest setName(String name) {
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
    DeleteFunctionRequest that = (DeleteFunctionRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFunctionRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }

  DeleteFunctionRequestPb toPb() {
    DeleteFunctionRequestPb pb = new DeleteFunctionRequestPb();
    pb.setForce(force);
    pb.setName(name);

    return pb;
  }

  static DeleteFunctionRequest fromPb(DeleteFunctionRequestPb pb) {
    DeleteFunctionRequest model = new DeleteFunctionRequest();
    model.setForce(pb.getForce());
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteFunctionRequestSerializer
      extends JsonSerializer<DeleteFunctionRequest> {
    @Override
    public void serialize(
        DeleteFunctionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteFunctionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteFunctionRequestDeserializer
      extends JsonDeserializer<DeleteFunctionRequest> {
    @Override
    public DeleteFunctionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteFunctionRequestPb pb = mapper.readValue(p, DeleteFunctionRequestPb.class);
      return DeleteFunctionRequest.fromPb(pb);
    }
  }
}
