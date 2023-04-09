// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListSharesResponse {
  /** An array of data share information objects. */
  @JsonProperty("shares")
  private Collection<ShareInfo> shares;

  public ListSharesResponse setShares(Collection<ShareInfo> shares) {
    this.shares = shares;
    return this;
  }

  public Collection<ShareInfo> getShares() {
    return shares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSharesResponse that = (ListSharesResponse) o;
    return Objects.equals(shares, that.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shares);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSharesResponse.class).add("shares", shares).toString();
  }
}
