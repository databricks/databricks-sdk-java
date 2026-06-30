// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Qualifies the breadth of API access permitted by an ingress network policy rule.
 * API_SCOPE_QUALIFIER_READ narrows matching to read-only variants of the listed scopes;
 * API_SCOPE_QUALIFIER_ALL matches any scope. When unset, scopes match exactly as listed.
 */
@Generated
public enum CustomerFacingIngressNetworkPolicyApiScopeQualifier {
  API_SCOPE_QUALIFIER_ALL,
  API_SCOPE_QUALIFIER_READ,
}
