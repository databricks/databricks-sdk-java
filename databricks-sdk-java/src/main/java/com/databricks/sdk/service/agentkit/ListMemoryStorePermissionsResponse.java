// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of explicit memory store permissions. */
@Generated
public class ListMemoryStorePermissionsResponse {
  /**
   * Explicit READ or WRITE grants. Implicit owner/admin access and inherited grants are excluded.
   */
  @JsonProperty("memory_store_permissions")
  private Collection<MemoryStorePermission> memoryStorePermissions;

  /** Token for the next page, omitted when all permissions have been returned. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListMemoryStorePermissionsResponse setMemoryStorePermissions(
      Collection<MemoryStorePermission> memoryStorePermissions) {
    this.memoryStorePermissions = memoryStorePermissions;
    return this;
  }

  public Collection<MemoryStorePermission> getMemoryStorePermissions() {
    return memoryStorePermissions;
  }

  public ListMemoryStorePermissionsResponse setNextPageToken(String nextPageToken) {
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
    ListMemoryStorePermissionsResponse that = (ListMemoryStorePermissionsResponse) o;
    return Objects.equals(memoryStorePermissions, that.memoryStorePermissions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoryStorePermissions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMemoryStorePermissionsResponse.class)
        .add("memoryStorePermissions", memoryStorePermissions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
