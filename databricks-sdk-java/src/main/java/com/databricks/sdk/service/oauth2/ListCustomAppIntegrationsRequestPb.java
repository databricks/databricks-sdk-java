// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get custom oauth app integrations */
@Generated
class ListCustomAppIntegrationsRequestPb {
  @JsonIgnore
  @QueryParam("include_creator_username")
  private Boolean includeCreatorUsername;

  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListCustomAppIntegrationsRequestPb setIncludeCreatorUsername(
      Boolean includeCreatorUsername) {
    this.includeCreatorUsername = includeCreatorUsername;
    return this;
  }

  public Boolean getIncludeCreatorUsername() {
    return includeCreatorUsername;
  }

  public ListCustomAppIntegrationsRequestPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCustomAppIntegrationsRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCustomAppIntegrationsRequestPb that = (ListCustomAppIntegrationsRequestPb) o;
    return Objects.equals(includeCreatorUsername, that.includeCreatorUsername)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeCreatorUsername, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCustomAppIntegrationsRequestPb.class)
        .add("includeCreatorUsername", includeCreatorUsername)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
