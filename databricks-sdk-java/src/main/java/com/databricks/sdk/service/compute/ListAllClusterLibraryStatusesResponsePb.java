// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListAllClusterLibraryStatusesResponsePb {
  @JsonProperty("statuses")
  private Collection<ClusterLibraryStatuses> statuses;

  public ListAllClusterLibraryStatusesResponsePb setStatuses(
      Collection<ClusterLibraryStatuses> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<ClusterLibraryStatuses> getStatuses() {
    return statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAllClusterLibraryStatusesResponsePb that = (ListAllClusterLibraryStatusesResponsePb) o;
    return Objects.equals(statuses, that.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAllClusterLibraryStatusesResponsePb.class)
        .add("statuses", statuses)
        .toString();
  }
}
