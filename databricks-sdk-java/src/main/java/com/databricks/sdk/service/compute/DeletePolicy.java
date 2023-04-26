// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DeletePolicy class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeletePolicy {
  /** The ID of the policy to delete. */
  @JsonProperty("policy_id")
  private String policyId;

  /**
   * <p>Setter for the field <code>policyId</code>.</p>
   *
   * @param policyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.DeletePolicy} object
   */
  public DeletePolicy setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>policyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPolicyId() {
    return policyId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletePolicy that = (DeletePolicy) o;
    return Objects.equals(policyId, that.policyId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(policyId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeletePolicy.class).add("policyId", policyId).toString();
  }
}
