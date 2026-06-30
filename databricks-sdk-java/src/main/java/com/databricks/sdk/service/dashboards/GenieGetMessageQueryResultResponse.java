// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieGetMessageQueryResultResponse {
  /**
   * SQL Statement Execution response. See [Get status, manifest, and result first
   * chunk](:method:statementexecution/getstatement) for more details.
   */
  @JsonProperty("statement_response")
  private com.databricks.sdk.service.sql.StatementResponse statementResponse;

  public GenieGetMessageQueryResultResponse setStatementResponse(
      com.databricks.sdk.service.sql.StatementResponse statementResponse) {
    this.statementResponse = statementResponse;
    return this;
  }

  public com.databricks.sdk.service.sql.StatementResponse getStatementResponse() {
    return statementResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGetMessageQueryResultResponse that = (GenieGetMessageQueryResultResponse) o;
    return Objects.equals(statementResponse, that.statementResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementResponse);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetMessageQueryResultResponse.class)
        .add("statementResponse", statementResponse)
        .toString();
  }
}
