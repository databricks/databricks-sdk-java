// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage network policies for this account. Network policies control which network
 * destinations can be accessed from the Databricks environment. Each Databricks account includes a
 * default policy named 'default-policy'. 'default-policy' is associated with any workspace lacking
 * an explicit network policy assignment, and is automatically associated with each newly created
 * workspace. 'default-policy' is reserved and cannot be deleted, but it can be updated to customize
 * the default network access rules for your account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface NetworkPoliciesService {
  /**
   * Creates a new network policy to manage which network destinations can be accessed from the
   * Databricks environment.
   */
  AccountNetworkPolicy createNetworkPolicyRpc(
      CreateNetworkPolicyRequest createNetworkPolicyRequest);

  /** Deletes a network policy. Cannot be called on 'default-policy'. */
  void deleteNetworkPolicyRpc(DeleteNetworkPolicyRequest deleteNetworkPolicyRequest);

  /** Gets a network policy. */
  AccountNetworkPolicy getNetworkPolicyRpc(GetNetworkPolicyRequest getNetworkPolicyRequest);

  /** Gets an array of network policies. */
  ListNetworkPoliciesResponse listNetworkPoliciesRpc(
      ListNetworkPoliciesRequest listNetworkPoliciesRequest);

  /** Updates a network policy. This allows you to modify the configuration of a network policy. */
  AccountNetworkPolicy updateNetworkPolicyRpc(
      UpdateNetworkPolicyRequest updateNetworkPolicyRequest);
}
