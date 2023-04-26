// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListPoliciesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListPoliciesResponse {
  /** List of policies. */
  @JsonProperty("policies")
  private Collection<Policy> policies;

  /**
   * <p>Setter for the field <code>policies</code>.</p>
   *
   * @param policies a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListPoliciesResponse} object
   */
  public ListPoliciesResponse setPolicies(Collection<Policy> policies) {
    this.policies = policies;
    return this;
  }

  /**
   * <p>Getter for the field <code>policies</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Policy> getPolicies() {
    return policies;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPoliciesResponse that = (ListPoliciesResponse) o;
    return Objects.equals(policies, that.policies);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(policies);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListPoliciesResponse.class).add("policies", policies).toString();
  }
}
