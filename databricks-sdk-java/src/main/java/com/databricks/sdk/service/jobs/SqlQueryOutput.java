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
@JsonSerialize(using = SqlQueryOutput.SqlQueryOutputSerializer.class)
@JsonDeserialize(using = SqlQueryOutput.SqlQueryOutputDeserializer.class)
public class SqlQueryOutput {
  /** */
  private String endpointId;

  /** The link to find the output results. */
  private String outputLink;

  /**
   * The text of the SQL query. Can Run permission of the SQL query is required to view this field.
   */
  private String queryText;

  /** Information about SQL statements executed in the run. */
  private Collection<SqlStatementOutput> sqlStatements;

  /** The canonical identifier of the SQL warehouse. */
  private String warehouseId;

  public SqlQueryOutput setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public SqlQueryOutput setOutputLink(String outputLink) {
    this.outputLink = outputLink;
    return this;
  }

  public String getOutputLink() {
    return outputLink;
  }

  public SqlQueryOutput setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public SqlQueryOutput setSqlStatements(Collection<SqlStatementOutput> sqlStatements) {
    this.sqlStatements = sqlStatements;
    return this;
  }

  public Collection<SqlStatementOutput> getSqlStatements() {
    return sqlStatements;
  }

  public SqlQueryOutput setWarehouseId(String warehouseId) {
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
    SqlQueryOutput that = (SqlQueryOutput) o;
    return Objects.equals(endpointId, that.endpointId)
        && Objects.equals(outputLink, that.outputLink)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(sqlStatements, that.sqlStatements)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, outputLink, queryText, sqlStatements, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlQueryOutput.class)
        .add("endpointId", endpointId)
        .add("outputLink", outputLink)
        .add("queryText", queryText)
        .add("sqlStatements", sqlStatements)
        .add("warehouseId", warehouseId)
        .toString();
  }

  SqlQueryOutputPb toPb() {
    SqlQueryOutputPb pb = new SqlQueryOutputPb();
    pb.setEndpointId(endpointId);
    pb.setOutputLink(outputLink);
    pb.setQueryText(queryText);
    pb.setSqlStatements(sqlStatements);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static SqlQueryOutput fromPb(SqlQueryOutputPb pb) {
    SqlQueryOutput model = new SqlQueryOutput();
    model.setEndpointId(pb.getEndpointId());
    model.setOutputLink(pb.getOutputLink());
    model.setQueryText(pb.getQueryText());
    model.setSqlStatements(pb.getSqlStatements());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class SqlQueryOutputSerializer extends JsonSerializer<SqlQueryOutput> {
    @Override
    public void serialize(SqlQueryOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlQueryOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlQueryOutputDeserializer extends JsonDeserializer<SqlQueryOutput> {
    @Override
    public SqlQueryOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlQueryOutputPb pb = mapper.readValue(p, SqlQueryOutputPb.class);
      return SqlQueryOutput.fromPb(pb);
    }
  }
}
