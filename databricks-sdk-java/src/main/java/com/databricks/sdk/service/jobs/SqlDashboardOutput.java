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
@JsonSerialize(using = SqlDashboardOutput.SqlDashboardOutputSerializer.class)
@JsonDeserialize(using = SqlDashboardOutput.SqlDashboardOutputDeserializer.class)
public class SqlDashboardOutput {
  /** The canonical identifier of the SQL warehouse. */
  private String warehouseId;

  /** Widgets executed in the run. Only SQL query based widgets are listed. */
  private Collection<SqlDashboardWidgetOutput> widgets;

  public SqlDashboardOutput setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  public SqlDashboardOutput setWidgets(Collection<SqlDashboardWidgetOutput> widgets) {
    this.widgets = widgets;
    return this;
  }

  public Collection<SqlDashboardWidgetOutput> getWidgets() {
    return widgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlDashboardOutput that = (SqlDashboardOutput) o;
    return Objects.equals(warehouseId, that.warehouseId) && Objects.equals(widgets, that.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId, widgets);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlDashboardOutput.class)
        .add("warehouseId", warehouseId)
        .add("widgets", widgets)
        .toString();
  }

  SqlDashboardOutputPb toPb() {
    SqlDashboardOutputPb pb = new SqlDashboardOutputPb();
    pb.setWarehouseId(warehouseId);
    pb.setWidgets(widgets);

    return pb;
  }

  static SqlDashboardOutput fromPb(SqlDashboardOutputPb pb) {
    SqlDashboardOutput model = new SqlDashboardOutput();
    model.setWarehouseId(pb.getWarehouseId());
    model.setWidgets(pb.getWidgets());

    return model;
  }

  public static class SqlDashboardOutputSerializer extends JsonSerializer<SqlDashboardOutput> {
    @Override
    public void serialize(SqlDashboardOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlDashboardOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlDashboardOutputDeserializer extends JsonDeserializer<SqlDashboardOutput> {
    @Override
    public SqlDashboardOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlDashboardOutputPb pb = mapper.readValue(p, SqlDashboardOutputPb.class);
      return SqlDashboardOutput.fromPb(pb);
    }
  }
}
