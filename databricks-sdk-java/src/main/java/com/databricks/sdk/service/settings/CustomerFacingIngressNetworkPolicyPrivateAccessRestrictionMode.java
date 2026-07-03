// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The restriction mode for private access. In ALLOW_ALL_REGISTERED_ENDPOINTS mode, requests
 * arriving through any endpoint registered to the account are allowed, and deny rules and allow
 * rules cannot be set. In RESTRICTED_ACCESS mode, access is restricted based on deny rules and
 * allow rules; requests that do not match any allow rule are denied.
 */
@Generated
public enum CustomerFacingIngressNetworkPolicyPrivateAccessRestrictionMode {
  ALLOW_ALL_REGISTERED_ENDPOINTS,
  RESTRICTED_ACCESS,
}
