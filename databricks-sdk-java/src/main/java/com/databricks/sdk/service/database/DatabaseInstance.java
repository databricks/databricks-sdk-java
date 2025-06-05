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
import java.util.Collection;
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

  /** The refs of the child instances. This is only available if the instance is parent instance. */
  private Collection<DatabaseInstanceRef> childInstanceRefs;

  /** The timestamp when the instance was created. */
  private String creationTime;

  /** The email of the creator of the instance. */
  private String creator;

  /** Whether to enable secondaries to serve read-only traffic. Defaults to false. */
  private Boolean enableReadableSecondaries;

  /** The name of the instance. This is the unique identifier for the instance. */
  private String name;

  /**
   * The number of nodes in the instance, composed of 1 primary and 0 or more secondaries. Defaults
   * to 1 primary and 0 secondaries.
   */
  private Long nodeCount;

  /**
   * The ref of the parent instance. This is only available if the instance is child instance.
   * Input: For specifying the parent instance to create a child instance. Optional. Output: Only
   * populated if provided as input to create a child instance.
   */
  private DatabaseInstanceRef parentInstanceRef;

  /** The version of Postgres running on the instance. */
  private String pgVersion;

  /**
   * The DNS endpoint to connect to the instance for read only access. This is only available if
   * enable_readable_secondaries is true.
   */
  private String readOnlyDns;

  /** The DNS endpoint to connect to the instance for read+write access. */
  private String readWriteDns;

  /**
   * The retention window for the instance. This is the time window in days for which the historical
   * data is retained. The default value is 7 days. Valid values are 2 to 35 days.
   */
  private Long retentionWindowInDays;

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

  public DatabaseInstance setChildInstanceRefs(Collection<DatabaseInstanceRef> childInstanceRefs) {
    this.childInstanceRefs = childInstanceRefs;
    return this;
  }

  public Collection<DatabaseInstanceRef> getChildInstanceRefs() {
    return childInstanceRefs;
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

  public DatabaseInstance setEnableReadableSecondaries(Boolean enableReadableSecondaries) {
    this.enableReadableSecondaries = enableReadableSecondaries;
    return this;
  }

  public Boolean getEnableReadableSecondaries() {
    return enableReadableSecondaries;
  }

  public DatabaseInstance setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatabaseInstance setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  public Long getNodeCount() {
    return nodeCount;
  }

  public DatabaseInstance setParentInstanceRef(DatabaseInstanceRef parentInstanceRef) {
    this.parentInstanceRef = parentInstanceRef;
    return this;
  }

  public DatabaseInstanceRef getParentInstanceRef() {
    return parentInstanceRef;
  }

  public DatabaseInstance setPgVersion(String pgVersion) {
    this.pgVersion = pgVersion;
    return this;
  }

  public String getPgVersion() {
    return pgVersion;
  }

  public DatabaseInstance setReadOnlyDns(String readOnlyDns) {
    this.readOnlyDns = readOnlyDns;
    return this;
  }

  public String getReadOnlyDns() {
    return readOnlyDns;
  }

  public DatabaseInstance setReadWriteDns(String readWriteDns) {
    this.readWriteDns = readWriteDns;
    return this;
  }

  public String getReadWriteDns() {
    return readWriteDns;
  }

  public DatabaseInstance setRetentionWindowInDays(Long retentionWindowInDays) {
    this.retentionWindowInDays = retentionWindowInDays;
    return this;
  }

  public Long getRetentionWindowInDays() {
    return retentionWindowInDays;
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
        && Objects.equals(childInstanceRefs, that.childInstanceRefs)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(enableReadableSecondaries, that.enableReadableSecondaries)
        && Objects.equals(name, that.name)
        && Objects.equals(nodeCount, that.nodeCount)
        && Objects.equals(parentInstanceRef, that.parentInstanceRef)
        && Objects.equals(pgVersion, that.pgVersion)
        && Objects.equals(readOnlyDns, that.readOnlyDns)
        && Objects.equals(readWriteDns, that.readWriteDns)
        && Objects.equals(retentionWindowInDays, that.retentionWindowInDays)
        && Objects.equals(state, that.state)
        && Objects.equals(stopped, that.stopped)
        && Objects.equals(uid, that.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capacity,
        childInstanceRefs,
        creationTime,
        creator,
        enableReadableSecondaries,
        name,
        nodeCount,
        parentInstanceRef,
        pgVersion,
        readOnlyDns,
        readWriteDns,
        retentionWindowInDays,
        state,
        stopped,
        uid);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseInstance.class)
        .add("capacity", capacity)
        .add("childInstanceRefs", childInstanceRefs)
        .add("creationTime", creationTime)
        .add("creator", creator)
        .add("enableReadableSecondaries", enableReadableSecondaries)
        .add("name", name)
        .add("nodeCount", nodeCount)
        .add("parentInstanceRef", parentInstanceRef)
        .add("pgVersion", pgVersion)
        .add("readOnlyDns", readOnlyDns)
        .add("readWriteDns", readWriteDns)
        .add("retentionWindowInDays", retentionWindowInDays)
        .add("state", state)
        .add("stopped", stopped)
        .add("uid", uid)
        .toString();
  }

  DatabaseInstancePb toPb() {
    DatabaseInstancePb pb = new DatabaseInstancePb();
    pb.setCapacity(capacity);
    pb.setChildInstanceRefs(childInstanceRefs);
    pb.setCreationTime(creationTime);
    pb.setCreator(creator);
    pb.setEnableReadableSecondaries(enableReadableSecondaries);
    pb.setName(name);
    pb.setNodeCount(nodeCount);
    pb.setParentInstanceRef(parentInstanceRef);
    pb.setPgVersion(pgVersion);
    pb.setReadOnlyDns(readOnlyDns);
    pb.setReadWriteDns(readWriteDns);
    pb.setRetentionWindowInDays(retentionWindowInDays);
    pb.setState(state);
    pb.setStopped(stopped);
    pb.setUid(uid);

    return pb;
  }

  static DatabaseInstance fromPb(DatabaseInstancePb pb) {
    DatabaseInstance model = new DatabaseInstance();
    model.setCapacity(pb.getCapacity());
    model.setChildInstanceRefs(pb.getChildInstanceRefs());
    model.setCreationTime(pb.getCreationTime());
    model.setCreator(pb.getCreator());
    model.setEnableReadableSecondaries(pb.getEnableReadableSecondaries());
    model.setName(pb.getName());
    model.setNodeCount(pb.getNodeCount());
    model.setParentInstanceRef(pb.getParentInstanceRef());
    model.setPgVersion(pb.getPgVersion());
    model.setReadOnlyDns(pb.getReadOnlyDns());
    model.setReadWriteDns(pb.getReadWriteDns());
    model.setRetentionWindowInDays(pb.getRetentionWindowInDays());
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
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabaseInstancePb pb = mapper.readValue(p, DatabaseInstancePb.class);
      return DatabaseInstance.fromPb(pb);
    }
  }
}
