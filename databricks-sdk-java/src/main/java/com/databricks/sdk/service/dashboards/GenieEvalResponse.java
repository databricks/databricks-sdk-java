// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieEvalResponse {
  /** The response content (either text or SQL query). */
  @JsonProperty("response")
  private String response;

  /** Type of response */
  @JsonProperty("response_type")
  private GenieEvalResponseType responseType;

  /** SQL Statement Execution response. */
  @JsonProperty("sql_execution_result")
  private com.databricks.sdk.service.sql.StatementResponse sqlExecutionResult;

  public GenieEvalResponse setResponse(String response) {
    this.response = response;
    return this;
  }

  public String getResponse() {
    return response;
  }

  public GenieEvalResponse setResponseType(GenieEvalResponseType responseType) {
    this.responseType = responseType;
    return this;
  }

  public GenieEvalResponseType getResponseType() {
    return responseType;
  }

  public GenieEvalResponse setSqlExecutionResult(
      com.databricks.sdk.service.sql.StatementResponse sqlExecutionResult) {
    this.sqlExecutionResult = sqlExecutionResult;
    return this;
  }

  public com.databricks.sdk.service.sql.StatementResponse getSqlExecutionResult() {
    return sqlExecutionResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieEvalResponse that = (GenieEvalResponse) o;
    return Objects.equals(response, that.response)
        && Objects.equals(responseType, that.responseType)
        && Objects.equals(sqlExecutionResult, that.sqlExecutionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, responseType, sqlExecutionResult);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieEvalResponse.class)
        .add("response", response)
        .add("responseType", responseType)
        .add("sqlExecutionResult", sqlExecutionResult)
        .toString();
  }
}
