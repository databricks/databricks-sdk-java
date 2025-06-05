// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ValidationResultPb {
  @JsonProperty("message")
  private String message;

  @JsonProperty("operation")
  private ValidationResultOperation operation;

  @JsonProperty("result")
  private ValidationResultResult result;

  public ValidationResultPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ValidationResultPb setOperation(ValidationResultOperation operation) {
    this.operation = operation;
    return this;
  }

  public ValidationResultOperation getOperation() {
    return operation;
  }

  public ValidationResultPb setResult(ValidationResultResult result) {
    this.result = result;
    return this;
  }

  public ValidationResultResult getResult() {
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationResultPb that = (ValidationResultPb) o;
    return Objects.equals(message, that.message)
        && Objects.equals(operation, that.operation)
        && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, operation, result);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidationResultPb.class)
        .add("message", message)
        .add("operation", operation)
        .add("result", result)
        .toString();
  }
}
