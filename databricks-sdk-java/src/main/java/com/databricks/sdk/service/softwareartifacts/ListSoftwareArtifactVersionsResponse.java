// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing a page of software artifact versions. */
@Generated
public class ListSoftwareArtifactVersionsResponse {
  /** Opaque token to pass as the next request's page_token. Empty when there are no more pages. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The versions of the requested software artifact. */
  @JsonProperty("software_artifact_versions")
  private Collection<SoftwareArtifactVersion> softwareArtifactVersions;

  public ListSoftwareArtifactVersionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSoftwareArtifactVersionsResponse setSoftwareArtifactVersions(
      Collection<SoftwareArtifactVersion> softwareArtifactVersions) {
    this.softwareArtifactVersions = softwareArtifactVersions;
    return this;
  }

  public Collection<SoftwareArtifactVersion> getSoftwareArtifactVersions() {
    return softwareArtifactVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSoftwareArtifactVersionsResponse that = (ListSoftwareArtifactVersionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(softwareArtifactVersions, that.softwareArtifactVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, softwareArtifactVersions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSoftwareArtifactVersionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("softwareArtifactVersions", softwareArtifactVersions)
        .toString();
  }
}
