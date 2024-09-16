// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a function */
@Generated
public class GetFunctionRequest {
  /**
   * Whether to include functions in the response for which the principal can only access selective
   * metadata for
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  /**
   * The fully-qualified name of the function (of the form
   * __catalog_name__.__schema_name__.__function__name__).
   */
  @JsonIgnore private String name;

  public GetFunctionRequest setIncludeBrowse(Boolean includeBrowse) {
    this.includeBrowse = includeBrowse;
    return this;
  }

  public Boolean getIncludeBrowse() {
    return includeBrowse;
  }

  public GetFunctionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetFunctionRequest that = (GetFunctionRequest) o;
    return Objects.equals(includeBrowse, that.includeBrowse) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeBrowse, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFunctionRequest.class)
        .add("includeBrowse", includeBrowse)
        .add("name", name)
        .toString();
  }
}
