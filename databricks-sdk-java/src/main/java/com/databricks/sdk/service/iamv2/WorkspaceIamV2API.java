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
public class WorkspaceIamV2API {
  private static final Logger LOG = LoggerFactory.getLogger(WorkspaceIamV2API.class);

  private final WorkspaceIamV2Service impl;

  /** Regular-use constructor */
  public WorkspaceIamV2API(ApiClient apiClient) {
    impl = new WorkspaceIamV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public WorkspaceIamV2API(WorkspaceIamV2Service mock) {
    impl = mock;
  }

  public WorkspaceAccessDetail getWorkspaceAccessDetailLocal(long principalId) {
    return getWorkspaceAccessDetailLocal(
        new GetWorkspaceAccessDetailLocalRequest().setPrincipalId(principalId));
  }

  /**
   * Returns the access details for a principal in the current workspace. Allows for checking access
   * details for any provisioned principal (user, service principal, or group) in the current
   * workspace. * Provisioned principal here refers to one that has been synced into Databricks from
   * the customer's IdP or added explicitly to Databricks via SCIM/UI. Allows for passing in a
   * "view" parameter to control what fields are returned (BASIC by default or FULL).
   */
  public WorkspaceAccessDetail getWorkspaceAccessDetailLocal(
      GetWorkspaceAccessDetailLocalRequest request) {
    return impl.getWorkspaceAccessDetailLocal(request);
  }

  /**
   * Resolves a group with the given external ID from the customer's IdP. If the group does not
   * exist, it will be created in the account. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  public ResolveGroupResponse resolveGroupProxy(ResolveGroupProxyRequest request) {
    return impl.resolveGroupProxy(request);
  }

  /**
   * Resolves an SP with the given external ID from the customer's IdP. If the SP does not exist, it
   * will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  public ResolveServicePrincipalResponse resolveServicePrincipalProxy(
      ResolveServicePrincipalProxyRequest request) {
    return impl.resolveServicePrincipalProxy(request);
  }

  /**
   * Resolves a user with the given external ID from the customer's IdP. If the user does not exist,
   * it will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  public ResolveUserResponse resolveUserProxy(ResolveUserProxyRequest request) {
    return impl.resolveUserProxy(request);
  }

  public WorkspaceIamV2Service impl() {
    return impl;
  }
}
