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
  /** Creates a group membership (assigns a principal to a group). */
  DirectGroupMember createDirectGroupMember(
      CreateDirectGroupMemberRequest createDirectGroupMemberRequest);

  /**
   * Creates a local group in the Databricks account and returns the created group. A local group is
   * one that is not synced from the customer's identity provider, and can be created whether or not
   * Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. Use the ExternalGroup
   * resource to sync groups from the identity provider instead.
   */
  Group createGroup(CreateGroupRequest createGroupRequest);

  /**
   * Creates a local service principal in the Databricks account and returns the created service
   * principal. A local service principal is one that is not synced from the customer's identity
   * provider, and can be created whether or not Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. Use the
   * ExternalServicePrincipal resource to sync service principals from the identity provider
   * instead.
   */
  ServicePrincipal createServicePrincipal(
      CreateServicePrincipalRequest createServicePrincipalRequest);

  /**
   * Creates a local user in the Databricks account and returns the created user. A local user is
   * one that is not synced from the customer's identity provider, and can be created whether or not
   * Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. Use the ExternalUser
   * resource to sync users from the identity provider instead.
   */
  User createUser(CreateUserRequest createUserRequest);

  /**
   * Creates a workspace assignment for a principal. Entitlements are granted one at a time rather
   * than atomically. If the request fails partway through, the principal stays assigned to the
   * workspace with only some of the requested entitlements. Get the assignment afterwards to
   * confirm which entitlements were granted.
   */
  WorkspaceAssignment createWorkspaceAssignment(
      CreateWorkspaceAssignmentRequest createWorkspaceAssignmentRequest);

  /**
   * Creates a workspace assignment detail for a principal. Entitlements are granted one at a time
   * rather than atomically. If the request fails partway through, the principal stays assigned to
   * the workspace with only some of the requested entitlements. Get the assignment detail
   * afterwards to confirm which entitlements were granted.
   */
  WorkspaceAssignmentDetail createWorkspaceAssignmentDetail(
      CreateWorkspaceAssignmentDetailRequest createWorkspaceAssignmentDetailRequest);

  /** Deletes a group membership (unassigns a principal from a group). */
  void deleteDirectGroupMember(DeleteDirectGroupMemberRequest deleteDirectGroupMemberRequest);

  /** Deletes a group from the Databricks account by its internal ID. */
  void deleteGroup(DeleteGroupRequest deleteGroupRequest);

  /** Deletes a service principal from the Databricks account by its internal ID. */
  void deleteServicePrincipal(DeleteServicePrincipalRequest deleteServicePrincipalRequest);

  /** Deletes a user from the Databricks account by its internal ID. */
  void deleteUser(DeleteUserRequest deleteUserRequest);

  /**
   * Deletes a workspace assignment for a principal, revoking all of its entitlements. Entitlements
   * are revoked one at a time rather than atomically. If the request fails partway through, the
   * principal stays assigned with some of its original entitlements. Retrying is safe.
   */
  void deleteWorkspaceAssignment(DeleteWorkspaceAssignmentRequest deleteWorkspaceAssignmentRequest);

  /**
   * Deletes a workspace assignment detail for a principal, revoking all of its entitlements.
   * Entitlements are revoked one at a time rather than atomically. If the request fails partway
   * through, the principal stays assigned with some of its original entitlements. Retrying is safe.
   */
  void deleteWorkspaceAssignmentDetail(
      DeleteWorkspaceAssignmentDetailRequest deleteWorkspaceAssignmentDetailRequest);

  /** Gets a provisioned direct member of a group. */
  DirectGroupMember getDirectGroupMember(GetDirectGroupMemberRequest getDirectGroupMemberRequest);

  /** Fetches a group from the Databricks account by its internal ID. */
  Group getGroup(GetGroupRequest getGroupRequest);

  /** Fetches a service principal from the Databricks account by its internal ID. */
  ServicePrincipal getServicePrincipal(GetServicePrincipalRequest getServicePrincipalRequest);

  /** Fetches a user from the Databricks account by its internal ID. */
  User getUser(GetUserRequest getUserRequest);

  /**
   * Returns the access details for a principal in a workspace. Allows for checking access details
   * for any provisioned principal (user, service principal, or group) in a workspace. * Provisioned
   * principal here refers to one that has been synced into Databricks from the customer's IdP or
   * added explicitly to Databricks via SCIM/UI. Allows for passing in a "view" parameter to control
   * what fields are returned (BASIC by default or FULL).
   */
  WorkspaceAccessDetail getWorkspaceAccessDetail(
      GetWorkspaceAccessDetailRequest getWorkspaceAccessDetailRequest);

  /** Returns the assignment for a principal in a workspace. */
  WorkspaceAssignment getWorkspaceAssignment(
      GetWorkspaceAssignmentRequest getWorkspaceAssignmentRequest);

  /** Returns the assignment details for a principal in a workspace. */
  WorkspaceAssignmentDetail getWorkspaceAssignmentDetail(
      GetWorkspaceAssignmentDetailRequest getWorkspaceAssignmentDetailRequest);

  /**
   * Lists provisioned direct members of a group with their membership source (internal or from
   * identity provider).
   */
  ListDirectGroupMembersResponse listDirectGroupMembers(
      ListDirectGroupMembersRequest listDirectGroupMembersRequest);

  /**
   * Lists the groups in the Databricks account, returning one page per call. Supports filtering by
   * group name or external ID.
   */
  ListGroupsResponse listGroups(ListGroupsRequest listGroupsRequest);

  /**
   * Lists the service principals in the Databricks account, returning one page per call. Supports
   * filtering by application ID or external ID.
   */
  ListServicePrincipalsResponse listServicePrincipals(
      ListServicePrincipalsRequest listServicePrincipalsRequest);

  /** Lists all transitive parent groups of a principal. */
  ListTransitiveParentGroupsResponse listTransitiveParentGroups(
      ListTransitiveParentGroupsRequest listTransitiveParentGroupsRequest);

  /**
   * Lists the users in the Databricks account, returning one page per call. Supports filtering by
   * username or external ID.
   */
  ListUsersResponse listUsers(ListUsersRequest listUsersRequest);

  /**
   * Lists workspace assignment details for a workspace. The response omits the per-principal
   * entitlement fields (`entitlements` and `effective_entitlements`). To read the entitlements for
   * a single principal, get that principal's assignment detail.
   */
  ListWorkspaceAssignmentDetailsResponse listWorkspaceAssignmentDetails(
      ListWorkspaceAssignmentDetailsRequest listWorkspaceAssignmentDetailsRequest);

  /**
   * Lists workspace assignments for a workspace. The response omits the per-principal entitlement
   * fields (`entitlements` and `effective_entitlements`). To read the entitlements for a single
   * principal, get that principal's assignment.
   */
  ListWorkspaceAssignmentsResponse listWorkspaceAssignments(
      ListWorkspaceAssignmentsRequest listWorkspaceAssignmentsRequest);

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
   * Updates an existing group in the Databricks account. Only the fields named in the update mask
   * are modified. Returns the updated Group resource.
   */
  Group updateGroup(UpdateGroupRequest updateGroupRequest);

  /**
   * Updates an existing service principal in the Databricks account. Only the fields named in the
   * update mask are modified. Returns the updated ServicePrincipal resource.
   */
  ServicePrincipal updateServicePrincipal(
      UpdateServicePrincipalRequest updateServicePrincipalRequest);

  /**
   * Updates an existing user in the Databricks account and returns the updated user. Only the
   * fields named in the update mask are modified. The updatable fields are fullName.givenName,
   * fullName.familyName, status, and externalId. The behavior is the same whether or not Account
   * Identity Management (AIM) is enabled.
   */
  User updateUser(UpdateUserRequest updateUserRequest);

  /**
   * Updates the entitlements of a directly assigned principal in a workspace. Changes are applied
   * one at a time rather than atomically. If the request fails partway through, only some of the
   * requested changes take effect. Get the assignment afterwards to confirm the final state.
   */
  WorkspaceAssignment updateWorkspaceAssignment(
      UpdateWorkspaceAssignmentRequest updateWorkspaceAssignmentRequest);

  /**
   * Updates the entitlements of a directly assigned principal in a workspace. Changes are applied
   * one at a time rather than atomically. If the request fails partway through, only some of the
   * requested changes take effect. Get the assignment detail afterwards to confirm the final state.
   */
  WorkspaceAssignmentDetail updateWorkspaceAssignmentDetail(
      UpdateWorkspaceAssignmentDetailRequest updateWorkspaceAssignmentDetailRequest);
}
