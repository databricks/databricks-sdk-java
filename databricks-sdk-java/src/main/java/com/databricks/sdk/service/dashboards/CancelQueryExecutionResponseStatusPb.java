// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CancelQueryExecutionResponseStatusPb {
  @JsonProperty("data_token")
  private String dataToken;

  @JsonProperty("pending")
  private Empty pending;

  @JsonProperty("success")
  private Empty success;

  public CancelQueryExecutionResponseStatusPb setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  public CancelQueryExecutionResponseStatusPb setPending(Empty pending) {
    this.pending = pending;
    return this;
  }

  public Empty getPending() {
    return pending;
  }

  public CancelQueryExecutionResponseStatusPb setSuccess(Empty success) {
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
    CancelQueryExecutionResponseStatusPb that = (CancelQueryExecutionResponseStatusPb) o;
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
    return new ToStringer(CancelQueryExecutionResponseStatusPb.class)
        .add("dataToken", dataToken)
        .add("pending", pending)
        .add("success", success)
        .toString();
  }
}
