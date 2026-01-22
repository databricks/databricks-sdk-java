// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateEndpointRequest {
  /** The Endpoint to create. */
  @JsonProperty("endpoint")
  private Endpoint endpoint;

  /**
   * The ID to use for the Endpoint. This becomes the final component of the endpoint's resource
   * name. The ID is required and must be 1-63 characters long, start with a lowercase letter, and
   * contain only lowercase letters, numbers, and hyphens. For example, `primary` becomes
   * `projects/my-app/branches/development/endpoints/primary`.
   */
  @JsonIgnore
  @QueryParam("endpoint_id")
  private String endpointId;

  /**
   * The Branch where this Endpoint will be created. Format:
   * projects/{project_id}/branches/{branch_id}
   */
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
