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
   * Whether to include the secret value in the response. Defaults to false. Requires the
   * **READ_SECRET** privilege.
   */
  @JsonIgnore
  @QueryParam("include_value")
  private Boolean includeValue;

  public GetSecretRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetSecretRequest setIncludeValue(Boolean includeValue) {
    this.includeValue = includeValue;
    return this;
  }

  public Boolean getIncludeValue() {
    return includeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSecretRequest that = (GetSecretRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(includeValue, that.includeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, includeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSecretRequest.class)
        .add("fullName", fullName)
        .add("includeValue", includeValue)
        .toString();
  }
}
