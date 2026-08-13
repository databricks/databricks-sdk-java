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
public interface WorkspaceIamV2Service {
  /** Creates a group membership (assigns a principal to a group). */
  DirectGroupMember createDirectGroupMemberProxy(
      CreateDirectGroupMemberProxyRequest createDirectGroupMemberProxyRequest);

  /**
   * Creates a local group in the Databricks account that parents the calling workspace and returns
   * the created group. A local group is one that is not synced from the customer's identity
   * provider, and can be created whether or not Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. Use the ExternalGroup
   * resource to sync groups from the identity provider instead.
   */
  Group createGroupProxy(CreateGroupProxyRequest createGroupProxyRequest);

  /**
   * Creates a local service principal in the Databricks account that parents the calling workspace
   * and returns the created service principal. A local service principal is one that is not synced
   * from the customer's identity provider, and can be created whether or not Account Identity
   * Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. Use the
   * ExternalServicePrincipal resource to sync service principals from the identity provider
   * instead.
   */
  ServicePrincipal createServicePrincipalProxy(
      CreateServicePrincipalProxyRequest createServicePrincipalProxyRequest);

  /**
   * Creates a local user in the Databricks account that parents the calling workspace and returns
   * the created user. A local user is one that is not synced from the customer's identity provider,
   * and can be created whether or not Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. Use the ExternalUser
   * resource to sync users from the identity provider instead.
   */
  User createUserProxy(CreateUserProxyRequest createUserProxyRequest);

  /**
   * Creates a workspace assignment detail for a principal in the calling workspace. Entitlements
   * are granted one at a time rather than atomically. If the request fails partway through, the
   * principal stays assigned to the workspace with only some of the requested entitlements. Get the
   * assignment detail afterwards to confirm which entitlements were granted.
   */
  WorkspaceAssignmentDetail createWorkspaceAssignmentDetailProxy(
      CreateWorkspaceAssignmentDetailProxyRequest createWorkspaceAssignmentDetailProxyRequest);

  /**
   * Creates a workspace assignment for a principal in the calling workspace. Entitlements are
   * granted one at a time rather than atomically. If the request fails partway through, the
   * principal stays assigned to the workspace with only some of the requested entitlements. Get the
   * assignment afterwards to confirm which entitlements were granted.
   */
  WorkspaceAssignment createWorkspaceAssignmentProxy(
      CreateWorkspaceAssignmentProxyRequest createWorkspaceAssignmentProxyRequest);

  /** Deletes a group membership (unassigns a principal from a group). */
  void deleteDirectGroupMemberProxy(
      DeleteDirectGroupMemberProxyRequest deleteDirectGroupMemberProxyRequest);

  /**
   * Deletes a group by its internal ID from the Databricks account that parents the calling
   * workspace.
   */
  void deleteGroupProxy(DeleteGroupProxyRequest deleteGroupProxyRequest);

  /**
   * Deletes a service principal by its internal ID from the Databricks account that parents the
   * calling workspace.
   */
  void deleteServicePrincipalProxy(
      DeleteServicePrincipalProxyRequest deleteServicePrincipalProxyRequest);

  /**
   * Deletes a user by its internal ID from the Databricks account that parents the calling
   * workspace.
   */
  void deleteUserProxy(DeleteUserProxyRequest deleteUserProxyRequest);

  /**
   * Deletes a workspace assignment detail for a principal in the calling workspace, revoking all of
   * its entitlements. Entitlements are revoked one at a time rather than atomically. If the request
   * fails partway through, the principal stays assigned with some of its original entitlements.
   * Retrying is safe.
   */
  void deleteWorkspaceAssignmentDetailProxy(
      DeleteWorkspaceAssignmentDetailProxyRequest deleteWorkspaceAssignmentDetailProxyRequest);

  /**
   * Deletes a workspace assignment for a principal in the calling workspace, revoking all of its
   * entitlements. Entitlements are revoked one at a time rather than atomically. If the request
   * fails partway through, the principal stays assigned with some of its original entitlements.
   * Retrying is safe.
   */
  void deleteWorkspaceAssignmentProxy(
      DeleteWorkspaceAssignmentProxyRequest deleteWorkspaceAssignmentProxyRequest);

  /** Gets a provisioned direct member of a group. */
  DirectGroupMember getDirectGroupMemberProxy(
      GetDirectGroupMemberProxyRequest getDirectGroupMemberProxyRequest);

  /**
   * Fetches a group by its internal ID from the Databricks account that parents the calling
   * workspace.
   */
  Group getGroupProxy(GetGroupProxyRequest getGroupProxyRequest);

  /**
   * Fetches a service principal by its internal ID from the Databricks account that parents the
   * calling workspace.
   */
  ServicePrincipal getServicePrincipalProxy(
      GetServicePrincipalProxyRequest getServicePrincipalProxyRequest);

  /**
   * Fetches a user by its internal ID from the Databricks account that parents the calling
   * workspace.
   */
  User getUserProxy(GetUserProxyRequest getUserProxyRequest);

  /**
   * Returns the access details for a principal in the current workspace. Allows for checking access
   * details for any provisioned principal (user, service principal, or group) in the current
   * workspace. * Provisioned principal here refers to one that has been synced into Databricks from
   * the customer's IdP or added explicitly to Databricks via SCIM/UI. Allows for passing in a
   * "view" parameter to control what fields are returned (BASIC by default or FULL).
   */
  WorkspaceAccessDetail getWorkspaceAccessDetailLocal(
      GetWorkspaceAccessDetailLocalRequest getWorkspaceAccessDetailLocalRequest);

