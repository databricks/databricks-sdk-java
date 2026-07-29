// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Fallback routing, applied after the primary destination returns a retryable error. Traversal is
 * in list order; the attempt count is the length of the list.
 */
@Generated
public class ModelServiceConfigFallbackConfig {
  /**
   * Ordered list of fallback destinations. Traversal is in list order; the attempt count is the
   * length of the list. At most 5 are allowed.
   */
  @JsonProperty("destinations")
  private Collection<ModelServiceConfigDestinationConfig> destinations;

  public ModelServiceConfigFallbackConfig setDestinations(
      Collection<ModelServiceConfigDestinationConfig> destinations) {
    this.destinations = destinations;
    return this;
  }

  public Collection<ModelServiceConfigDestinationConfig> getDestinations() {
    return destinations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelServiceConfigFallbackConfig that = (ModelServiceConfigFallbackConfig) o;
    return Objects.equals(destinations, that.destinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinations);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfigFallbackConfig.class)
        .add("destinations", destinations)
        .toString();
  }
}
