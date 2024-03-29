// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a table */
@Generated
public class GetTableRequest {
  /** Full name of the table. */
  private String fullName;

  /**
   * Whether to include tables in the response for which the principal can only access selective
   * metadata for
   */
  @QueryParam("include_browse")
  private Boolean includeBrowse;

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

  public GetTableRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
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
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse, includeDeltaMetadata);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTableRequest.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .toString();
  }
}
