// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyAuthenticationIdentity {
  /** */
  @JsonProperty("principal_id")
  private Long principalId;

  /** */
  @JsonProperty("principal_type")
  private CustomerFacingIngressNetworkPolicyAuthenticationIdentityPrincipalType principalType;

  public CustomerFacingIngressNetworkPolicyAuthenticationIdentity setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public CustomerFacingIngressNetworkPolicyAuthenticationIdentity setPrincipalType(
      CustomerFacingIngressNetworkPolicyAuthenticationIdentityPrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAuthenticationIdentityPrincipalType getPrincipalType() {
    return principalType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyAuthenticationIdentity that =
        (CustomerFacingIngressNetworkPolicyAuthenticationIdentity) o;
    return Objects.equals(principalId, that.principalId)
        && Objects.equals(principalType, that.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId, principalType);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyAuthenticationIdentity.class)
        .add("principalId", principalId)
        .add("principalType", principalType)
        .toString();
  }
}
