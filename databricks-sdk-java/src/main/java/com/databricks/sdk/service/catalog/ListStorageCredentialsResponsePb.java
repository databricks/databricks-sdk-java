// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListStorageCredentialsResponsePb {
  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("storage_credentials")
  private Collection<StorageCredentialInfo> storageCredentials;

  public ListStorageCredentialsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListStorageCredentialsResponsePb setStorageCredentials(
      Collection<StorageCredentialInfo> storageCredentials) {
    this.storageCredentials = storageCredentials;
    return this;
  }

  public Collection<StorageCredentialInfo> getStorageCredentials() {
    return storageCredentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListStorageCredentialsResponsePb that = (ListStorageCredentialsResponsePb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(storageCredentials, that.storageCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, storageCredentials);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStorageCredentialsResponsePb.class)
        .add("nextPageToken", nextPageToken)
        .add("storageCredentials", storageCredentials)
        .toString();
  }
}
