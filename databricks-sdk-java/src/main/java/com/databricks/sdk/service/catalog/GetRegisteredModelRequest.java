// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a Registered Model */
@Generated
public class GetRegisteredModelRequest {
  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  /** Whether to include registered model aliases in the response */
  @QueryParam("include_aliases")
  private Boolean includeAliases;

  /**
   * Whether to include registered models in the response for which the principal can only access
   * selective metadata for
   */
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  public GetRegisteredModelRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetRegisteredModelRequest setIncludeAliases(Boolean includeAliases) {
    this.includeAliases = includeAliases;
    return this;
  }

  public Boolean getIncludeAliases() {
    return includeAliases;
  }

  public GetRegisteredModelRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRegisteredModelRequest that = (GetRegisteredModelRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeAliases, that.includeAliases)
        && Objects.equals(includeBrowse, that.includeBrowse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeAliases, includeBrowse);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelRequest.class)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .add("includeBrowse", includeBrowse)
        .toString();
  }
}
