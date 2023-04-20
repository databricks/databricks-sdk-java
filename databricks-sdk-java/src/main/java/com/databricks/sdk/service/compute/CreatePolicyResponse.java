// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreatePolicyResponse {
  /** Canonical unique identifier for the cluster policy. */
  @JsonProperty("policy_id")
  private String policyId;

  public CreatePolicyResponse setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePolicyResponse that = (CreatePolicyResponse) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePolicyResponse.class).add("policyId", policyId).toString();
  }
}
