// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateBudgetConfigurationBudgetActionConfigurationsPb {
  @JsonProperty("action_type")
  private ActionConfigurationType actionType;

  @JsonProperty("target")
  private String target;

  public CreateBudgetConfigurationBudgetActionConfigurationsPb setActionType(
      ActionConfigurationType actionType) {
    this.actionType = actionType;
    return this;
  }

  public ActionConfigurationType getActionType() {
    return actionType;
  }

  public CreateBudgetConfigurationBudgetActionConfigurationsPb setTarget(String target) {
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
    CreateBudgetConfigurationBudgetActionConfigurationsPb that =
        (CreateBudgetConfigurationBudgetActionConfigurationsPb) o;
    return Objects.equals(actionType, that.actionType) && Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, target);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationBudgetActionConfigurationsPb.class)
        .add("actionType", actionType)
        .add("target", target)
        .toString();
  }
}
