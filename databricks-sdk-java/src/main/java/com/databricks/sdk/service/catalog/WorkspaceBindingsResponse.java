// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Currently assigned workspace bindings */
@Generated
public class WorkspaceBindingsResponse {
  /** List of workspace bindings */
  @JsonProperty("bindings")
  private Collection<WorkspaceBinding> bindings;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public WorkspaceBindingsResponse setBindings(Collection<WorkspaceBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public Collection<WorkspaceBinding> getBindings() {
    return bindings;
  }

  public WorkspaceBindingsResponse setNextPageToken(String nextPageToken) {
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
    WorkspaceBindingsResponse that = (WorkspaceBindingsResponse) o;
    return Objects.equals(bindings, that.bindings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceBindingsResponse.class)
        .add("bindings", bindings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
