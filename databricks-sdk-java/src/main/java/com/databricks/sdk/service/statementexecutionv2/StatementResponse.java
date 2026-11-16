// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.statementexecutionv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Statement Execution (Lakehouse//RT) is version 2 of the Statement Execution API. It is optimized
 * for Lakehouse//RT warehouses, with lower latency and higher concurrency, and takes `warehouse_id`
 * as a path parameter on every call. It currently supports Lakehouse//RT warehouses only. The
 * Statement Execution API (version 1) works with all SQL warehouse types, including Lakehouse//RT.
 */
@Generated
public class StatementResponse {
  /** The schema and metadata of the result set. Present when `status.state` is `SUCCEEDED`. */
  @JsonProperty("manifest")
  private ResultManifest manifest;

  /** The first chunk of result data. Present when `status.state` is `SUCCEEDED`. */
  @JsonProperty("result")
  private ResultData result;

  /**
   * The statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  @JsonProperty("statement_id")
  private String statementId;

  /** The execution state of the statement and, if it failed, the error details. */
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
