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
@JsonSerialize(using = SqlOutput.SqlOutputSerializer.class)
@JsonDeserialize(using = SqlOutput.SqlOutputDeserializer.class)
public class SqlOutput {
  /** The output of a SQL alert task, if available. */
  private SqlAlertOutput alertOutput;

  /** The output of a SQL dashboard task, if available. */
  private SqlDashboardOutput dashboardOutput;

  /** The output of a SQL query task, if available. */
  private SqlQueryOutput queryOutput;

  public SqlOutput setAlertOutput(SqlAlertOutput alertOutput) {
    this.alertOutput = alertOutput;
    return this;
  }

  public SqlAlertOutput getAlertOutput() {
    return alertOutput;
  }

  public SqlOutput setDashboardOutput(SqlDashboardOutput dashboardOutput) {
    this.dashboardOutput = dashboardOutput;
    return this;
  }

  public SqlDashboardOutput getDashboardOutput() {
    return dashboardOutput;
  }

  public SqlOutput setQueryOutput(SqlQueryOutput queryOutput) {
    this.queryOutput = queryOutput;
    return this;
  }

  public SqlQueryOutput getQueryOutput() {
    return queryOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlOutput that = (SqlOutput) o;
    return Objects.equals(alertOutput, that.alertOutput)
        && Objects.equals(dashboardOutput, that.dashboardOutput)
        && Objects.equals(queryOutput, that.queryOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertOutput, dashboardOutput, queryOutput);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlOutput.class)
        .add("alertOutput", alertOutput)
        .add("dashboardOutput", dashboardOutput)
        .add("queryOutput", queryOutput)
        .toString();
  }

  SqlOutputPb toPb() {
    SqlOutputPb pb = new SqlOutputPb();
    pb.setAlertOutput(alertOutput);
    pb.setDashboardOutput(dashboardOutput);
    pb.setQueryOutput(queryOutput);

    return pb;
  }

  static SqlOutput fromPb(SqlOutputPb pb) {
    SqlOutput model = new SqlOutput();
    model.setAlertOutput(pb.getAlertOutput());
    model.setDashboardOutput(pb.getDashboardOutput());
    model.setQueryOutput(pb.getQueryOutput());

    return model;
  }

  public static class SqlOutputSerializer extends JsonSerializer<SqlOutput> {
    @Override
    public void serialize(SqlOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlOutputDeserializer extends JsonDeserializer<SqlOutput> {
    @Override
    public SqlOutput deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlOutputPb pb = mapper.readValue(p, SqlOutputPb.class);
      return SqlOutput.fromPb(pb);
    }
  }
}
