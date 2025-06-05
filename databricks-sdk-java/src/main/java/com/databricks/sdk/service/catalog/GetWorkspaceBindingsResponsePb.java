// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetWorkspaceBindingsResponsePb {
  @JsonProperty("bindings")
  private Collection<WorkspaceBinding> bindings;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public GetWorkspaceBindingsResponsePb setBindings(Collection<WorkspaceBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public Collection<WorkspaceBinding> getBindings() {
    return bindings;
  }

  public GetWorkspaceBindingsResponsePb setNextPageToken(String nextPageToken) {
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
    GetWorkspaceBindingsResponsePb that = (GetWorkspaceBindingsResponsePb) o;
    return Objects.equals(bindings, that.bindings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceBindingsResponsePb.class)
        .add("bindings", bindings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
