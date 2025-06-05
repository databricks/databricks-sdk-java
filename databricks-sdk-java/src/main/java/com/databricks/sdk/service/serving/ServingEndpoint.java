// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ServingEndpoint.ServingEndpointSerializer.class)
@JsonDeserialize(using = ServingEndpoint.ServingEndpointDeserializer.class)
public class ServingEndpoint {
  /**
   * The AI Gateway configuration for the serving endpoint. NOTE: External model, provisioned
   * throughput, and pay-per-token endpoints are fully supported; agent endpoints currently only
   * support inference tables.
   */
  private AiGatewayConfig aiGateway;

  /** The budget policy associated with the endpoint. */
  private String budgetPolicyId;

  /** The config that is currently being served by the endpoint. */
  private EndpointCoreConfigSummary config;

  /** The timestamp when the endpoint was created in Unix time. */
  private Long creationTimestamp;

  /** The email of the user who created the serving endpoint. */
  private String creator;

  /** System-generated ID of the endpoint, included to be used by the Permissions API. */
  private String id;

  /** The timestamp when the endpoint was last updated by a user in Unix time. */
  private Long lastUpdatedTimestamp;

  /** The name of the serving endpoint. */
  private String name;

  /** Information corresponding to the state of the serving endpoint. */
  private EndpointState state;

  /** Tags attached to the serving endpoint. */
  private Collection<EndpointTag> tags;

  /** The task type of the serving endpoint. */
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
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("name", name)
        .add("state", state)
        .add("tags", tags)
        .add("task", task)
        .toString();
  }

  ServingEndpointPb toPb() {
    ServingEndpointPb pb = new ServingEndpointPb();
    pb.setAiGateway(aiGateway);
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setConfig(config);
    pb.setCreationTimestamp(creationTimestamp);
    pb.setCreator(creator);
    pb.setId(id);
    pb.setLastUpdatedTimestamp(lastUpdatedTimestamp);
    pb.setName(name);
    pb.setState(state);
    pb.setTags(tags);
    pb.setTask(task);

    return pb;
  }

  static ServingEndpoint fromPb(ServingEndpointPb pb) {
    ServingEndpoint model = new ServingEndpoint();
    model.setAiGateway(pb.getAiGateway());
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setConfig(pb.getConfig());
    model.setCreationTimestamp(pb.getCreationTimestamp());
    model.setCreator(pb.getCreator());
    model.setId(pb.getId());
    model.setLastUpdatedTimestamp(pb.getLastUpdatedTimestamp());
    model.setName(pb.getName());
    model.setState(pb.getState());
    model.setTags(pb.getTags());
    model.setTask(pb.getTask());

    return model;
  }

  public static class ServingEndpointSerializer extends JsonSerializer<ServingEndpoint> {
    @Override
    public void serialize(ServingEndpoint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServingEndpointPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServingEndpointDeserializer extends JsonDeserializer<ServingEndpoint> {
    @Override
    public ServingEndpoint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServingEndpointPb pb = mapper.readValue(p, ServingEndpointPb.class);
      return ServingEndpoint.fromPb(pb);
    }
  }
}
