// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Default rules don't have specific targets. */
@Generated
public class NccEgressDefaultRules {
  /** */
  @JsonProperty("aws_stable_ip_rule")
  private NccAwsStableIpRule awsStableIpRule;

  /** */
  @JsonProperty("azure_service_endpoint_rule")
  private NccAzureServiceEndpointRule azureServiceEndpointRule;

  /** */
  @JsonProperty("gcp_project_id_rule")
  private NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule gcpProjectIdRule;

  public NccEgressDefaultRules setAwsStableIpRule(NccAwsStableIpRule awsStableIpRule) {
    this.awsStableIpRule = awsStableIpRule;
    return this;
  }

  public NccAwsStableIpRule getAwsStableIpRule() {
    return awsStableIpRule;
  }

  public NccEgressDefaultRules setAzureServiceEndpointRule(
      NccAzureServiceEndpointRule azureServiceEndpointRule) {
    this.azureServiceEndpointRule = azureServiceEndpointRule;
    return this;
  }

  public NccAzureServiceEndpointRule getAzureServiceEndpointRule() {
    return azureServiceEndpointRule;
  }

  public NccEgressDefaultRules setGcpProjectIdRule(
      NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule gcpProjectIdRule) {
    this.gcpProjectIdRule = gcpProjectIdRule;
    return this;
  }

  public NetworkConnectivityConfigEgressConfigDefaultRuleGcpProjectIdRule getGcpProjectIdRule() {
    return gcpProjectIdRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NccEgressDefaultRules that = (NccEgressDefaultRules) o;
    return Objects.equals(awsStableIpRule, that.awsStableIpRule)
        && Objects.equals(azureServiceEndpointRule, that.azureServiceEndpointRule)
        && Objects.equals(gcpProjectIdRule, that.gcpProjectIdRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsStableIpRule, azureServiceEndpointRule, gcpProjectIdRule);
  }

  @Override
  public String toString() {
    return new ToStringer(NccEgressDefaultRules.class)
        .add("awsStableIpRule", awsStableIpRule)
        .add("azureServiceEndpointRule", azureServiceEndpointRule)
        .add("gcpProjectIdRule", gcpProjectIdRule)
        .toString();
  }
}
