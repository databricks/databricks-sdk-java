// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The network connectivity rules that are applied by default without resource specific
 * configurations. You can find the stable network information of your serverless compute resources
 * here.
 */
@Generated
public class NccEgressDefaultRules {
  /**
   * The stable Azure service endpoints. You can configure the firewall of your Azure resources to
   * allow traffic from your Databricks serverless compute resources.
   */
  @JsonProperty("azure_service_endpoint_rule")
  private NccAzureServiceEndpointRule azureServiceEndpointRule;

  public NccEgressDefaultRules setAzureServiceEndpointRule(
      NccAzureServiceEndpointRule azureServiceEndpointRule) {
    this.azureServiceEndpointRule = azureServiceEndpointRule;
    return this;
  }

  public NccAzureServiceEndpointRule getAzureServiceEndpointRule() {
    return azureServiceEndpointRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccEgressDefaultRules that = (NccEgressDefaultRules) o;
    return Objects.equals(azureServiceEndpointRule, that.azureServiceEndpointRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureServiceEndpointRule);
  }

  @Override
  public String toString() {
    return new ToStringer(NccEgressDefaultRules.class)
        .add("azureServiceEndpointRule", azureServiceEndpointRule)
        .toString();
  }
}
