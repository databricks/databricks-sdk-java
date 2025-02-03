// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CancelQueryExecutionResponseStatus {
  /**
   * The token to poll for result asynchronously Example:
   * EC0A..ChAB7WCEn_4Qo4vkLqEbXsxxEgh3Y2pbWw45WhoQXgZSQo9aS5q2ZvFcbvbx9CgA-PAEAQ
   */
  @JsonProperty("data_token")
  private String dataToken;

  /**
   * Represents an empty message, similar to google.protobuf.Empty, which is not available in the
   * firm right now.
   */
  @JsonProperty("pending")
  private Empty pending;

  /**
   * Represents an empty message, similar to google.protobuf.Empty, which is not available in the
   * firm right now.
   */
  @JsonProperty("success")
  private Empty success;

  public CancelQueryExecutionResponseStatus setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  public CancelQueryExecutionResponseStatus setPending(Empty pending) {
    this.pending = pending;
    return this;
  }

  public Empty getPending() {
    return pending;
  }

  public CancelQueryExecutionResponseStatus setSuccess(Empty success) {
    this.success = success;
    return this;
  }

  public Empty getSuccess() {
    return success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelQueryExecutionResponseStatus that = (CancelQueryExecutionResponseStatus) o;
    return Objects.equals(dataToken, that.dataToken)
        && Objects.equals(pending, that.pending)
        && Objects.equals(success, that.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToken, pending, success);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelQueryExecutionResponseStatus.class)
        .add("dataToken", dataToken)
        .add("pending", pending)
        .add("success", success)
        .toString();
  }
}
