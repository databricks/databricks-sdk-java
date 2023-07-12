// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RepeatedEndpointConfPairs {
  /** Deprecated: Use configuration_pairs */
  @JsonProperty("config_pair")
  private Collection<EndpointConfPair> configPair;

  /** */
  @JsonProperty("configuration_pairs")
  private Collection<EndpointConfPair> configurationPairs;

  public RepeatedEndpointConfPairs setConfigPair(Collection<EndpointConfPair> configPair) {
    this.configPair = configPair;
    return this;
  }

  public Collection<EndpointConfPair> getConfigPair() {
    return configPair;
  }

  public RepeatedEndpointConfPairs setConfigurationPairs(
      Collection<EndpointConfPair> configurationPairs) {
    this.configurationPairs = configurationPairs;
    return this;
  }

  public Collection<EndpointConfPair> getConfigurationPairs() {
    return configurationPairs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepeatedEndpointConfPairs that = (RepeatedEndpointConfPairs) o;
    return Objects.equals(configPair, that.configPair)
        && Objects.equals(configurationPairs, that.configurationPairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configPair, configurationPairs);
  }

  @Override
  public String toString() {
    return new ToStringer(RepeatedEndpointConfPairs.class)
        .add("configPair", configPair)
        .add("configurationPairs", configurationPairs)
        .toString();
  }
}
