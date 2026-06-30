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
public class NccAzureServiceEndpointRule {
  /**
   * The list of subnets from which Databricks network traffic originates when accessing your Azure
   * resources.
   */
  @JsonProperty("subnets")
  private Collection<String> subnets;

  /** The Azure region in which this service endpoint rule applies.. */
  @JsonProperty("target_region")
  private String targetRegion;

  /** The Azure services to which this service endpoint rule applies to. */
  @JsonProperty("target_services")
  private Collection<EgressResourceType> targetServices;

  public NccAzureServiceEndpointRule setSubnets(Collection<String> subnets) {
    this.subnets = subnets;
    return this;
  }

  public Collection<String> getSubnets() {
    return subnets;
  }

  public NccAzureServiceEndpointRule setTargetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }

  public String getTargetRegion() {
    return targetRegion;
  }

  public NccAzureServiceEndpointRule setTargetServices(
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
    NccAzureServiceEndpointRule that = (NccAzureServiceEndpointRule) o;
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
    return new ToStringer(NccAzureServiceEndpointRule.class)
        .add("subnets", subnets)
        .add("targetRegion", targetRegion)
        .add("targetServices", targetServices)
        .toString();
  }
}
