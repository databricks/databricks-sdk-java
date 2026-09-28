// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Request to pop an item from a session. */
@Generated
public class PopSessionItemRequest {
  /**
   * Resource name of the containing session, in the form
   * `session-stores/{session_store_id}/sessions/{session_id}`.
   */
  @JsonIgnore private String parent;

  public PopSessionItemRequest setParent(String parent) {
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
    PopSessionItemRequest that = (PopSessionItemRequest) o;
    return Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent);
  }

  @Override
  public String toString() {
    return new ToStringer(PopSessionItemRequest.class).add("parent", parent).toString();
  }
}
