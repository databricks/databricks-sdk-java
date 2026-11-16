// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A list of Sandboxes. */
@Generated
public class ListSandboxesResponse {
  /** Token for retrieving the next page of results. Empty when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Sandboxes in this page of results. */
  @JsonProperty("sandboxes")
  private Collection<Sandbox> sandboxes;

  public ListSandboxesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSandboxesResponse setSandboxes(Collection<Sandbox> sandboxes) {
    this.sandboxes = sandboxes;
    return this;
  }

  public Collection<Sandbox> getSandboxes() {
    return sandboxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSandboxesResponse that = (ListSandboxesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(sandboxes, that.sandboxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, sandboxes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSandboxesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("sandboxes", sandboxes)
        .toString();
  }
}
