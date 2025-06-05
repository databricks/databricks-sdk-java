// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update a network policy */
@Generated
class UpdateNetworkPolicyRequestPb {
  @JsonProperty("network_policy")
  private AccountNetworkPolicy networkPolicy;

  @JsonIgnore private String networkPolicyId;

  public UpdateNetworkPolicyRequestPb setNetworkPolicy(AccountNetworkPolicy networkPolicy) {
    this.networkPolicy = networkPolicy;
    return this;
  }

  public AccountNetworkPolicy getNetworkPolicy() {
    return networkPolicy;
  }

  public UpdateNetworkPolicyRequestPb setNetworkPolicyId(String networkPolicyId) {
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
    UpdateNetworkPolicyRequestPb that = (UpdateNetworkPolicyRequestPb) o;
    return Objects.equals(networkPolicy, that.networkPolicy)
        && Objects.equals(networkPolicyId, that.networkPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkPolicy, networkPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNetworkPolicyRequestPb.class)
        .add("networkPolicy", networkPolicy)
        .add("networkPolicyId", networkPolicyId)
        .toString();
  }
}
