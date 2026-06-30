// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCredentialsResponse {
  /** */
  @JsonProperty("credentials")
  private Collection<CredentialInfo> credentials;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListCredentialsResponse setCredentials(Collection<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Collection<CredentialInfo> getCredentials() {
    return credentials;
  }

  public ListCredentialsResponse setNextPageToken(String nextPageToken) {
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
    ListCredentialsResponse that = (ListCredentialsResponse) o;
    return Objects.equals(credentials, that.credentials)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCredentialsResponse.class)
        .add("credentials", credentials)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
