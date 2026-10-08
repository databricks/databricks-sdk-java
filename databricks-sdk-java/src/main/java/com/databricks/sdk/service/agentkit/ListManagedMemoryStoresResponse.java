// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing managed memory stores in the caller's workspace. */
@Generated
public class ListManagedMemoryStoresResponse {
  /** Managed memory stores in the caller's workspace. */
  @JsonProperty("managed_memory_stores")
  private Collection<ManagedMemoryStore> managedMemoryStores;

  /** Opaque pagination token. This field is omitted when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListManagedMemoryStoresResponse setManagedMemoryStores(
      Collection<ManagedMemoryStore> managedMemoryStores) {
    this.managedMemoryStores = managedMemoryStores;
    return this;
  }

  public Collection<ManagedMemoryStore> getManagedMemoryStores() {
    return managedMemoryStores;
  }

  public ListManagedMemoryStoresResponse setNextPageToken(String nextPageToken) {
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
    ListManagedMemoryStoresResponse that = (ListManagedMemoryStoresResponse) o;
    return Objects.equals(managedMemoryStores, that.managedMemoryStores)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryStores, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListManagedMemoryStoresResponse.class)
        .add("managedMemoryStores", managedMemoryStores)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
