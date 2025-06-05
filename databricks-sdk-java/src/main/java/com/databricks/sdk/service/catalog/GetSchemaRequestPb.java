// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a schema */
@Generated
class GetSchemaRequestPb {
  @JsonIgnore private String fullName;

  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  public GetSchemaRequestPb setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetSchemaRequestPb setIncludeBrowse(Boolean includeBrowse) {
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
    GetSchemaRequestPb that = (GetSchemaRequestPb) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeBrowse, that.includeBrowse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSchemaRequestPb.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .toString();
  }
}
