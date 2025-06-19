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

/** Delete a metastore */
@Generated
@JsonSerialize(using = DeleteMetastoreRequest.DeleteMetastoreRequestSerializer.class)
@JsonDeserialize(using = DeleteMetastoreRequest.DeleteMetastoreRequestDeserializer.class)
public class DeleteMetastoreRequest {
  /** Force deletion even if the metastore is not empty. Default is false. */
  private Boolean force;

  /** Unique ID of the metastore. */
  private String id;

  public DeleteMetastoreRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteMetastoreRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteMetastoreRequest that = (DeleteMetastoreRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteMetastoreRequest.class)
        .add("force", force)
        .add("id", id)
        .toString();
  }

  DeleteMetastoreRequestPb toPb() {
    DeleteMetastoreRequestPb pb = new DeleteMetastoreRequestPb();
    pb.setForce(force);
    pb.setId(id);

    return pb;
  }

  static DeleteMetastoreRequest fromPb(DeleteMetastoreRequestPb pb) {
    DeleteMetastoreRequest model = new DeleteMetastoreRequest();
    model.setForce(pb.getForce());
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteMetastoreRequestSerializer
      extends JsonSerializer<DeleteMetastoreRequest> {
    @Override
    public void serialize(
        DeleteMetastoreRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteMetastoreRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteMetastoreRequestDeserializer
      extends JsonDeserializer<DeleteMetastoreRequest> {
    @Override
    public DeleteMetastoreRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteMetastoreRequestPb pb = mapper.readValue(p, DeleteMetastoreRequestPb.class);
      return DeleteMetastoreRequest.fromPb(pb);
    }
  }
}
