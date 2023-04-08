// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import com.databricks.sdk.annotation.QueryParam;

/** Get entity */
public class Get {
  /** Canonical unique identifier for the cluster policy. */
  @QueryParam("policy_id")
  private String policyId;

  public Get setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }
}
