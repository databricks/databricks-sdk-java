// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs are used to manage identities and the workspace access of these identities in
 * <Databricks>.
 */
@Generated
public class AccountIamV2API {
  private static final Logger LOG = LoggerFactory.getLogger(AccountIamV2API.class);

  private final AccountIamV2Service impl;

  /** Regular-use constructor */
  public AccountIamV2API(ApiClient apiClient) {
    impl = new AccountIamV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public AccountIamV2API(AccountIamV2Service mock) {
    impl = mock;
  }

  public WorkspaceAccessDetail getWorkspaceAccessDetail(long workspaceId, long principalId) {
    return getWorkspaceAccessDetail(
        new GetWorkspaceAccessDetailRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /**
   * Returns the access details for a principal in a workspace. Allows for checking access details
   * for any provisioned principal (user, service principal, or group) in a workspace. * Provisioned
   * principal here refers to one that has been synced into Databricks from the customer's IdP or
   * added explicitly to Databricks via SCIM/UI. Allows for passing in a "view" parameter to control
   * what fields are returned (BASIC by default or FULL).
   */
  public WorkspaceAccessDetail getWorkspaceAccessDetail(GetWorkspaceAccessDetailRequest request) {
    return impl.getWorkspaceAccessDetail(request);
  }

  /**
   * Resolves a group with the given external ID from the customer's IdP. If the group does not
   * exist, it will be created in the account. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  public ResolveGroupResponse resolveGroup(ResolveGroupRequest request) {
    return impl.resolveGroup(request);
  }

  /**
   * Resolves an SP with the given external ID from the customer's IdP. If the SP does not exist, it
   * will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  public ResolveServicePrincipalResponse resolveServicePrincipal(
      ResolveServicePrincipalRequest request) {
    return impl.resolveServicePrincipal(request);
  }

  /**
   * Resolves a user with the given external ID from the customer's IdP. If the user does not exist,
   * it will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  public ResolveUserResponse resolveUser(ResolveUserRequest request) {
    return impl.resolveUser(request);
  }

  public AccountIamV2Service impl() {
    return impl;
  }
}
