// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Network policy is a set of rules that defines what can be accessed from your Databricks network.
 * E.g.: You can choose to block your SQL UDF to access internet from your Databricks serverless
 * clusters.
 *
 * <p>There is only one instance of this setting per account. Since this setting has a default
 * value, this setting is present on all accounts even though it's never set on a given account.
 * Deletion reverts the value of the setting back to the default value.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountNetworkPolicyService {
  /**
   * Delete Account Network Policy.
   *
   * <p>Reverts back all the account network policies back to default.
   */
  DeleteAccountNetworkPolicyResponse deleteAccountNetworkPolicy(
      DeleteAccountNetworkPolicyRequest deleteAccountNetworkPolicyRequest);

  /**
   * Get Account Network Policy.
   *
   * <p>Gets the value of Account level Network Policy.
   */
  AccountNetworkPolicyMessage readAccountNetworkPolicy(
      ReadAccountNetworkPolicyRequest readAccountNetworkPolicyRequest);

  /**
   * Update Account Network Policy.
   *
   * <p>Updates the policy content of Account level Network Policy.
   */
  AccountNetworkPolicyMessage updateAccountNetworkPolicy(
      UpdateAccountNetworkPolicyRequest updateAccountNetworkPolicyRequest);
}
