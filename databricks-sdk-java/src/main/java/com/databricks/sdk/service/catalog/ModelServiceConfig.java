// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Operational configuration wrapped around the ModelService resource. */
@Generated
public class ModelServiceConfig {
  /** Inference table config for payload logging. */
  @JsonProperty("inference_table")
  private InferenceTableConfig inferenceTable;

  /** Rate limits applied to requests routed through this model service. */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  /** Routing configuration: destinations and fallback. */
  @JsonProperty("routing")
  private ModelServiceConfigRoutingConfig routing;

  public ModelServiceConfig setInferenceTable(InferenceTableConfig inferenceTable) {
    this.inferenceTable = inferenceTable;
    return this;
  }

  public InferenceTableConfig getInferenceTable() {
    return inferenceTable;
  }

  public ModelServiceConfig setRateLimits(Collection<RateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<RateLimit> getRateLimits() {
    return rateLimits;
  }

  public ModelServiceConfig setRouting(ModelServiceConfigRoutingConfig routing) {
    this.routing = routing;
    return this;
  }

  public ModelServiceConfigRoutingConfig getRouting() {
    return routing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelServiceConfig that = (ModelServiceConfig) o;
    return Objects.equals(inferenceTable, that.inferenceTable)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(routing, that.routing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inferenceTable, rateLimits, routing);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelServiceConfig.class)
        .add("inferenceTable", inferenceTable)
        .add("rateLimits", rateLimits)
        .add("routing", routing)
        .toString();
  }
}
