// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing a page of software artifacts. */
@Generated
public class ListSoftwareArtifactsResponse {
  /** Opaque token to pass as the next request's page_token. Empty when there are no more pages. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The software artifacts under the requested schema. */
  @JsonProperty("software_artifacts")
  private Collection<SoftwareArtifact> softwareArtifacts;

  public ListSoftwareArtifactsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSoftwareArtifactsResponse setSoftwareArtifacts(
      Collection<SoftwareArtifact> softwareArtifacts) {
    this.softwareArtifacts = softwareArtifacts;
    return this;
  }

  public Collection<SoftwareArtifact> getSoftwareArtifacts() {
    return softwareArtifacts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSoftwareArtifactsResponse that = (ListSoftwareArtifactsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(softwareArtifacts, that.softwareArtifacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, softwareArtifacts);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSoftwareArtifactsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("softwareArtifacts", softwareArtifacts)
        .toString();
  }
}
