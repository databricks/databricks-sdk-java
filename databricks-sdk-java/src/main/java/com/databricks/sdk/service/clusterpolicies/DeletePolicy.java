// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletePolicy {
  /** The ID of the policy to delete. */
  @JsonProperty("policy_id")
  private String policyId;

  public DeletePolicy setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }
}
