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

@Generated
@JsonSerialize(using = DatabaseCatalog.DatabaseCatalogSerializer.class)
@JsonDeserialize(using = DatabaseCatalog.DatabaseCatalogDeserializer.class)
public class DatabaseCatalog {
  /** */
  private Boolean createDatabaseIfNotExists;

  /** The name of the DatabaseInstance housing the database. */
  private String databaseInstanceName;

  /** The name of the database (in a instance) associated with the catalog. */
  private String databaseName;

  /** The name of the catalog in UC. */
  private String name;

  /** */
  private String uid;

  public DatabaseCatalog setCreateDatabaseIfNotExists(Boolean createDatabaseIfNotExists) {
    this.createDatabaseIfNotExists = createDatabaseIfNotExists;
    return this;
  }

  public Boolean getCreateDatabaseIfNotExists() {
    return createDatabaseIfNotExists;
  }

  public DatabaseCatalog setDatabaseInstanceName(String databaseInstanceName) {
    this.databaseInstanceName = databaseInstanceName;
    return this;
  }

  public String getDatabaseInstanceName() {
    return databaseInstanceName;
  }

  public DatabaseCatalog setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public DatabaseCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseCatalog setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseCatalog that = (DatabaseCatalog) o;
    return Objects.equals(createDatabaseIfNotExists, that.createDatabaseIfNotExists)
        && Objects.equals(databaseInstanceName, that.databaseInstanceName)
        && Objects.equals(databaseName, that.databaseName)
        && Objects.equals(name, that.name)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDatabaseIfNotExists, databaseInstanceName, databaseName, name, uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseCatalog.class)
        .add("createDatabaseIfNotExists", createDatabaseIfNotExists)
        .add("databaseInstanceName", databaseInstanceName)
        .add("databaseName", databaseName)
        .add("name", name)
        .add("uid", uid)
        .toString();
  }

  DatabaseCatalogPb toPb() {
    DatabaseCatalogPb pb = new DatabaseCatalogPb();
    pb.setCreateDatabaseIfNotExists(createDatabaseIfNotExists);
    pb.setDatabaseInstanceName(databaseInstanceName);
    pb.setDatabaseName(databaseName);
    pb.setName(name);
    pb.setUid(uid);

    return pb;
  }

  static DatabaseCatalog fromPb(DatabaseCatalogPb pb) {
    DatabaseCatalog model = new DatabaseCatalog();
    model.setCreateDatabaseIfNotExists(pb.getCreateDatabaseIfNotExists());
    model.setDatabaseInstanceName(pb.getDatabaseInstanceName());
    model.setDatabaseName(pb.getDatabaseName());
    model.setName(pb.getName());
    model.setUid(pb.getUid());

    return model;
  }

  public static class DatabaseCatalogSerializer extends JsonSerializer<DatabaseCatalog> {
    @Override
    public void serialize(DatabaseCatalog value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatabaseCatalogPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatabaseCatalogDeserializer extends JsonDeserializer<DatabaseCatalog> {
    @Override
    public DatabaseCatalog deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabaseCatalogPb pb = mapper.readValue(p, DatabaseCatalogPb.class);
      return DatabaseCatalog.fromPb(pb);
    }
  }
}
