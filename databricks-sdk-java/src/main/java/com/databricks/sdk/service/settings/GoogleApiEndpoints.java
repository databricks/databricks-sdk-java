// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Wrapper for a list of Google API hostnames. Wrapped in a message because proto3 oneof does not
 * support repeated fields directly.
 */
@Generated
public class GoogleApiEndpoints {
  /**
   * Google API hostnames, e.g. "storage.googleapis.com", "bigquery.googleapis.com". Use
   * "googleapis.com" to cover all Google APIs.
   */
  @JsonProperty("endpoints")
  private Collection<String> endpoints;

  public GoogleApiEndpoints setEndpoints(Collection<String> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Collection<String> getEndpoints() {
    return endpoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GoogleApiEndpoints that = (GoogleApiEndpoints) o;
    return Objects.equals(endpoints, that.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints);
  }

  @Override
  public String toString() {
    return new ToStringer(GoogleApiEndpoints.class).add("endpoints", endpoints).toString();
  }
}
