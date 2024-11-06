// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateProviderResponse {
  /** */
  @JsonProperty("provider")
  private ProviderInfo provider;

  public UpdateProviderResponse setProvider(ProviderInfo provider) {
    this.provider = provider;
    return this;
  }

  public ProviderInfo getProvider() {
    return provider;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateProviderResponse that = (UpdateProviderResponse) o;
    return Objects.equals(provider, that.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProviderResponse.class).add("provider", provider).toString();
  }
}
