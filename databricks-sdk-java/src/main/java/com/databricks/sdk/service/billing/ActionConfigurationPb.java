// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ActionConfigurationPb {
  @JsonProperty("action_configuration_id")
  private String actionConfigurationId;

  @JsonProperty("action_type")
  private ActionConfigurationType actionType;

  @JsonProperty("target")
  private String target;

  public ActionConfigurationPb setActionConfigurationId(String actionConfigurationId) {
    this.actionConfigurationId = actionConfigurationId;
    return this;
  }

  public String getActionConfigurationId() {
    return actionConfigurationId;
  }

  public ActionConfigurationPb setActionType(ActionConfigurationType actionType) {
    this.actionType = actionType;
    return this;
  }

  public ActionConfigurationType getActionType() {
    return actionType;
  }

  public ActionConfigurationPb setTarget(String target) {
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
    ActionConfigurationPb that = (ActionConfigurationPb) o;
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
    return new ToStringer(ActionConfigurationPb.class)
        .add("actionConfigurationId", actionConfigurationId)
        .add("actionType", actionType)
        .add("target", target)
        .toString();
  }
}
