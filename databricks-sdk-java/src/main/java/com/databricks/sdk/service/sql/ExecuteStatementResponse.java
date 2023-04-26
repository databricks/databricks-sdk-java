// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ExecuteStatementResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExecuteStatementResponse {
  /** The result manifest provides schema and metadata for the result set. */
  @JsonProperty("manifest")
  private ResultManifest manifest;

  /**
   * Result data chunks are delivered in either the `chunk` field when using `INLINE` disposition,
   * or in the `external_link` field when using `EXTERNAL_LINKS` disposition. Exactly one of these
   * will be set.
   */
  @JsonProperty("result")
  private ResultData result;

  /**
   * Statement ID is returned upon successfully submitting a SQL statement, and is a required
   * reference for all subsequent calls.
   */
  @JsonProperty("statement_id")
  private String statementId;

  /** Status response includes execution state and if relevant, error information. */
  @JsonProperty("status")
  private StatementStatus status;

  /**
   * <p>Setter for the field <code>manifest</code>.</p>
   *
   * @param manifest a {@link com.databricks.sdk.service.sql.ResultManifest} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementResponse} object
   */
  public ExecuteStatementResponse setManifest(ResultManifest manifest) {
    this.manifest = manifest;
    return this;
  }

  /**
   * <p>Getter for the field <code>manifest</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ResultManifest} object
   */
  public ResultManifest getManifest() {
    return manifest;
  }

  /**
   * <p>Setter for the field <code>result</code>.</p>
   *
   * @param result a {@link com.databricks.sdk.service.sql.ResultData} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementResponse} object
   */
  public ExecuteStatementResponse setResult(ResultData result) {
    this.result = result;
    return this;
  }

  /**
   * <p>Getter for the field <code>result</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ResultData} object
   */
  public ResultData getResult() {
    return result;
  }

  /**
   * <p>Setter for the field <code>statementId</code>.</p>
   *
   * @param statementId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementResponse} object
   */
  public ExecuteStatementResponse setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * <p>Getter for the field <code>statementId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStatementId() {
    return statementId;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.sql.StatementStatus} object
   * @return a {@link com.databricks.sdk.service.sql.ExecuteStatementResponse} object
   */
  public ExecuteStatementResponse setStatus(StatementStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.StatementStatus} object
   */
  public StatementStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExecuteStatementResponse that = (ExecuteStatementResponse) o;
    return Objects.equals(manifest, that.manifest)
        && Objects.equals(result, that.result)
        && Objects.equals(statementId, that.statementId)
        && Objects.equals(status, that.status);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(manifest, result, statementId, status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExecuteStatementResponse.class)
        .add("manifest", manifest)
        .add("result", result)
        .add("statementId", statementId)
        .add("status", status)
        .toString();
  }
}
