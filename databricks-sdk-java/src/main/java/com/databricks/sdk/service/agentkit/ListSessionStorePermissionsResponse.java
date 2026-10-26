// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A page of explicit session store permissions. */
@Generated
public class ListSessionStorePermissionsResponse {
  /** Token for the next page, omitted when all permissions have been returned. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /**
   * Explicit READ or WRITE grants. Implicit owner/admin access and inherited grants are excluded.
   */
  @JsonProperty("session_store_permissions")
  private Collection<SessionStorePermission> sessionStorePermissions;

  public ListSessionStorePermissionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSessionStorePermissionsResponse setSessionStorePermissions(
      Collection<SessionStorePermission> sessionStorePermissions) {
    this.sessionStorePermissions = sessionStorePermissions;
    return this;
  }

  public Collection<SessionStorePermission> getSessionStorePermissions() {
    return sessionStorePermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSessionStorePermissionsResponse that = (ListSessionStorePermissionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(sessionStorePermissions, that.sessionStorePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, sessionStorePermissions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSessionStorePermissionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("sessionStorePermissions", sessionStorePermissions)
        .toString();
  }
}
