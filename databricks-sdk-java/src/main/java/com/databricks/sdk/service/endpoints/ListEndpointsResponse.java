// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListEndpointsResponse {
  /** The list of endpoints. */
  @JsonProperty("endpoints")
  private java.util.List<ServingEndpoint> endpoints;

  public ListEndpointsResponse setEndpoints(java.util.List<ServingEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public java.util.List<ServingEndpoint> getEndpoints() {
    return endpoints;
  }
}
