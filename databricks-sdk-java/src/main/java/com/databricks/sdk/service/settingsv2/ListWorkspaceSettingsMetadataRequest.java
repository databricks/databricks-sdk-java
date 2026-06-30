// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListWorkspaceSettingsMetadataRequest {
  /**
   * The maximum number of settings to return. The service may return fewer than this value. If
   * unspecified, at most 200 settings will be returned. The maximum value is 1000; values above
   * 1000 will be coerced to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListWorkspaceSettingsMetadataRequest` call. Provide
   * this to retrieve the subsequent page.
   *
   * <p>When paginating, all other parameters provided to `ListWorkspaceSettingsMetadataRequest`
   * must match the call that provided the page token.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListWorkspaceSettingsMetadataRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListWorkspaceSettingsMetadataRequest setPageToken(String pageToken) {
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
    ListWorkspaceSettingsMetadataRequest that = (ListWorkspaceSettingsMetadataRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListWorkspaceSettingsMetadataRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
