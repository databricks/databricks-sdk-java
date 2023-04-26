// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListPolicyFamiliesResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListPolicyFamiliesResponse {
  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of policy families. */
  @JsonProperty("policy_families")
  private Collection<PolicyFamily> policyFamilies;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.ListPolicyFamiliesResponse} object
   */
  public ListPolicyFamiliesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>policyFamilies</code>.</p>
   *
   * @param policyFamilies a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListPolicyFamiliesResponse} object
   */
  public ListPolicyFamiliesResponse setPolicyFamilies(Collection<PolicyFamily> policyFamilies) {
    this.policyFamilies = policyFamilies;
    return this;
  }

  /**
   * <p>Getter for the field <code>policyFamilies</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PolicyFamily> getPolicyFamilies() {
    return policyFamilies;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPolicyFamiliesResponse that = (ListPolicyFamiliesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(policyFamilies, that.policyFamilies);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, policyFamilies);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListPolicyFamiliesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("policyFamilies", policyFamilies)
        .toString();
  }
}
