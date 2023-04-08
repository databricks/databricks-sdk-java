// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidateStorageCredentialResponse {
  /** Whether the tested location is a directory in cloud storage. */
  @JsonProperty("isDir")
  private Boolean isDir;

  /** The results of the validation check. */
  @JsonProperty("results")
  private java.util.List<ValidationResult> results;

  public ValidateStorageCredentialResponse setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

  public ValidateStorageCredentialResponse setResults(java.util.List<ValidationResult> results) {
    this.results = results;
    return this;
  }

  public java.util.List<ValidationResult> getResults() {
    return results;
  }
}
