// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a table */
public class GetTableRequest {
  /** Full name of the table. */
  private String fullName;

  /** Whether delta metadata should be included in the response. */
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  public GetTableRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetTableRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTableRequest that = (GetTableRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeDeltaMetadata);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTableRequest.class)
        .add("fullName", fullName)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .toString();
  }
}
