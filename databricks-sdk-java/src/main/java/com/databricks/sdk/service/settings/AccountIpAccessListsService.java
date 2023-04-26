// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

/**
 * The Accounts IP Access List API enables account admins to configure IP access lists for access to
 * the account console.
 *
 * <p>Account IP Access Lists affect web application access and REST API access to the account
 * console and account APIs. If the feature is disabled for the account, all access is allowed for
 * this account. There is support for allow lists (inclusion) and block lists (exclusion).
 *
 * <p>When a connection is attempted: 1. **First, all block lists are checked.** If the connection
 * IP address matches any block list, the connection is rejected. 2. **If the connection was not
 * rejected by block lists**, the IP address is compared with the allow lists.
 *
 * <p>If there is at least one allow list for the account, the connection is allowed only if the IP
 * address matches an allow list. If there are no allow lists for the account, all IP addresses are
 * allowed.
 *
 * <p>For all allow lists and block lists combined, the account supports a maximum of 1000 IP/CIDR
 * values, where one CIDR counts as a single value.
 *
 * <p>After changes to the account-level IP access lists, it can take a few minutes for changes to
 * take effect.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface AccountIpAccessListsService {
  /**
   * Create access list.
   *
   * <p>Creates an IP access list for the account.
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
   * <p>It can take a few minutes for the changes to take effect.
   *
   * @param createIpAccessList a {@link com.databricks.sdk.service.settings.CreateIpAccessList} object
   * @return a {@link com.databricks.sdk.service.settings.CreateIpAccessListResponse} object
   */
  CreateIpAccessListResponse create(CreateIpAccessList createIpAccessList);

  /**
   * Delete access list.
   *
   * <p>Deletes an IP access list, specified by its list ID.
   *
   * @param deleteAccountIpAccessListRequest a {@link com.databricks.sdk.service.settings.DeleteAccountIpAccessListRequest} object
   */
  void delete(DeleteAccountIpAccessListRequest deleteAccountIpAccessListRequest);

  /**
   * Get IP access list.
   *
   * <p>Gets an IP access list, specified by its list ID.
   *
   * @param getAccountIpAccessListRequest a {@link com.databricks.sdk.service.settings.GetAccountIpAccessListRequest} object
   * @return a {@link com.databricks.sdk.service.settings.GetIpAccessListResponse} object
   */
  GetIpAccessListResponse get(GetAccountIpAccessListRequest getAccountIpAccessListRequest);

  /**
   * Get access lists.
   *
   * <p>Gets all IP access lists for the specified account.
   *
   * @return a {@link com.databricks.sdk.service.settings.GetIpAccessListsResponse} object
   */
  GetIpAccessListsResponse list();

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
   * can take a few minutes for the changes to take effect.
   *
   * @param replaceIpAccessList a {@link com.databricks.sdk.service.settings.ReplaceIpAccessList} object
   */
  void replace(ReplaceIpAccessList replaceIpAccessList);

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
   * <p>It can take a few minutes for the changes to take effect.
   *
   * @param updateIpAccessList a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  void update(UpdateIpAccessList updateIpAccessList);
}
