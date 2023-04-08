// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepeatedEndpointConfPairs {
  /** Deprecated: Use configuration_pairs */
  @JsonProperty("config_pair")
  private java.util.List<EndpointConfPair> configPair;

  /** */
  @JsonProperty("configuration_pairs")
  private java.util.List<EndpointConfPair> configurationPairs;

  public RepeatedEndpointConfPairs setConfigPair(java.util.List<EndpointConfPair> configPair) {
    this.configPair = configPair;
    return this;
  }

  public java.util.List<EndpointConfPair> getConfigPair() {
    return configPair;
  }

  public RepeatedEndpointConfPairs setConfigurationPairs(
      java.util.List<EndpointConfPair> configurationPairs) {
    this.configurationPairs = configurationPairs;
    return this;
  }

  public java.util.List<EndpointConfPair> getConfigurationPairs() {
    return configurationPairs;
  }
}
