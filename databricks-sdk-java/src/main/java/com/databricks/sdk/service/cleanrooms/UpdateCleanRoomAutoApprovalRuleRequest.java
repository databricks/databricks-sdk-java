// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateCleanRoomAutoApprovalRuleRequest {
  /** The auto-approval rule to update. The rule_id field is used to identify the rule to update. */
  @JsonProperty("auto_approval_rule")
  private CleanRoomAutoApprovalRule autoApprovalRule;

  /** The name of the clean room this auto-approval rule belongs to. */
  @JsonIgnore private String cleanRoomName;

  /** A generated UUID identifying the rule. */
  @JsonIgnore private String ruleId;

  public UpdateCleanRoomAutoApprovalRuleRequest setAutoApprovalRule(
      CleanRoomAutoApprovalRule autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
    return this;
  }

  public CleanRoomAutoApprovalRule getAutoApprovalRule() {
    return autoApprovalRule;
  }

  public UpdateCleanRoomAutoApprovalRuleRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public UpdateCleanRoomAutoApprovalRuleRequest setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCleanRoomAutoApprovalRuleRequest that = (UpdateCleanRoomAutoApprovalRuleRequest) o;
    return Objects.equals(autoApprovalRule, that.autoApprovalRule)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(ruleId, that.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoApprovalRule, cleanRoomName, ruleId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCleanRoomAutoApprovalRuleRequest.class)
        .add("autoApprovalRule", autoApprovalRule)
        .add("cleanRoomName", cleanRoomName)
        .add("ruleId", ruleId)
        .toString();
  }
}
