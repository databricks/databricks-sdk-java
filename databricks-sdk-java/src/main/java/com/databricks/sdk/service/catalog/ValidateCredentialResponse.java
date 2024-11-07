// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ValidateCredentialResponse {
  /** The results of the validation check. */
  @JsonProperty("results")
  private Collection<CredentialValidationResult> results;

  public ValidateCredentialResponse setResults(Collection<CredentialValidationResult> results) {
    this.results = results;
    return this;
  }

  public Collection<CredentialValidationResult> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidateCredentialResponse that = (ValidateCredentialResponse) o;
    return Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateCredentialResponse.class).add("results", results).toString();
  }
}
