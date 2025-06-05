// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a Model Version */
@Generated
class GetModelVersionRequestPb {
  @JsonIgnore private String fullName;

  @JsonIgnore
  @QueryParam("include_aliases")
  private Boolean includeAliases;

  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  @JsonIgnore private Long version;

  public GetModelVersionRequestPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetModelVersionRequestPb setIncludeAliases(Boolean includeAliases) {
    this.includeAliases = includeAliases;
    return this;
  }

  public Boolean getIncludeAliases() {
    return includeAliases;
  }

  public GetModelVersionRequestPb setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetModelVersionRequestPb setVersion(Long version) {
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
    GetModelVersionRequestPb that = (GetModelVersionRequestPb) o;
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
    return new ToStringer(GetModelVersionRequestPb.class)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .add("includeBrowse", includeBrowse)
        .add("version", version)
        .toString();
  }
}
