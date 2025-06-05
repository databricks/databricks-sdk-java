// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListCredentialsResponsePb {
  @JsonProperty("credentials")
  private Collection<CredentialInfo> credentials;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCredentialsResponsePb setCredentials(Collection<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Collection<CredentialInfo> getCredentials() {
    return credentials;
  }

  public ListCredentialsResponsePb setNextPageToken(String nextPageToken) {
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
    ListCredentialsResponsePb that = (ListCredentialsResponsePb) o;
    return Objects.equals(credentials, that.credentials)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCredentialsResponsePb.class)
        .add("credentials", credentials)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
