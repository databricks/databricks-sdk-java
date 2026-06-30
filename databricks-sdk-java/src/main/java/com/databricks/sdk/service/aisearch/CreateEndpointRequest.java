// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateEndpointRequest {
  /**
   * The Endpoint resource to create. Fields other than `endpoint.name` carry the desired
   * configuration; `endpoint.name` is server-assigned from `parent` and `endpoint_id`.
   */
  @JsonProperty("endpoint")
  private Endpoint endpoint;

  /**
   * The user-supplied short name for the Endpoint, per AIP-133. The server composes the full
   * `Endpoint.name` as `{parent}/endpoints/{endpoint_id}`. AIP-133 does not list `endpoint_id` as a
   * fields-may-be-required entry, so we annotate it OPTIONAL on the wire; the server still rejects
   * empty values with INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("endpoint_id")
  private String endpointId;

  /** The Workspace where this Endpoint will be created. Format: `workspaces/{workspace_id}` */
  @JsonIgnore private String parent;

  public CreateEndpointRequest setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public CreateEndpointRequest setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public CreateEndpointRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateEndpointRequest that = (CreateEndpointRequest) o;
    return Objects.equals(endpoint, that.endpoint)
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, endpointId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateEndpointRequest.class)
        .add("endpoint", endpoint)
        .add("endpointId", endpointId)
        .add("parent", parent)
        .toString();
  }
}
