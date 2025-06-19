// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

@Generated
@JsonSerialize(
    using = TableUpdateTriggerConfiguration.TableUpdateTriggerConfigurationSerializer.class)
@JsonDeserialize(
    using = TableUpdateTriggerConfiguration.TableUpdateTriggerConfigurationDeserializer.class)
public class TableUpdateTriggerConfiguration {
  /** The table(s) condition based on which to trigger a job run. */
  private Condition condition;

  /**
   * If set, the trigger starts a run only after the specified amount of time has passed since the
   * last time the trigger fired. The minimum allowed value is 60 seconds.
   */
  private Long minTimeBetweenTriggersSeconds;

  /**
   * A list of Delta tables to monitor for changes. The table name must be in the format
   * `catalog_name.schema_name.table_name`.
   */
  private Collection<String> tableNames;

  /**
   * If set, the trigger starts a run only after no table updates have occurred for the specified
   * time and can be used to wait for a series of table updates before triggering a run. The minimum
   * allowed value is 60 seconds.
   */
  private Long waitAfterLastChangeSeconds;

  public TableUpdateTriggerConfiguration setCondition(Condition condition) {
    this.condition = condition;
    return this;
  }

  public Condition getCondition() {
    return condition;
  }

  public TableUpdateTriggerConfiguration setMinTimeBetweenTriggersSeconds(
      Long minTimeBetweenTriggersSeconds) {
    this.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
    return this;
  }

  public Long getMinTimeBetweenTriggersSeconds() {
    return minTimeBetweenTriggersSeconds;
  }

  public TableUpdateTriggerConfiguration setTableNames(Collection<String> tableNames) {
    this.tableNames = tableNames;
    return this;
  }

  public Collection<String> getTableNames() {
    return tableNames;
  }

  public TableUpdateTriggerConfiguration setWaitAfterLastChangeSeconds(
      Long waitAfterLastChangeSeconds) {
    this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
    return this;
  }

  public Long getWaitAfterLastChangeSeconds() {
    return waitAfterLastChangeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableUpdateTriggerConfiguration that = (TableUpdateTriggerConfiguration) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(minTimeBetweenTriggersSeconds, that.minTimeBetweenTriggersSeconds)
        && Objects.equals(tableNames, that.tableNames)
        && Objects.equals(waitAfterLastChangeSeconds, that.waitAfterLastChangeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        condition, minTimeBetweenTriggersSeconds, tableNames, waitAfterLastChangeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(TableUpdateTriggerConfiguration.class)
        .add("condition", condition)
        .add("minTimeBetweenTriggersSeconds", minTimeBetweenTriggersSeconds)
        .add("tableNames", tableNames)
        .add("waitAfterLastChangeSeconds", waitAfterLastChangeSeconds)
        .toString();
  }

  TableUpdateTriggerConfigurationPb toPb() {
    TableUpdateTriggerConfigurationPb pb = new TableUpdateTriggerConfigurationPb();
    pb.setCondition(condition);
    pb.setMinTimeBetweenTriggersSeconds(minTimeBetweenTriggersSeconds);
    pb.setTableNames(tableNames);
    pb.setWaitAfterLastChangeSeconds(waitAfterLastChangeSeconds);

    return pb;
  }

  static TableUpdateTriggerConfiguration fromPb(TableUpdateTriggerConfigurationPb pb) {
    TableUpdateTriggerConfiguration model = new TableUpdateTriggerConfiguration();
    model.setCondition(pb.getCondition());
    model.setMinTimeBetweenTriggersSeconds(pb.getMinTimeBetweenTriggersSeconds());
    model.setTableNames(pb.getTableNames());
    model.setWaitAfterLastChangeSeconds(pb.getWaitAfterLastChangeSeconds());

    return model;
  }

  public static class TableUpdateTriggerConfigurationSerializer
      extends JsonSerializer<TableUpdateTriggerConfiguration> {
    @Override
    public void serialize(
        TableUpdateTriggerConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TableUpdateTriggerConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TableUpdateTriggerConfigurationDeserializer
      extends JsonDeserializer<TableUpdateTriggerConfiguration> {
    @Override
    public TableUpdateTriggerConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TableUpdateTriggerConfigurationPb pb =
          mapper.readValue(p, TableUpdateTriggerConfigurationPb.class);
      return TableUpdateTriggerConfiguration.fromPb(pb);
    }
  }
}
