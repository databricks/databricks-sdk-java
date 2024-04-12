// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ValidationResult {
  /** The operation tested. */
  @JsonProperty("aws_operation")
  private ValidationResultAwsOperation awsOperation;

  /** The operation tested. */
  @JsonProperty("azure_operation")
  private ValidationResultAzureOperation azureOperation;

  /** The operation tested. */
  @JsonProperty("gcp_operation")
  private ValidationResultGcpOperation gcpOperation;

  /** Error message would exist when the result does not equal to **PASS**. */
  @JsonProperty("message")
  private String message;

  /** The results of the tested operation. */
  @JsonProperty("result")
  private ValidationResultResult result;

  public ValidationResult setAwsOperation(ValidationResultAwsOperation awsOperation) {
    this.awsOperation = awsOperation;
    return this;
  }

  public ValidationResultAwsOperation getAwsOperation() {
    return awsOperation;
  }

  public ValidationResult setAzureOperation(ValidationResultAzureOperation azureOperation) {
    this.azureOperation = azureOperation;
    return this;
  }

  public ValidationResultAzureOperation getAzureOperation() {
    return azureOperation;
  }

  public ValidationResult setGcpOperation(ValidationResultGcpOperation gcpOperation) {
    this.gcpOperation = gcpOperation;
    return this;
  }

  public ValidationResultGcpOperation getGcpOperation() {
    return gcpOperation;
  }

  public ValidationResult setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
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
    return Objects.equals(awsOperation, that.awsOperation)
        && Objects.equals(azureOperation, that.azureOperation)
        && Objects.equals(gcpOperation, that.gcpOperation)
        && Objects.equals(message, that.message)
        && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsOperation, azureOperation, gcpOperation, message, result);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidationResult.class)
        .add("awsOperation", awsOperation)
        .add("azureOperation", azureOperation)
        .add("gcpOperation", gcpOperation)
        .add("message", message)
        .add("result", result)
        .toString();
  }
}
