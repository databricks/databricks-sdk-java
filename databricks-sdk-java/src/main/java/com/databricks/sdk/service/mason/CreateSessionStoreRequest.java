// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSessionStoreRequest {
  /** The session store to create. */
  @JsonProperty("session_store")
  private SessionStore sessionStore;

  /**
   * Caller-provided, workspace-unique session store ID. It must be 3-55 characters, begin with a
   * lowercase letter, and contain only lowercase letters, digits, and hyphens.
   */
  @JsonIgnore
  @QueryParam("session_store_id")
  private String sessionStoreId;

  public CreateSessionStoreRequest setSessionStore(SessionStore sessionStore) {
    this.sessionStore = sessionStore;
    return this;
  }

  public SessionStore getSessionStore() {
    return sessionStore;
  }

  public CreateSessionStoreRequest setSessionStoreId(String sessionStoreId) {
    this.sessionStoreId = sessionStoreId;
    return this;
  }

  public String getSessionStoreId() {
    return sessionStoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSessionStoreRequest that = (CreateSessionStoreRequest) o;
    return Objects.equals(sessionStore, that.sessionStore)
        && Objects.equals(sessionStoreId, that.sessionStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionStore, sessionStoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSessionStoreRequest.class)
        .add("sessionStore", sessionStore)
        .add("sessionStoreId", sessionStoreId)
        .toString();
  }
}
