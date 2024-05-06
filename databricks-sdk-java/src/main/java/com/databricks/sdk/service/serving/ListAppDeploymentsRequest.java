// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List App Deployments */
@Generated
public class ListAppDeploymentsRequest {
  /** The name of the app. */
  private String appName;

  /** Upper bound for items returned. */
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to go to the next page of apps. Requests first page if absent. */
  @QueryParam("page_token")
  private String pageToken;

  public ListAppDeploymentsRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  public ListAppDeploymentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAppDeploymentsRequest setPageToken(String pageToken) {
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
    ListAppDeploymentsRequest that = (ListAppDeploymentsRequest) o;
    return Objects.equals(appName, that.appName)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppDeploymentsRequest.class)
        .add("appName", appName)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
