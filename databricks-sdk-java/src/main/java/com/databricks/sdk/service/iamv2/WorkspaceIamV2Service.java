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
public interface WorkspaceIamV2Service {
  /**
   * Adds a user, service principal, or group as a direct member of a group in the account that
   * contains this workspace.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  DirectGroupMember createDirectGroupMemberProxy(
      CreateDirectGroupMemberProxyRequest createDirectGroupMemberProxyRequest);

  /**
   * Creates a local group in the account that contains this workspace. A local group is a group
   * that isn't synced from your identity provider (IdP). You become a manager of the new group.
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a group from
   * your IdP, get it as an external group instead.
   */
  Group createGroupProxy(CreateGroupProxyRequest createGroupProxyRequest);

  /**
   * Creates a local service principal in the account that contains this workspace. A local service
   * principal is one that isn't synced from your identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a service
   * principal from your IdP, get it as an external service principal instead.
   */
  ServicePrincipal createServicePrincipalProxy(
      CreateServicePrincipalProxyRequest createServicePrincipalProxyRequest);

  /**
   * Creates a local user in the account that contains this workspace. A local user is a user that
   * isn't synced from your identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a user from your
   * IdP, get them as an external user instead.
   */
  User createUserProxy(CreateUserProxyRequest createUserProxyRequest);

  /** Creates a workspace assignment detail for a principal in the calling workspace. */
  WorkspaceAssignmentDetail createWorkspaceAssignmentDetailProxy(
      CreateWorkspaceAssignmentDetailProxyRequest createWorkspaceAssignmentDetailProxyRequest);

  /**
   * Assigns a user, service principal, or group directly to this workspace with the given
   * entitlements. Returns an error if the principal is already assigned directly.
   *
   * <p>Entitlements are granted one at a time. If the request fails partway through, the principal
   * stays assigned with only some of the entitlements. Get the assignment afterwards to check which
   * were granted.
   */
  WorkspaceAssignment createWorkspaceAssignmentProxy(
      CreateWorkspaceAssignmentProxyRequest createWorkspaceAssignmentProxyRequest);

  /**
   * Removes a direct member from a group in the account that contains this workspace.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  void deleteDirectGroupMemberProxy(
      DeleteDirectGroupMemberProxyRequest deleteDirectGroupMemberProxyRequest);

  /**
   * Deletes a group from the account that contains this workspace and removes it from the
   * workspaces it's assigned to.
   */
  void deleteGroupProxy(DeleteGroupProxyRequest deleteGroupProxyRequest);

  /**
   * Deletes a service principal from the account that contains this workspace and removes it from
   * the workspaces it's assigned to. You can't delete service principals that Databricks manages.
   */
  void deleteServicePrincipalProxy(
      DeleteServicePrincipalProxyRequest deleteServicePrincipalProxyRequest);

  /**
   * Deletes a user from the account that contains this workspace and removes them from the
   * workspaces they're assigned to.
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
   * Removes a principal's direct assignment to this workspace and revokes the entitlements it
   * granted. The principal keeps any access it gets through groups.
   *
   * <p>Entitlements are revoked one at a time. If the request fails partway through, the principal
   * stays assigned with some of its entitlements. You can retry the request.
   */
  void deleteWorkspaceAssignmentProxy(
      DeleteWorkspaceAssignmentProxyRequest deleteWorkspaceAssignmentProxyRequest);

  /**
   * Gets a direct member of a group in the account that contains this workspace, including where
   * the membership comes from. Returns an error if the principal isn't a direct member.
   */
  DirectGroupMember getDirectGroupMemberProxy(
      GetDirectGroupMemberProxyRequest getDirectGroupMemberProxyRequest);

  /**
   * Gets a group by its ID in your identity provider (IdP) and syncs its name and parent groups
   * from your IdP. If the group isn't in the account that contains this workspace yet, it's added.
   * Requires automatic identity management. If your account has group visibility filters, the group
   * must match them.
   */
  ExternalGroup getExternalGroupProxy(GetExternalGroupProxyRequest getExternalGroupProxyRequest);

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in the account that contains
   * this workspace yet, it's added. Requires automatic identity management with Microsoft Entra ID
   * as your IdP.
   */
  ExternalServicePrincipal getExternalServicePrincipalProxy(
      GetExternalServicePrincipalProxyRequest getExternalServicePrincipalProxyRequest);

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in the account that contains this workspace yet,
   * they're added. Requires automatic identity management.
   */
  ExternalUser getExternalUserProxy(GetExternalUserProxyRequest getExternalUserProxyRequest);

  /** Gets a group in the account that contains this workspace by its Databricks ID. */
  Group getGroupProxy(GetGroupProxyRequest getGroupProxyRequest);

  /** Gets a service principal in the account that contains this workspace by its Databricks ID. */
  ServicePrincipal getServicePrincipalProxy(
      GetServicePrincipalProxyRequest getServicePrincipalProxyRequest);

  /** Gets a user in the account that contains this workspace by their Databricks ID. */
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

  /**
   * Gets a principal's direct assignment to this workspace, including its effective entitlements.
   * Returns an error if the principal isn't assigned directly.
   */
  WorkspaceAssignment getWorkspaceAssignmentProxy(
      GetWorkspaceAssignmentProxyRequest getWorkspaceAssignmentProxyRequest);

