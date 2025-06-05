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
@JsonSerialize(using = PowerBiTask.PowerBiTaskSerializer.class)
@JsonDeserialize(using = PowerBiTask.PowerBiTaskDeserializer.class)
public class PowerBiTask {
  /** The resource name of the UC connection to authenticate from Databricks to Power BI */
  private String connectionResourceName;

  /** The semantic model to update */
  private PowerBiModel powerBiModel;

  /** Whether the model should be refreshed after the update */
  private Boolean refreshAfterUpdate;

  /** The tables to be exported to Power BI */
  private Collection<PowerBiTable> tables;

  /** The SQL warehouse ID to use as the Power BI data source */
  private String warehouseId;

  public PowerBiTask setConnectionResourceName(String connectionResourceName) {
    this.connectionResourceName = connectionResourceName;
    return this;
  }

  public String getConnectionResourceName() {
    return connectionResourceName;
  }

  public PowerBiTask setPowerBiModel(PowerBiModel powerBiModel) {
    this.powerBiModel = powerBiModel;
    return this;
  }

  public PowerBiModel getPowerBiModel() {
    return powerBiModel;
  }

  public PowerBiTask setRefreshAfterUpdate(Boolean refreshAfterUpdate) {
    this.refreshAfterUpdate = refreshAfterUpdate;
    return this;
  }

  public Boolean getRefreshAfterUpdate() {
    return refreshAfterUpdate;
  }

  public PowerBiTask setTables(Collection<PowerBiTable> tables) {
    this.tables = tables;
    return this;
  }

  public Collection<PowerBiTable> getTables() {
    return tables;
  }

  public PowerBiTask setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PowerBiTask that = (PowerBiTask) o;
    return Objects.equals(connectionResourceName, that.connectionResourceName)
        && Objects.equals(powerBiModel, that.powerBiModel)
        && Objects.equals(refreshAfterUpdate, that.refreshAfterUpdate)
        && Objects.equals(tables, that.tables)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectionResourceName, powerBiModel, refreshAfterUpdate, tables, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(PowerBiTask.class)
        .add("connectionResourceName", connectionResourceName)
        .add("powerBiModel", powerBiModel)
        .add("refreshAfterUpdate", refreshAfterUpdate)
        .add("tables", tables)
        .add("warehouseId", warehouseId)
        .toString();
  }

  PowerBiTaskPb toPb() {
    PowerBiTaskPb pb = new PowerBiTaskPb();
    pb.setConnectionResourceName(connectionResourceName);
    pb.setPowerBiModel(powerBiModel);
    pb.setRefreshAfterUpdate(refreshAfterUpdate);
    pb.setTables(tables);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static PowerBiTask fromPb(PowerBiTaskPb pb) {
    PowerBiTask model = new PowerBiTask();
    model.setConnectionResourceName(pb.getConnectionResourceName());
    model.setPowerBiModel(pb.getPowerBiModel());
    model.setRefreshAfterUpdate(pb.getRefreshAfterUpdate());
    model.setTables(pb.getTables());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class PowerBiTaskSerializer extends JsonSerializer<PowerBiTask> {
    @Override
    public void serialize(PowerBiTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PowerBiTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PowerBiTaskDeserializer extends JsonDeserializer<PowerBiTask> {
    @Override
    public PowerBiTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PowerBiTaskPb pb = mapper.readValue(p, PowerBiTaskPb.class);
      return PowerBiTask.fromPb(pb);
    }
  }
}
