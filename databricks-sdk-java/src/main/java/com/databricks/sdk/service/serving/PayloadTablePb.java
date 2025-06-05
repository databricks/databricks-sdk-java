// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PayloadTablePb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private String status;

  @JsonProperty("status_message")
  private String statusMessage;

  public PayloadTablePb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PayloadTablePb setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getStatus() {
    return status;
  }

  public PayloadTablePb setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PayloadTablePb that = (PayloadTablePb) o;
    return Objects.equals(name, that.name)
        && Objects.equals(status, that.status)
        && Objects.equals(statusMessage, that.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, statusMessage);
  }

  @Override
  public String toString() {
    return new ToStringer(PayloadTablePb.class)
        .add("name", name)
        .add("status", status)
        .add("statusMessage", statusMessage)
        .toString();
  }
}
