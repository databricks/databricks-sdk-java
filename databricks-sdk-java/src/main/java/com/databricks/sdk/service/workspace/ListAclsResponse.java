// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListAclsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListAclsResponse {
  /** The associated ACLs rule applied to principals in the given scope. */
  @JsonProperty("items")
  private Collection<AclItem> items;

  /**
   * <p>Setter for the field <code>items</code>.</p>
   *
   * @param items a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.workspace.ListAclsResponse} object
   */
  public ListAclsResponse setItems(Collection<AclItem> items) {
    this.items = items;
    return this;
  }

  /**
   * <p>Getter for the field <code>items</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<AclItem> getItems() {
    return items;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAclsResponse that = (ListAclsResponse) o;
    return Objects.equals(items, that.items);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListAclsResponse.class).add("items", items).toString();
  }
}
