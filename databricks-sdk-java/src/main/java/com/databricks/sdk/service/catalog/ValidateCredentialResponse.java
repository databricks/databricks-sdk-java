// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ValidateCredentialResponse {
  /**
   * Whether the tested location is a directory in cloud storage. Only applicable for when purpose
   * is **STORAGE**.
   */
  @JsonProperty("isDir")
  private Boolean isDir;

  /** The results of the validation check. */
  @JsonProperty("results")
  private Collection<CredentialValidationResult> results;

  public ValidateCredentialResponse setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

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
    return Objects.equals(isDir, that.isDir) && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDir, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateCredentialResponse.class)
        .add("isDir", isDir)
        .add("results", results)
        .toString();
  }
}
