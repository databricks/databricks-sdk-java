// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateBudgetConfigurationBudgetActionConfigurations {
  /** The type of the action. */
  @JsonProperty("action_type")
  private ActionConfigurationType actionType;

  /** Target for the action. For example, an email address. */
  @JsonProperty("target")
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
}
