// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Matches workspace-level Databricks API endpoints for an ingress network policy rule. */
@Generated
public class CustomerFacingIngressNetworkPolicyWorkspaceApiDestination {
  /**
   * Inverse of `scopes`: matches every API scope EXCEPT those listed here ("allow all except").
   * Mutually exclusive with `scopes` — a single destination may set at most one of the two.
   */
  @JsonProperty("excluded_scopes")
  private Collection<String> excludedScopes;

  /** Qualifies the breadth of API access for the listed scopes. See ApiScopeQualifier. */
  @JsonProperty("scope_qualifier")
  private CustomerFacingIngressNetworkPolicyApiScopeQualifier scopeQualifier;

  /** */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  public CustomerFacingIngressNetworkPolicyWorkspaceApiDestination setExcludedScopes(
      Collection<String> excludedScopes) {
    this.excludedScopes = excludedScopes;
    return this;
  }

  public Collection<String> getExcludedScopes() {
    return excludedScopes;
  }

  public CustomerFacingIngressNetworkPolicyWorkspaceApiDestination setScopeQualifier(
      CustomerFacingIngressNetworkPolicyApiScopeQualifier scopeQualifier) {
    this.scopeQualifier = scopeQualifier;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyApiScopeQualifier getScopeQualifier() {
    return scopeQualifier;
  }

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
    return Objects.equals(excludedScopes, that.excludedScopes)
        && Objects.equals(scopeQualifier, that.scopeQualifier)
        && Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedScopes, scopeQualifier, scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyWorkspaceApiDestination.class)
        .add("excludedScopes", excludedScopes)
        .add("scopeQualifier", scopeQualifier)
        .add("scopes", scopes)
        .toString();
  }
}
