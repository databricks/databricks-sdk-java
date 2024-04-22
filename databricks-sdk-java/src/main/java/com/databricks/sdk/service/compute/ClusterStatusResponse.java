// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ClusterStatusResponse {
  /** Unique identifier for the cluster. */
  @JsonProperty("cluster_id")
  private String clusterId;

  /** Status of all libraries on the cluster. */
  @JsonProperty("library_statuses")
  private Collection<LibraryFullStatus> libraryStatuses;

  public ClusterStatusResponse setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterStatusResponse setLibraryStatuses(Collection<LibraryFullStatus> libraryStatuses) {
    this.libraryStatuses = libraryStatuses;
    return this;
  }

  public Collection<LibraryFullStatus> getLibraryStatuses() {
    return libraryStatuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterStatusResponse that = (ClusterStatusResponse) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(libraryStatuses, that.libraryStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, libraryStatuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterStatusResponse.class)
        .add("clusterId", clusterId)
        .add("libraryStatuses", libraryStatuses)
        .toString();
  }
}
