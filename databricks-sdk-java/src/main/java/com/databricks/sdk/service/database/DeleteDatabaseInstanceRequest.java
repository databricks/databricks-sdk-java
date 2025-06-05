// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** Delete a Database Instance */
@Generated
@JsonSerialize(using = DeleteDatabaseInstanceRequest.DeleteDatabaseInstanceRequestSerializer.class)
@JsonDeserialize(
    using = DeleteDatabaseInstanceRequest.DeleteDatabaseInstanceRequestDeserializer.class)
public class DeleteDatabaseInstanceRequest {
  /**
   * By default, a instance cannot be deleted if it has descendant instances created via PITR. If
   * this flag is specified as true, all descendent instances will be deleted as well.
   */
  private Boolean force;

  /** Name of the instance to delete. */
  private String name;

  /**
   * If false, the database instance is soft deleted. Soft deleted instances behave as if they are
   * deleted, and cannot be used for CRUD operations nor connected to. However they can be undeleted
   * by calling the undelete API for a limited time. If true, the database instance is hard deleted
   * and cannot be undeleted.
   */
  private Boolean purge;

  public DeleteDatabaseInstanceRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteDatabaseInstanceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteDatabaseInstanceRequest setPurge(Boolean purge) {
    this.purge = purge;
    return this;
  }

  public Boolean getPurge() {
    return purge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDatabaseInstanceRequest that = (DeleteDatabaseInstanceRequest) o;
    return Objects.equals(force, that.force)
        && Objects.equals(name, that.name)
        && Objects.equals(purge, that.purge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name, purge);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDatabaseInstanceRequest.class)
        .add("force", force)
        .add("name", name)
        .add("purge", purge)
        .toString();
  }

  DeleteDatabaseInstanceRequestPb toPb() {
    DeleteDatabaseInstanceRequestPb pb = new DeleteDatabaseInstanceRequestPb();
    pb.setForce(force);
    pb.setName(name);
    pb.setPurge(purge);

    return pb;
  }

  static DeleteDatabaseInstanceRequest fromPb(DeleteDatabaseInstanceRequestPb pb) {
    DeleteDatabaseInstanceRequest model = new DeleteDatabaseInstanceRequest();
    model.setForce(pb.getForce());
    model.setName(pb.getName());
    model.setPurge(pb.getPurge());

    return model;
  }

  public static class DeleteDatabaseInstanceRequestSerializer
      extends JsonSerializer<DeleteDatabaseInstanceRequest> {
    @Override
    public void serialize(
        DeleteDatabaseInstanceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDatabaseInstanceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDatabaseInstanceRequestDeserializer
      extends JsonDeserializer<DeleteDatabaseInstanceRequest> {
    @Override
    public DeleteDatabaseInstanceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDatabaseInstanceRequestPb pb =
          mapper.readValue(p, DeleteDatabaseInstanceRequestPb.class);
      return DeleteDatabaseInstanceRequest.fromPb(pb);
    }
  }
}
