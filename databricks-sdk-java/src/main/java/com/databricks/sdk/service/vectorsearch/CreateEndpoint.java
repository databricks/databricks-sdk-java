// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateEndpoint {
  /** The budget policy id to be applied */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** Type of endpoint */
  @JsonProperty("endpoint_type")
  private EndpointType endpointType;

  /** Name of the vector search endpoint */
  @JsonProperty("name")
  private String name;

  /**
   * Target QPS for the endpoint. Mutually exclusive with num_replicas. The actual replica count is
   * calculated at index creation/sync time based on this value. Best-effort target; the system does
   * not guarantee this QPS will be achieved.
   */
  @JsonProperty("target_qps")
  private Long targetQps;

  /** The usage policy id to be applied once we've migrated to usage policies */
  @JsonProperty("usage_policy_id")
  private String usagePolicyId;

  public CreateEndpoint setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public CreateEndpoint setEndpointType(EndpointType endpointType) {
    this.endpointType = endpointType;
    return this;
  }

  public EndpointType getEndpointType() {
    return endpointType;
  }

  public CreateEndpoint setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateEndpoint setTargetQps(Long targetQps) {
    this.targetQps = targetQps;
    return this;
  }

  public Long getTargetQps() {
    return targetQps;
  }

  public CreateEndpoint setUsagePolicyId(String usagePolicyId) {
    this.usagePolicyId = usagePolicyId;
    return this;
  }

  public String getUsagePolicyId() {
    return usagePolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateEndpoint that = (CreateEndpoint) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(endpointType, that.endpointType)
        && Objects.equals(name, that.name)
        && Objects.equals(targetQps, that.targetQps)
        && Objects.equals(usagePolicyId, that.usagePolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetPolicyId, endpointType, name, targetQps, usagePolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateEndpoint.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("endpointType", endpointType)
        .add("name", name)
        .add("targetQps", targetQps)
        .add("usagePolicyId", usagePolicyId)
        .toString();
  }
}
