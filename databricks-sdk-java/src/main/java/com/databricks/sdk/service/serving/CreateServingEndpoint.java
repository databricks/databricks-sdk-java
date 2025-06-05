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
@JsonSerialize(using = CreateServingEndpoint.CreateServingEndpointSerializer.class)
@JsonDeserialize(using = CreateServingEndpoint.CreateServingEndpointDeserializer.class)
public class CreateServingEndpoint {
  /**
   * The AI Gateway configuration for the serving endpoint. NOTE: External model, provisioned
   * throughput, and pay-per-token endpoints are fully supported; agent endpoints currently only
   * support inference tables.
   */
  private AiGatewayConfig aiGateway;

  /** The budget policy to be applied to the serving endpoint. */
  private String budgetPolicyId;

  /** The core config of the serving endpoint. */
  private EndpointCoreConfigInput config;

  /**
   * The name of the serving endpoint. This field is required and must be unique across a Databricks
   * workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores.
   */
  private String name;

  /**
   * Rate limits to be applied to the serving endpoint. NOTE: this field is deprecated, please use
   * AI Gateway to manage rate limits.
   */
  private Collection<RateLimit> rateLimits;

  /** Enable route optimization for the serving endpoint. */
  private Boolean routeOptimized;

  /** Tags to be attached to the serving endpoint and automatically propagated to billing logs. */
  private Collection<EndpointTag> tags;

  public CreateServingEndpoint setAiGateway(AiGatewayConfig aiGateway) {
    this.aiGateway = aiGateway;
    return this;
  }

  public AiGatewayConfig getAiGateway() {
    return aiGateway;
  }

  public CreateServingEndpoint setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
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
    return new ToStringer(CreateServingEndpoint.class)
        .add("aiGateway", aiGateway)
        .add("budgetPolicyId", budgetPolicyId)
        .add("config", config)
        .add("name", name)
        .add("rateLimits", rateLimits)
        .add("routeOptimized", routeOptimized)
        .add("tags", tags)
        .toString();
  }

  CreateServingEndpointPb toPb() {
    CreateServingEndpointPb pb = new CreateServingEndpointPb();
    pb.setAiGateway(aiGateway);
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setConfig(config);
    pb.setName(name);
    pb.setRateLimits(rateLimits);
    pb.setRouteOptimized(routeOptimized);
    pb.setTags(tags);

    return pb;
  }

  static CreateServingEndpoint fromPb(CreateServingEndpointPb pb) {
    CreateServingEndpoint model = new CreateServingEndpoint();
    model.setAiGateway(pb.getAiGateway());
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setConfig(pb.getConfig());
    model.setName(pb.getName());
    model.setRateLimits(pb.getRateLimits());
    model.setRouteOptimized(pb.getRouteOptimized());
    model.setTags(pb.getTags());

    return model;
  }

  public static class CreateServingEndpointSerializer
      extends JsonSerializer<CreateServingEndpoint> {
    @Override
    public void serialize(
        CreateServingEndpoint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateServingEndpointPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateServingEndpointDeserializer
      extends JsonDeserializer<CreateServingEndpoint> {
    @Override
    public CreateServingEndpoint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateServingEndpointPb pb = mapper.readValue(p, CreateServingEndpointPb.class);
      return CreateServingEndpoint.fromPb(pb);
    }
  }
}
