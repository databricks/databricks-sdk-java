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
@JsonSerialize(using = CreatePtEndpointRequest.CreatePtEndpointRequestSerializer.class)
@JsonDeserialize(using = CreatePtEndpointRequest.CreatePtEndpointRequestDeserializer.class)
public class CreatePtEndpointRequest {
  /** The AI Gateway configuration for the serving endpoint. */
  private AiGatewayConfig aiGateway;

  /** The budget policy associated with the endpoint. */
  private String budgetPolicyId;

  /** The core config of the serving endpoint. */
  private PtEndpointCoreConfig config;

  /**
   * The name of the serving endpoint. This field is required and must be unique across a Databricks
   * workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores.
   */
  private String name;

  /** Tags to be attached to the serving endpoint and automatically propagated to billing logs. */
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

  CreatePtEndpointRequestPb toPb() {
    CreatePtEndpointRequestPb pb = new CreatePtEndpointRequestPb();
    pb.setAiGateway(aiGateway);
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setConfig(config);
    pb.setName(name);
    pb.setTags(tags);

    return pb;
  }

  static CreatePtEndpointRequest fromPb(CreatePtEndpointRequestPb pb) {
    CreatePtEndpointRequest model = new CreatePtEndpointRequest();
    model.setAiGateway(pb.getAiGateway());
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setConfig(pb.getConfig());
    model.setName(pb.getName());
    model.setTags(pb.getTags());

    return model;
  }

  public static class CreatePtEndpointRequestSerializer
      extends JsonSerializer<CreatePtEndpointRequest> {
    @Override
    public void serialize(
        CreatePtEndpointRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePtEndpointRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePtEndpointRequestDeserializer
      extends JsonDeserializer<CreatePtEndpointRequest> {
    @Override
    public CreatePtEndpointRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePtEndpointRequestPb pb = mapper.readValue(p, CreatePtEndpointRequestPb.class);
      return CreatePtEndpointRequest.fromPb(pb);
    }
  }
}
