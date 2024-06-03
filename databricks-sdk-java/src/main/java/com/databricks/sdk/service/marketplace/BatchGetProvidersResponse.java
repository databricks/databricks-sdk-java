// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class BatchGetProvidersResponse {
  /** */
  @JsonProperty("providers")
  private Collection<ProviderInfo> providers;

  public BatchGetProvidersResponse setProviders(Collection<ProviderInfo> providers) {
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
    BatchGetProvidersResponse that = (BatchGetProvidersResponse) o;
    return Objects.equals(providers, that.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providers);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchGetProvidersResponse.class).add("providers", providers).toString();
  }
}
