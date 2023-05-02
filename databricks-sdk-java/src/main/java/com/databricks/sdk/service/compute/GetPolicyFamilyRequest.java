// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

@Generated
public class GetPolicyFamilyRequest {
  /** */
  private String policyFamilyId;

  public GetPolicyFamilyRequest setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPolicyFamilyRequest that = (GetPolicyFamilyRequest) o;
    return Objects.equals(policyFamilyId, that.policyFamilyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyFamilyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPolicyFamilyRequest.class)
        .add("policyFamilyId", policyFamilyId)
        .toString();
  }
}
