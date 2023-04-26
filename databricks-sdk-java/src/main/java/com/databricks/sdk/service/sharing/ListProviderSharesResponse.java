// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListProviderSharesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListProviderSharesResponse {
  /** An array of provider shares. */
  @JsonProperty("shares")
  private Collection<ProviderShare> shares;

  /**
   * <p>Setter for the field <code>shares</code>.</p>
   *
   * @param shares a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.ListProviderSharesResponse} object
   */
  public ListProviderSharesResponse setShares(Collection<ProviderShare> shares) {
    this.shares = shares;
    return this;
  }

  /**
   * <p>Getter for the field <code>shares</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ProviderShare> getShares() {
    return shares;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderSharesResponse that = (ListProviderSharesResponse) o;
    return Objects.equals(shares, that.shares);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(shares);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListProviderSharesResponse.class).add("shares", shares).toString();
  }
}
