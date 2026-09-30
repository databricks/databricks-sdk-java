// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing a page of session stores. */
@Generated
public class ListSessionStoresResponse {
  /** Token to retrieve the next page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Session stores in the requested page. */
  @JsonProperty("session_stores")
  private Collection<SessionStore> sessionStores;

  public ListSessionStoresResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSessionStoresResponse setSessionStores(Collection<SessionStore> sessionStores) {
    this.sessionStores = sessionStores;
    return this;
  }

  public Collection<SessionStore> getSessionStores() {
    return sessionStores;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSessionStoresResponse that = (ListSessionStoresResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(sessionStores, that.sessionStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, sessionStores);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSessionStoresResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("sessionStores", sessionStores)
        .toString();
  }
}
