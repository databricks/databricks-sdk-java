// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * IP Access List enables admins to configure IP access lists.
 *
 * <p>IP access lists affect web application access and REST API access to this workspace only. If
 * the feature is disabled for a workspace, all access is allowed for this workspace. There is
 * support for allow lists (inclusion) and block lists (exclusion).
 *
 * <p>When a connection is attempted: 1. **First, all block lists are checked.** If the connection
 * IP address matches any block list, the connection is rejected. 2. **If the connection was not
 * rejected by block lists**, the IP address is compared with the allow lists.
 *
 * <p>If there is at least one allow list for the workspace, the connection is allowed only if the
 * IP address matches an allow list. If there are no allow lists for the workspace, all IP addresses
 * are allowed.
 *
 * <p>For all allow lists and block lists combined, the workspace supports a maximum of 1000 IP/CIDR
 * values, where one CIDR counts as a single value.
 *
 * <p>After changes to the IP access list feature, it can take a few minutes for changes to take
 * effect.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface IpAccessListsService {
  /**
   * Creates an IP access list for this workspace.
   *
   * <p>A list can be an allow list or a block list. See the top of this file for a description of
   * how the server treats allow lists and block lists at runtime.
   *
   * <p>When creating or updating an IP access list:
   *
   * <p>* For all allow lists and block lists combined, the API supports a maximum of 1000 IP/CIDR
   * values, where one CIDR counts as a single value. Attempts to exceed that number return error
   * 400 with `error_code` value `QUOTA_EXCEEDED`. * If the new list would block the calling user's
   * current IP, error 400 is returned with `error_code` value `INVALID_STATE`.
   *
   * <p>It can take a few minutes for the changes to take effect. **Note**: Your new IP access list
   * has no effect until you enable the feature. See :method:workspaceconf/setStatus
   */
  CreateIpAccessListResponse create(CreateIpAccessList createIpAccessList);

  /** Deletes an IP access list, specified by its list ID. */
  void delete(DeleteIpAccessListRequest deleteIpAccessListRequest);

  /** Gets an IP access list, specified by its list ID. */
  FetchIpAccessListResponse get(GetIpAccessListRequest getIpAccessListRequest);

  /** Gets all IP access lists for the specified workspace. */
  ListIpAccessListResponse list();

  /**
   * Replaces an IP access list, specified by its ID.
   *
   * <p>A list can include allow lists and block lists. See the top of this file for a description
   * of how the server treats allow lists and block lists at run time. When replacing an IP access
   * list: * For all allow lists and block lists combined, the API supports a maximum of 1000
   * IP/CIDR values, where one CIDR counts as a single value. Attempts to exceed that number return
   * error 400 with `error_code` value `QUOTA_EXCEEDED`. * If the resulting list would block the
   * calling user's current IP, error 400 is returned with `error_code` value `INVALID_STATE`. It
   * can take a few minutes for the changes to take effect. Note that your resulting IP access list
   * has no effect until you enable the feature. See :method:workspaceconf/setStatus.
   */
  void replace(ReplaceIpAccessList replaceIpAccessList);

  /**
   * Updates an existing IP access list, specified by its ID.
   *
   * <p>A list can include allow lists and block lists. See the top of this file for a description
   * of how the server treats allow lists and block lists at run time.
   *
   * <p>When updating an IP access list:
   *
   * <p>* For all allow lists and block lists combined, the API supports a maximum of 1000 IP/CIDR
   * values, where one CIDR counts as a single value. Attempts to exceed that number return error
   * 400 with `error_code` value `QUOTA_EXCEEDED`. * If the updated list would block the calling
   * user's current IP, error 400 is returned with `error_code` value `INVALID_STATE`.
   *
   * <p>It can take a few minutes for the changes to take effect. Note that your resulting IP access
   * list has no effect until you enable the feature. See :method:workspaceconf/setStatus.
   */
  void update(UpdateIpAccessList updateIpAccessList);
}
