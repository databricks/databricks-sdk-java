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
   * Adds a user, service principal, or group as a direct member of a group.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  public DirectGroupMember createDirectGroupMember(CreateDirectGroupMemberRequest request) {
    return impl.createDirectGroupMember(request);
  }

  /**
   * Creates a local group, which is a group that isn't synced from your identity provider (IdP).
   * You become a manager of the new group.
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a group from
   * your IdP, get it as an external group instead.
   */
  public Group createGroup(CreateGroupRequest request) {
    return impl.createGroup(request);
  }

  /**
   * Creates a group visibility filter. It applies to every workspace in the account.
   *
   * <p>Returns `ALREADY_EXISTS` if a filter with the same ID, or the same type and match value,
   * already exists. Returns `RESOURCE_EXHAUSTED` if the account already has the maximum number of
   * filters of that type. You can't change a filter: to change a rule, delete it and create a new
   * one.
   */
  public IdentityVisibilityFilter createIdentityVisibilityFilter(
      CreateIdentityVisibilityFilterRequest request) {
    return impl.createIdentityVisibilityFilter(request);
  }

  /**
   * Creates a local service principal, which is a service principal that isn't synced from your
   * identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a service
   * principal from your IdP, get it as an external service principal instead.
   */
  public ServicePrincipal createServicePrincipal(CreateServicePrincipalRequest request) {
    return impl.createServicePrincipal(request);
  }

  /**
   * Creates a local user, which is a user that isn't synced from your identity provider (IdP).
   *
   * <p>If automatic identity management is on, you can't set `external_id`. To add a user from your
   * IdP, get them as an external user instead.
   */
  public User createUser(CreateUserRequest request) {
    return impl.createUser(request);
  }

  /**
   * Assigns a user, service principal, or group directly to a workspace with the given
   * entitlements. Returns an error if the principal is already assigned directly.
   *
   * <p>Entitlements are granted one at a time. If the request fails partway through, the principal
   * stays assigned with only some of the entitlements. Get the assignment afterwards to check which
   * were granted.
   */
  public WorkspaceAssignment createWorkspaceAssignment(CreateWorkspaceAssignmentRequest request) {
    return impl.createWorkspaceAssignment(request);
  }

  /** Creates a workspace assignment detail for a principal. */
  public WorkspaceAssignmentDetail createWorkspaceAssignmentDetail(
      CreateWorkspaceAssignmentDetailRequest request) {
    return impl.createWorkspaceAssignmentDetail(request);
  }

  public void deleteDirectGroupMember(String name) {
    deleteDirectGroupMember(new DeleteDirectGroupMemberRequest().setName(name));
  }

  /**
   * Removes a direct member from a group.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, its members come
   * from your identity provider and can't be changed in Databricks.
   */
  public void deleteDirectGroupMember(DeleteDirectGroupMemberRequest request) {
    impl.deleteDirectGroupMember(request);
  }

  public void deleteGroup(String name) {
    deleteGroup(new DeleteGroupRequest().setName(name));
  }

  /** Deletes a group from your account and removes it from the workspaces it's assigned to. */
  public void deleteGroup(DeleteGroupRequest request) {
    impl.deleteGroup(request);
  }

  public void deleteIdentityVisibilityFilter(String name) {
    deleteIdentityVisibilityFilter(new DeleteIdentityVisibilityFilterRequest().setName(name));
  }

  /**
   * Deletes a group visibility filter. Deleting a filter doesn't delete groups or remove access.
   * Groups that only this filter matched stop being visible, unless they or a parent group are
   * already in your account. If no group filters remain, all groups become visible again. Deleting
   * a filter that doesn't exist succeeds.
   */
  public void deleteIdentityVisibilityFilter(DeleteIdentityVisibilityFilterRequest request) {
    impl.deleteIdentityVisibilityFilter(request);
  }

  public void deleteServicePrincipal(String name) {
    deleteServicePrincipal(new DeleteServicePrincipalRequest().setName(name));
  }

  /**
   * Deletes a service principal from your account and removes it from the workspaces it's assigned
   * to. You can't delete service principals that Databricks manages.
   */
  public void deleteServicePrincipal(DeleteServicePrincipalRequest request) {
    impl.deleteServicePrincipal(request);
  }

  public void deleteUser(String name) {
    deleteUser(new DeleteUserRequest().setName(name));
  }

  /** Deletes a user from your account and removes them from the workspaces they're assigned to. */
  public void deleteUser(DeleteUserRequest request) {
    impl.deleteUser(request);
  }

  public void deleteWorkspaceAssignment(String name) {
    deleteWorkspaceAssignment(new DeleteWorkspaceAssignmentRequest().setName(name));
  }

  /**
   * Removes a principal's direct assignment to a workspace and revokes the entitlements it granted.
   * The principal keeps any access it gets through groups.
   *
   * <p>Entitlements are revoked one at a time. If the request fails partway through, the principal
   * stays assigned with some of its entitlements. You can retry the request.
   */
  public void deleteWorkspaceAssignment(DeleteWorkspaceAssignmentRequest request) {
    impl.deleteWorkspaceAssignment(request);
  }

  public void deleteWorkspaceAssignmentDetail(long workspaceId, long principalId) {
    deleteWorkspaceAssignmentDetail(
        new DeleteWorkspaceAssignmentDetailRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /**
   * Deletes a workspace assignment detail for a principal, revoking all of its entitlements.
   * Entitlements are revoked one at a time rather than atomically. If the request fails partway
   * through, the principal stays assigned with some of its original entitlements. Retrying is safe.
   */
  public void deleteWorkspaceAssignmentDetail(DeleteWorkspaceAssignmentDetailRequest request) {
    impl.deleteWorkspaceAssignmentDetail(request);
  }

  public DirectGroupMember getDirectGroupMember(String name) {
    return getDirectGroupMember(new GetDirectGroupMemberRequest().setName(name));
  }

  /**
   * Gets a direct member of a group, including where the membership comes from. Returns an error if
   * the principal isn't a direct member.
   */
  public DirectGroupMember getDirectGroupMember(GetDirectGroupMemberRequest request) {
    return impl.getDirectGroupMember(request);
  }

  public ExternalGroup getExternalGroup(String name) {
    return getExternalGroup(new GetExternalGroupRequest().setName(name));
  }

  /**
   * Gets a group by its ID in your identity provider (IdP) and syncs its name and parent groups
   * from your IdP. If the group isn't in your account yet, it's added. Requires automatic identity
   * management. If your account has group visibility filters, the group must match them.
   */
  public ExternalGroup getExternalGroup(GetExternalGroupRequest request) {
    return impl.getExternalGroup(request);
  }

  public ExternalServicePrincipal getExternalServicePrincipal(String name) {
    return getExternalServicePrincipal(new GetExternalServicePrincipalRequest().setName(name));
  }

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in your account yet, it's
   * added. Requires automatic identity management with Microsoft Entra ID as your IdP.
   */
  public ExternalServicePrincipal getExternalServicePrincipal(
      GetExternalServicePrincipalRequest request) {
    return impl.getExternalServicePrincipal(request);
  }

  public ExternalUser getExternalUser(String name) {
    return getExternalUser(new GetExternalUserRequest().setName(name));
  }

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in your account yet, they're added. Requires
   * automatic identity management.
   */
  public ExternalUser getExternalUser(GetExternalUserRequest request) {
    return impl.getExternalUser(request);
  }

  public Group getGroup(String name) {
    return getGroup(new GetGroupRequest().setName(name));
  }

  /** Gets a group by its Databricks ID. */
  public Group getGroup(GetGroupRequest request) {
    return impl.getGroup(request);
  }

  public IdentityVisibilityFilter getIdentityVisibilityFilter(String name) {
    return getIdentityVisibilityFilter(new GetIdentityVisibilityFilterRequest().setName(name));
  }

  /** Gets a group visibility filter. It returns the rule, not the groups it matches. */
  public IdentityVisibilityFilter getIdentityVisibilityFilter(
      GetIdentityVisibilityFilterRequest request) {
    return impl.getIdentityVisibilityFilter(request);
  }

  public ServicePrincipal getServicePrincipal(String name) {
    return getServicePrincipal(new GetServicePrincipalRequest().setName(name));
  }

  /** Gets a service principal by its Databricks ID. */
  public ServicePrincipal getServicePrincipal(GetServicePrincipalRequest request) {
    return impl.getServicePrincipal(request);
  }

  public User getUser(String name) {
    return getUser(new GetUserRequest().setName(name));
  }

  /** Gets a user by their Databricks ID. */
  public User getUser(GetUserRequest request) {
    return impl.getUser(request);
  }

  public WorkspaceAccessDetail getWorkspaceAccessDetail(String name) {
    return getWorkspaceAccessDetail(new GetWorkspaceAccessDetailRequest().setName(name));
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

  public WorkspaceAssignment getWorkspaceAssignment(String name) {
    return getWorkspaceAssignment(new GetWorkspaceAssignmentRequest().setName(name));
  }

  /**
   * Gets a principal's direct assignment to a workspace, including its effective entitlements.
   * Returns an error if the principal isn't assigned directly.
   */
  public WorkspaceAssignment getWorkspaceAssignment(GetWorkspaceAssignmentRequest request) {
    return impl.getWorkspaceAssignment(request);
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

  public Iterable<DirectGroupMember> listDirectGroupMembers(String parent) {
    return listDirectGroupMembers(new ListDirectGroupMembersRequest().setParent(parent));
  }

  /**
   * Lists the direct members of a group, sorted by display name, with where each membership comes
   * from. Members in your identity provider who haven't been added to Databricks aren't included.
   */
  public Iterable<DirectGroupMember> listDirectGroupMembers(ListDirectGroupMembersRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listDirectGroupMembers,
        ListDirectGroupMembersResponse::getDirectGroupMembers,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Group> listGroups(String parent) {
    return listGroups(new ListGroupsRequest().setParent(parent));
  }

  /**
   * Lists the groups in your account, sorted by Databricks ID. Groups in your identity provider
   * that haven't been added to Databricks aren't included.
   */
  public Iterable<Group> listGroups(ListGroupsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listGroups,
        ListGroupsResponse::getGroups,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<IdentityVisibilityFilter> listIdentityVisibilityFilters(String parent) {
    return listIdentityVisibilityFilters(
        new ListIdentityVisibilityFiltersRequest().setParent(parent));
  }

  /**
   * Lists the group visibility filters in an account. It returns the rules, not the groups they
   * match.
   */
  public Iterable<IdentityVisibilityFilter> listIdentityVisibilityFilters(
      ListIdentityVisibilityFiltersRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listIdentityVisibilityFilters,
        ListIdentityVisibilityFiltersResponse::getIdentityVisibilityFilters,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<ServicePrincipal> listServicePrincipals(String parent) {
    return listServicePrincipals(new ListServicePrincipalsRequest().setParent(parent));
  }

  /**
   * Lists the service principals in your account, sorted by Databricks ID. Service principals in
   * your identity provider that haven't been added to Databricks aren't included.
   */
  public Iterable<ServicePrincipal> listServicePrincipals(ListServicePrincipalsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listServicePrincipals,
        ListServicePrincipalsResponse::getServicePrincipals,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ListTransitiveParentGroupsResponse listTransitiveParentGroups(String parent) {
    return listTransitiveParentGroups(new ListTransitiveParentGroupsRequest().setParent(parent));
  }

  /**
   * Lists every group that a user, service principal, or group belongs to, directly or through
   * other groups, sorted by Databricks ID. If automatic identity management is on, the principal's
   * group memberships are synced from your identity provider first.
   */
  public ListTransitiveParentGroupsResponse listTransitiveParentGroups(
      ListTransitiveParentGroupsRequest request) {
    return impl.listTransitiveParentGroups(request);
  }

  public Iterable<User> listUsers(String parent) {
    return listUsers(new ListUsersRequest().setParent(parent));
  }

  /**
   * Lists the users in your account, sorted by Databricks ID. Users in your identity provider who
   * haven't been added to Databricks aren't included.
   */
  public Iterable<User> listUsers(ListUsersRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listUsers,
        ListUsersResponse::getUsers,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<WorkspaceAssignmentDetail> listWorkspaceAssignmentDetails(long workspaceId) {
    return listWorkspaceAssignmentDetails(
        new ListWorkspaceAssignmentDetailsRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Lists workspace assignment details for a workspace. The response omits the per-principal
   * entitlement fields (`entitlements` and `effective_entitlements`). To read the entitlements for
   * a single principal, get that principal's assignment detail.
   */
  public Iterable<WorkspaceAssignmentDetail> listWorkspaceAssignmentDetails(
      ListWorkspaceAssignmentDetailsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listWorkspaceAssignmentDetails,
        ListWorkspaceAssignmentDetailsResponse::getWorkspaceAssignmentDetails,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<WorkspaceAssignment> listWorkspaceAssignments(String parent) {
    return listWorkspaceAssignments(new ListWorkspaceAssignmentsRequest().setParent(parent));
  }

  /**
   * Lists the principals assigned directly to a workspace. The response leaves `entitlements` and
   * `effective_entitlements` empty. To read a principal's entitlements, get its assignment.
   */
  public Iterable<WorkspaceAssignment> listWorkspaceAssignments(
      ListWorkspaceAssignmentsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listWorkspaceAssignments,
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
   * from your IdP. If the group isn't in your account yet, it's added. Requires automatic identity
   * management. If your account has group visibility filters, the group must match them.
   */
  public ResolveGroupResponse resolveGroup(ResolveGroupRequest request) {
    return impl.resolveGroup(request);
  }

  /**
   * Gets a service principal by its ID in your identity provider (IdP) and syncs its details and
   * group memberships from your IdP. If the service principal isn't in your account yet, it's
   * added. Requires automatic identity management with Microsoft Entra ID as your IdP.
   */
  public ResolveServicePrincipalResponse resolveServicePrincipal(
      ResolveServicePrincipalRequest request) {
    return impl.resolveServicePrincipal(request);
  }

  /**
   * Gets a user by their ID in your identity provider (IdP) and syncs their details and group
   * memberships from your IdP. If the user isn't in your account yet, they're added. Requires
   * automatic identity management.
   */
  public ResolveUserResponse resolveUser(ResolveUserRequest request) {
    return impl.resolveUser(request);
  }

  /**
   * Updates a group. Only the fields in `update_mask` change.
   *
   * <p>If automatic identity management is on and the group has an `external_id`, you can only
   * update `external_id`. The group's other fields come from your identity provider. If your
   * account also has group visibility filters, a new `external_id` must match them. You can always
   * clear `external_id`.
   */
  public Group updateGroup(UpdateGroupRequest request) {
    return impl.updateGroup(request);
  }

  /**
   * Updates a service principal. Only the fields in `update_mask` change.
   *
   * <p>If automatic identity management is on and the service principal has an `external_id`, you
   * can only update `external_id`. Its other fields come from your identity provider. A service
   * principal can't deactivate itself, and you can't update service principals that Databricks
   * manages.
   */
  public ServicePrincipal updateServicePrincipal(UpdateServicePrincipalRequest request) {
    return impl.updateServicePrincipal(request);
  }

  /**
   * Updates a user. Only the fields in `update_mask` change.
   *
   * <p>If automatic identity management is on and the user has an `external_id`, you can only
   * update `external_id`. The user's other fields come from your identity provider. You can't
   * deactivate yourself or change the status of the account owner.
   */
  public User updateUser(UpdateUserRequest request) {
    return impl.updateUser(request);
  }

  /**
   * Replaces the entitlements of a principal's direct assignment to a workspace. The new list can't
   * be empty.
   *
   * <p>Entitlements are changed one at a time. If the request fails partway through, only some of
   * the changes take effect. Get the assignment afterwards to check the result.
   */
  public WorkspaceAssignment updateWorkspaceAssignment(UpdateWorkspaceAssignmentRequest request) {
    return impl.updateWorkspaceAssignment(request);
  }

  /**
   * Updates the entitlements of a directly assigned principal in a workspace. Changes are applied
   * one at a time rather than atomically. If the request fails partway through, only some of the
   * requested changes take effect. Get the assignment detail afterwards to confirm the final state.
   */
  public WorkspaceAssignmentDetail updateWorkspaceAssignmentDetail(
      UpdateWorkspaceAssignmentDetailRequest request) {
    return impl.updateWorkspaceAssignmentDetail(request);
  }

  public AccountIamV2Service impl() {
    return impl;
  }
}
