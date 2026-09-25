// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing a page of sessions. */
@Generated
public class ListSessionsResponse {
  /** Token to retrieve the next page. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Sessions in the requested page. */
  @JsonProperty("sessions")
  private Collection<Session> sessions;

  public ListSessionsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSessionsResponse setSessions(Collection<Session> sessions) {
    this.sessions = sessions;
    return this;
  }

  public Collection<Session> getSessions() {
    return sessions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSessionsResponse that = (ListSessionsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(sessions, that.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, sessions);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSessionsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("sessions", sessions)
        .toString();
  }
}
