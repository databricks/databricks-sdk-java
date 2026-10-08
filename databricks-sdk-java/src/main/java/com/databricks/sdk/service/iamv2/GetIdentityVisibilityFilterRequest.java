// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetIdentityVisibilityFilterRequest {
  /**
   * Required. The resource name of the filter. Format:
   * accounts/{account_id}/identity-visibility-filters/{identity_visibility_filter_id}
   */
  @JsonIgnore private String name;

  public GetIdentityVisibilityFilterRequest setName(String name) {
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
    GetIdentityVisibilityFilterRequest that = (GetIdentityVisibilityFilterRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetIdentityVisibilityFilterRequest.class).add("name", name).toString();
  }
}
