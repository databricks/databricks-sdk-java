// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a private endpoint rule */
@Generated
class DeletePrivateEndpointRuleRequestPb {
  @JsonIgnore private String networkConnectivityConfigId;

  @JsonIgnore private String privateEndpointRuleId;

  public DeletePrivateEndpointRuleRequestPb setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public DeletePrivateEndpointRuleRequestPb setPrivateEndpointRuleId(String privateEndpointRuleId) {
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
    DeletePrivateEndpointRuleRequestPb that = (DeletePrivateEndpointRuleRequestPb) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRuleId, that.privateEndpointRuleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, privateEndpointRuleId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePrivateEndpointRuleRequestPb.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRuleId", privateEndpointRuleId)
        .toString();
  }
}
