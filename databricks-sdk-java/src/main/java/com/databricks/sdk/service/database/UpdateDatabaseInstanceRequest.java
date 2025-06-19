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

/** Update a Database Instance */
@Generated
@JsonSerialize(using = UpdateDatabaseInstanceRequest.UpdateDatabaseInstanceRequestSerializer.class)
@JsonDeserialize(
    using = UpdateDatabaseInstanceRequest.UpdateDatabaseInstanceRequestDeserializer.class)
public class UpdateDatabaseInstanceRequest {
  /**
   * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and
   * storage.
   */
  private DatabaseInstance databaseInstance;

  /** The name of the instance. This is the unique identifier for the instance. */
  private String name;

  /** The list of fields to update. */
  private String updateMask;

  public UpdateDatabaseInstanceRequest setDatabaseInstance(DatabaseInstance databaseInstance) {
    this.databaseInstance = databaseInstance;
    return this;
  }

  public DatabaseInstance getDatabaseInstance() {
    return databaseInstance;
  }

  public UpdateDatabaseInstanceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDatabaseInstanceRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDatabaseInstanceRequest that = (UpdateDatabaseInstanceRequest) o;
    return Objects.equals(databaseInstance, that.databaseInstance)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstance, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDatabaseInstanceRequest.class)
        .add("databaseInstance", databaseInstance)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }

  UpdateDatabaseInstanceRequestPb toPb() {
    UpdateDatabaseInstanceRequestPb pb = new UpdateDatabaseInstanceRequestPb();
    pb.setDatabaseInstance(databaseInstance);
    pb.setName(name);
    pb.setUpdateMask(updateMask);

    return pb;
  }

  static UpdateDatabaseInstanceRequest fromPb(UpdateDatabaseInstanceRequestPb pb) {
    UpdateDatabaseInstanceRequest model = new UpdateDatabaseInstanceRequest();
    model.setDatabaseInstance(pb.getDatabaseInstance());
    model.setName(pb.getName());
    model.setUpdateMask(pb.getUpdateMask());

    return model;
  }

  public static class UpdateDatabaseInstanceRequestSerializer
      extends JsonSerializer<UpdateDatabaseInstanceRequest> {
    @Override
    public void serialize(
        UpdateDatabaseInstanceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateDatabaseInstanceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateDatabaseInstanceRequestDeserializer
      extends JsonDeserializer<UpdateDatabaseInstanceRequest> {
    @Override
    public UpdateDatabaseInstanceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateDatabaseInstanceRequestPb pb =
          mapper.readValue(p, UpdateDatabaseInstanceRequestPb.class);
      return UpdateDatabaseInstanceRequest.fromPb(pb);
    }
  }
}
