// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusterpolicies;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Get that = (Get) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(Get.class).add("policyId", policyId).toString();
  }
}
