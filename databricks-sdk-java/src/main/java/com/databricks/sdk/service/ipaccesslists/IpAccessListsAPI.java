// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ipaccesslists;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
public class IpAccessListsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(IpAccessListsAPI.class);

  private final IpAccessListsService impl;

  /** Regular-use constructor */
  public IpAccessListsAPI(ApiClient apiClient) {
    impl = new IpAccessListsImpl(apiClient);
  }

  /** Constructor for mocks */
  public IpAccessListsAPI(IpAccessListsService mock) {
    impl = mock;
  }

  public CreateIpAccessListResponse create(
      String label, ListType listType, Collection<String> ipAddresses) {
    return create(
        new CreateIpAccessList().setLabel(label).setListType(listType).setIpAddresses(ipAddresses));
  }

  /**
   * Create access list.
   *
   * <p>Creates an IP access list for this workspace.
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
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    return impl.create(request);
  }

  public void delete(String ipAccessListId) {
    delete(new Delete().setIpAccessListId(ipAccessListId));
  }

  /**
   * Delete access list.
   *
   * <p>Deletes an IP access list, specified by its list ID.
   */
  public void delete(Delete request) {
    impl.delete(request);
  }

  public FetchIpAccessListResponse get(String ipAccessListId) {
    return get(new Get().setIpAccessListId(ipAccessListId));
  }

  /**
   * Get access list.
   *
   * <p>Gets an IP access list, specified by its list ID.
   */
  public FetchIpAccessListResponse get(Get request) {
    return impl.get(request);
  }

  /**
   * Get access lists.
   *
   * <p>Gets all IP access lists for the specified workspace.
   */
  public Iterable<IpAccessListInfo> list() {
    return impl.list().getIpAccessLists();
  }

  public void replace(
      String label,
      ListType listType,
      Collection<String> ipAddresses,
      boolean enabled,
      String ipAccessListId) {
    replace(
        new ReplaceIpAccessList()
            .setLabel(label)
            .setListType(listType)
            .setIpAddresses(ipAddresses)
            .setEnabled(enabled)
            .setIpAccessListId(ipAccessListId));
  }

  /**
   * Replace access list.
   *
   * <p>Replaces an IP access list, specified by its ID.
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
  public void replace(ReplaceIpAccessList request) {
    impl.replace(request);
  }

  public void update(
      String label,
      ListType listType,
      Collection<String> ipAddresses,
      boolean enabled,
      String ipAccessListId) {
    update(
        new UpdateIpAccessList()
            .setLabel(label)
            .setListType(listType)
            .setIpAddresses(ipAddresses)
            .setEnabled(enabled)
            .setIpAccessListId(ipAccessListId));
  }

  /**
   * Update access list.
   *
   * <p>Updates an existing IP access list, specified by its ID.
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
  public void update(UpdateIpAccessList request) {
    impl.update(request);
  }

  public IpAccessListsService impl() {
    return impl;
  }
}
