// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AppUpdate {
  /** */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** */
  @JsonProperty("compute_size")
  private ComputeSize computeSize;

  /** */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("resources")
  private Collection<AppResource> resources;

  /** */
  @JsonProperty("status")
  private AppUpdateUpdateStatus status;

  /** */
  @JsonProperty("usage_policy_id")
  private String usagePolicyId;

  /** */
  @JsonProperty("user_api_scopes")
  private Collection<String> userApiScopes;

  public AppUpdate setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public AppUpdate setComputeSize(ComputeSize computeSize) {
    this.computeSize = computeSize;
    return this;
  }

  public ComputeSize getComputeSize() {
    return computeSize;
  }

  public AppUpdate setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppUpdate setResources(Collection<AppResource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<AppResource> getResources() {
    return resources;
  }

  public AppUpdate setStatus(AppUpdateUpdateStatus status) {
    this.status = status;
    return this;
  }

  public AppUpdateUpdateStatus getStatus() {
    return status;
  }

  public AppUpdate setUsagePolicyId(String usagePolicyId) {
    this.usagePolicyId = usagePolicyId;
    return this;
  }

  public String getUsagePolicyId() {
    return usagePolicyId;
  }

  public AppUpdate setUserApiScopes(Collection<String> userApiScopes) {
    this.userApiScopes = userApiScopes;
    return this;
  }

  public Collection<String> getUserApiScopes() {
    return userApiScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUpdate that = (AppUpdate) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(computeSize, that.computeSize)
        && Objects.equals(description, that.description)
        && Objects.equals(resources, that.resources)
        && Objects.equals(status, that.status)
        && Objects.equals(usagePolicyId, that.usagePolicyId)
        && Objects.equals(userApiScopes, that.userApiScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetPolicyId, computeSize, description, resources, status, usagePolicyId, userApiScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(AppUpdate.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("computeSize", computeSize)
        .add("description", description)
        .add("resources", resources)
        .add("status", status)
        .add("usagePolicyId", usagePolicyId)
        .add("userApiScopes", userApiScopes)
        .toString();
  }
}
