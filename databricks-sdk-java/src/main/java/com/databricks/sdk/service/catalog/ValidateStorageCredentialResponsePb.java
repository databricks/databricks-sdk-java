// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ValidateStorageCredentialResponsePb {
  @JsonProperty("isDir")
  private Boolean isDir;

  @JsonProperty("results")
  private Collection<ValidationResult> results;

  public ValidateStorageCredentialResponsePb setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

  public ValidateStorageCredentialResponsePb setResults(Collection<ValidationResult> results) {
    this.results = results;
    return this;
  }

  public Collection<ValidationResult> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidateStorageCredentialResponsePb that = (ValidateStorageCredentialResponsePb) o;
    return Objects.equals(isDir, that.isDir) && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDir, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateStorageCredentialResponsePb.class)
        .add("isDir", isDir)
        .add("results", results)
        .toString();
  }
}
