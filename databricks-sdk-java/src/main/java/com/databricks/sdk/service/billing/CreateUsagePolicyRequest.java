// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A request to create a UsagePolicy. */
@Generated
public class CreateUsagePolicyRequest {
  /** The policy to create. `policy_id` needs to be empty as it will be generated */
  @JsonProperty("policy")
  private UsagePolicy policy;

  /** A unique identifier for this request. Restricted to 36 ASCII characters. */
  @JsonProperty("request_id")
  private String requestId;

  public CreateUsagePolicyRequest setPolicy(UsagePolicy policy) {
    this.policy = policy;
    return this;
  }

  public UsagePolicy getPolicy() {
    return policy;
  }

  public CreateUsagePolicyRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateUsagePolicyRequest that = (CreateUsagePolicyRequest) o;
    return Objects.equals(policy, that.policy) && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateUsagePolicyRequest.class)
        .add("policy", policy)
        .add("requestId", requestId)
        .toString();
  }
}
