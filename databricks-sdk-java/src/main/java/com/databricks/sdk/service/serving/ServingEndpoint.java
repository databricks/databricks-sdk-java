// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ServingEndpoint {
  /**
   * The AI Gateway configuration for the serving endpoint. NOTE: External model, provisioned
   * throughput, and pay-per-token endpoints are fully supported; agent endpoints currently only
   * support inference tables.
   */
  @JsonProperty("ai_gateway")
  private AiGatewayConfig aiGateway;

  /** The budget policy associated with the endpoint. */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** The config that is currently being served by the endpoint. */
  @JsonProperty("config")
  private EndpointCoreConfigSummary config;

  /** The timestamp when the endpoint was created in Unix time. */
  @JsonProperty("creation_timestamp")
  private Long creationTimestamp;

  /** The email of the user who created the serving endpoint. */
  @JsonProperty("creator")
  private String creator;

  /** Description of the endpoint */
  @JsonProperty("description")
  private String description;

  /** System-generated ID of the endpoint, included to be used by the Permissions API. */
  @JsonProperty("id")
  private String id;

  /** The timestamp when the endpoint was last updated by a user in Unix time. */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** The name of the serving endpoint. */
  @JsonProperty("name")
  private String name;

  /** Information corresponding to the state of the serving endpoint. */
  @JsonProperty("state")
  private EndpointState state;

  /** Tags attached to the serving endpoint. */
  @JsonProperty("tags")
  private Collection<EndpointTag> tags;

  /** The task type of the serving endpoint. */
  @JsonProperty("task")
  private String task;

  public ServingEndpoint setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public ServingEndpoint setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public ServingEndpoint setConfig(EndpointCoreConfigSummary config) {
    this.config = config;
    return this;
  }

  public EndpointCoreConfigSummary getConfig() {
    return config;
  }

  public ServingEndpoint setCreationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  public Long getCreationTimestamp() {
    return creationTimestamp;
  }

  public ServingEndpoint setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public ServingEndpoint setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ServingEndpoint setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ServingEndpoint setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public ServingEndpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ServingEndpoint setState(EndpointState state) {
    this.state = state;
    return this;
  }

  public EndpointState getState() {
    return state;
  }

  public ServingEndpoint setTags(Collection<EndpointTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<EndpointTag> getTags() {
    return tags;
  }

  public ServingEndpoint setTask(String task) {
    this.task = task;
    return this;
  }

  public String getTask() {
    return task;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServingEndpoint that = (ServingEndpoint) o;
    return Objects.equals(aiGateway, that.aiGateway)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(config, that.config)
        && Objects.equals(creationTimestamp, that.creationTimestamp)
        && Objects.equals(creator, that.creator)
        && Objects.equals(description, that.description)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(name, that.name)
        && Objects.equals(state, that.state)
        && Objects.equals(tags, that.tags)
        && Objects.equals(task, that.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aiGateway,
        budgetPolicyId,
        config,
        creationTimestamp,
        creator,
        description,
        id,
        lastUpdatedTimestamp,
        name,
        state,
        tags,
        task);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpoint.class)
        .add("aiGateway", aiGateway)
        .add("budgetPolicyId", budgetPolicyId)
        .add("config", config)
        .add("creationTimestamp", creationTimestamp)
        .add("creator", creator)
        .add("description", description)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("state", state)
        .add("tags", tags)
        .add("task", task)
        .toString();
  }
}
