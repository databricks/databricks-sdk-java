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

  /**
   * Creates a workspace assignment detail for a principal in the calling workspace. Entitlements
   * are granted one at a time rather than atomically. If the request fails partway through, the
   * principal stays assigned to the workspace with only some of the requested entitlements. Get the
   * assignment detail afterwards to confirm which entitlements were granted.
   */
  public WorkspaceAssignmentDetail createWorkspaceAssignmentDetailProxy(
      CreateWorkspaceAssignmentDetailProxyRequest request) {
    return impl.createWorkspaceAssignmentDetailProxy(request);
  }

  public void deleteWorkspaceAssignmentDetailProxy(long principalId) {
    deleteWorkspaceAssignmentDetailProxy(
        new DeleteWorkspaceAssignmentDetailProxyRequest().setPrincipalId(principalId));
  }

  /**
   * Deletes a workspace assignment detail for a principal in the calling workspace, revoking all of
   * its entitlements. Entitlements are revoked one at a time rather than atomically. If the request
   * fails partway through, the principal stays assigned with some of its original entitlements.
   * Retrying is safe.
   */
  public void deleteWorkspaceAssignmentDetailProxy(
      DeleteWorkspaceAssignmentDetailProxyRequest request) {
    impl.deleteWorkspaceAssignmentDetailProxy(request);
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

  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetailProxy(long principalId) {
    return getWorkspaceAssignmentDetailProxy(
        new GetWorkspaceAssignmentDetailProxyRequest().setPrincipalId(principalId));
  }

  /** Returns the assignment details for a principal in the calling workspace. */
  public WorkspaceAssignmentDetail getWorkspaceAssignmentDetailProxy(
      GetWorkspaceAssignmentDetailProxyRequest request) {
    return impl.getWorkspaceAssignmentDetailProxy(request);
  }

  /**
   * Lists workspace assignment details for the calling workspace. The response omits the
   * per-principal entitlement fields (`entitlements` and `effective_entitlements`). To read the
   * entitlements for a single principal, get that principal's assignment detail.
   */
  public ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetailsProxy(
      ListWorkspaceAssignmentDetailsProxyRequest request) {
    return impl.listWorkspaceAssignmentDetailsProxy(request);
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
   * Resolves a service principal with the given external ID from the customer's IdP. If the service
   * principal does not exist, it will be created. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
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

  /**
   * Updates the entitlements of a directly assigned principal in the calling workspace. Changes are
   * applied one at a time rather than atomically. If the request fails partway through, only some
   * of the requested changes take effect. Get the assignment detail afterwards to confirm the final
   * state.
   */
  public WorkspaceAssignmentDetail updateWorkspaceAssignmentDetailProxy(
      UpdateWorkspaceAssignmentDetailProxyRequest request) {
    return impl.updateWorkspaceAssignmentDetailProxy(request);
  }

  public WorkspaceIamV2Service impl() {
    return impl;
  }
}
