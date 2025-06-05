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

/** Create a role for a Database Instance */
@Generated
@JsonSerialize(
    using = CreateDatabaseInstanceRoleRequest.CreateDatabaseInstanceRoleRequestSerializer.class)
@JsonDeserialize(
    using = CreateDatabaseInstanceRoleRequest.CreateDatabaseInstanceRoleRequestDeserializer.class)
public class CreateDatabaseInstanceRoleRequest {
  /** A DatabaseInstanceRole represents a Postgres role in a database instance. */
  private DatabaseInstanceRole databaseInstanceRole;

  /** */
  private String instanceName;

  public CreateDatabaseInstanceRoleRequest setDatabaseInstanceRole(
      DatabaseInstanceRole databaseInstanceRole) {
    this.databaseInstanceRole = databaseInstanceRole;
    return this;
  }

  public DatabaseInstanceRole getDatabaseInstanceRole() {
    return databaseInstanceRole;
  }

  public CreateDatabaseInstanceRoleRequest setInstanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  public String getInstanceName() {
    return instanceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseInstanceRoleRequest that = (CreateDatabaseInstanceRoleRequest) o;
    return Objects.equals(databaseInstanceRole, that.databaseInstanceRole)
        && Objects.equals(instanceName, that.instanceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseInstanceRole, instanceName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseInstanceRoleRequest.class)
        .add("databaseInstanceRole", databaseInstanceRole)
        .add("instanceName", instanceName)
        .toString();
  }

  CreateDatabaseInstanceRoleRequestPb toPb() {
    CreateDatabaseInstanceRoleRequestPb pb = new CreateDatabaseInstanceRoleRequestPb();
    pb.setDatabaseInstanceRole(databaseInstanceRole);
    pb.setInstanceName(instanceName);

    return pb;
  }

  static CreateDatabaseInstanceRoleRequest fromPb(CreateDatabaseInstanceRoleRequestPb pb) {
    CreateDatabaseInstanceRoleRequest model = new CreateDatabaseInstanceRoleRequest();
    model.setDatabaseInstanceRole(pb.getDatabaseInstanceRole());
    model.setInstanceName(pb.getInstanceName());

    return model;
  }

  public static class CreateDatabaseInstanceRoleRequestSerializer
      extends JsonSerializer<CreateDatabaseInstanceRoleRequest> {
    @Override
    public void serialize(
        CreateDatabaseInstanceRoleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateDatabaseInstanceRoleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDatabaseInstanceRoleRequestDeserializer
      extends JsonDeserializer<CreateDatabaseInstanceRoleRequest> {
    @Override
    public CreateDatabaseInstanceRoleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateDatabaseInstanceRoleRequestPb pb =
          mapper.readValue(p, CreateDatabaseInstanceRoleRequestPb.class);
      return CreateDatabaseInstanceRoleRequest.fromPb(pb);
    }
  }
}
