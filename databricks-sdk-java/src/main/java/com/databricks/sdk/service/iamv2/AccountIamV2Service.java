// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs are used to manage identities and the workspace access of these identities in
 * Databricks.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountIamV2Service {
  /**
   * Adds a user, service principal, or group as a direct member of a group.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  DirectGroupMember createDirectGroupMember(
      CreateDirectGroupMemberRequest createDirectGroupMemberRequest);

  /**
   * Creates a local group, which is a group that isn't synced from your identity provider (IdP).
   * You become a manager of the new group.
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a group from
   * your IdP, get it as an external group instead.
   */
  Group createGroup(CreateGroupRequest createGroupRequest);

  /**
   * Creates a group visibility filter. It applies to every workspace in the account.
   *
   * <p>Returns `ALREADY_EXISTS` if a filter with the same ID, or the same type and match value,
   * already exists. Returns `RESOURCE_EXHAUSTED` if the account already has the maximum number of
   * filters of that type. You can't change a filter: to change a rule, delete it and create a new
   * one.
   */
  IdentityVisibilityFilter createIdentityVisibilityFilter(
      CreateIdentityVisibilityFilterRequest createIdentityVisibilityFilterRequest);

  /**
   * Creates a local service principal, which is a service principal that isn't synced from your
   * identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a service
   * principal from your IdP, get it as an external service principal instead.
   */
  ServicePrincipal createServicePrincipal(
      CreateServicePrincipalRequest createServicePrincipalRequest);

  /**
   * Creates a local user, which is a user that isn't synced from your identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a user from your
   * IdP, get them as an external user instead.
   */
  User createUser(CreateUserRequest createUserRequest);

  /**
   * Assigns a user, service principal, or group directly to a workspace with the given
   * entitlements. Returns an error if the principal is already assigned directly.
   *
   * <p>Entitlements are granted one at a time. If the request fails partway through, the principal
   * stays assigned with only some of the entitlements. Get the assignment afterwards to check which
   * were granted.
   */
  WorkspaceAssignment createWorkspaceAssignment(
      CreateWorkspaceAssignmentRequest createWorkspaceAssignmentRequest);

  /** Creates a workspace assignment detail for a principal. */
  WorkspaceAssignmentDetail createWorkspaceAssignmentDetail(
      CreateWorkspaceAssignmentDetailRequest createWorkspaceAssignmentDetailRequest);

  /**
   * Removes a direct member from a group.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  void deleteDirectGroupMember(DeleteDirectGroupMemberRequest deleteDirectGroupMemberRequest);

  /** Deletes a group from your account and removes it from the workspaces it's assigned to. */
  void deleteGroup(DeleteGroupRequest deleteGroupRequest);

  /**
   * Deletes a group visibility filter. Deleting a filter doesn't delete groups or remove access.
   * Groups that only this filter matched stop being visible, unless they or a parent group are
   * already in your account. If no group filters remain, all groups become visible again. Deleting
   * a filter that doesn't exist succeeds.
   */
  void deleteIdentityVisibilityFilter(
      DeleteIdentityVisibilityFilterRequest deleteIdentityVisibilityFilterRequest);

  /**
   * Deletes a service principal from your account and removes it from the workspaces it's assigned
   * to. You can't delete service principals that Databricks manages.
   */
  void deleteServicePrincipal(DeleteServicePrincipalRequest deleteServicePrincipalRequest);

  /** Deletes a user from your account and removes them from the workspaces they're assigned to. */
  void deleteUser(DeleteUserRequest deleteUserRequest);

  /**
   * Removes a principal's direct assignment to a workspace and revokes the entitlements it granted.
   * The principal keeps any access it gets through groups.
   *
   * <p>Entitlements are revoked one at a time. If the request fails partway through, the principal
   * stays assigned with some of its entitlements. You can retry the request.
   */
  void deleteWorkspaceAssignment(DeleteWorkspaceAssignmentRequest deleteWorkspaceAssignmentRequest);

  /**
   * Deletes a workspace assignment detail for a principal, revoking all of its entitlements.
   * Entitlements are revoked one at a time rather than atomically. If the request fails partway
   * through, the principal stays assigned with some of its original entitlements. Retrying is safe.
   */
  void deleteWorkspaceAssignmentDetail(
      DeleteWorkspaceAssignmentDetailRequest deleteWorkspaceAssignmentDetailRequest);

  /**
   * Gets a direct member of a group, including where the membership comes from. Returns an error if
   * the principal isn't a direct member.
   */
  DirectGroupMember getDirectGroupMember(GetDirectGroupMemberRequest getDirectGroupMemberRequest);

  /**
   * Gets a group by its ID in your identity provider (IdP) and syncs its name and parent groups
   * from your IdP. If the group isn't in your account yet, it's added. Requires automatic identity
   * management. If your account has group visibility filters, the group must match them.
   */
  ExternalGroup getExternalGroup(GetExternalGroupRequest getExternalGroupRequest);

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in your account yet, it's
   * added. Requires automatic identity management with Microsoft Entra ID as your IdP.
   */
  ExternalServicePrincipal getExternalServicePrincipal(
      GetExternalServicePrincipalRequest getExternalServicePrincipalRequest);

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in your account yet, they're added. Requires
   * automatic identity management.
   */
  ExternalUser getExternalUser(GetExternalUserRequest getExternalUserRequest);

  /** Gets a group by its Databricks ID. */
  Group getGroup(GetGroupRequest getGroupRequest);

  /** Gets a group visibility filter. It returns the rule, not the groups it matches. */
  IdentityVisibilityFilter getIdentityVisibilityFilter(
      GetIdentityVisibilityFilterRequest getIdentityVisibilityFilterRequest);

  /** Gets a service principal by its Databricks ID. */
  ServicePrincipal getServicePrincipal(GetServicePrincipalRequest getServicePrincipalRequest);

  /** Gets a user by their Databricks ID. */
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

  /**
   * Gets a principal's direct assignment to a workspace, including its effective entitlements.
   * Returns an error if the principal isn't assigned directly.
   */
  WorkspaceAssignment getWorkspaceAssignment(
      GetWorkspaceAssignmentRequest getWorkspaceAssignmentRequest);

  /** Returns the assignment details for a principal in a workspace. */
  WorkspaceAssignmentDetail getWorkspaceAssignmentDetail(
      GetWorkspaceAssignmentDetailRequest getWorkspaceAssignmentDetailRequest);

  /**
   * Lists the direct members of a group, sorted by display name, with where each membership comes
   * from. Members in your identity provider who haven't been added to Databricks aren't included.
   */
  ListDirectGroupMembersResponse listDirectGroupMembers(
      ListDirectGroupMembersRequest listDirectGroupMembersRequest);

  /**
   * Lists the groups in your account, sorted by Databricks ID. Groups in your identity provider
   * that haven't been added to Databricks aren't included.
   */
  ListGroupsResponse listGroups(ListGroupsRequest listGroupsRequest);

  /**
   * Lists the group visibility filters in an account. It returns the rules, not the groups they
   * match.
   */
  ListIdentityVisibilityFiltersResponse listIdentityVisibilityFilters(
      ListIdentityVisibilityFiltersRequest listIdentityVisibilityFiltersRequest);

  /**
   * Lists the service principals in your account, sorted by Databricks ID. Service principals in
   * your identity provider that haven't been added to Databricks aren't included.
   */
  ListServicePrincipalsResponse listServicePrincipals(
      ListServicePrincipalsRequest listServicePrincipalsRequest);

  /**
   * Lists every group that a user, service principal, or group belongs to, directly or through
   * other groups, sorted by Databricks ID. If automatic identity management is on, the principal's
   * group memberships are synced from your identity provider first.
   */
  ListTransitiveParentGroupsResponse listTransitiveParentGroups(
      ListTransitiveParentGroupsRequest listTransitiveParentGroupsRequest);

  /**
   * Lists the users in your account, sorted by Databricks ID. Users in your identity provider who
   * haven't been added to Databricks aren't included.
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
   * Lists the principals assigned directly to a workspace. The response leaves `entitlements` and
   * `effective_entitlements` empty. To read a principal's entitlements, get its assignment.
   */
  ListWorkspaceAssignmentsResponse listWorkspaceAssignments(
      ListWorkspaceAssignmentsRequest listWorkspaceAssignmentsRequest);

  /**
   * Gets a group by its ID in your identity provider (IdP) and syncs its name and parent groups
   * from your IdP. If the group isn't in your account yet, it's added. Requires automatic identity
   * management. If your account has group visibility filters, the group must match them.
   */
  ResolveGroupResponse resolveGroup(ResolveGroupRequest resolveGroupRequest);

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in your account yet, it's
   * added. Requires automatic identity management with Microsoft Entra ID as your IdP.
   */
  ResolveServicePrincipalResponse resolveServicePrincipal(
      ResolveServicePrincipalRequest resolveServicePrincipalRequest);

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in your account yet, they're added. Requires
   * automatic identity management.
   */
  ResolveUserResponse resolveUser(ResolveUserRequest resolveUserRequest);

  /**
   * Updates a group. Only the fields in `update_mask` change.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, you can only
   * update `external_id`. The group's other fields come from your identity provider. If your
   * account also has group visibility filters, a new `external_id` must match them. You can always
   * clear `external_id`.
   */
  Group updateGroup(UpdateGroupRequest updateGroupRequest);

  /**
   * Updates a service principal. Only the fields in `update_mask` change.
   *
   * <p>If automatic identity management is on and the service principal has an `external_id`, you
   * can only update `external_id`. Its other fields come from your identity provider. A service
   * principal can't deactivate itself, and you can't update service principals that Databricks
   * manages.
   */
  ServicePrincipal updateServicePrincipal(
      UpdateServicePrincipalRequest updateServicePrincipalRequest);

  /**
   * Updates a user. Only the fields in `update_mask` change.
   *
   * <p>If automatic identity management is on and the user has an `external_id`, you can only
   * update `external_id`. The user's other fields come from your identity provider. You can't
   * deactivate yourself or change the status of the account owner.
   */
  User updateUser(UpdateUserRequest updateUserRequest);

  /**
   * Replaces the entitlements of a principal's direct assignment to a workspace. The new list can't
   * be empty.
   *
   * <p>Entitlements are changed one at a time. If the request fails partway through, only some of
   * the changes take effect. Get the assignment afterwards to check the result.
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
