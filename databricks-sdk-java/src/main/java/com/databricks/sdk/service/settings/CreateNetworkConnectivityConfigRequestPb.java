// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create a network connectivity configuration */
@Generated
class CreateNetworkConnectivityConfigRequestPb {
  @JsonProperty("network_connectivity_config")
  private CreateNetworkConnectivityConfiguration networkConnectivityConfig;

  public CreateNetworkConnectivityConfigRequestPb setNetworkConnectivityConfig(
      CreateNetworkConnectivityConfiguration networkConnectivityConfig) {
    this.networkConnectivityConfig = networkConnectivityConfig;
    return this;
  }

  public CreateNetworkConnectivityConfiguration getNetworkConnectivityConfig() {
    return networkConnectivityConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNetworkConnectivityConfigRequestPb that = (CreateNetworkConnectivityConfigRequestPb) o;
    return Objects.equals(networkConnectivityConfig, that.networkConnectivityConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkConnectivityConfigRequestPb.class)
        .add("networkConnectivityConfig", networkConnectivityConfig)
        .toString();
  }
}
