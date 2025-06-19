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
@JsonSerialize(using = SqlDashboardWidgetOutput.SqlDashboardWidgetOutputSerializer.class)
@JsonDeserialize(using = SqlDashboardWidgetOutput.SqlDashboardWidgetOutputDeserializer.class)
public class SqlDashboardWidgetOutput {
  /** Time (in epoch milliseconds) when execution of the SQL widget ends. */
  private Long endTime;

  /** The information about the error when execution fails. */
  private SqlOutputError error;

  /** The link to find the output results. */
  private String outputLink;

  /** Time (in epoch milliseconds) when execution of the SQL widget starts. */
  private Long startTime;

  /** The execution status of the SQL widget. */
  private SqlDashboardWidgetOutputStatus status;

  /** The canonical identifier of the SQL widget. */
  private String widgetId;

  /** The title of the SQL widget. */
  private String widgetTitle;

  public SqlDashboardWidgetOutput setEndTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  public Long getEndTime() {
    return endTime;
  }

  public SqlDashboardWidgetOutput setError(SqlOutputError error) {
    this.error = error;
    return this;
  }

  public SqlOutputError getError() {
    return error;
  }

  public SqlDashboardWidgetOutput setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  public String getOutputLink() {
    return outputLink;
  }

  public SqlDashboardWidgetOutput setStartTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  public Long getStartTime() {
    return startTime;
  }

  public SqlDashboardWidgetOutput setStatus(SqlDashboardWidgetOutputStatus status) {
    this.status = status;
    return this;
  }

  public SqlDashboardWidgetOutputStatus getStatus() {
    return status;
  }

  public SqlDashboardWidgetOutput setWidgetId(String widgetId) {
    this.widgetId = widgetId;
    return this;
  }

  public String getWidgetId() {
    return widgetId;
  }

  public SqlDashboardWidgetOutput setWidgetTitle(String widgetTitle) {
    this.widgetTitle = widgetTitle;
    return this;
  }

  public String getWidgetTitle() {
    return widgetTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlDashboardWidgetOutput that = (SqlDashboardWidgetOutput) o;
    return Objects.equals(endTime, that.endTime)
        && Objects.equals(error, that.error)
        && Objects.equals(outputLink, that.outputLink)
        && Objects.equals(startTime, that.startTime)
        && Objects.equals(status, that.status)
        && Objects.equals(widgetId, that.widgetId)
        && Objects.equals(widgetTitle, that.widgetTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, error, outputLink, startTime, status, widgetId, widgetTitle);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlDashboardWidgetOutput.class)
        .add("endTime", endTime)
        .add("error", error)
        .add("outputLink", outputLink)
        .add("startTime", startTime)
        .add("status", status)
        .add("widgetId", widgetId)
        .add("widgetTitle", widgetTitle)
        .toString();
  }

  SqlDashboardWidgetOutputPb toPb() {
    SqlDashboardWidgetOutputPb pb = new SqlDashboardWidgetOutputPb();
    pb.setEndTime(endTime);
    pb.setError(error);
    pb.setOutputLink(outputLink);
    pb.setStartTime(startTime);
    pb.setStatus(status);
    pb.setWidgetId(widgetId);
    pb.setWidgetTitle(widgetTitle);

    return pb;
  }

  static SqlDashboardWidgetOutput fromPb(SqlDashboardWidgetOutputPb pb) {
    SqlDashboardWidgetOutput model = new SqlDashboardWidgetOutput();
    model.setEndTime(pb.getEndTime());
    model.setError(pb.getError());
    model.setOutputLink(pb.getOutputLink());
    model.setStartTime(pb.getStartTime());
    model.setStatus(pb.getStatus());
    model.setWidgetId(pb.getWidgetId());
    model.setWidgetTitle(pb.getWidgetTitle());

    return model;
  }

  public static class SqlDashboardWidgetOutputSerializer
      extends JsonSerializer<SqlDashboardWidgetOutput> {
    @Override
    public void serialize(
        SqlDashboardWidgetOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlDashboardWidgetOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlDashboardWidgetOutputDeserializer
      extends JsonDeserializer<SqlDashboardWidgetOutput> {
    @Override
    public SqlDashboardWidgetOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlDashboardWidgetOutputPb pb = mapper.readValue(p, SqlDashboardWidgetOutputPb.class);
      return SqlDashboardWidgetOutput.fromPb(pb);
    }
  }
}
