// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreatePtEndpointRequestPb {
  @JsonProperty("ai_gateway")
  private AiGatewayConfig aiGateway;

  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  @JsonProperty("config")
  private PtEndpointCoreConfig config;

  @JsonProperty("name")
  private String name;

  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  public CreatePtEndpointRequestPb setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public CreatePtEndpointRequestPb setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public CreatePtEndpointRequestPb setConfig(PtEndpointCoreConfig config) {
    this.config = config;
    return this;
  }

  public PtEndpointCoreConfig getConfig() {
    return config;
  }

  public CreatePtEndpointRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreatePtEndpointRequestPb setTags(Collection<EndpointTag> tags) {
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
    CreatePtEndpointRequestPb that = (CreatePtEndpointRequestPb) o;
    return Objects.equals(aiGateway, that.aiGateway)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(config, that.config)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiGateway, budgetPolicyId, config, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePtEndpointRequestPb.class)
        .add("aiGateway", aiGateway)
        .add("budgetPolicyId", budgetPolicyId)
        .add("config", config)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
