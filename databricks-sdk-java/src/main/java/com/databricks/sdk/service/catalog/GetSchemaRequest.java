// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a schema */
@Generated
public class GetSchemaRequest {
  /** Full name of the schema. */
  private String fullName;

  /**
   * Whether to include schemas in the response for which the principal can only access selective
   * metadata for
   */
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
