// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a network connectivity configuration */
@Generated
public class DeleteNetworkConnectivityConfigurationRequest {
  /** Your Network Connectvity Configuration ID. */
  private String networkConnectivityConfigId;

  public DeleteNetworkConnectivityConfigurationRequest setNetworkConnectivityConfigId(
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
    DeleteNetworkConnectivityConfigurationRequest that =
        (DeleteNetworkConnectivityConfigurationRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteNetworkConnectivityConfigurationRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .toString();
  }
}
