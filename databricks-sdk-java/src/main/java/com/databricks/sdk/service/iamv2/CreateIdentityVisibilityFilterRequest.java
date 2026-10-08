// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateIdentityVisibilityFilterRequest {
  /** Required. The filter to create. */
  @JsonProperty("identity_visibility_filter")
  private IdentityVisibilityFilter identityVisibilityFilter;

  /**
   * Optional. The ID to use for the filter, which becomes the final component of its resource name.
   * If not specified, the server generates one.
   */
  @JsonIgnore
  @QueryParam("identity_visibility_filter_id")
  private String identityVisibilityFilterId;

  /** Required. The parent account. Format: accounts/{account_id} */
  @JsonIgnore private String parent;

  public CreateIdentityVisibilityFilterRequest setIdentityVisibilityFilter(
      IdentityVisibilityFilter identityVisibilityFilter) {
    this.identityVisibilityFilter = identityVisibilityFilter;
    return this;
  }

  public IdentityVisibilityFilter getIdentityVisibilityFilter() {
    return identityVisibilityFilter;
  }

  public CreateIdentityVisibilityFilterRequest setIdentityVisibilityFilterId(
      String identityVisibilityFilterId) {
    this.identityVisibilityFilterId = identityVisibilityFilterId;
    return this;
  }

  public String getIdentityVisibilityFilterId() {
    return identityVisibilityFilterId;
  }

  public CreateIdentityVisibilityFilterRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateIdentityVisibilityFilterRequest that = (CreateIdentityVisibilityFilterRequest) o;
    return Objects.equals(identityVisibilityFilter, that.identityVisibilityFilter)
        && Objects.equals(identityVisibilityFilterId, that.identityVisibilityFilterId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityVisibilityFilter, identityVisibilityFilterId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateIdentityVisibilityFilterRequest.class)
        .add("identityVisibilityFilter", identityVisibilityFilter)
        .add("identityVisibilityFilterId", identityVisibilityFilterId)
        .add("parent", parent)
        .toString();
  }
}
