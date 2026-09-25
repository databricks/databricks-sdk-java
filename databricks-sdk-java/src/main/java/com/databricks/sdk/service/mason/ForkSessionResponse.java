// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response from forking a session. */
@Generated
public class ForkSessionResponse {
  /** The newly-created independent top-level session. */
  @JsonProperty("session")
  private Session session;

  public ForkSessionResponse setSession(Session session) {
    this.session = session;
    return this;
  }

  public Session getSession() {
    return session;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForkSessionResponse that = (ForkSessionResponse) o;
    return Objects.equals(session, that.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(session);
  }

  @Override
  public String toString() {
    return new ToStringer(ForkSessionResponse.class).add("session", session).toString();
  }
}
