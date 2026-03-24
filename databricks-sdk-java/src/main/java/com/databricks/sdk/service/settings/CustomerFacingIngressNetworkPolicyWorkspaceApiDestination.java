// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyWorkspaceApiDestination {
  /** */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  public CustomerFacingIngressNetworkPolicyWorkspaceApiDestination setScopes(
      Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyWorkspaceApiDestination that =
        (CustomerFacingIngressNetworkPolicyWorkspaceApiDestination) o;
    return Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyWorkspaceApiDestination.class)
        .add("scopes", scopes)
        .toString();
  }
}
