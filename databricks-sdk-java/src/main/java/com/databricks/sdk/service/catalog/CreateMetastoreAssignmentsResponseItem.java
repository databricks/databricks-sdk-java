// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateMetastoreAssignmentsResponseItem {
  /** A human-readable message describing the outcome of the creation */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("metastore_assignment")
  private MetastoreAssignment metastoreAssignment;

  /** The returned HTTP status code for an individual creation in the batch */
  @JsonProperty("status_code")
  private Long statusCode;

  public CreateMetastoreAssignmentsResponseItem setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public CreateMetastoreAssignmentsResponseItem setMetastoreAssignment(
      MetastoreAssignment metastoreAssignment) {
    this.metastoreAssignment = metastoreAssignment;
    return this;
  }

  public MetastoreAssignment getMetastoreAssignment() {
    return metastoreAssignment;
  }

  public CreateMetastoreAssignmentsResponseItem setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public Long getStatusCode() {
    return statusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMetastoreAssignmentsResponseItem that = (CreateMetastoreAssignmentsResponseItem) o;
    return Objects.equals(message, that.message)
        && Objects.equals(metastoreAssignment, that.metastoreAssignment)
        && Objects.equals(statusCode, that.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, metastoreAssignment, statusCode);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMetastoreAssignmentsResponseItem.class)
        .add("message", message)
        .add("metastoreAssignment", metastoreAssignment)
        .add("statusCode", statusCode)
        .toString();
  }
}
