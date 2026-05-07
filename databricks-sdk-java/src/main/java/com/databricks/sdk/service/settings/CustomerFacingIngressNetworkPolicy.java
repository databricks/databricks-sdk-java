// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This proto is under development. The network policies applying for ingress traffic. Any changes
 * here should also be synced to estore/namespaces/lakehousenetworkmanager/latest.proto.
 */
@Generated
public class CustomerFacingIngressNetworkPolicy {
  /**
   * The network policy restrictions for private access to the workspace. Configures how registered
   * private endpoints are allowed or denied access.
   */
  @JsonProperty("private_access")
  private CustomerFacingIngressNetworkPolicyPrivateAccess privateAccess;

  /**
   * The network policy restrictions for public access to the workspace. Configures how public
   * internet traffic is allowed or denied access.
   */
  @JsonProperty("public_access")
  private CustomerFacingIngressNetworkPolicyPublicAccess publicAccess;

  public CustomerFacingIngressNetworkPolicy setPrivateAccess(
      CustomerFacingIngressNetworkPolicyPrivateAccess privateAccess) {
    this.privateAccess = privateAccess;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyPrivateAccess getPrivateAccess() {
    return privateAccess;
  }

  public CustomerFacingIngressNetworkPolicy setPublicAccess(
      CustomerFacingIngressNetworkPolicyPublicAccess publicAccess) {
    this.publicAccess = publicAccess;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyPublicAccess getPublicAccess() {
    return publicAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicy that = (CustomerFacingIngressNetworkPolicy) o;
    return Objects.equals(privateAccess, that.privateAccess)
        && Objects.equals(publicAccess, that.publicAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateAccess, publicAccess);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicy.class)
        .add("privateAccess", privateAccess)
        .add("publicAccess", publicAccess)
        .toString();
  }
}
