// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetCleanRoomAutoApprovalRuleRequest {
  /** */
  @JsonIgnore private String cleanRoomName;

  /** */
  @JsonIgnore private String ruleId;

  public GetCleanRoomAutoApprovalRuleRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public GetCleanRoomAutoApprovalRuleRequest setRuleId(String ruleId) {
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
    GetCleanRoomAutoApprovalRuleRequest that = (GetCleanRoomAutoApprovalRuleRequest) o;
    return Objects.equals(cleanRoomName, that.cleanRoomName) && Objects.equals(ruleId, that.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanRoomName, ruleId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCleanRoomAutoApprovalRuleRequest.class)
        .add("cleanRoomName", cleanRoomName)
        .add("ruleId", ruleId)
        .toString();
  }
}
