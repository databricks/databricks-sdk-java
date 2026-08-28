// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListSnapshotsResponse {
  /** Token to retrieve the next page; empty if there are no more pages. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The snapshots in the project. */
  @JsonProperty("snapshots")
  private Collection<Snapshot> snapshots;

  public ListSnapshotsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSnapshotsResponse setSnapshots(Collection<Snapshot> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public Collection<Snapshot> getSnapshots() {
    return snapshots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSnapshotsResponse that = (ListSnapshotsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(snapshots, that.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, snapshots);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSnapshotsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("snapshots", snapshots)
        .toString();
  }
}
