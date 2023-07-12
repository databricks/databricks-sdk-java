// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class SqlQueryOutput {
  /**
   * The link to find the output results.
   */
  @JsonProperty("output_link")
  private String outputLink;
  
  /**
   * The text of the SQL query. Can Run permission of the SQL query is required
   * to view this field.
   */
  @JsonProperty("query_text")
  private String queryText;
  
  /**
   * Information about SQL statements executed in the run.
   */
  @JsonProperty("sql_statements")
  private Collection<SqlStatementOutput> sqlStatements;
  
  /**
   * The canonical identifier of the SQL warehouse.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;
  
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
    return Objects.equals(outputLink, that.outputLink)
    && Objects.equals(queryText, that.queryText)
    && Objects.equals(sqlStatements, that.sqlStatements)
    && Objects.equals(warehouseId, that.warehouseId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputLink, queryText, sqlStatements, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlQueryOutput.class)
      .add("outputLink", outputLink)
      .add("queryText", queryText)
      .add("sqlStatements", sqlStatements)
      .add("warehouseId", warehouseId).toString();
  }
}
