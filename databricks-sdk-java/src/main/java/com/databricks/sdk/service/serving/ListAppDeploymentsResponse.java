// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAppDeploymentsResponse {
  /** Deployment history of the app. */
  @JsonProperty("app_deployments")
  private Collection<AppDeployment> appDeployments;

  /** Pagination token to request the next page of apps. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListAppDeploymentsResponse setAppDeployments(Collection<AppDeployment> appDeployments) {
    this.appDeployments = appDeployments;
    return this;
  }

  public Collection<AppDeployment> getAppDeployments() {
    return appDeployments;
  }

  public ListAppDeploymentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAppDeploymentsResponse that = (ListAppDeploymentsResponse) o;
    return Objects.equals(appDeployments, that.appDeployments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeployments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppDeploymentsResponse.class)
        .add("appDeployments", appDeployments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
