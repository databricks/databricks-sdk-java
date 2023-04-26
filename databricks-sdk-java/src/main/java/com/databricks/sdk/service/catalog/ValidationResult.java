// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ValidationResult class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidationResult} object
   */
  public ValidationResult setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * <p>Setter for the field <code>operation</code>.</p>
   *
   * @param operation a {@link com.databricks.sdk.service.catalog.ValidationResultOperation} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidationResult} object
   */
  public ValidationResult setOperation(ValidationResultOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * <p>Getter for the field <code>operation</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.ValidationResultOperation} object
   */
  public ValidationResultOperation getOperation() {
    return operation;
  }

  /**
   * <p>Setter for the field <code>result</code>.</p>
   *
   * @param result a {@link com.databricks.sdk.service.catalog.ValidationResultResult} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidationResult} object
   */
  public ValidationResult setResult(ValidationResultResult result) {
    this.result = result;
    return this;
  }

  /**
   * <p>Getter for the field <code>result</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.ValidationResultResult} object
   */
  public ValidationResultResult getResult() {
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationResult that = (ValidationResult) o;
    return Objects.equals(message, that.message)
        && Objects.equals(operation, that.operation)
        && Objects.equals(result, that.result);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(message, operation, result);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ValidationResult.class)
        .add("message", message)
        .add("operation", operation)
        .add("result", result)
        .toString();
  }
}
