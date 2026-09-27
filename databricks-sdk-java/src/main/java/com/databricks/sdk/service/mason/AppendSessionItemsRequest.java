// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Request to append items to a session. */
@Generated
public class AppendSessionItemsRequest {
  /**
   * Items to append atomically in request order. Concurrent append requests are serialized into one
   * committed order without exposing a numeric sequence in the public contract.
   */
  @JsonProperty("items")
  private Collection<SessionItem> items;

  /**
   * Resource name of the containing session, in the form
   * `session-stores/{session_store_id}/sessions/{session_id}`.
   */
  @JsonIgnore private String parent;

  public AppendSessionItemsRequest setItems(Collection<SessionItem> items) {
    this.items = items;
    return this;
  }

  public Collection<SessionItem> getItems() {
    return items;
  }

  public AppendSessionItemsRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppendSessionItemsRequest that = (AppendSessionItemsRequest) o;
    return Objects.equals(items, that.items) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(AppendSessionItemsRequest.class)
        .add("items", items)
        .add("parent", parent)
        .toString();
  }
}
