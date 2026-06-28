// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * At which level can Databricks and Databricks managed compute access Internet. FULL_ACCESS:
 * Databricks can access Internet. No blocking rules will apply. RESTRICTED_ACCESS: Databricks can
 * only access explicitly allowed internet and storage destinations, as well as UC connections and
 * external locations.
 */
@Generated
public enum EgressNetworkPolicyNetworkAccessPolicyRestrictionMode {
  FULL_ACCESS,
  RESTRICTED_ACCESS,
}
