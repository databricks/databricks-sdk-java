// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = UpdateRuleSetRequest.UpdateRuleSetRequestSerializer.class)
@JsonDeserialize(using = UpdateRuleSetRequest.UpdateRuleSetRequestDeserializer.class)
public class UpdateRuleSetRequest {
  /** Name of the rule set. */
  private String name;

  /** */
  private RuleSetUpdateRequest ruleSet;

  public UpdateRuleSetRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRuleSetRequest setRuleSet(RuleSetUpdateRequest ruleSet) {
    this.ruleSet = ruleSet;
    return this;
  }

  public RuleSetUpdateRequest getRuleSet() {
    return ruleSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRuleSetRequest that = (UpdateRuleSetRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(ruleSet, that.ruleSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ruleSet);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRuleSetRequest.class)
        .add("name", name)
        .add("ruleSet", ruleSet)
        .toString();
  }

  UpdateRuleSetRequestPb toPb() {
    UpdateRuleSetRequestPb pb = new UpdateRuleSetRequestPb();
    pb.setName(name);
    pb.setRuleSet(ruleSet);

    return pb;
  }

  static UpdateRuleSetRequest fromPb(UpdateRuleSetRequestPb pb) {
    UpdateRuleSetRequest model = new UpdateRuleSetRequest();
    model.setName(pb.getName());
    model.setRuleSet(pb.getRuleSet());

    return model;
  }

  public static class UpdateRuleSetRequestSerializer extends JsonSerializer<UpdateRuleSetRequest> {
    @Override
    public void serialize(
        UpdateRuleSetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateRuleSetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateRuleSetRequestDeserializer
      extends JsonDeserializer<UpdateRuleSetRequest> {
    @Override
    public UpdateRuleSetRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateRuleSetRequestPb pb = mapper.readValue(p, UpdateRuleSetRequestPb.class);
      return UpdateRuleSetRequest.fromPb(pb);
    }
  }
}
