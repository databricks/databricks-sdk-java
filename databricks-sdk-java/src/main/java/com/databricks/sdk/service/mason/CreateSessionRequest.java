// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSessionRequest {
  /**
   * Resource name of the containing session store, in the form `session-stores/{session_store_id}`.
   */
  @JsonIgnore private String parent;

  /**
   * The session to create. `actor_id` is required. A session with `parent_session_id` is a child
   * and must use its parent's `actor_id`. Independent forks are created only through `ForkSession`.
   */
  @JsonProperty("session")
  private Session session;

  /**
   * Optional caller-selected session ID. The service generates a UUID when this field is omitted.
   * The ID must be unique; a collision returns `ALREADY_EXISTS`.
   */
  @JsonIgnore
  @QueryParam("session_id")
  private String sessionId;

  public CreateSessionRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateSessionRequest setSession(Session session) {
    this.session = session;
    return this;
  }

  public Session getSession() {
    return session;
  }

  public CreateSessionRequest setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public String getSessionId() {
    return sessionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSessionRequest that = (CreateSessionRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(session, that.session)
        && Objects.equals(sessionId, that.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, session, sessionId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSessionRequest.class)
        .add("parent", parent)
        .add("session", session)
        .add("sessionId", sessionId)
        .toString();
  }
}
