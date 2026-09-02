// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The restriction mode for cross-workspace access. In FULL_ACCESS mode, requests from any source
 * workspace (in any account) are allowed, and deny rules and allow rules cannot be set. In
 * RESTRICTED_ACCESS mode, access is restricted based on deny rules and allow rules; requests that
 * do not match any allow rule are denied. In LEGACY_MODE, cross-workspace ingress is not governed
 * by this policy.
 */
@Generated
public enum CustomerFacingIngressNetworkPolicyCrossWorkspaceAccessRestrictionMode {
  FULL_ACCESS,
  LEGACY_MODE,
  RESTRICTED_ACCESS,
}
