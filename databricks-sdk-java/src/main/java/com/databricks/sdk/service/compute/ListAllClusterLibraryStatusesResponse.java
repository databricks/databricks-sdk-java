// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListAllClusterLibraryStatusesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListAllClusterLibraryStatusesResponse {
  /** A list of cluster statuses. */
  @JsonProperty("statuses")
  private Collection<ClusterLibraryStatuses> statuses;

  /**
   * <p>Setter for the field <code>statuses</code>.</p>
   *
   * @param statuses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListAllClusterLibraryStatusesResponse} object
   */
  public ListAllClusterLibraryStatusesResponse setStatuses(
      Collection<ClusterLibraryStatuses> statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * <p>Getter for the field <code>statuses</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ClusterLibraryStatuses> getStatuses() {
    return statuses;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAllClusterLibraryStatusesResponse that = (ListAllClusterLibraryStatusesResponse) o;
    return Objects.equals(statuses, that.statuses);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListAllClusterLibraryStatusesResponse.class)
        .add("statuses", statuses)
        .toString();
  }
}
