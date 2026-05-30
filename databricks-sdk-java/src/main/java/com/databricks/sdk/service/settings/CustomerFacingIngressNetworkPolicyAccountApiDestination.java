// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyAccountApiDestination {
  /** Qualifies the breadth of API access for the listed scopes. See ApiScopeQualifier. */
  @JsonProperty("scope_qualifier")
  private CustomerFacingIngressNetworkPolicyApiScopeQualifier scopeQualifier;

  /** */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  public CustomerFacingIngressNetworkPolicyAccountApiDestination setScopeQualifier(
      CustomerFacingIngressNetworkPolicyApiScopeQualifier scopeQualifier) {
    this.scopeQualifier = scopeQualifier;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyApiScopeQualifier getScopeQualifier() {
    return scopeQualifier;
  }

  public CustomerFacingIngressNetworkPolicyAccountApiDestination setScopes(
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
    CustomerFacingIngressNetworkPolicyAccountApiDestination that =
        (CustomerFacingIngressNetworkPolicyAccountApiDestination) o;
    return Objects.equals(scopeQualifier, that.scopeQualifier)
        && Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeQualifier, scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyAccountApiDestination.class)
        .add("scopeQualifier", scopeQualifier)
        .add("scopes", scopes)
        .toString();
  }
}