  /**
   * Gets a principal's status in this workspace and whether it has access directly or through a
   * group. Returns an error if the principal doesn't have access to the workspace.
   */
  WorkspaceIdentityDetail getWorkspaceIdentityDetail(
      GetWorkspaceIdentityDetailRequest getWorkspaceIdentityDetailRequest);

  /**
   * Lists the direct members of a group in the account that contains this workspace, sorted by
   * display name, with where each membership comes from. Members in your identity provider who
   * haven't been added to Databricks aren't included.
   */
  ListDirectGroupMembersResponse listDirectGroupMembersProxy(
      ListDirectGroupMembersProxyRequest listDirectGroupMembersProxyRequest);

  /**
   * Lists the groups in the account that contains this workspace, sorted by Databricks ID. Groups
   * in your identity provider that haven't been added to Databricks aren't included.
   */
  ListGroupsResponse listGroupsProxy(ListGroupsProxyRequest listGroupsProxyRequest);

  /**
   * Lists the service principals in the account that contains this workspace, sorted by Databricks
   * ID. Service principals in your identity provider that haven't been added to Databricks aren't
   * included.
   */
  ListServicePrincipalsResponse listServicePrincipalsProxy(
      ListServicePrincipalsProxyRequest listServicePrincipalsProxyRequest);

  /**
   * Lists every group that a user, service principal, or group belongs to, directly or through
   * other groups, in the account that contains this workspace. Results are sorted by Databricks ID.
   * If automatic identity management is on, the principal's group memberships are synced from your
   * identity provider first.
   */
  ListTransitiveParentGroupsResponse listTransitiveParentGroupsProxy(
      ListTransitiveParentGroupsProxyRequest listTransitiveParentGroupsProxyRequest);

  /**
   * Lists the users in the account that contains this workspace, sorted by Databricks ID. Users in
   * your identity provider who haven't been added to Databricks aren't included.
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
   * Lists the principals assigned directly to this workspace. The response leaves `entitlements`
   * and `effective_entitlements` empty. To read a principal's entitlements, get its assignment.
   */
  ListWorkspaceAssignmentsResponse listWorkspaceAssignmentsProxy(
      ListWorkspaceAssignmentsProxyRequest listWorkspaceAssignmentsProxyRequest);

  /**
   * Gets a group by its ID in your identity provider (IdP) and syncs its name and parent groups
   * from your IdP. If the group isn't in the account that contains this workspace yet, it's added.
   * Requires automatic identity management. If your account has group visibility filters, the group
   * must match them.
   */
  ResolveGroupResponse resolveGroupProxy(ResolveGroupProxyRequest resolveGroupProxyRequest);

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in the account that contains
   * this workspace yet, it's added. Requires automatic identity management with Microsoft Entra ID
   * as your IdP.
   */
  ResolveServicePrincipalResponse resolveServicePrincipalProxy(
      ResolveServicePrincipalProxyRequest resolveServicePrincipalProxyRequest);

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in the account that contains this workspace yet,
   * they're added. Requires automatic identity management.
   */
  ResolveUserResponse resolveUserProxy(ResolveUserProxyRequest resolveUserProxyRequest);

  /**
   * Updates a group in the account that contains this workspace. Only the fields in `update_mask`
   * change.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, you can only
   * update `external_id`. The group's other fields come from your identity provider. If your
   * account also has group visibility filters, a new `external_id` must match them. You can always
   * clear `external_id`.
   */
  Group updateGroupProxy(UpdateGroupProxyRequest updateGroupProxyRequest);

  /**
   * Updates a service principal in the account that contains this workspace. Only the fields in
   * `update_mask` change.
   *
   * <p>If automatic identity management is on and the service principal has an `external_id`, you
   * can only update `external_id`. Its other fields come from your identity provider. A service
   * principal can't deactivate itself, and you can't update service principals that Databricks
   * manages.
   */
  ServicePrincipal updateServicePrincipalProxy(
      UpdateServicePrincipalProxyRequest updateServicePrincipalProxyRequest);

  /**
   * Updates a user in the account that contains this workspace. Only the fields in `update_mask`
   * change.
   *
   * <p>If automatic identity management is on and the user has an `external_id`, you can only
   * update `external_id`. The user's other fields come from your identity provider. You can't
   * deactivate yourself or change the status of the account owner.
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
   * Replaces the entitlements of a principal's direct assignment to this workspace. The new list
   * can't be empty.
   *
   * <p>Entitlements are changed one at a time. If the request fails partway through, only some of
   * the changes take effect. Get the assignment afterwards to check the result.
   */
  WorkspaceAssignment updateWorkspaceAssignmentProxy(
      UpdateWorkspaceAssignmentProxyRequest updateWorkspaceAssignmentProxyRequest);

  /**
   * Activates or deactivates a user or service principal in this workspace. You can only update
   * `workspace_identity_status`. You can't change your own status or the status of a group.
   */
  WorkspaceIdentityDetail updateWorkspaceIdentityDetail(
      UpdateWorkspaceIdentityDetailRequest updateWorkspaceIdentityDetailRequest);
}
