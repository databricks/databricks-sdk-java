// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListSharesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListSharesResponse {
  /** An array of data share information objects. */
  @JsonProperty("shares")
  private Collection<ShareInfo> shares;

  /**
   * <p>Setter for the field <code>shares</code>.</p>
   *
   * @param shares a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.ListSharesResponse} object
   */
  public ListSharesResponse setShares(Collection<ShareInfo> shares) {
    this.shares = shares;
    return this;
  }

  /**
   * <p>Getter for the field <code>shares</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ShareInfo> getShares() {
    return shares;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSharesResponse that = (ListSharesResponse) o;
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
    return new ToStringer(ListSharesResponse.class).add("shares", shares).toString();
  }
}
