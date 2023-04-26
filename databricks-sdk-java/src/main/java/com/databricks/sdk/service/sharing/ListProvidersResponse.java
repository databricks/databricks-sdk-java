// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListProvidersResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListProvidersResponse {
  /** An array of provider information objects. */
  @JsonProperty("providers")
  private Collection<ProviderInfo> providers;

  /**
   * <p>Setter for the field <code>providers</code>.</p>
   *
   * @param providers a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.ListProvidersResponse} object
   */
  public ListProvidersResponse setProviders(Collection<ProviderInfo> providers) {
    this.providers = providers;
    return this;
  }

  /**
   * <p>Getter for the field <code>providers</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ProviderInfo> getProviders() {
    return providers;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProvidersResponse that = (ListProvidersResponse) o;
    return Objects.equals(providers, that.providers);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(providers);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListProvidersResponse.class).add("providers", providers).toString();
  }
}
