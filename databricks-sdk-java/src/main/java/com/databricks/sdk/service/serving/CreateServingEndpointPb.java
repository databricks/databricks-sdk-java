// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateServingEndpointPb {
  @JsonProperty("ai_gateway")
  private AiGatewayConfig aiGateway;

  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  @JsonProperty("config")
  private EndpointCoreConfigInput config;

  @JsonProperty("name")
  private String name;

  @JsonProperty("rate_limits")
  private Collection<RateLimit> rateLimits;

  @JsonProperty("route_optimized")
  private Boolean routeOptimized;

  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  public CreateServingEndpointPb setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public CreateServingEndpointPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public CreateServingEndpointPb setConfig(EndpointCoreConfigInput config) {
    this.config = config;
    return this;
  }

  public EndpointCoreConfigInput getConfig() {
    return config;
  }

  public CreateServingEndpointPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateServingEndpointPb setRateLimits(Collection<RateLimit> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public Collection<RateLimit> getRateLimits() {
    return rateLimits;
  }

  public CreateServingEndpointPb setRouteOptimized(Boolean routeOptimized) {
    this.routeOptimized = routeOptimized;
    return this;
  }

  public Boolean getRouteOptimized() {
    return routeOptimized;
  }

  public CreateServingEndpointPb setTags(Collection<EndpointTag> tags) {
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
    CreateServingEndpointPb that = (CreateServingEndpointPb) o;
    return Objects.equals(aiGateway, that.aiGateway)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(config, that.config)
        && Objects.equals(name, that.name)
        && Objects.equals(rateLimits, that.rateLimits)
        && Objects.equals(routeOptimized, that.routeOptimized)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiGateway, budgetPolicyId, config, name, rateLimits, routeOptimized, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateServingEndpointPb.class)
        .add("aiGateway", aiGateway)
        .add("budgetPolicyId", budgetPolicyId)
        .add("config", config)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .add("routeOptimized", routeOptimized)
        .add("tags", tags)
        .toString();
  }
}
