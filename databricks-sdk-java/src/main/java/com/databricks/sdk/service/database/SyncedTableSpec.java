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

/** Specification of a synced database table. */
@Generated
@JsonSerialize(using = SyncedTableSpec.SyncedTableSpecSerializer.class)
@JsonDeserialize(using = SyncedTableSpec.SyncedTableSpecDeserializer.class)
public class SyncedTableSpec {
  /**
   * If true, the synced table's logical database and schema resources in PG will be created if they
   * do not already exist.
   */
  private Boolean createDatabaseObjectsIfMissing;

  /** Spec of new pipeline. Should be empty if pipeline_id is set */
  private NewPipelineSpec newPipelineSpec;

  /** ID of the associated pipeline. Should be empty if new_pipeline_spec is set */
  private String pipelineId;

  /** Primary Key columns to be used for data insert/update in the destination. */
  private Collection<String> primaryKeyColumns;

  /** Scheduling policy of the underlying pipeline. */
  private SyncedTableSchedulingPolicy schedulingPolicy;

  /** Three-part (catalog, schema, table) name of the source Delta table. */
  private String sourceTableFullName;

  /** Time series key to deduplicate (tie-break) rows with the same primary key. */
  private String timeseriesKey;

  public SyncedTableSpec setCreateDatabaseObjectsIfMissing(Boolean createDatabaseObjectsIfMissing) {
    this.createDatabaseObjectsIfMissing = createDatabaseObjectsIfMissing;
    return this;
  }

  public Boolean getCreateDatabaseObjectsIfMissing() {
    return createDatabaseObjectsIfMissing;
  }

  public SyncedTableSpec setNewPipelineSpec(NewPipelineSpec newPipelineSpec) {
    this.newPipelineSpec = newPipelineSpec;
    return this;
  }

  public NewPipelineSpec getNewPipelineSpec() {
    return newPipelineSpec;
  }

  public SyncedTableSpec setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public SyncedTableSpec setPrimaryKeyColumns(Collection<String> primaryKeyColumns) {
    this.primaryKeyColumns = primaryKeyColumns;
    return this;
  }

  public Collection<String> getPrimaryKeyColumns() {
    return primaryKeyColumns;
  }

  public SyncedTableSpec setSchedulingPolicy(SyncedTableSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
    return this;
  }

  public SyncedTableSchedulingPolicy getSchedulingPolicy() {
    return schedulingPolicy;
  }

  public SyncedTableSpec setSourceTableFullName(String sourceTableFullName) {
    this.sourceTableFullName = sourceTableFullName;
    return this;
  }

  public String getSourceTableFullName() {
    return sourceTableFullName;
  }

  public SyncedTableSpec setTimeseriesKey(String timeseriesKey) {
    this.timeseriesKey = timeseriesKey;
    return this;
  }

  public String getTimeseriesKey() {
    return timeseriesKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncedTableSpec that = (SyncedTableSpec) o;
    return Objects.equals(createDatabaseObjectsIfMissing, that.createDatabaseObjectsIfMissing)
        && Objects.equals(newPipelineSpec, that.newPipelineSpec)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(primaryKeyColumns, that.primaryKeyColumns)
        && Objects.equals(schedulingPolicy, that.schedulingPolicy)
        && Objects.equals(sourceTableFullName, that.sourceTableFullName)
        && Objects.equals(timeseriesKey, that.timeseriesKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createDatabaseObjectsIfMissing,
        newPipelineSpec,
        pipelineId,
        primaryKeyColumns,
        schedulingPolicy,
        sourceTableFullName,
        timeseriesKey);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncedTableSpec.class)
        .add("createDatabaseObjectsIfMissing", createDatabaseObjectsIfMissing)
        .add("newPipelineSpec", newPipelineSpec)
        .add("pipelineId", pipelineId)
        .add("primaryKeyColumns", primaryKeyColumns)
        .add("schedulingPolicy", schedulingPolicy)
        .add("sourceTableFullName", sourceTableFullName)
        .add("timeseriesKey", timeseriesKey)
        .toString();
  }

  SyncedTableSpecPb toPb() {
    SyncedTableSpecPb pb = new SyncedTableSpecPb();
    pb.setCreateDatabaseObjectsIfMissing(createDatabaseObjectsIfMissing);
    pb.setNewPipelineSpec(newPipelineSpec);
    pb.setPipelineId(pipelineId);
    pb.setPrimaryKeyColumns(primaryKeyColumns);
    pb.setSchedulingPolicy(schedulingPolicy);
    pb.setSourceTableFullName(sourceTableFullName);
    pb.setTimeseriesKey(timeseriesKey);

    return pb;
  }

  static SyncedTableSpec fromPb(SyncedTableSpecPb pb) {
    SyncedTableSpec model = new SyncedTableSpec();
    model.setCreateDatabaseObjectsIfMissing(pb.getCreateDatabaseObjectsIfMissing());
    model.setNewPipelineSpec(pb.getNewPipelineSpec());
    model.setPipelineId(pb.getPipelineId());
    model.setPrimaryKeyColumns(pb.getPrimaryKeyColumns());
    model.setSchedulingPolicy(pb.getSchedulingPolicy());
    model.setSourceTableFullName(pb.getSourceTableFullName());
    model.setTimeseriesKey(pb.getTimeseriesKey());

    return model;
  }

  public static class SyncedTableSpecSerializer extends JsonSerializer<SyncedTableSpec> {
    @Override
    public void serialize(SyncedTableSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SyncedTableSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SyncedTableSpecDeserializer extends JsonDeserializer<SyncedTableSpec> {
    @Override
    public SyncedTableSpec deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SyncedTableSpecPb pb = mapper.readValue(p, SyncedTableSpecPb.class);
      return SyncedTableSpec.fromPb(pb);
    }
  }
}
