// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * The stable Azure service endpoints. You can configure the firewall of your Azure resources to
 * allow traffic from your Databricks serverless compute resources.
 */
@Generated
class NccAzureServiceEndpointRulePb {
  @JsonProperty("subnets")
  private Collection<String> subnets;

  @JsonProperty("target_region")
  private String targetRegion;

  @JsonProperty("target_services")
  private Collection<EgressResourceType> targetServices;

  public NccAzureServiceEndpointRulePb setSubnets(Collection<String> subnets) {
    this.subnets = subnets;
    return this;
  }

  public Collection<String> getSubnets() {
    return subnets;
  }

  public NccAzureServiceEndpointRulePb setTargetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }

  public String getTargetRegion() {
    return targetRegion;
  }

  public NccAzureServiceEndpointRulePb setTargetServices(
      Collection<EgressResourceType> targetServices) {
    this.targetServices = targetServices;
    return this;
  }

  public Collection<EgressResourceType> getTargetServices() {
    return targetServices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccAzureServiceEndpointRulePb that = (NccAzureServiceEndpointRulePb) o;
    return Objects.equals(subnets, that.subnets)
        && Objects.equals(targetRegion, that.targetRegion)
        && Objects.equals(targetServices, that.targetServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnets, targetRegion, targetServices);
  }

  @Override
  public String toString() {
    return new ToStringer(NccAzureServiceEndpointRulePb.class)
        .add("subnets", subnets)
        .add("targetRegion", targetRegion)
        .add("targetServices", targetServices)
        .toString();
  }
}
