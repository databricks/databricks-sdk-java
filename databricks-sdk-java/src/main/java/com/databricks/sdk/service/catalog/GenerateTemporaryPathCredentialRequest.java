// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenerateTemporaryPathCredentialRequest {
  /**
   * Optional. When set to true, the service will not validate that the generated credentials can
   * perform write operations, therefore no new paths will be created and the response will not
   * contain valid credentials. Defaults to false.
   */
  @JsonProperty("dry_run")
  private Boolean dryRun;

  /** The operation being performed on the path. */
  @JsonProperty("operation")
  private PathOperation operation;

  /** URL for path-based access. */
  @JsonProperty("url")
  private String url;

  public GenerateTemporaryPathCredentialRequest setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  public Boolean getDryRun() {
    return dryRun;
  }

  public GenerateTemporaryPathCredentialRequest setOperation(PathOperation operation) {
    this.operation = operation;
    return this;
  }

  public PathOperation getOperation() {
    return operation;
  }

  public GenerateTemporaryPathCredentialRequest setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryPathCredentialRequest that = (GenerateTemporaryPathCredentialRequest) o;
    return Objects.equals(dryRun, that.dryRun)
        && Objects.equals(operation, that.operation)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, operation, url);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryPathCredentialRequest.class)
        .add("dryRun", dryRun)
        .add("operation", operation)
        .add("url", url)
        .toString();
  }
}
