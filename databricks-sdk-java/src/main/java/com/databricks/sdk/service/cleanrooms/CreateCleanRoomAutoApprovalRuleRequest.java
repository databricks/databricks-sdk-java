// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCleanRoomAutoApprovalRuleRequest {
  /** */
  @JsonProperty("auto_approval_rule")
  private CleanRoomAutoApprovalRule autoApprovalRule;

  /** The name of the clean room this auto-approval rule belongs to. */
  @JsonIgnore private String cleanRoomName;

  public CreateCleanRoomAutoApprovalRuleRequest setAutoApprovalRule(
      CleanRoomAutoApprovalRule autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
    return this;
  }

  public CleanRoomAutoApprovalRule getAutoApprovalRule() {
    return autoApprovalRule;
  }

  public CreateCleanRoomAutoApprovalRuleRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomAutoApprovalRuleRequest that = (CreateCleanRoomAutoApprovalRuleRequest) o;
    return Objects.equals(autoApprovalRule, that.autoApprovalRule)
        && Objects.equals(cleanRoomName, that.cleanRoomName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoApprovalRule, cleanRoomName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomAutoApprovalRuleRequest.class)
        .add("autoApprovalRule", autoApprovalRule)
        .add("cleanRoomName", cleanRoomName)
        .toString();
  }
}
