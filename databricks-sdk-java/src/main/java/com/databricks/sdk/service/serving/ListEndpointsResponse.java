// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListEndpointsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListEndpointsResponse {
  /** The list of endpoints. */
  @JsonProperty("endpoints")
  private Collection<ServingEndpoint> endpoints;

  /**
   * <p>Setter for the field <code>endpoints</code>.</p>
   *
   * @param endpoints a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.serving.ListEndpointsResponse} object
   */
  public ListEndpointsResponse setEndpoints(Collection<ServingEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * <p>Getter for the field <code>endpoints</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<ServingEndpoint> getEndpoints() {
    return endpoints;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListEndpointsResponse that = (ListEndpointsResponse) o;
    return Objects.equals(endpoints, that.endpoints);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(endpoints);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListEndpointsResponse.class).add("endpoints", endpoints).toString();
  }
}
