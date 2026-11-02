// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Serverless compute settings for a job cluster. */
@Generated
public class JobClusterServerlessCompute {
  /** The ID of the serverless compute policy to apply to this cluster. */
  @JsonProperty("policy_id")
  private String policyId;

  public JobClusterServerlessCompute setPolicyId(String policyId) {
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
    JobClusterServerlessCompute that = (JobClusterServerlessCompute) o;
    return Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobClusterServerlessCompute.class).add("policyId", policyId).toString();
  }
}
