// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListModelsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListModelsResponse {
  /** Pagination token to request next page of models for the same query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("registered_models")
  private Collection<Model> registeredModels;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListModelsResponse} object
   */
  public ListModelsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>registeredModels</code>.</p>
   *
   * @param registeredModels a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ListModelsResponse} object
   */
  public ListModelsResponse setRegisteredModels(Collection<Model> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
  }

  /**
   * <p>Getter for the field <code>registeredModels</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Model> getRegisteredModels() {
    return registeredModels;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListModelsResponse that = (ListModelsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(registeredModels, that.registeredModels);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, registeredModels);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListModelsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("registeredModels", registeredModels)
        .toString();
  }
}
