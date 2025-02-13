// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Structured representation of a filter to be applied to a list of policies. All specified filters
 * will be applied in conjunction.
 */
@Generated
public class Filter {
  /**
   * The policy creator user id to be filtered on. If unspecified, all policies will be returned.
   */
  @JsonProperty("creator_user_id")
  @QueryParam("creator_user_id")
  private Long creatorUserId;

  /**
   * The policy creator user name to be filtered on. If unspecified, all policies will be returned.
   */
  @JsonProperty("creator_user_name")
  @QueryParam("creator_user_name")
  private String creatorUserName;

  /**
   * The partial name of policies to be filtered on. If unspecified, all policies will be returned.
   */
  @JsonProperty("policy_name")
  @QueryParam("policy_name")
  private String policyName;

  public Filter setCreatorUserId(Long creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  public Long getCreatorUserId() {
    return creatorUserId;
  }

  public Filter setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

  public String getCreatorUserName() {
    return creatorUserName;
  }

  public Filter setPolicyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  public String getPolicyName() {
    return policyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Filter that = (Filter) o;
    return Objects.equals(creatorUserId, that.creatorUserId)
        && Objects.equals(creatorUserName, that.creatorUserName)
        && Objects.equals(policyName, that.policyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorUserId, creatorUserName, policyName);
  }

  @Override
  public String toString() {
    return new ToStringer(Filter.class)
        .add("creatorUserId", creatorUserId)
        .add("creatorUserName", creatorUserName)
        .add("policyName", policyName)
        .toString();
  }
}