  /** Returns the assignment details for a principal in the calling workspace. */
  WorkspaceAssignmentDetail getWorkspaceAssignmentDetailProxy(
      GetWorkspaceAssignmentDetailProxyRequest getWorkspaceAssignmentDetailProxyRequest);

  /** Returns the assignment for a principal in the calling workspace. */
  WorkspaceAssignment getWorkspaceAssignmentProxy(
      GetWorkspaceAssignmentProxyRequest getWorkspaceAssignmentProxyRequest);

  /** Returns the identity details for a principal in a workspace. */
  WorkspaceIdentityDetail getWorkspaceIdentityDetail(
      GetWorkspaceIdentityDetailRequest getWorkspaceIdentityDetailRequest);

  /**
   * Lists provisioned direct members of a group with their membership source (internal or from
   * identity provider).
   */
  ListDirectGroupMembersResponse listDirectGroupMembersProxy(
      ListDirectGroupMembersProxyRequest listDirectGroupMembersProxyRequest);

  /**
   * Lists the groups in the Databricks account that parents the calling workspace, returning one
   * page per call. Supports filtering by group name or external ID.
   */
  ListGroupsResponse listGroupsProxy(ListGroupsProxyRequest listGroupsProxyRequest);

  /**
   * Lists the service principals in the Databricks account that parents the calling workspace,
   * returning one page per call. Supports filtering by application ID or external ID.
   */
  ListServicePrincipalsResponse listServicePrincipalsProxy(
      ListServicePrincipalsProxyRequest listServicePrincipalsProxyRequest);

  /** Lists all transitive parent groups of a principal. */
  ListTransitiveParentGroupsResponse listTransitiveParentGroupsProxy(
      ListTransitiveParentGroupsProxyRequest listTransitiveParentGroupsProxyRequest);

  /**
   * Lists the users in the Databricks account that parents the calling workspace, returning one
   * page per call. Supports filtering by username or external ID.
   */
  ListUsersResponse listUsersProxy(ListUsersProxyRequest listUsersProxyRequest);

  /**
   * Lists workspace assignment details for the calling workspace. The response omits the
   * per-principal entitlement fields (`entitlements` and `effective_entitlements`). To read the
   * entitlements for a single principal, get that principal's assignment detail.
   */
  ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetailsProxy(
      ListWorkspaceAssignmentDetailsProxyRequest listWorkspaceAssignmentDetailsProxyRequest);

  /**
   * Lists workspace assignments for the calling workspace. The response omits the per-principal
   * entitlement fields (`entitlements` and `effective_entitlements`). To read the entitlements for
   * a single principal, get that principal's assignment.
   */
  ListWorkspaceAssignmentsResponse listWorkspaceAssignmentsProxy(
      ListWorkspaceAssignmentsProxyRequest listWorkspaceAssignmentsProxyRequest);

  /**
   * Resolves a group with the given external ID from the customer's IdP. If the group does not
   * exist, it will be created in the account. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  ResolveGroupResponse resolveGroupProxy(ResolveGroupProxyRequest resolveGroupProxyRequest);

  /**
   * Resolves a service principal with the given external ID from the customer's IdP. If the service
   * principal does not exist, it will be created. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  ResolveServicePrincipalResponse resolveServicePrincipalProxy(
      ResolveServicePrincipalProxyRequest resolveServicePrincipalProxyRequest);

  /**
   * Resolves a user with the given external ID from the customer's IdP. If the user does not exist,
   * it will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  ResolveUserResponse resolveUserProxy(ResolveUserProxyRequest resolveUserProxyRequest);

  /**
   * Updates an existing group in the Databricks account that parents the calling workspace. Only
   * the fields named in the update mask are modified. Returns the updated Group resource.
   */
  Group updateGroupProxy(UpdateGroupProxyRequest updateGroupProxyRequest);

  /**
   * Updates an existing service principal in the Databricks account that parents the calling
   * workspace. Only the fields named in the update mask are modified. Returns the updated
   * ServicePrincipal resource.
   */
  ServicePrincipal updateServicePrincipalProxy(
      UpdateServicePrincipalProxyRequest updateServicePrincipalProxyRequest);

  /**
   * Updates an existing user in the Databricks account that parents the calling workspace and
   * returns the updated user. Only the fields named in the update mask are modified. The updatable
   * fields are fullName.givenName, fullName.familyName, status, and externalId.
   */
  User updateUserProxy(UpdateUserProxyRequest updateUserProxyRequest);

  /**
   * Updates the entitlements of a directly assigned principal in the calling workspace. Changes are
   * applied one at a time rather than atomically. If the request fails partway through, only some
   * of the requested changes take effect. Get the assignment detail afterwards to confirm the final
   * state.
   */
  WorkspaceAssignmentDetail updateWorkspaceAssignmentDetailProxy(
      UpdateWorkspaceAssignmentDetailProxyRequest updateWorkspaceAssignmentDetailProxyRequest);

  /**
   * Updates the entitlements of a directly assigned principal in the calling workspace. Changes are
   * applied one at a time rather than atomically. If the request fails partway through, only some
   * of the requested changes take effect. Get the assignment afterwards to confirm the final state.
   */
  WorkspaceAssignment updateWorkspaceAssignmentProxy(
      UpdateWorkspaceAssignmentProxyRequest updateWorkspaceAssignmentProxyRequest);

  /** Updates a workspace identity detail for a principal. */
  WorkspaceIdentityDetail updateWorkspaceIdentityDetail(
      UpdateWorkspaceIdentityDetailRequest updateWorkspaceIdentityDetailRequest);
}
