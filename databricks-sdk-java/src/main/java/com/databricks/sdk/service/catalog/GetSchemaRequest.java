// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetSchemaRequest {
  /** Full name of the schema, in the form catalog_name.schema_name. */
  @JsonIgnore private String fullName;

  /**
   * Whether to return the schema when the principal can only access selective metadata for it
   * through the BROWSE privilege. The response then has browse_only set to true.
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  public GetSchemaRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetSchemaRequest setIncludeBrowse(Boolean includeBrowse) {
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
    GetSchemaRequest that = (GetSchemaRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeBrowse, that.includeBrowse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSchemaRequest.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .toString();
  }
}
