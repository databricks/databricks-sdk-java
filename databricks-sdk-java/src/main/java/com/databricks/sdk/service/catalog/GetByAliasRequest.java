// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get Model Version By Alias */
@Generated
public class GetByAliasRequest {
  /** The name of the alias */
  @JsonIgnore private String alias;

  /** The three-level (fully qualified) name of the registered model */
  @JsonIgnore private String fullName;

  /** Whether to include aliases associated with the model version in the response */
  @JsonIgnore
  @QueryParam("include_aliases")
  private Boolean includeAliases;

  public GetByAliasRequest setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public GetByAliasRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetByAliasRequest setIncludeAliases(Boolean includeAliases) {
    this.includeAliases = includeAliases;
    return this;
  }

  public Boolean getIncludeAliases() {
    return includeAliases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetByAliasRequest that = (GetByAliasRequest) o;
    return Objects.equals(alias, that.alias)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(includeAliases, that.includeAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, fullName, includeAliases);
  }

  @Override
  public String toString() {
    return new ToStringer(GetByAliasRequest.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .toString();
  }
}
