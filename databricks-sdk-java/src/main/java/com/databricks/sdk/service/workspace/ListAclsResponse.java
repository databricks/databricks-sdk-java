// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListAclsResponse {
  /** The associated ACLs rule applied to principals in the given scope. */
  @JsonProperty("items")
  private Collection<AclItem> items;

  public ListAclsResponse setItems(Collection<AclItem> items) {
    this.items = items;
    return this;
  }

  public Collection<AclItem> getItems() {
    return items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAclsResponse that = (ListAclsResponse) o;
    return Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAclsResponse.class).add("items", items).toString();
  }
}
