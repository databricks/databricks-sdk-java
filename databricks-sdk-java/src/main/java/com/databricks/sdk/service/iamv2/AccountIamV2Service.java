// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs are used to manage identities and the workspace access of these identities in
 * <Databricks>.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountIamV2Service {
  /**
   * Creates a workspace assignment detail for a principal. Entitlements are granted one at a time
   * rather than atomically. If the request fails partway through, the principal stays assigned to
   * the workspace with only some of the requested entitlements. Get the assignment detail
   * afterwards to confirm which entitlements were granted.
   */
  WorkspaceAssignmentDetail createWorkspaceAssignmentDetail(
      CreateWorkspaceAssignmentDetailRequest createWorkspaceAssignmentDetailRequest);

  /**
   * Deletes a workspace assignment detail for a principal, revoking all of its entitlements.
   * Entitlements are revoked one at a time rather than atomically. If the request fails partway
   * through, the principal stays assigned with some of its original entitlements. Retrying is safe.
   */
  void deleteWorkspaceAssignmentDetail(
      DeleteWorkspaceAssignmentDetailRequest deleteWorkspaceAssignmentDetailRequest);

  /**
   * Returns the access details for a principal in a workspace. Allows for checking access details
   * for any provisioned principal (user, service principal, or group) in a workspace. * Provisioned
   * principal here refers to one that has been synced into Databricks from the customer's IdP or
   * added explicitly to Databricks via SCIM/UI. Allows for passing in a "view" parameter to control
   * what fields are returned (BASIC by default or FULL).
   */
  WorkspaceAccessDetail getWorkspaceAccessDetail(
      GetWorkspaceAccessDetailRequest getWorkspaceAccessDetailRequest);

  /** Returns the assignment details for a principal in a workspace. */
  WorkspaceAssignmentDetail getWorkspaceAssignmentDetail(
      GetWorkspaceAssignmentDetailRequest getWorkspaceAssignmentDetailRequest);

  /**
   * Lists workspace assignment details for a workspace. The response omits the per-principal
   * entitlement fields (`entitlements` and `effective_entitlements`). To read the entitlements for
   * a single principal, get that principal's assignment detail.
   */
  ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetails(
      ListWorkspaceAssignmentDetailsRequest listWorkspaceAssignmentDetailsRequest);

  /**
   * Resolves a group with the given external ID from the customer's IdP. If the group does not
   * exist, it will be created in the account. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  ResolveGroupResponse resolveGroup(ResolveGroupRequest resolveGroupRequest);

  /**
   * Resolves a service principal with the given external ID from the customer's IdP. If the service
   * principal does not exist, it will be created. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  ResolveServicePrincipalResponse resolveServicePrincipal(
      ResolveServicePrincipalRequest resolveServicePrincipalRequest);

  /**
   * Resolves a user with the given external ID from the customer's IdP. If the user does not exist,
   * it will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  ResolveUserResponse resolveUser(ResolveUserRequest resolveUserRequest);

  /**
   * Updates the entitlements of a directly assigned principal in a workspace. Changes are applied
   * one at a time rather than atomically. If the request fails partway through, only some of the
   * requested changes take effect. Get the assignment detail afterwards to confirm the final state.
   */
  WorkspaceAssignmentDetail updateWorkspaceAssignmentDetail(
      UpdateWorkspaceAssignmentDetailRequest updateWorkspaceAssignmentDetailRequest);
}
