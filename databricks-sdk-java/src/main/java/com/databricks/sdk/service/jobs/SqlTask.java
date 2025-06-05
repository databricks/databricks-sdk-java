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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = SqlTask.SqlTaskSerializer.class)
@JsonDeserialize(using = SqlTask.SqlTaskDeserializer.class)
public class SqlTask {
  /** If alert, indicates that this job must refresh a SQL alert. */
  private SqlTaskAlert alert;

  /** If dashboard, indicates that this job must refresh a SQL dashboard. */
  private SqlTaskDashboard dashboard;

  /** If file, indicates that this job runs a SQL file in a remote Git repository. */
  private SqlTaskFile file;

  /**
   * Parameters to be used for each run of this job. The SQL alert task does not support custom
   * parameters.
   */
  private Map<String, String> parameters;

  /** If query, indicates that this job must execute a SQL query. */
  private SqlTaskQuery query;

  /**
   * The canonical identifier of the SQL warehouse. Recommended to use with serverless or pro SQL
   * warehouses. Classic SQL warehouses are only supported for SQL alert, dashboard and query tasks
   * and are limited to scheduled single-task jobs.
   */
  private String warehouseId;

  public SqlTask setAlert(SqlTaskAlert alert) {
    this.alert = alert;
    return this;
  }

  public SqlTaskAlert getAlert() {
    return alert;
  }

  public SqlTask setDashboard(SqlTaskDashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public SqlTaskDashboard getDashboard() {
    return dashboard;
  }

  public SqlTask setFile(SqlTaskFile file) {
    this.file = file;
    return this;
  }

  public SqlTaskFile getFile() {
    return file;
  }

  public SqlTask setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public SqlTask setQuery(SqlTaskQuery query) {
    this.query = query;
    return this;
  }

  public SqlTaskQuery getQuery() {
    return query;
  }

  public SqlTask setWarehouseId(String warehouseId) {
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
    SqlTask that = (SqlTask) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(dashboard, that.dashboard)
        && Objects.equals(file, that.file)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(query, that.query)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, dashboard, file, parameters, query, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTask.class)
        .add("alert", alert)
        .add("dashboard", dashboard)
        .add("file", file)
        .add("parameters", parameters)
        .add("query", query)
        .add("warehouseId", warehouseId)
        .toString();
  }

  SqlTaskPb toPb() {
    SqlTaskPb pb = new SqlTaskPb();
    pb.setAlert(alert);
    pb.setDashboard(dashboard);
    pb.setFile(file);
    pb.setParameters(parameters);
    pb.setQuery(query);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static SqlTask fromPb(SqlTaskPb pb) {
    SqlTask model = new SqlTask();
    model.setAlert(pb.getAlert());
    model.setDashboard(pb.getDashboard());
    model.setFile(pb.getFile());
    model.setParameters(pb.getParameters());
    model.setQuery(pb.getQuery());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class SqlTaskSerializer extends JsonSerializer<SqlTask> {
    @Override
    public void serialize(SqlTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlTaskDeserializer extends JsonDeserializer<SqlTask> {
    @Override
    public SqlTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlTaskPb pb = mapper.readValue(p, SqlTaskPb.class);
      return SqlTask.fromPb(pb);
    }
  }
}
