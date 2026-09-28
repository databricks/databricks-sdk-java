// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing appended items. */
@Generated
public class AppendSessionItemsResponse {
  /** Persisted session items with service-assigned fields. */
  @JsonProperty("session_items")
  private Collection<SessionItem> sessionItems;

  public AppendSessionItemsResponse setSessionItems(Collection<SessionItem> sessionItems) {
    this.sessionItems = sessionItems;
    return this;
  }

  public Collection<SessionItem> getSessionItems() {
    return sessionItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppendSessionItemsResponse that = (AppendSessionItemsResponse) o;
    return Objects.equals(sessionItems, that.sessionItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionItems);
  }

  @Override
  public String toString() {
    return new ToStringer(AppendSessionItemsResponse.class)
        .add("sessionItems", sessionItems)
        .toString();
  }
}
