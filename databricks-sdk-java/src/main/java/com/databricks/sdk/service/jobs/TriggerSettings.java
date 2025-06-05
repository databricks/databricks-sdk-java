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
import java.util.Objects;

@Generated
@JsonSerialize(using = TriggerSettings.TriggerSettingsSerializer.class)
@JsonDeserialize(using = TriggerSettings.TriggerSettingsDeserializer.class)
public class TriggerSettings {
  /** File arrival trigger settings. */
  private FileArrivalTriggerConfiguration fileArrival;

  /** Whether this trigger is paused or not. */
  private PauseStatus pauseStatus;

  /** Periodic trigger settings. */
  private PeriodicTriggerConfiguration periodic;

  /** Old table trigger settings name. Deprecated in favor of `table_update`. */
  private TableUpdateTriggerConfiguration table;

  /** */
  private TableUpdateTriggerConfiguration tableUpdate;

  public TriggerSettings setFileArrival(FileArrivalTriggerConfiguration fileArrival) {
    this.fileArrival = fileArrival;
    return this;
  }

  public FileArrivalTriggerConfiguration getFileArrival() {
    return fileArrival;
  }

  public TriggerSettings setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public TriggerSettings setPeriodic(PeriodicTriggerConfiguration periodic) {
    this.periodic = periodic;
    return this;
  }

  public PeriodicTriggerConfiguration getPeriodic() {
    return periodic;
  }

  public TriggerSettings setTable(TableUpdateTriggerConfiguration table) {
    this.table = table;
    return this;
  }

  public TableUpdateTriggerConfiguration getTable() {
    return table;
  }

  public TriggerSettings setTableUpdate(TableUpdateTriggerConfiguration tableUpdate) {
    this.tableUpdate = tableUpdate;
    return this;
  }

  public TableUpdateTriggerConfiguration getTableUpdate() {
    return tableUpdate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerSettings that = (TriggerSettings) o;
    return Objects.equals(fileArrival, that.fileArrival)
        && Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(periodic, that.periodic)
        && Objects.equals(table, that.table)
        && Objects.equals(tableUpdate, that.tableUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileArrival, pauseStatus, periodic, table, tableUpdate);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerSettings.class)
        .add("fileArrival", fileArrival)
        .add("pauseStatus", pauseStatus)
        .add("periodic", periodic)
        .add("table", table)
        .add("tableUpdate", tableUpdate)
        .toString();
  }

  TriggerSettingsPb toPb() {
    TriggerSettingsPb pb = new TriggerSettingsPb();
    pb.setFileArrival(fileArrival);
    pb.setPauseStatus(pauseStatus);
    pb.setPeriodic(periodic);
    pb.setTable(table);
    pb.setTableUpdate(tableUpdate);

    return pb;
  }

  static TriggerSettings fromPb(TriggerSettingsPb pb) {
    TriggerSettings model = new TriggerSettings();
    model.setFileArrival(pb.getFileArrival());
    model.setPauseStatus(pb.getPauseStatus());
    model.setPeriodic(pb.getPeriodic());
    model.setTable(pb.getTable());
    model.setTableUpdate(pb.getTableUpdate());

    return model;
  }

  public static class TriggerSettingsSerializer extends JsonSerializer<TriggerSettings> {
    @Override
    public void serialize(TriggerSettings value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TriggerSettingsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TriggerSettingsDeserializer extends JsonDeserializer<TriggerSettings> {
    @Override
    public TriggerSettings deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TriggerSettingsPb pb = mapper.readValue(p, TriggerSettingsPb.class);
      return TriggerSettings.fromPb(pb);
    }
  }
}
