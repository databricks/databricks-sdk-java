// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ValidateStorageCredentialResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ValidateStorageCredentialResponse {
  /** Whether the tested location is a directory in cloud storage. */
  @JsonProperty("isDir")
  private Boolean isDir;

  /** The results of the validation check. */
  @JsonProperty("results")
  private Collection<ValidationResult> results;

  /**
   * <p>Setter for the field <code>isDir</code>.</p>
   *
   * @param isDir a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredentialResponse} object
   */
  public ValidateStorageCredentialResponse setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  /**
   * <p>Getter for the field <code>isDir</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsDir() {
    return isDir;
  }

  /**
   * <p>Setter for the field <code>results</code>.</p>
   *
   * @param results a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ValidateStorageCredentialResponse} object
   */
  public ValidateStorageCredentialResponse setResults(Collection<ValidationResult> results) {
    this.results = results;
    return this;
  }

  /**
   * <p>Getter for the field <code>results</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ValidationResult> getResults() {
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidateStorageCredentialResponse that = (ValidateStorageCredentialResponse) o;
    return Objects.equals(isDir, that.isDir) && Objects.equals(results, that.results);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(isDir, results);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ValidateStorageCredentialResponse.class)
        .add("isDir", isDir)
        .add("results", results)
        .toString();
  }
}
