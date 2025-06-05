// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CredentialValidationResultPb {
  @JsonProperty("message")
  private String message;

  @JsonProperty("result")
  private ValidateCredentialResult result;

  public CredentialValidationResultPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public CredentialValidationResultPb setResult(ValidateCredentialResult result) {
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
    CredentialValidationResultPb that = (CredentialValidationResultPb) o;
    return Objects.equals(message, that.message) && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result);
  }

  @Override
  public String toString() {
    return new ToStringer(CredentialValidationResultPb.class)
        .add("message", message)
        .add("result", result)
        .toString();
  }
}
