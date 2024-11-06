// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a table */
@Generated
public class GetTableRequest {
  /** Full name of the table. */
  @JsonIgnore private String fullName;

  /**
   * Whether to include tables in the response for which the principal can only access selective
   * metadata for
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /** Whether delta metadata should be included in the response. */
  @JsonIgnore
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  /** Whether to include a manifest containing capabilities the table has. */
  @JsonIgnore
  @QueryParam("include_manifest_capabilities")
  private Boolean includeManifestCapabilities;

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

  public GetTableRequest setIncludeManifestCapabilities(Boolean includeManifestCapabilities) {
    this.includeManifestCapabilities = includeManifestCapabilities;
    return this;
  }

  public Boolean getIncludeManifestCapabilities() {
    return includeManifestCapabilities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetTableRequest that = (GetTableRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(includeDeltaMetadata, that.includeDeltaMetadata)
        && Objects.equals(includeManifestCapabilities, that.includeManifestCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse, includeDeltaMetadata, includeManifestCapabilities);
  }

  @Override
  public String toString() {
    return new ToStringer(GetTableRequest.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("includeManifestCapabilities", includeManifestCapabilities)
        .toString();
  }
}
