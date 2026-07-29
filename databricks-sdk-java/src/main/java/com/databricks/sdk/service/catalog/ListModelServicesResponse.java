// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing model services. */
@Generated
public class ListModelServicesResponse {
  /** The list of model services. */
  @JsonProperty("model_services")
  private Collection<ModelService> modelServices;

  /** Pagination token for retrieving the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListModelServicesResponse setModelServices(Collection<ModelService> modelServices) {
    this.modelServices = modelServices;
    return this;
  }

  public Collection<ModelService> getModelServices() {
    return modelServices;
  }

  public ListModelServicesResponse setNextPageToken(String nextPageToken) {
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
    ListModelServicesResponse that = (ListModelServicesResponse) o;
    return Objects.equals(modelServices, that.modelServices)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelServices, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListModelServicesResponse.class)
        .add("modelServices", modelServices)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
