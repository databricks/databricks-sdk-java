// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class StatementResponse {
  /** The result manifest provides schema and metadata for the result set. */
  @JsonProperty("manifest")
  private ResultManifest manifest;

  /** */
  @JsonProperty("result")
  private ResultData result;

  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  @JsonProperty("statement_id")
  private String statementId;

  /** The status response includes execution state and if relevant, error information. */
  @JsonProperty("status")
  private StatementStatus status;

  public StatementResponse setManifest(ResultManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  public ResultManifest getManifest() {
    return manifest;
  }

  public StatementResponse setResult(ResultData result) {
    this.result = result;
    return this;
  }

  public ResultData getResult() {
    return result;
  }

  public StatementResponse setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public String getStatementId() {
    return statementId;
  }

  public StatementResponse setStatus(StatementStatus status) {
    this.status = status;
    return this;
  }

  public StatementStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StatementResponse that = (StatementResponse) o;
    return Objects.equals(manifest, that.manifest)
        && Objects.equals(result, that.result)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest, result, statementId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(StatementResponse.class)
        .add("manifest", manifest)
        .add("result", result)
        .add("statementId", statementId)
        .add("status", status)
        .toString();
  }
}
