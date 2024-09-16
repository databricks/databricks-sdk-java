// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a Model Version */
@Generated
public class GetModelVersionRequest {
  /** The three-level (fully qualified) name of the model version */
  @JsonIgnore private String fullName;

  /** Whether to include aliases associated with the model version in the response */
  @JsonIgnore
  @QueryParam("include_aliases")
  private Boolean includeAliases;

  /**
   * Whether to include model versions in the response for which the principal can only access
   * selective metadata for
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /** The integer version number of the model version */
  @JsonIgnore private Long version;

  public GetModelVersionRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetModelVersionRequest setIncludeAliases(Boolean includeAliases) {
    this.includeAliases = includeAliases;
    return this;
  }

  public Boolean getIncludeAliases() {
    return includeAliases;
  }

  public GetModelVersionRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetModelVersionRequest setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionRequest that = (GetModelVersionRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeAliases, that.includeAliases)
        && Objects.equals(includeBrowse, that.includeBrowse)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeAliases, includeBrowse, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionRequest.class)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .add("includeBrowse", includeBrowse)
        .add("version", version)
        .toString();
  }
}
