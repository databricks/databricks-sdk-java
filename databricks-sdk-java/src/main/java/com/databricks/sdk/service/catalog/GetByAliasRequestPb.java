// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get Model Version By Alias */
@Generated
class GetByAliasRequestPb {
  @JsonIgnore private String alias;

  @JsonIgnore private String fullName;

  @JsonIgnore
  @QueryParam("include_aliases")
  private Boolean includeAliases;

  public GetByAliasRequestPb setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public GetByAliasRequestPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetByAliasRequestPb setIncludeAliases(Boolean includeAliases) {
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
    GetByAliasRequestPb that = (GetByAliasRequestPb) o;
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
    return new ToStringer(GetByAliasRequestPb.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .add("includeAliases", includeAliases)
        .toString();
  }
}
