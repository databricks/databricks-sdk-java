// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for ListResources. */
@Generated
public class ListResourcesResponse {
  /**
   * A token, which can be sent as {@code page_token} to retrieve the next page. If this field is
   * omitted, there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The resources under the specified deployment. */
  @JsonProperty("resources")
  private Collection<Resource> resources;

  public ListResourcesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListResourcesResponse setResources(Collection<Resource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<Resource> getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResourcesResponse that = (ListResourcesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, resources);
  }

  @Override
  public String toString() {
    return new ToStringer(ListResourcesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("resources", resources)
        .toString();
  }
}
