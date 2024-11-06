// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateProviderRequest {
  /** */
  @JsonIgnore private String id;

  /** */
  @JsonProperty("provider")
  private ProviderInfo provider;

  public UpdateProviderRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateProviderRequest setProvider(ProviderInfo provider) {
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
    UpdateProviderRequest that = (UpdateProviderRequest) o;
    return Objects.equals(id, that.id) && Objects.equals(provider, that.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, provider);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateProviderRequest.class)
        .add("id", id)
        .add("provider", provider)
        .toString();
  }
}
