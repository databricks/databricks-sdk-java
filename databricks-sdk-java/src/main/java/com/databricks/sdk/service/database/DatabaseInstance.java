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

/**
 * A DatabaseInstance represents a logical Postgres instance, comprised of both compute and storage.
 */
@Generated
@JsonSerialize(using = DatabaseInstance.DatabaseInstanceSerializer.class)
@JsonDeserialize(using = DatabaseInstance.DatabaseInstanceDeserializer.class)
public class DatabaseInstance {
  /** The sku of the instance. Valid values are "CU_1", "CU_2", "CU_4". */
  private String capacity;

  /** The timestamp when the instance was created. */
  private String creationTime;

  /** The email of the creator of the instance. */
  private String creator;

  /** The name of the instance. This is the unique identifier for the instance. */
  private String name;

  /** The version of Postgres running on the instance. */
  private String pgVersion;

  /** The DNS endpoint to connect to the instance for read+write access. */
  private String readWriteDns;

  /** The current state of the instance. */
  private DatabaseInstanceState state;

  /** Whether the instance is stopped. */
  private Boolean stopped;

  /** An immutable UUID identifier for the instance. */
  private String uid;

  public DatabaseInstance setCapacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  public String getCapacity() {
    return capacity;
  }

  public DatabaseInstance setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public DatabaseInstance setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public DatabaseInstance setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseInstance setPgVersion(String pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public String getPgVersion() {
    return pgVersion;
  }

  public DatabaseInstance setReadWriteDns(String readWriteDns) {
    this.readWriteDns = readWriteDns;
    return this;
  }

  public String getReadWriteDns() {
    return readWriteDns;
  }

  public DatabaseInstance setState(DatabaseInstanceState state) {
    this.state = state;
    return this;
  }

  public DatabaseInstanceState getState() {
    return state;
  }

  public DatabaseInstance setStopped(Boolean stopped) {
    this.stopped = stopped;
    return this;
  }

  public Boolean getStopped() {
    return stopped;
  }

  public DatabaseInstance setUid(String uid) {
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
    DatabaseInstance that = (DatabaseInstance) o;
    return Objects.equals(capacity, that.capacity)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(name, that.name)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(readWriteDns, that.readWriteDns)
        && Objects.equals(state, that.state)
        && Objects.equals(stopped, that.stopped)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capacity, creationTime, creator, name, pgVersion, readWriteDns, state, stopped, uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstance.class)
        .add("capacity", capacity)
        .add("creationTime", creationTime)
        .add("creator", creator)
        .add("name", name)
        .add("pgVersion", pgVersion)
        .add("readWriteDns", readWriteDns)
        .add("state", state)
        .add("stopped", stopped)
        .add("uid", uid)
        .toString();
  }

  DatabaseInstancePb toPb() {
    DatabaseInstancePb pb = new DatabaseInstancePb();
    pb.setCapacity(capacity);
    pb.setCreationTime(creationTime);
    pb.setCreator(creator);
    pb.setName(name);
    pb.setPgVersion(pgVersion);
    pb.setReadWriteDns(readWriteDns);
    pb.setState(state);
    pb.setStopped(stopped);
    pb.setUid(uid);

    return pb;
  }

  static DatabaseInstance fromPb(DatabaseInstancePb pb) {
    DatabaseInstance model = new DatabaseInstance();
    model.setCapacity(pb.getCapacity());
    model.setCreationTime(pb.getCreationTime());
    model.setCreator(pb.getCreator());
    model.setName(pb.getName());
    model.setPgVersion(pb.getPgVersion());
    model.setReadWriteDns(pb.getReadWriteDns());
    model.setState(pb.getState());
    model.setStopped(pb.getStopped());
    model.setUid(pb.getUid());

    return model;
  }

  public static class DatabaseInstanceSerializer extends JsonSerializer<DatabaseInstance> {
    @Override
    public void serialize(DatabaseInstance value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatabaseInstancePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatabaseInstanceDeserializer extends JsonDeserializer<DatabaseInstance> {
    @Override
    public DatabaseInstance deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabaseInstancePb pb = mapper.readValue(p, DatabaseInstancePb.class);
      return DatabaseInstance.fromPb(pb);
    }
  }
}
