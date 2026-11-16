// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response message for ListAppDeploymentScanFindings. */
@Generated
public class ListAppDeploymentScanFindingsResponse {
  /** The scan findings for the deployment. */
  @JsonProperty("app_deployment_scan_findings")
  private Collection<AppDeploymentScanFinding> appDeploymentScanFindings;

  /** Pagination token to request the next page of findings. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListAppDeploymentScanFindingsResponse setAppDeploymentScanFindings(
      Collection<AppDeploymentScanFinding> appDeploymentScanFindings) {
    this.appDeploymentScanFindings = appDeploymentScanFindings;
    return this;
  }

  public Collection<AppDeploymentScanFinding> getAppDeploymentScanFindings() {
    return appDeploymentScanFindings;
  }

  public ListAppDeploymentScanFindingsResponse setNextPageToken(String nextPageToken) {
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
    ListAppDeploymentScanFindingsResponse that = (ListAppDeploymentScanFindingsResponse) o;
    return Objects.equals(appDeploymentScanFindings, that.appDeploymentScanFindings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeploymentScanFindings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppDeploymentScanFindingsResponse.class)
        .add("appDeploymentScanFindings", appDeploymentScanFindings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
