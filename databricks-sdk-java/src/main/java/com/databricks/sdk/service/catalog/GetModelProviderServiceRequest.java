// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetModelProviderServiceRequest {
  /**
   * Resource name of the model provider service. Format:
   * `model-provider-services/{catalog}.{schema}.{model_provider_service}`. Each `{...}` component
   * is capped at 255 characters individually.
   */
  @JsonIgnore private String name;

  public GetModelProviderServiceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelProviderServiceRequest that = (GetModelProviderServiceRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelProviderServiceRequest.class).add("name", name).toString();
  }
}
