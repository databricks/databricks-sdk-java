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
  /**
   * The endpoint to create. Only `spec` is read from this message; the system sets the other
   * fields.
   */
  @JsonProperty("endpoint")
  private Endpoint endpoint;

  /**
   * The ID to use for the endpoint. It becomes the final segment of the endpoint's resource name,
   * `projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}`. The ID must be 3 to 63
   * characters long, start with a lowercase letter, end with a lowercase letter or digit, and
   * contain only lowercase letters, digits, and hyphens.
   */
  @JsonIgnore
  @QueryParam("endpoint_id")
  private String endpointId;

  /**
   * The Branch where this Endpoint will be created. Format:
   * projects/{project_id}/branches/{branch_id}
   */
  @JsonIgnore private String parent;

  /**
   * If true, update the endpoint if it already exists instead of returning an error. The request's
   * `spec.endpoint_type` must match the existing endpoint's type, and the other `spec` fields are
   * applied as an update. Use this to configure the read-write endpoint that was created together
   * with the branch.
   */
  @JsonIgnore
  @QueryParam("replace_existing")
  private Boolean replaceExisting;

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

  public CreateEndpointRequest setReplaceExisting(Boolean replaceExisting) {
    this.replaceExisting = replaceExisting;
    return this;
  }

  public Boolean getReplaceExisting() {
    return replaceExisting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateEndpointRequest that = (CreateEndpointRequest) o;
    return Objects.equals(endpoint, that.endpoint)
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(parent, that.parent)
        && Objects.equals(replaceExisting, that.replaceExisting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, endpointId, parent, replaceExisting);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateEndpointRequest.class)
        .add("endpoint", endpoint)
        .add("endpointId", endpointId)
        .add("parent", parent)
        .add("replaceExisting", replaceExisting)
        .toString();
  }
}
