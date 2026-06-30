// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyAuthentication {
  /** Valid only when IdentityType is IDENTITY_TYPE_SELECTED_IDENTITIES. */
  @JsonProperty("identities")
  private Collection<CustomerFacingIngressNetworkPolicyAuthenticationIdentity> identities;

  /** */
  @JsonProperty("identity_type")
  private CustomerFacingIngressNetworkPolicyAuthenticationIdentityType identityType;

  public CustomerFacingIngressNetworkPolicyAuthentication setIdentities(
      Collection<CustomerFacingIngressNetworkPolicyAuthenticationIdentity> identities) {
    this.identities = identities;
    return this;
  }

  public Collection<CustomerFacingIngressNetworkPolicyAuthenticationIdentity> getIdentities() {
    return identities;
  }

  public CustomerFacingIngressNetworkPolicyAuthentication setIdentityType(
      CustomerFacingIngressNetworkPolicyAuthenticationIdentityType identityType) {
    this.identityType = identityType;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyAuthenticationIdentityType getIdentityType() {
    return identityType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyAuthentication that =
        (CustomerFacingIngressNetworkPolicyAuthentication) o;
    return Objects.equals(identities, that.identities)
        && Objects.equals(identityType, that.identityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identities, identityType);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyAuthentication.class)
        .add("identities", identities)
        .add("identityType", identityType)
        .toString();
  }
}
