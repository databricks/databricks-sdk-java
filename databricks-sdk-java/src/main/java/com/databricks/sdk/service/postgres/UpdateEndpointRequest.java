// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateEndpointRequest {
  /**
   * The Endpoint to update.
   *
   * <p>The endpoint's `name` field is used to identify the endpoint to update. Format:
   * projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}
   */
  @JsonProperty("endpoint")
  private Endpoint endpoint;

  /**
   * The resource name of the endpoint. Format:
   * projects/{project_id}/branches/{branch_id}/endpoints/{endpoint_id}
   */
  @JsonIgnore private String name;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateEndpointRequest setEndpoint(Endpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public Endpoint getEndpoint() {
    return endpoint;
  }

  public UpdateEndpointRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateEndpointRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateEndpointRequest that = (UpdateEndpointRequest) o;
    return Objects.equals(endpoint, that.endpoint)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEndpointRequest.class)
        .add("endpoint", endpoint)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
