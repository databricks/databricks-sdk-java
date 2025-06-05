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
@JsonSerialize(using = ActionConfiguration.ActionConfigurationSerializer.class)
@JsonDeserialize(using = ActionConfiguration.ActionConfigurationDeserializer.class)
public class ActionConfiguration {
  /** Databricks action configuration ID. */
  private String actionConfigurationId;

  /** The type of the action. */
  private ActionConfigurationType actionType;

  /** Target for the action. For example, an email address. */
  private String target;

  public ActionConfiguration setActionConfigurationId(String actionConfigurationId) {
    this.actionConfigurationId = actionConfigurationId;
    return this;
  }

  public String getActionConfigurationId() {
    return actionConfigurationId;
  }

  public ActionConfiguration setActionType(ActionConfigurationType actionType) {
    this.actionType = actionType;
    return this;
  }

  public ActionConfigurationType getActionType() {
    return actionType;
  }

  public ActionConfiguration setTarget(String target) {
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
    ActionConfiguration that = (ActionConfiguration) o;
    return Objects.equals(actionConfigurationId, that.actionConfigurationId)
        && Objects.equals(actionType, that.actionType)
        && Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionConfigurationId, actionType, target);
  }

  @Override
  public String toString() {
    return new ToStringer(ActionConfiguration.class)
        .add("actionConfigurationId", actionConfigurationId)
        .add("actionType", actionType)
        .add("target", target)
        .toString();
  }

  ActionConfigurationPb toPb() {
    ActionConfigurationPb pb = new ActionConfigurationPb();
    pb.setActionConfigurationId(actionConfigurationId);
    pb.setActionType(actionType);
    pb.setTarget(target);

    return pb;
  }

  static ActionConfiguration fromPb(ActionConfigurationPb pb) {
    ActionConfiguration model = new ActionConfiguration();
    model.setActionConfigurationId(pb.getActionConfigurationId());
    model.setActionType(pb.getActionType());
    model.setTarget(pb.getTarget());

    return model;
  }

  public static class ActionConfigurationSerializer extends JsonSerializer<ActionConfiguration> {
    @Override
    public void serialize(ActionConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ActionConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ActionConfigurationDeserializer
      extends JsonDeserializer<ActionConfiguration> {
    @Override
    public ActionConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ActionConfigurationPb pb = mapper.readValue(p, ActionConfigurationPb.class);
      return ActionConfiguration.fromPb(pb);
    }
  }
}
