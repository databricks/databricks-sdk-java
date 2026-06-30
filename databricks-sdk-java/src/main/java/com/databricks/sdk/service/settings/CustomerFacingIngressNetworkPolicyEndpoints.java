// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyEndpoints {
  /** */
  @JsonProperty("endpoint_ids")
  private Collection<String> endpointIds;

  public CustomerFacingIngressNetworkPolicyEndpoints setEndpointIds(
      Collection<String> endpointIds) {
    this.endpointIds = endpointIds;
    return this;
  }

  public Collection<String> getEndpointIds() {
    return endpointIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyEndpoints that =
        (CustomerFacingIngressNetworkPolicyEndpoints) o;
    return Objects.equals(endpointIds, that.endpointIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointIds);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyEndpoints.class)
        .add("endpointIds", endpointIds)
        .toString();
  }
}
