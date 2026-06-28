// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreatePolicyRequest {
  /** Required. The policy to create. */
  @JsonProperty("policy_info")
  private PolicyInfo policyInfo;

  public CreatePolicyRequest setPolicyInfo(PolicyInfo policyInfo) {
    this.policyInfo = policyInfo;
    return this;
  }

  public PolicyInfo getPolicyInfo() {
    return policyInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePolicyRequest that = (CreatePolicyRequest) o;
    return Objects.equals(policyInfo, that.policyInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePolicyRequest.class).add("policyInfo", policyInfo).toString();
  }
}
