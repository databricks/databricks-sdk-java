// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;

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

  /**
   * Creates a workspace assignment detail for a principal. Entitlement grants are applied
   * individually and non-atomically — if a failure occurs partway through, the principal will be
   * assigned to the workspace but with only a subset of the requested entitlements. Use
   * GetWorkspaceAssignmentDetail to confirm which entitlements were successfully granted.
   */
  public WorkspaceAssignmentDetail createWorkspaceAssignmentDetail(
      CreateWorkspaceAssignmentDetailRequest request) {
    return impl.createWorkspaceAssignmentDetail(request);
  }

  public void deleteWorkspaceAssignmentDetail(long workspaceId, long principalId) {
    deleteWorkspaceAssignmentDetail(
        new DeleteWorkspaceAssignmentDetailRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /**
   * Deletes a workspace assignment detail for a principal, revoking all associated entitlements.
   * Entitlement revocations are applied individually and non-atomically — if a failure occurs
   * partway through, the principal remains assigned with a subset of its original entitlements, and
   * the operation is safe to retry.
   */
  public void deleteWorkspaceAssignmentDetail(DeleteWorkspaceAssignmentDetailRequest request) {
    impl.deleteWorkspaceAssignmentDetail(request);
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

  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetail(
      long workspaceId, long principalId) {
    return getWorkspaceAssignmentDetail(
        new GetWorkspaceAssignmentDetailRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /** Returns the assignment details for a principal in a workspace. */
  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetail(
      GetWorkspaceAssignmentDetailRequest request) {
    return impl.getWorkspaceAssignmentDetail(request);
  }

  public ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetails(long workspaceId) {
    return listWorkspaceAssignmentDetails(
        new ListWorkspaceAssignmentDetailsRequest().setWorkspaceId(workspaceId));
  }

  /** Lists workspace assignment details for a workspace. */
  public ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetails(
      ListWorkspaceAssignmentDetailsRequest request) {
    return impl.listWorkspaceAssignmentDetails(request);
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

  /**
   * Updates the entitlements of a directly assigned principal in a workspace. Entitlement changes
   * are applied individually and non-atomically — if a failure occurs partway through, only a
   * subset of the requested changes may have been applied. Use GetWorkspaceAssignmentDetail to
   * confirm the final state.
   */
  public WorkspaceAssignmentDetail updateWorkspaceAssignmentDetail(
      UpdateWorkspaceAssignmentDetailRequest request) {
    return impl.updateWorkspaceAssignmentDetail(request);
  }

  public AccountIamV2Service impl() {
    return impl;
  }
}
