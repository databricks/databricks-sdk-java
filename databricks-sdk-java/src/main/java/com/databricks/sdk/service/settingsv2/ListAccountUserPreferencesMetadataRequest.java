// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListAccountUserPreferencesMetadataRequest {
  /**
   * The maximum number of settings to return. The service may return fewer than this value. If
   * unspecified, at most 200 settings will be returned. The maximum value is 1000; values above
   * 1000 will be coerced to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListAccountUserPreferencesMetadataRequest` call.
   * Provide this to retrieve the subsequent page.
   *
   * <p>When paginating, all other parameters provided to
   * `ListAccountUserPreferencesMetadataRequest` must match the call that provided the page token.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** User ID of the user whose settings metadata is being retrieved. */
  @JsonIgnore private String userId;

  public ListAccountUserPreferencesMetadataRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAccountUserPreferencesMetadataRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListAccountUserPreferencesMetadataRequest setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAccountUserPreferencesMetadataRequest that = (ListAccountUserPreferencesMetadataRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountUserPreferencesMetadataRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("userId", userId)
        .toString();
  }
}
