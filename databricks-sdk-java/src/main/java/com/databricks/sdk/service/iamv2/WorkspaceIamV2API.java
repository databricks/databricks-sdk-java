// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * These APIs are used to manage identities and the workspace access of these identities in
 * Databricks.
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
   * Adds a user, service principal, or group as a direct member of a group in the account that
   * contains this workspace.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  public DirectGroupMember createDirectGroupMemberProxy(
      CreateDirectGroupMemberProxyRequest request) {
    return impl.createDirectGroupMemberProxy(request);
  }

  /**
   * Creates a local group in the account that contains this workspace. A local group is a group
   * that isn't synced from your identity provider (IdP). You become a manager of the new group.
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a group from
   * your IdP, get it as an external group instead.
   */
  public Group createGroupProxy(CreateGroupProxyRequest request) {
    return impl.createGroupProxy(request);
  }

  /**
   * Creates a local service principal in the account that contains this workspace. A local service
   * principal is one that isn't synced from your identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a service
   * principal from your IdP, get it as an external service principal instead.
   */
  public ServicePrincipal createServicePrincipalProxy(CreateServicePrincipalProxyRequest request) {
    return impl.createServicePrincipalProxy(request);
  }

  /**
   * Creates a local user in the account that contains this workspace. A local user is a user that
   * isn't synced from your identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a user from your
   * IdP, get them as an external user instead.
   */
  public User createUserProxy(CreateUserProxyRequest request) {
    return impl.createUserProxy(request);
  }

  /** Creates a workspace assignment detail for a principal in the calling workspace. */
  public WorkspaceAssignmentDetail createWorkspaceAssignmentDetailProxy(
      CreateWorkspaceAssignmentDetailProxyRequest request) {
    return impl.createWorkspaceAssignmentDetailProxy(request);
  }

  /**
   * Assigns a user, service principal, or group directly to this workspace with the given
   * entitlements. Returns an error if the principal is already assigned directly.
   *
   * <p>Entitlements are granted one at a time. If the request fails partway through, the principal
   * stays assigned with only some of the entitlements. Get the assignment afterwards to check which
   * were granted.
   */
  public WorkspaceAssignment createWorkspaceAssignmentProxy(
      CreateWorkspaceAssignmentProxyRequest request) {
    return impl.createWorkspaceAssignmentProxy(request);
  }

  public void deleteDirectGroupMemberProxy(String name) {
    deleteDirectGroupMemberProxy(new DeleteDirectGroupMemberProxyRequest().setName(name));
  }

  /**
   * Removes a direct member from a group in the account that contains this workspace.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  public void deleteDirectGroupMemberProxy(DeleteDirectGroupMemberProxyRequest request) {
    impl.deleteDirectGroupMemberProxy(request);
  }

  public void deleteGroupProxy(String name) {
    deleteGroupProxy(new DeleteGroupProxyRequest().setName(name));
  }

  /**
   * Deletes a group from the account that contains this workspace and removes it from the
   * workspaces it's assigned to.
   */
  public void deleteGroupProxy(DeleteGroupProxyRequest request) {
    impl.deleteGroupProxy(request);
  }

  public void deleteServicePrincipalProxy(String name) {
    deleteServicePrincipalProxy(new DeleteServicePrincipalProxyRequest().setName(name));
  }

  /**
   * Deletes a service principal from the account that contains this workspace and removes it from
   * the workspaces it's assigned to. You can't delete service principals that Databricks manages.
   */
  public void deleteServicePrincipalProxy(DeleteServicePrincipalProxyRequest request) {
    impl.deleteServicePrincipalProxy(request);
  }

  public void deleteUserProxy(String name) {
    deleteUserProxy(new DeleteUserProxyRequest().setName(name));
  }

  /**
   * Deletes a user from the account that contains this workspace and removes them from the
   * workspaces they're assigned to.
   */
  public void deleteUserProxy(DeleteUserProxyRequest request) {
    impl.deleteUserProxy(request);
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

  public void deleteWorkspaceAssignmentProxy(String name) {
    deleteWorkspaceAssignmentProxy(new DeleteWorkspaceAssignmentProxyRequest().setName(name));
  }

  /**
   * Removes a principal's direct assignment to this workspace and revokes the entitlements it
   * granted. The principal keeps any access it gets through groups.
   *
   * <p>Entitlements are revoked one at a time. If the request fails partway through, the principal
   * stays assigned with some of its entitlements. You can retry the request.
   */
  public void deleteWorkspaceAssignmentProxy(DeleteWorkspaceAssignmentProxyRequest request) {
    impl.deleteWorkspaceAssignmentProxy(request);
  }

  public DirectGroupMember getDirectGroupMemberProxy(String name) {
    return getDirectGroupMemberProxy(new GetDirectGroupMemberProxyRequest().setName(name));
  }

  /**
   * Gets a direct member of a group in the account that contains this workspace, including where
   * the membership comes from. Returns an error if the principal isn't a direct member.
   */
  public DirectGroupMember getDirectGroupMemberProxy(GetDirectGroupMemberProxyRequest request) {
    return impl.getDirectGroupMemberProxy(request);
  }

  public ExternalGroup getExternalGroupProxy(String name) {
    return getExternalGroupProxy(new GetExternalGroupProxyRequest().setName(name));
  }

  /**
   * Gets a group by its ID in your identity provider (IdP) and syncs its name and parent groups
   * from your IdP. If the group isn't in the account that contains this workspace yet, it's added.
   * Requires automatic identity management. If your account has group visibility filters, the group
   * must match them.
   */
  public ExternalGroup getExternalGroupProxy(GetExternalGroupProxyRequest request) {
    return impl.getExternalGroupProxy(request);
  }

  public ExternalServicePrincipal getExternalServicePrincipalProxy(String name) {
    return getExternalServicePrincipalProxy(
        new GetExternalServicePrincipalProxyRequest().setName(name));
  }

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in the account that contains
   * this workspace yet, it's added. Requires automatic identity management with Microsoft Entra ID
   * as your IdP.
   */
  public ExternalServicePrincipal getExternalServicePrincipalProxy(
      GetExternalServicePrincipalProxyRequest request) {
    return impl.getExternalServicePrincipalProxy(request);
  }

  public ExternalUser getExternalUserProxy(String name) {
    return getExternalUserProxy(new GetExternalUserProxyRequest().setName(name));
  }

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in the account that contains this workspace yet,
   * they're added. Requires automatic identity management.
   */
  public ExternalUser getExternalUserProxy(GetExternalUserProxyRequest request) {
    return impl.getExternalUserProxy(request);
  }

  public Group getGroupProxy(String name) {
    return getGroupProxy(new GetGroupProxyRequest().setName(name));
  }

  /** Gets a group in the account that contains this workspace by its Databricks ID. */
  public Group getGroupProxy(GetGroupProxyRequest request) {
    return impl.getGroupProxy(request);
  }

  public ServicePrincipal getServicePrincipalProxy(String name) {
    return getServicePrincipalProxy(new GetServicePrincipalProxyRequest().setName(name));
  }

  /** Gets a service principal in the account that contains this workspace by its Databricks ID. */
  public ServicePrincipal getServicePrincipalProxy(GetServicePrincipalProxyRequest request) {
    return impl.getServicePrincipalProxy(request);
  }

  public User getUserProxy(String name) {
    return getUserProxy(new GetUserProxyRequest().setName(name));
  }

  /** Gets a user in the account that contains this workspace by their Databricks ID. */
  public User getUserProxy(GetUserProxyRequest request) {
    return impl.getUserProxy(request);
  }

  public WorkspaceAccessDetail getWorkspaceAccessDetailLocal(String name) {
    return getWorkspaceAccessDetailLocal(new GetWorkspaceAccessDetailLocalRequest().setName(name));
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

  public WorkspaceAssignment getWorkspaceAssignmentProxy(String name) {
    return getWorkspaceAssignmentProxy(new GetWorkspaceAssignmentProxyRequest().setName(name));
  }

  /**
   * Gets a principal's direct assignment to this workspace, including its effective entitlements.
   * Returns an error if the principal isn't assigned directly.
   */
  public WorkspaceAssignment getWorkspaceAssignmentProxy(
      GetWorkspaceAssignmentProxyRequest request) {
    return impl.getWorkspaceAssignmentProxy(request);
  }

  public WorkspaceIdentityDetail getWorkspaceIdentityDetail(String name) {
    return getWorkspaceIdentityDetail(new GetWorkspaceIdentityDetailRequest().setName(name));
  }

  /**
   * Gets a principal's status in this workspace and whether it has access directly or through a
   * group. Returns an error if the principal doesn't have access to the workspace.
   */
  public WorkspaceIdentityDetail getWorkspaceIdentityDetail(
      GetWorkspaceIdentityDetailRequest request) {
    return impl.getWorkspaceIdentityDetail(request);
  }

  public Iterable<DirectGroupMember> listDirectGroupMembersProxy(String parent) {
    return listDirectGroupMembersProxy(new ListDirectGroupMembersProxyRequest().setParent(parent));
  }

  /**
   * Lists the direct members of a group in the account that contains this workspace, sorted by
   * display name, with where each membership comes from. Members in your identity provider who
   * haven't been added to Databricks aren't included.
   */
  public Iterable<DirectGroupMember> listDirectGroupMembersProxy(
      ListDirectGroupMembersProxyRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listDirectGroupMembersProxy,
        ListDirectGroupMembersResponse::getDirectGroupMembers,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Lists the groups in the account that contains this workspace, sorted by Databricks ID. Groups
   * in your identity provider that haven't been added to Databricks aren't included.
   */
  public Iterable<Group> listGroupsProxy(ListGroupsProxyRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listGroupsProxy,
        ListGroupsResponse::getGroups,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Lists the service principals in the account that contains this workspace, sorted by Databricks
   * ID. Service principals in your identity provider that haven't been added to Databricks aren't
   * included.
   */
  public Iterable<ServicePrincipal> listServicePrincipalsProxy(
      ListServicePrincipalsProxyRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listServicePrincipalsProxy,
        ListServicePrincipalsResponse::getServicePrincipals,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ListTransitiveParentGroupsResponse listTransitiveParentGroupsProxy(String parent) {
    return listTransitiveParentGroupsProxy(
        new ListTransitiveParentGroupsProxyRequest().setParent(parent));
  }

  /**
   * Lists every group that a user, service principal, or group belongs to, directly or through
   * other groups, in the account that contains this workspace. Results are sorted by Databricks ID.
   * If automatic identity management is on, the principal's group memberships are synced from your
   * identity provider first.
   */
  public ListTransitiveParentGroupsResponse listTransitiveParentGroupsProxy(
      ListTransitiveParentGroupsProxyRequest request) {
    return impl.listTransitiveParentGroupsProxy(request);
  }

  /**
   * Lists the users in the account that contains this workspace, sorted by Databricks ID. Users in
   * your identity provider who haven't been added to Databricks aren't included.
   */
  public Iterable<User> listUsersProxy(ListUsersProxyRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listUsersProxy,
        ListUsersResponse::getUsers,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Lists workspace assignment details for the calling workspace. The response omits the
   * per-principal entitlement fields (`entitlements` and `effective_entitlements`). To read the
   * entitlements for a single principal, get that principal's assignment detail.
   */
  public Iterable<WorkspaceAssignmentDetail> listWorkspaceAssignmentDetailsProxy(
      ListWorkspaceAssignmentDetailsProxyRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listWorkspaceAssignmentDetailsProxy,
        ListWorkspaceAssignmentDetailsResponse::getWorkspaceAssignmentDetails,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Lists the principals assigned directly to this workspace. The response leaves `entitlements`
   * and `effective_entitlements` empty. To read a principal's entitlements, get its assignment.
   */
  public Iterable<WorkspaceAssignment> listWorkspaceAssignmentsProxy(
      ListWorkspaceAssignmentsProxyRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listWorkspaceAssignmentsProxy,
        ListWorkspaceAssignmentsResponse::getWorkspaceAssignments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Gets a group by its ID in your identity provider (IdP) and syncs its name and parent groups
   * from your IdP. If the group isn't in the account that contains this workspace yet, it's added.
   * Requires automatic identity management. If your account has group visibility filters, the group
   * must match them.
   */
  public ResolveGroupResponse resolveGroupProxy(ResolveGroupProxyRequest request) {
    return impl.resolveGroupProxy(request);
  }

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in the account that contains
   * this workspace yet, it's added. Requires automatic identity management with Microsoft Entra ID
   * as your IdP.
   */
  public ResolveServicePrincipalResponse resolveServicePrincipalProxy(
      ResolveServicePrincipalProxyRequest request) {
    return impl.resolveServicePrincipalProxy(request);
  }

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in the account that contains this workspace yet,
   * they're added. Requires automatic identity management.
   */
  public ResolveUserResponse resolveUserProxy(ResolveUserProxyRequest request) {
    return impl.resolveUserProxy(request);
  }

  /**
   * Updates a group in the account that contains this workspace. Only the fields in `update_mask`
   * change.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, you can only
   * update `external_id`. The group's other fields come from your identity provider. If your
   * account also has group visibility filters, a new `external_id` must match them. You can always
   * clear `external_id`.
   */
  public Group updateGroupProxy(UpdateGroupProxyRequest request) {
    return impl.updateGroupProxy(request);
  }

  /**
   * Updates a service principal in the account that contains this workspace. Only the fields in
   * `update_mask` change.
   *
   * <p>If automatic identity management is on and the service principal has an `external_id`, you
   * can only update `external_id`. Its other fields come from your identity provider. A service
   * principal can't deactivate itself, and you can't update service principals that Databricks
   * manages.
   */
  public ServicePrincipal updateServicePrincipalProxy(UpdateServicePrincipalProxyRequest request) {
    return impl.updateServicePrincipalProxy(request);
  }

  /**
   * Updates a user in the account that contains this workspace. Only the fields in `update_mask`
   * change.
   *
   * <p>If automatic identity management is on and the user has an `external_id`, you can only
   * update `external_id`. The user's other fields come from your identity provider. You can't
   * deactivate yourself or change the status of the account owner.
   */
  public User updateUserProxy(UpdateUserProxyRequest request) {
    return impl.updateUserProxy(request);
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

  /**
   * Replaces the entitlements of a principal's direct assignment to this workspace. The new list
   * can't be empty.
   *
   * <p>Entitlements are changed one at a time. If the request fails partway through, only some of
   * the changes take effect. Get the assignment afterwards to check the result.
   */
  public WorkspaceAssignment updateWorkspaceAssignmentProxy(
      UpdateWorkspaceAssignmentProxyRequest request) {
    return impl.updateWorkspaceAssignmentProxy(request);
  }

  /**
   * Activates or deactivates a user or service principal in this workspace. You can only update
   * `workspace_identity_status`. You can't change your own status or the status of a group.
   */
  public WorkspaceIdentityDetail updateWorkspaceIdentityDetail(
      UpdateWorkspaceIdentityDetailRequest request) {
    return impl.updateWorkspaceIdentityDetail(request);
  }

  public WorkspaceIamV2Service impl() {
    return impl;
  }
}
