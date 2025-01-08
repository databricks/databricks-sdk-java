// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete service principal federation policy */
@Generated
public class DeleteServicePrincipalFederationPolicyRequest {
  /** The identifier for the federation policy. */
  @JsonIgnore private String policyId;

  /** The service principal id for the federation policy. */
  @JsonIgnore private Long servicePrincipalId;

  public DeleteServicePrincipalFederationPolicyRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public DeleteServicePrincipalFederationPolicyRequest setServicePrincipalId(
      Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteServicePrincipalFederationPolicyRequest that =
        (DeleteServicePrincipalFederationPolicyRequest) o;
    return Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, servicePrincipalId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteServicePrincipalFederationPolicyRequest.class)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .toString();
  }
}
