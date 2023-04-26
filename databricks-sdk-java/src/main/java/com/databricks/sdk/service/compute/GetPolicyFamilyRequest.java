// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * <p>GetPolicyFamilyRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetPolicyFamilyRequest {
  /** */
  private String policyFamilyId;

  /**
   * <p>Setter for the field <code>policyFamilyId</code>.</p>
   *
   * @param policyFamilyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GetPolicyFamilyRequest} object
   */
  public GetPolicyFamilyRequest setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  /**
   * <p>Getter for the field <code>policyFamilyId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPolicyFamilyRequest that = (GetPolicyFamilyRequest) o;
    return Objects.equals(policyFamilyId, that.policyFamilyId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(policyFamilyId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetPolicyFamilyRequest.class)
        .add("policyFamilyId", policyFamilyId)
        .toString();
  }
}
