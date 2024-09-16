// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a private endpoint rule */
@Generated
public class GetPrivateEndpointRuleRequest {
  /** Your Network Connectvity Configuration ID. */
  @JsonIgnore private String networkConnectivityConfigId;

  /** Your private endpoint rule ID. */
  @JsonIgnore private String privateEndpointRuleId;

  public GetPrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public GetPrivateEndpointRuleRequest setPrivateEndpointRuleId(String privateEndpointRuleId) {
    this.privateEndpointRuleId = privateEndpointRuleId;
    return this;
  }

  public String getPrivateEndpointRuleId() {
    return privateEndpointRuleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPrivateEndpointRuleRequest that = (GetPrivateEndpointRuleRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRuleId, that.privateEndpointRuleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, privateEndpointRuleId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPrivateEndpointRuleRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRuleId", privateEndpointRuleId)
        .toString();
  }
}
