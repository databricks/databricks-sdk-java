// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Routing configuration for a model service, nesting destinations and fallback under a single
 * sub-message.
 */
@Generated
public class ModelServiceConfigRoutingConfig {
  /**
   * Primary routing destinations. At most 10 are allowed. At least one is required on Create. On
   * Update, provide this list when replacing the full `config` or updating
   * `config.routing.destinations`; other granular routing updates do not require resending
   * destinations. The intermediate `config.routing` mask path is not supported.
   */
  @JsonProperty("destinations")
  private Collection<ModelServiceConfigDestinationConfig> destinations;

  /**
   * Fallback routing applied after a primary destination fails. Fallback destinations are tried in
   * the listed order.
   */
  @JsonProperty("fallback")
  private ModelServiceConfigFallbackConfig fallback;

  public ModelServiceConfigRoutingConfig setDestinations(
      Collection<ModelServiceConfigDestinationConfig> destinations) {
    this.destinations = destinations;
    return this;
  }

  public Collection<ModelServiceConfigDestinationConfig> getDestinations() {
    return destinations;
  }

  public ModelServiceConfigRoutingConfig setFallback(ModelServiceConfigFallbackConfig fallback) {
    this.fallback = fallback;
    return this;
  }

  public ModelServiceConfigFallbackConfig getFallback() {
    return fallback;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelServiceConfigRoutingConfig that = (ModelServiceConfigRoutingConfig) o;
    return Objects.equals(destinations, that.destinations)
        && Objects.equals(fallback, that.fallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinations, fallback);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfigRoutingConfig.class)
        .add("destinations", destinations)
        .add("fallback", fallback)
        .toString();
  }
}
