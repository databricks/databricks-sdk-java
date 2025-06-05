// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a network policy */
@Generated
class GetNetworkPolicyRequestPb {
  @JsonIgnore private String networkPolicyId;

  public GetNetworkPolicyRequestPb setNetworkPolicyId(String networkPolicyId) {
    this.networkPolicyId = networkPolicyId;
    return this;
  }

  public String getNetworkPolicyId() {
    return networkPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetNetworkPolicyRequestPb that = (GetNetworkPolicyRequestPb) o;
    return Objects.equals(networkPolicyId, that.networkPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetNetworkPolicyRequestPb.class)
        .add("networkPolicyId", networkPolicyId)
        .toString();
  }
}
