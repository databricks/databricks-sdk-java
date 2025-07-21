// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListDefaultBaseEnvironmentsResponse {
  /** */
  @JsonProperty("default_base_environments")
  private Collection<DefaultBaseEnvironment> defaultBaseEnvironments;

  /** */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListDefaultBaseEnvironmentsResponse setDefaultBaseEnvironments(
      Collection<DefaultBaseEnvironment> defaultBaseEnvironments) {
    this.defaultBaseEnvironments = defaultBaseEnvironments;
    return this;
  }

  public Collection<DefaultBaseEnvironment> getDefaultBaseEnvironments() {
    return defaultBaseEnvironments;
  }

  public ListDefaultBaseEnvironmentsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDefaultBaseEnvironmentsResponse that = (ListDefaultBaseEnvironmentsResponse) o;
    return Objects.equals(defaultBaseEnvironments, that.defaultBaseEnvironments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultBaseEnvironments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDefaultBaseEnvironmentsResponse.class)
        .add("defaultBaseEnvironments", defaultBaseEnvironments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
