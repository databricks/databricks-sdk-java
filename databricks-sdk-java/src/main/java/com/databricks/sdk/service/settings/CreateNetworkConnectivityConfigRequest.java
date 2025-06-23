// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateNetworkConnectivityConfigRequest {
  /** Properties of the new network connectivity configuration. */
  @JsonProperty("network_connectivity_config")
  private CreateNetworkConnectivityConfiguration networkConnectivityConfig;

  public CreateNetworkConnectivityConfigRequest setNetworkConnectivityConfig(
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
    CreateNetworkConnectivityConfigRequest that = (CreateNetworkConnectivityConfigRequest) o;
    return Objects.equals(networkConnectivityConfig, that.networkConnectivityConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNetworkConnectivityConfigRequest.class)
        .add("networkConnectivityConfig", networkConnectivityConfig)
        .toString();
  }
}
