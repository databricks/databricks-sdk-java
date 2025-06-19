// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateEndpoint.CreateEndpointSerializer.class)
@JsonDeserialize(using = CreateEndpoint.CreateEndpointDeserializer.class)
public class CreateEndpoint {
  /** The budget policy id to be applied */
  private String budgetPolicyId;

  /** Type of endpoint */
  private EndpointType endpointType;

  /** Name of the vector search endpoint */
  private String name;

  public CreateEndpoint setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public CreateEndpoint setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public CreateEndpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateEndpoint that = (CreateEndpoint) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetPolicyId, endpointType, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateEndpoint.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("endpointType", endpointType)
        .add("name", name)
        .toString();
  }

  CreateEndpointPb toPb() {
    CreateEndpointPb pb = new CreateEndpointPb();
    pb.setBudgetPolicyId(budgetPolicyId);
    pb.setEndpointType(endpointType);
    pb.setName(name);

    return pb;
  }

  static CreateEndpoint fromPb(CreateEndpointPb pb) {
    CreateEndpoint model = new CreateEndpoint();
    model.setBudgetPolicyId(pb.getBudgetPolicyId());
    model.setEndpointType(pb.getEndpointType());
    model.setName(pb.getName());

    return model;
  }

  public static class CreateEndpointSerializer extends JsonSerializer<CreateEndpoint> {
    @Override
    public void serialize(CreateEndpoint value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateEndpointPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateEndpointDeserializer extends JsonDeserializer<CreateEndpoint> {
    @Override
    public CreateEndpoint deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateEndpointPb pb = mapper.readValue(p, CreateEndpointPb.class);
      return CreateEndpoint.fromPb(pb);
    }
  }
}
