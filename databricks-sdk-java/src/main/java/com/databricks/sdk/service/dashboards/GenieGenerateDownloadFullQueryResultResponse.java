// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieGenerateDownloadFullQueryResultResponse {
  /** Error message if Genie failed to download the result */
  @JsonProperty("error")
  private String error;

  /** Download result status */
  @JsonProperty("status")
  private MessageStatus status;

  /**
   * Transient Statement ID. Use this ID to track the download request in subsequent polling calls
   */
  @JsonProperty("transient_statement_id")
  private String transientStatementId;

  public GenieGenerateDownloadFullQueryResultResponse setError(String error) {
    this.error = error;
    return this;
  }

  public String getError() {
    return error;
  }

  public GenieGenerateDownloadFullQueryResultResponse setStatus(MessageStatus status) {
    this.status = status;
    return this;
  }

  public MessageStatus getStatus() {
    return status;
  }

  public GenieGenerateDownloadFullQueryResultResponse setTransientStatementId(
      String transientStatementId) {
    this.transientStatementId = transientStatementId;
    return this;
  }

  public String getTransientStatementId() {
    return transientStatementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieGenerateDownloadFullQueryResultResponse that =
        (GenieGenerateDownloadFullQueryResultResponse) o;
    return Objects.equals(error, that.error)
        && Objects.equals(status, that.status)
        && Objects.equals(transientStatementId, that.transientStatementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, status, transientStatementId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGenerateDownloadFullQueryResultResponse.class)
        .add("error", error)
        .add("status", status)
        .add("transientStatementId", transientStatementId)
        .toString();
  }
}
