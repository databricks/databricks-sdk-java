// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreatePtEndpointRequest {
  /** The AI Gateway configuration for the serving endpoint. */
  @JsonProperty("ai_gateway")
  private AiGatewayConfig aiGateway;

  /** The budget policy associated with the endpoint. */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** The core config of the serving endpoint. */
  @JsonProperty("config")
  private PtEndpointCoreConfig config;

  /**
   * The name of the serving endpoint. This field is required and must be unique across a Databricks
   * workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores.
   */
  @JsonProperty("name")
  private String name;

  /** Tags to be attached to the serving endpoint and automatically propagated to billing logs. */
  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  public CreatePtEndpointRequest setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public CreatePtEndpointRequest setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public CreatePtEndpointRequest setConfig(PtEndpointCoreConfig config) {
    this.config = config;
    return this;
  }

  public PtEndpointCoreConfig getConfig() {
    return config;
  }

  public CreatePtEndpointRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreatePtEndpointRequest setTags(Collection<EndpointTag> tags) {
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
    CreatePtEndpointRequest that = (CreatePtEndpointRequest) o;
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
    return new ToStringer(CreatePtEndpointRequest.class)
        .add("aiGateway", aiGateway)
        .add("budgetPolicyId", budgetPolicyId)
        .add("config", config)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }
}
