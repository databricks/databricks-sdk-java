// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.libraries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListAllClusterLibraryStatusesResponse {
  /** A list of cluster statuses. */
  @JsonProperty("statuses")
  private java.util.List<ClusterLibraryStatuses> statuses;

  public ListAllClusterLibraryStatusesResponse setStatuses(
      java.util.List<ClusterLibraryStatuses> statuses) {
    this.statuses = statuses;
    return this;
  }

  public java.util.List<ClusterLibraryStatuses> getStatuses() {
    return statuses;
  }
}
