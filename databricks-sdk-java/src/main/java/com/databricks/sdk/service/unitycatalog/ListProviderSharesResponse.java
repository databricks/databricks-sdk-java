// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListProviderSharesResponse {
  /** An array of provider shares. */
  @JsonProperty("shares")
  private Collection<ProviderShare> shares;

  public ListProviderSharesResponse setShares(Collection<ProviderShare> shares) {
    this.shares = shares;
    return this;
  }

  public Collection<ProviderShare> getShares() {
    return shares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderSharesResponse that = (ListProviderSharesResponse) o;
    return Objects.equals(shares, that.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shares);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderSharesResponse.class).add("shares", shares).toString();
  }
}
