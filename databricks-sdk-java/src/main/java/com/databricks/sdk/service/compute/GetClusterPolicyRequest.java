// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get a cluster policy */
@Generated
public class GetClusterPolicyRequest {
  /** Canonical unique identifier for the Cluster Policy. */
  @QueryParam("policy_id")
  private String policyId;

  public GetClusterPolicyRequest setPolicyId(String policyId) {
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
    GetClusterPolicyRequest that = (GetClusterPolicyRequest) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPolicyRequest.class).add("policyId", policyId).toString();
  }
}
