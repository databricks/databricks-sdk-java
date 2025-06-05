// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update a private endpoint rule */
@Generated
class UpdateNccPrivateEndpointRuleRequestPb {
  @JsonIgnore private String networkConnectivityConfigId;

  @JsonProperty("private_endpoint_rule")
  private UpdatePrivateEndpointRule privateEndpointRule;

  @JsonIgnore private String privateEndpointRuleId;

  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateNccPrivateEndpointRuleRequestPb setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public UpdateNccPrivateEndpointRuleRequestPb setPrivateEndpointRule(
      UpdatePrivateEndpointRule privateEndpointRule) {
    this.privateEndpointRule = privateEndpointRule;
    return this;
  }

  public UpdatePrivateEndpointRule getPrivateEndpointRule() {
    return privateEndpointRule;
  }

  public UpdateNccPrivateEndpointRuleRequestPb setPrivateEndpointRuleId(
      String privateEndpointRuleId) {
    this.privateEndpointRuleId = privateEndpointRuleId;
    return this;
  }

  public String getPrivateEndpointRuleId() {
    return privateEndpointRuleId;
  }

  public UpdateNccPrivateEndpointRuleRequestPb setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateNccPrivateEndpointRuleRequestPb that = (UpdateNccPrivateEndpointRuleRequestPb) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRule, that.privateEndpointRule)
        && Objects.equals(privateEndpointRuleId, that.privateEndpointRuleId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        networkConnectivityConfigId, privateEndpointRule, privateEndpointRuleId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNccPrivateEndpointRuleRequestPb.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRule", privateEndpointRule)
        .add("privateEndpointRuleId", privateEndpointRuleId)
        .add("updateMask", updateMask)
        .toString();
  }
}
