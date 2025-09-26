// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;

/**
 * A service serves REST API about Usage policies
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface UsagePolicyService {
  /** Creates a new usage policy. */
  UsagePolicy create(CreateUsagePolicyRequest createUsagePolicyRequest);

  /** Deletes a usage policy */
  void delete(DeleteUsagePolicyRequest deleteUsagePolicyRequest);

  /** Retrieves a usage policy by it's ID. */
  UsagePolicy get(GetUsagePolicyRequest getUsagePolicyRequest);

  /**
   * Lists all usage policies. Policies are returned in the alphabetically ascending order of their
   * names.
   */
  ListUsagePoliciesResponse list(ListUsagePoliciesRequest listUsagePoliciesRequest);

  /** Updates a usage policy */
  UsagePolicy update(UpdateUsagePolicyRequest updateUsagePolicyRequest);
}
