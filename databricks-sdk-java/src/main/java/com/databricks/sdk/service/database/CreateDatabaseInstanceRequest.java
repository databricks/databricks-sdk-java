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

/** Create a Database Instance */
@Generated
@JsonSerialize(using = CreateDatabaseInstanceRequest.CreateDatabaseInstanceRequestSerializer.class)
@JsonDeserialize(
    using = CreateDatabaseInstanceRequest.CreateDatabaseInstanceRequestDeserializer.class)
public class CreateDatabaseInstanceRequest {
  /**
   * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and
   * storage.
   */
  private DatabaseInstance databaseInstance;

  public CreateDatabaseInstanceRequest setDatabaseInstance(DatabaseInstance databaseInstance) {
    this.databaseInstance = databaseInstance;
    return this;
  }

  public DatabaseInstance getDatabaseInstance() {
    return databaseInstance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseInstanceRequest that = (CreateDatabaseInstanceRequest) o;
    return Objects.equals(databaseInstance, that.databaseInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstance);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseInstanceRequest.class)
        .add("databaseInstance", databaseInstance)
        .toString();
  }

  CreateDatabaseInstanceRequestPb toPb() {
    CreateDatabaseInstanceRequestPb pb = new CreateDatabaseInstanceRequestPb();
    pb.setDatabaseInstance(databaseInstance);

    return pb;
  }

  static CreateDatabaseInstanceRequest fromPb(CreateDatabaseInstanceRequestPb pb) {
    CreateDatabaseInstanceRequest model = new CreateDatabaseInstanceRequest();
    model.setDatabaseInstance(pb.getDatabaseInstance());

    return model;
  }

  public static class CreateDatabaseInstanceRequestSerializer
      extends JsonSerializer<CreateDatabaseInstanceRequest> {
    @Override
    public void serialize(
        CreateDatabaseInstanceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateDatabaseInstanceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDatabaseInstanceRequestDeserializer
      extends JsonDeserializer<CreateDatabaseInstanceRequest> {
    @Override
    public CreateDatabaseInstanceRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateDatabaseInstanceRequestPb pb =
          mapper.readValue(p, CreateDatabaseInstanceRequestPb.class);
      return CreateDatabaseInstanceRequest.fromPb(pb);
    }
  }
}
