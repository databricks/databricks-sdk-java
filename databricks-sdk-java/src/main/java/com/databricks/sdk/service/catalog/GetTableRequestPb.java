// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a table */
@Generated
class GetTableRequestPb {
  @JsonIgnore private String fullName;

  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  @JsonIgnore
  @QueryParam("include_delta_metadata")
  private Boolean includeDeltaMetadata;

  @JsonIgnore
  @QueryParam("include_manifest_capabilities")
  private Boolean includeManifestCapabilities;

  public GetTableRequestPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetTableRequestPb setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetTableRequestPb setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
    this.includeDeltaMetadata = includeDeltaMetadata;
    return this;
  }

  public Boolean getIncludeDeltaMetadata() {
    return includeDeltaMetadata;
  }

  public GetTableRequestPb setIncludeManifestCapabilities(Boolean includeManifestCapabilities) {
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
    GetTableRequestPb that = (GetTableRequestPb) o;
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
    return new ToStringer(GetTableRequestPb.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .add("includeDeltaMetadata", includeDeltaMetadata)
        .add("includeManifestCapabilities", includeManifestCapabilities)
        .toString();
  }
}
