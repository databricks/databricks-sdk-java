// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CredentialValidationResult {
  /** Error message would exist when the result does not equal to **PASS**. */
  @JsonProperty("message")
  private String message;

  /** The results of the tested operation. */
  @JsonProperty("result")
  private ValidateCredentialResult result;

  public CredentialValidationResult setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public CredentialValidationResult setResult(ValidateCredentialResult result) {
    this.result = result;
    return this;
  }

  public ValidateCredentialResult getResult() {
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CredentialValidationResult that = (CredentialValidationResult) o;
    return Objects.equals(message, that.message) && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result);
  }

  @Override
  public String toString() {
    return new ToStringer(CredentialValidationResult.class)
        .add("message", message)
        .add("result", result)
        .toString();
  }
}
