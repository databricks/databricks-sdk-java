// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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
@JsonSerialize(
    using =
        CreateBudgetConfigurationBudgetActionConfigurations
            .CreateBudgetConfigurationBudgetActionConfigurationsSerializer.class)
@JsonDeserialize(
    using =
        CreateBudgetConfigurationBudgetActionConfigurations
            .CreateBudgetConfigurationBudgetActionConfigurationsDeserializer.class)
public class CreateBudgetConfigurationBudgetActionConfigurations {
  /** The type of the action. */
  private ActionConfigurationType actionType;

  /** Target for the action. For example, an email address. */
  private String target;

  public CreateBudgetConfigurationBudgetActionConfigurations setActionType(
      ActionConfigurationType actionType) {
    this.actionType = actionType;
    return this;
  }

  public ActionConfigurationType getActionType() {
    return actionType;
  }

  public CreateBudgetConfigurationBudgetActionConfigurations setTarget(String target) {
    this.target = target;
    return this;
  }

  public String getTarget() {
    return target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBudgetConfigurationBudgetActionConfigurations that =
        (CreateBudgetConfigurationBudgetActionConfigurations) o;
    return Objects.equals(actionType, that.actionType) && Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, target);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationBudgetActionConfigurations.class)
        .add("actionType", actionType)
        .add("target", target)
        .toString();
  }

  CreateBudgetConfigurationBudgetActionConfigurationsPb toPb() {
    CreateBudgetConfigurationBudgetActionConfigurationsPb pb =
        new CreateBudgetConfigurationBudgetActionConfigurationsPb();
    pb.setActionType(actionType);
    pb.setTarget(target);

    return pb;
  }

  static CreateBudgetConfigurationBudgetActionConfigurations fromPb(
      CreateBudgetConfigurationBudgetActionConfigurationsPb pb) {
    CreateBudgetConfigurationBudgetActionConfigurations model =
        new CreateBudgetConfigurationBudgetActionConfigurations();
    model.setActionType(pb.getActionType());
    model.setTarget(pb.getTarget());

    return model;
  }

  public static class CreateBudgetConfigurationBudgetActionConfigurationsSerializer
      extends JsonSerializer<CreateBudgetConfigurationBudgetActionConfigurations> {
    @Override
    public void serialize(
        CreateBudgetConfigurationBudgetActionConfigurations value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CreateBudgetConfigurationBudgetActionConfigurationsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBudgetConfigurationBudgetActionConfigurationsDeserializer
      extends JsonDeserializer<CreateBudgetConfigurationBudgetActionConfigurations> {
    @Override
    public CreateBudgetConfigurationBudgetActionConfigurations deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBudgetConfigurationBudgetActionConfigurationsPb pb =
          mapper.readValue(p, CreateBudgetConfigurationBudgetActionConfigurationsPb.class);
      return CreateBudgetConfigurationBudgetActionConfigurations.fromPb(pb);
    }
  }
}
