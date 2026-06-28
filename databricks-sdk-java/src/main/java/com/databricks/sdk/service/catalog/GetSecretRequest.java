// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetSecretRequest {
  /**
   * The three-level (fully qualified) name of the secret (for example,
   * **catalog_name.schema_name.secret_name**).
   */
  @JsonIgnore private String fullName;

  /**
   * Whether to include secrets in the response for which you only have the **BROWSE** privilege,
   * which limits access to metadata.
   */
  @JsonIgnore
  @QueryParam("include_browse")
  private Boolean includeBrowse;

  public GetSecretRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetSecretRequest setIncludeBrowse(Boolean includeBrowse) {
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
    GetSecretRequest that = (GetSecretRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeBrowse, that.includeBrowse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeBrowse);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSecretRequest.class)
        .add("fullName", fullName)
        .add("includeBrowse", includeBrowse)
        .toString();
  }
}
