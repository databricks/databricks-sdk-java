// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class AccountIpAccessListsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountIpAccessListsAPI.class);

  private final AccountIpAccessListsService impl;

  /** Regular-use constructor */
  public AccountIpAccessListsAPI(ApiClient apiClient) {
    impl = new AccountIpAccessListsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountIpAccessListsAPI(AccountIpAccessListsService mock) {
    impl = mock;
  }

  /**
   * Creates an IP access list for the account.
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
   */
  public CreateIpAccessListResponse create(CreateIpAccessList request) {
    return impl.create(request);
  }

  public void delete(String ipAccessListId) {
    delete(new DeleteAccountIpAccessListRequest().setIpAccessListId(ipAccessListId));
  }

  /** Deletes an IP access list, specified by its list ID. */
  public void delete(DeleteAccountIpAccessListRequest request) {
    impl.delete(request);
  }

  public GetIpAccessListResponse get(String ipAccessListId) {
    return get(new GetAccountIpAccessListRequest().setIpAccessListId(ipAccessListId));
  }

  /** Gets an IP access list, specified by its list ID. */
  public GetIpAccessListResponse get(GetAccountIpAccessListRequest request) {
    return impl.get(request);
  }

  /** Gets all IP access lists for the specified account. */
  public Iterable<IpAccessListInfo> list() {
    return new Paginator<>(
        null,
        (Void v) -> impl.list(),
        GetIpAccessListsResponse::getIpAccessLists,
        response -> null);
  }

  /**
   * Replaces an IP access list, specified by its ID.
   *
   * <p>A list can include allow lists and block lists. See the top of this file for a description
   * of how the server treats allow lists and block lists at run time. When replacing an IP access
   * list: * For all allow lists and block lists combined, the API supports a maximum of 1000
   * IP/CIDR values, where one CIDR counts as a single value. Attempts to exceed that number return
   * error 400 with `error_code` value `QUOTA_EXCEEDED`. * If the resulting list would block the
   * calling user's current IP, error 400 is returned with `error_code` value `INVALID_STATE`. It
   * can take a few minutes for the changes to take effect.
   */
  public void replace(ReplaceIpAccessList request) {
    impl.replace(request);
  }

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
   * <p>It can take a few minutes for the changes to take effect.
   */
  public void update(UpdateIpAccessList request) {
    impl.update(request);
  }

  public AccountIpAccessListsService impl() {
    return impl;
  }
}
