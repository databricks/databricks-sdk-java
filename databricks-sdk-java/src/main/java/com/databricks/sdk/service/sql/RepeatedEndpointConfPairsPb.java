// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class RepeatedEndpointConfPairsPb {
  @JsonProperty("config_pair")
  private Collection<EndpointConfPair> configPair;

  @JsonProperty("configuration_pairs")
  private Collection<EndpointConfPair> configurationPairs;

  public RepeatedEndpointConfPairsPb setConfigPair(Collection<EndpointConfPair> configPair) {
    this.configPair = configPair;
    return this;
  }

  public Collection<EndpointConfPair> getConfigPair() {
    return configPair;
  }

  public RepeatedEndpointConfPairsPb setConfigurationPairs(
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
    RepeatedEndpointConfPairsPb that = (RepeatedEndpointConfPairsPb) o;
    return Objects.equals(configPair, that.configPair)
        && Objects.equals(configurationPairs, that.configurationPairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configPair, configurationPairs);
  }

  @Override
  public String toString() {
    return new ToStringer(RepeatedEndpointConfPairsPb.class)
        .add("configPair", configPair)
        .add("configurationPairs", configurationPairs)
        .toString();
  }
}
