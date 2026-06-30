// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreatePrivateEndpointRuleRequest {
  /** Your Network Connectivity Configuration ID. */
  @JsonIgnore private String networkConnectivityConfigId;

  /** */
  @JsonProperty("private_endpoint_rule")
  private CreatePrivateEndpointRule privateEndpointRule;

  public CreatePrivateEndpointRuleRequest setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public CreatePrivateEndpointRuleRequest setPrivateEndpointRule(
      CreatePrivateEndpointRule privateEndpointRule) {
    this.privateEndpointRule = privateEndpointRule;
    return this;
  }

  public CreatePrivateEndpointRule getPrivateEndpointRule() {
    return privateEndpointRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePrivateEndpointRuleRequest that = (CreatePrivateEndpointRuleRequest) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(privateEndpointRule, that.privateEndpointRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, privateEndpointRule);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePrivateEndpointRuleRequest.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("privateEndpointRule", privateEndpointRule)
        .toString();
  }
}
