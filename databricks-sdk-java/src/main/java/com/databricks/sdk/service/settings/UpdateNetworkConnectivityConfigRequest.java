// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateNetworkConnectivityConfigRequest {
  /** The network connectivity configuration fields to update. */
  @JsonProperty("network_connectivity_config")
  private NetworkConnectivityConfiguration networkConnectivityConfig;

  /** Your Network Connectivity Configuration ID. */
  @JsonIgnore private String networkConnectivityConfigId;

  /** Must contain at least one of `name` or `billing_workspace_id`. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateNetworkConnectivityConfigRequest setNetworkConnectivityConfig(
      NetworkConnectivityConfiguration networkConnectivityConfig) {
    this.networkConnectivityConfig = networkConnectivityConfig;
    return this;
  }

  public NetworkConnectivityConfiguration getNetworkConnectivityConfig() {
    return networkConnectivityConfig;
  }

  public UpdateNetworkConnectivityConfigRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public UpdateNetworkConnectivityConfigRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateNetworkConnectivityConfigRequest that = (UpdateNetworkConnectivityConfigRequest) o;
    return Objects.equals(networkConnectivityConfig, that.networkConnectivityConfig)
        && Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfig, networkConnectivityConfigId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNetworkConnectivityConfigRequest.class)
        .add("networkConnectivityConfig", networkConnectivityConfig)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("updateMask", updateMask)
        .toString();
  }
}
