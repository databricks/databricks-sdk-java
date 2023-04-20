// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ValidationResult {
  /** Error message would exist when the result does not equal to **PASS**. */
  @JsonProperty("message")
  private String message;

  /** The operation tested. */
  @JsonProperty("operation")
  private ValidationResultOperation operation;

  /** The results of the tested operation. */
  @JsonProperty("result")
  private ValidationResultResult result;

  public ValidationResult setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ValidationResult setOperation(ValidationResultOperation operation) {
    this.operation = operation;
    return this;
  }

  public ValidationResultOperation getOperation() {
    return operation;
  }

  public ValidationResult setResult(ValidationResultResult result) {
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
    ValidationResult that = (ValidationResult) o;
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
    return new ToStringer(ValidationResult.class)
        .add("message", message)
        .add("operation", operation)
        .add("result", result)
        .toString();
  }
}
