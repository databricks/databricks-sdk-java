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
@JsonSerialize(using = SqlAlertOutput.SqlAlertOutputSerializer.class)
@JsonDeserialize(using = SqlAlertOutput.SqlAlertOutputDeserializer.class)
public class SqlAlertOutput {
  /**
   * The state of the SQL alert.
   *
   * <p>* UNKNOWN: alert yet to be evaluated * OK: alert evaluated and did not fulfill trigger
   * conditions * TRIGGERED: alert evaluated and fulfilled trigger conditions
   */
  private SqlAlertState alertState;

  /** The link to find the output results. */
  private String outputLink;

  /**
   * The text of the SQL query. Can Run permission of the SQL query associated with the SQL alert is
   * required to view this field.
   */
  private String queryText;

  /** Information about SQL statements executed in the run. */
  private Collection<SqlStatementOutput> sqlStatements;

  /** The canonical identifier of the SQL warehouse. */
  private String warehouseId;

  public SqlAlertOutput setAlertState(SqlAlertState alertState) {
    this.alertState = alertState;
    return this;
  }

  public SqlAlertState getAlertState() {
    return alertState;
  }

  public SqlAlertOutput setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  public String getOutputLink() {
    return outputLink;
  }

  public SqlAlertOutput setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public SqlAlertOutput setSqlStatements(Collection<SqlStatementOutput> sqlStatements) {
    this.sqlStatements = sqlStatements;
    return this;
  }

  public Collection<SqlStatementOutput> getSqlStatements() {
    return sqlStatements;
  }

  public SqlAlertOutput setWarehouseId(String warehouseId) {
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
    SqlAlertOutput that = (SqlAlertOutput) o;
    return Objects.equals(alertState, that.alertState)
        && Objects.equals(outputLink, that.outputLink)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(sqlStatements, that.sqlStatements)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertState, outputLink, queryText, sqlStatements, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlAlertOutput.class)
        .add("alertState", alertState)
        .add("outputLink", outputLink)
        .add("queryText", queryText)
        .add("sqlStatements", sqlStatements)
        .add("warehouseId", warehouseId)
        .toString();
  }

  SqlAlertOutputPb toPb() {
    SqlAlertOutputPb pb = new SqlAlertOutputPb();
    pb.setAlertState(alertState);
    pb.setOutputLink(outputLink);
    pb.setQueryText(queryText);
    pb.setSqlStatements(sqlStatements);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static SqlAlertOutput fromPb(SqlAlertOutputPb pb) {
    SqlAlertOutput model = new SqlAlertOutput();
    model.setAlertState(pb.getAlertState());
    model.setOutputLink(pb.getOutputLink());
    model.setQueryText(pb.getQueryText());
    model.setSqlStatements(pb.getSqlStatements());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class SqlAlertOutputSerializer extends JsonSerializer<SqlAlertOutput> {
    @Override
    public void serialize(SqlAlertOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlAlertOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlAlertOutputDeserializer extends JsonDeserializer<SqlAlertOutput> {
    @Override
    public SqlAlertOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlAlertOutputPb pb = mapper.readValue(p, SqlAlertOutputPb.class);
      return SqlAlertOutput.fromPb(pb);
    }
  }
}
