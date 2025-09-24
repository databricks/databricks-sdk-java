// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetUsagePolicyRequest {
  /** The Id of the policy. */
  @JsonIgnore private String policyId;

  public GetUsagePolicyRequest setPolicyId(String policyId) {
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
    GetUsagePolicyRequest that = (GetUsagePolicyRequest) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetUsagePolicyRequest.class).add("policyId", policyId).toString();
  }
}
