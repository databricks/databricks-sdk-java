// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing model provider services. */
@Generated
public class ListModelProviderServicesResponse {
  /** The list of model provider services. */
  @JsonProperty("model_provider_services")
  private Collection<ModelProviderService> modelProviderServices;

  /** Pagination token for retrieving the next page. Empty when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListModelProviderServicesResponse setModelProviderServices(
      Collection<ModelProviderService> modelProviderServices) {
    this.modelProviderServices = modelProviderServices;
    return this;
  }

  public Collection<ModelProviderService> getModelProviderServices() {
    return modelProviderServices;
  }

  public ListModelProviderServicesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListModelProviderServicesResponse that = (ListModelProviderServicesResponse) o;
    return Objects.equals(modelProviderServices, that.modelProviderServices)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelProviderServices, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelProviderServicesResponse.class)
        .add("modelProviderServices", modelProviderServices)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
