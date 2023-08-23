// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListRegisteredModelsResponse {
  /**
   * Opaque token for pagination. Omitted if there are no more results. page_token should be set to
   * this value for fetching the next page.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("registered_models")
  private Collection<RegisteredModelInfo> registeredModels;

  public ListRegisteredModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRegisteredModelsResponse setRegisteredModels(
      Collection<RegisteredModelInfo> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
  }

  public Collection<RegisteredModelInfo> getRegisteredModels() {
    return registeredModels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRegisteredModelsResponse that = (ListRegisteredModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRegisteredModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }
}
