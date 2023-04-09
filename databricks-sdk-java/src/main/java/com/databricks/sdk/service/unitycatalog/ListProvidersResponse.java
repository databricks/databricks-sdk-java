// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListProvidersResponse {
  /** An array of provider information objects. */
  @JsonProperty("providers")
  private Collection<ProviderInfo> providers;

  public ListProvidersResponse setProviders(Collection<ProviderInfo> providers) {
    this.providers = providers;
    return this;
  }

  public Collection<ProviderInfo> getProviders() {
    return providers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProvidersResponse that = (ListProvidersResponse) o;
    return Objects.equals(providers, that.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providers);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProvidersResponse.class).add("providers", providers).toString();
  }
}
