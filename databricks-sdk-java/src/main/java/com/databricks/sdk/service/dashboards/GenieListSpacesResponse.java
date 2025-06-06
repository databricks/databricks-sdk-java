// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GenieListSpacesResponse {
  /** Token to get the next page of results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of Genie spaces */
  @JsonProperty("spaces")
  private Collection<GenieSpace> spaces;

  public GenieListSpacesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GenieListSpacesResponse setSpaces(Collection<GenieSpace> spaces) {
    this.spaces = spaces;
    return this;
  }

  public Collection<GenieSpace> getSpaces() {
    return spaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieListSpacesResponse that = (GenieListSpacesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(spaces, that.spaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, spaces);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListSpacesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("spaces", spaces)
        .toString();
  }
}
