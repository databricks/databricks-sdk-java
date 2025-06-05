// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a network configuration */
@Generated
class DeleteNetworkRequestPb {
  @JsonIgnore private String networkId;

  public DeleteNetworkRequestPb setNetworkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  public String getNetworkId() {
    return networkId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteNetworkRequestPb that = (DeleteNetworkRequestPb) o;
    return Objects.equals(networkId, that.networkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteNetworkRequestPb.class).add("networkId", networkId).toString();
  }
}
