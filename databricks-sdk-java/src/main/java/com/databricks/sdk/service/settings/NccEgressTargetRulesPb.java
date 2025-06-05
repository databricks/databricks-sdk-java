// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Target rule controls the egress rules that are dedicated to specific resources. */
@Generated
class NccEgressTargetRulesPb {
  @JsonProperty("aws_private_endpoint_rules")
  private Collection<CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRule>
      awsPrivateEndpointRules;

  @JsonProperty("azure_private_endpoint_rules")
  private Collection<NccAzurePrivateEndpointRule> azurePrivateEndpointRules;

  public NccEgressTargetRulesPb setAwsPrivateEndpointRules(
      Collection<CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRule>
          awsPrivateEndpointRules) {
    this.awsPrivateEndpointRules = awsPrivateEndpointRules;
    return this;
  }

  public Collection<CustomerFacingNetworkConnectivityConfigAwsPrivateEndpointRule>
      getAwsPrivateEndpointRules() {
    return awsPrivateEndpointRules;
  }

  public NccEgressTargetRulesPb setAzurePrivateEndpointRules(
      Collection<NccAzurePrivateEndpointRule> azurePrivateEndpointRules) {
    this.azurePrivateEndpointRules = azurePrivateEndpointRules;
    return this;
  }

  public Collection<NccAzurePrivateEndpointRule> getAzurePrivateEndpointRules() {
    return azurePrivateEndpointRules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccEgressTargetRulesPb that = (NccEgressTargetRulesPb) o;
    return Objects.equals(awsPrivateEndpointRules, that.awsPrivateEndpointRules)
        && Objects.equals(azurePrivateEndpointRules, that.azurePrivateEndpointRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsPrivateEndpointRules, azurePrivateEndpointRules);
  }

  @Override
  public String toString() {
    return new ToStringer(NccEgressTargetRulesPb.class)
        .add("awsPrivateEndpointRules", awsPrivateEndpointRules)
        .add("azurePrivateEndpointRules", azurePrivateEndpointRules)
        .toString();
  }
}
