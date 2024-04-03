// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListVolumesResponseContent {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request to retrieve the next page of
   * results.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("volumes")
  private Collection<VolumeInfo> volumes;

  public ListVolumesResponseContent setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVolumesResponseContent setVolumes(Collection<VolumeInfo> volumes) {
    this.volumes = volumes;
    return this;
  }

  public Collection<VolumeInfo> getVolumes() {
    return volumes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVolumesResponseContent that = (ListVolumesResponseContent) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(volumes, that.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, volumes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVolumesResponseContent.class)
        .add("nextPageToken", nextPageToken)
        .add("volumes", volumes)
        .toString();
  }
}
