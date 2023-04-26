// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>RepeatedEndpointConfPairs class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RepeatedEndpointConfPairs {
  /** Deprecated: Use configuration_pairs */
  @JsonProperty("config_pair")
  private Collection<EndpointConfPair> configPair;

  /** */
  @JsonProperty("configuration_pairs")
  private Collection<EndpointConfPair> configurationPairs;

  /**
   * <p>Setter for the field <code>configPair</code>.</p>
   *
   * @param configPair a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   */
  public RepeatedEndpointConfPairs setConfigPair(Collection<EndpointConfPair> configPair) {
    this.configPair = configPair;
    return this;
  }

  /**
   * <p>Getter for the field <code>configPair</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EndpointConfPair> getConfigPair() {
    return configPair;
  }

  /**
   * <p>Setter for the field <code>configurationPairs</code>.</p>
   *
   * @param configurationPairs a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   */
  public RepeatedEndpointConfPairs setConfigurationPairs(
      Collection<EndpointConfPair> configurationPairs) {
    this.configurationPairs = configurationPairs;
    return this;
  }

  /**
   * <p>Getter for the field <code>configurationPairs</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EndpointConfPair> getConfigurationPairs() {
    return configurationPairs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepeatedEndpointConfPairs that = (RepeatedEndpointConfPairs) o;
    return Objects.equals(configPair, that.configPair)
        && Objects.equals(configurationPairs, that.configurationPairs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(configPair, configurationPairs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(RepeatedEndpointConfPairs.class)
        .add("configPair", configPair)
        .add("configurationPairs", configurationPairs)
        .toString();
  }
}
