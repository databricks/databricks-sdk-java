// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs allow configuration of network settings for Databricks workspaces by selecting which
 * network policy to associate with the workspace. Each workspace is always associated with exactly
 * one network policy that controls which network destinations can be accessed from the Databricks
 * environment. By default, workspaces are associated with the 'default-policy' network policy. You
 * cannot create or delete a workspace's network option, only update it to associate the workspace
 * with a different policy
 */
@Generated
public class WorkspaceNetworkConfigurationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceNetworkConfigurationAPI.class);

  private final WorkspaceNetworkConfigurationService impl;

  /** Regular-use constructor */
  public WorkspaceNetworkConfigurationAPI(ApiClient apiClient) {
    impl = new WorkspaceNetworkConfigurationImpl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceNetworkConfigurationAPI(WorkspaceNetworkConfigurationService mock) {
    impl = mock;
  }

  public WorkspaceNetworkOption getWorkspaceNetworkOptionRpc(long workspaceId) {
    return getWorkspaceNetworkOptionRpc(
        new GetWorkspaceNetworkOptionRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Gets the network option for a workspace. Every workspace has exactly one network policy
   * binding, with 'default-policy' used if no explicit assignment exists.
   */
  public WorkspaceNetworkOption getWorkspaceNetworkOptionRpc(
      GetWorkspaceNetworkOptionRequest request) {
    return impl.getWorkspaceNetworkOptionRpc(request);
  }

  public WorkspaceNetworkOption updateWorkspaceNetworkOptionRpc(
      long workspaceId, WorkspaceNetworkOption workspaceNetworkOption) {
    return updateWorkspaceNetworkOptionRpc(
        new UpdateWorkspaceNetworkOptionRequest()
            .setWorkspaceId(workspaceId)
            .setWorkspaceNetworkOption(workspaceNetworkOption));
  }

  /**
   * Updates the network option for a workspace. This operation associates the workspace with the
   * specified network policy. To revert to the default policy, specify 'default-policy' as the
   * network_policy_id.
   */
  public WorkspaceNetworkOption updateWorkspaceNetworkOptionRpc(
      UpdateWorkspaceNetworkOptionRequest request) {
    return impl.updateWorkspaceNetworkOptionRpc(request);
  }

  public WorkspaceNetworkConfigurationService impl() {
    return impl;
  }
}
