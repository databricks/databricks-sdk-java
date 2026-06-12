// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for ListDeployments. */
@Generated
public class ListDeploymentsResponse {
  /** The deployments from the queried workspace. */
  @JsonProperty("deployments")
  private Collection<Deployment> deployments;

  /**
   * A token, which can be sent as {@code page_token} to retrieve the next page. If this field is
   * omitted, there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDeploymentsResponse setDeployments(Collection<Deployment> deployments) {
    this.deployments = deployments;
    return this;
  }

  public Collection<Deployment> getDeployments() {
    return deployments;
  }

  public ListDeploymentsResponse setNextPageToken(String nextPageToken) {
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
    ListDeploymentsResponse that = (ListDeploymentsResponse) o;
    return Objects.equals(deployments, that.deployments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDeploymentsResponse.class)
        .add("deployments", deployments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
