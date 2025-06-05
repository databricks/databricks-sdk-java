// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListAclsResponsePb {
  @JsonProperty("items")
  private Collection<AclItem> items;

  public ListAclsResponsePb setItems(Collection<AclItem> items) {
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
    ListAclsResponsePb that = (ListAclsResponsePb) o;
    return Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAclsResponsePb.class).add("items", items).toString();
  }
}
