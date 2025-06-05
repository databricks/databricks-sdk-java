// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a network connectivity configuration */
@Generated
class GetNetworkConnectivityConfigurationRequestPb {
  @JsonIgnore private String networkConnectivityConfigId;

  public GetNetworkConnectivityConfigurationRequestPb setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetNetworkConnectivityConfigurationRequestPb that =
        (GetNetworkConnectivityConfigurationRequestPb) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetNetworkConnectivityConfigurationRequestPb.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .toString();
  }
}
