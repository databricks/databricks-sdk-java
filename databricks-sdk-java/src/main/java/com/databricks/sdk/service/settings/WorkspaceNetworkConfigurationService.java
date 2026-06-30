// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * These APIs allow configuration of network settings for Databricks workspaces by selecting which
 * network policy to associate with the workspace. Each workspace is always associated with exactly
 * one network policy that controls which network destinations can be accessed from the Databricks
 * environment. By default, workspaces are associated with the 'default-policy' network policy. You
 * cannot create or delete a workspace's network option, only update it to associate the workspace
 * with a different policy
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspaceNetworkConfigurationService {
  /**
   * Gets the network option for a workspace. Every workspace has exactly one network policy
   * binding, with 'default-policy' used if no explicit assignment exists.
   */
  WorkspaceNetworkOption getWorkspaceNetworkOptionRpc(
      GetWorkspaceNetworkOptionRequest getWorkspaceNetworkOptionRequest);

  /**
   * Updates the network option for a workspace. This operation associates the workspace with the
   * specified network policy. To revert to the default policy, specify 'default-policy' as the
   * network_policy_id.
   */
  WorkspaceNetworkOption updateWorkspaceNetworkOptionRpc(
      UpdateWorkspaceNetworkOptionRequest updateWorkspaceNetworkOptionRequest);
}
