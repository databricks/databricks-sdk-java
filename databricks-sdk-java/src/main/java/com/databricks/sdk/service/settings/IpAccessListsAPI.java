// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class IpAccessListsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(IpAccessListsAPI.class);

  private final IpAccessListsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public IpAccessListsAPI(ApiClient apiClient) {
    impl = new IpAccessListsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.settings.IpAccessListsService} object
   */
  public IpAccessListsAPI(IpAccessListsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param label a {@link java.lang.String} object
   * @param listType a {@link com.databricks.sdk.service.settings.ListType} object
   * @param ipAddresses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.settings.CreateIpAccessListResponse} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.settings.CreateIpAccessList} object
   * @return a {@link com.databricks.sdk.service.settings.CreateIpAccessListResponse} object
   */
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param ipAccessListId a {@link java.lang.String} object
   */
  public void delete(String ipAccessListId) {
    delete(new DeleteIpAccessListRequest().setIpAccessListId(ipAccessListId));
  }

  /**
   * Delete access list.
   *
   * <p>Deletes an IP access list, specified by its list ID.
   *
   * @param request a {@link com.databricks.sdk.service.settings.DeleteIpAccessListRequest} object
   */
  public void delete(DeleteIpAccessListRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param ipAccessListId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.FetchIpAccessListResponse} object
   */
  public FetchIpAccessListResponse get(String ipAccessListId) {
    return get(new GetIpAccessListRequest().setIpAccessListId(ipAccessListId));
  }

  /**
   * Get access list.
   *
   * <p>Gets an IP access list, specified by its list ID.
   *
   * @param request a {@link com.databricks.sdk.service.settings.GetIpAccessListRequest} object
   * @return a {@link com.databricks.sdk.service.settings.FetchIpAccessListResponse} object
   */
  public FetchIpAccessListResponse get(GetIpAccessListRequest request) {
    return impl.get(request);
  }

  /**
   * Get access lists.
   *
   * <p>Gets all IP access lists for the specified workspace.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<IpAccessListInfo> list() {
    return impl.list().getIpAccessLists();
  }

  /**
   * <p>replace.</p>
   *
   * @param label a {@link java.lang.String} object
   * @param listType a {@link com.databricks.sdk.service.settings.ListType} object
   * @param ipAddresses a {@link java.util.Collection} object
   * @param enabled a boolean
   * @param ipAccessListId a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.settings.ReplaceIpAccessList} object
   */
  public void replace(ReplaceIpAccessList request) {
    impl.replace(request);
  }

  /**
   * <p>update.</p>
   *
   * @param label a {@link java.lang.String} object
   * @param listType a {@link com.databricks.sdk.service.settings.ListType} object
   * @param ipAddresses a {@link java.util.Collection} object
   * @param enabled a boolean
   * @param ipAccessListId a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  public void update(UpdateIpAccessList request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListsService} object
   */
  public IpAccessListsService impl() {
    return impl;
  }
}
