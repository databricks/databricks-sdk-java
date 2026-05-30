// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundle;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for ListVersions. */
@Generated
public class ListVersionsResponse {
  /**
   * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The versions under the specified deployment. */
  @JsonProperty("versions")
  private Collection<Version> versions;

  public ListVersionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVersionsResponse setVersions(Collection<Version> versions) {
    this.versions = versions;
    return this;
  }

  public Collection<Version> getVersions() {
    return versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVersionsResponse that = (ListVersionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(versions, that.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, versions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVersionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("versions", versions)
        .toString();
  }
}
