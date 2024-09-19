// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateServingEndpoint {
  /**
   * The AI Gateway configuration for the serving endpoint. NOTE: only external model endpoints are
   * supported as of now.
   */
  @JsonProperty("ai_gateway")
  private AiGatewayConfig aiGateway;

  /** The core config of the serving endpoint. */
  @JsonProperty("config")
  private EndpointCoreConfigInput config;

  /**
   * The name of the serving endpoint. This field is required and must be unique across a Databricks
   * workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Rate limits to be applied to the serving endpoint. NOTE: this field is deprecated, please use
   * AI Gateway to manage rate limits.
   */
  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  /** Enable route optimization for the serving endpoint. */
  @JsonProperty("route_optimized")
  private Boolean routeOptimized;

  /** Tags to be attached to the serving endpoint and automatically propagated to billing logs. */
  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  public CreateServingEndpoint setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public CreateServingEndpoint setConfig(EndpointCoreConfigInput config) {
    this.config = config;
    return this;
  }

  public EndpointCoreConfigInput getConfig() {
    return config;
  }

  public CreateServingEndpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateServingEndpoint setRateLimits(Collection<RateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<RateLimit> getRateLimits() {
    return rateLimits;
  }

  public CreateServingEndpoint setRouteOptimized(Boolean routeOptimized) {
    this.routeOptimized = routeOptimized;
    return this;
  }

  public Boolean getRouteOptimized() {
    return routeOptimized;
  }

  public CreateServingEndpoint setTags(Collection<EndpointTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<EndpointTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateServingEndpoint that = (CreateServingEndpoint) o;
    return Objects.equals(aiGateway, that.aiGateway)
        && Objects.equals(config, that.config)
        && Objects.equals(name, that.name)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(routeOptimized, that.routeOptimized)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiGateway, config, name, rateLimits, routeOptimized, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServingEndpoint.class)
        .add("aiGateway", aiGateway)
        .add("config", config)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .add("routeOptimized", routeOptimized)
        .add("tags", tags)
        .toString();
  }
}
