// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

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

  /** Creates a group membership (assigns a principal to a group). */
  public DirectGroupMember createDirectGroupMember(CreateDirectGroupMemberRequest request) {
    return impl.createDirectGroupMember(request);
  }

  /**
   * Creates a local group in the Databricks account and returns the created group. A local group is
   * one that is not synced from the customer's identity provider, and can be created whether or not
   * Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. To provision the identity
   * from your identity provider, resolve it by its external ID with ResolveGroup; to read an
   * existing external identity, use the ExternalGroup resource.
   */
  public Group createGroup(CreateGroupRequest request) {
    return impl.createGroup(request);
  }

  /**
   * Creates a local service principal in the Databricks account and returns the created service
   * principal. A local service principal is one that is not synced from the customer's identity
   * provider, and can be created whether or not Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. To provision the identity
   * from your identity provider, resolve it by its external ID with ResolveServicePrincipal; to
   * read an existing external identity, use the ExternalServicePrincipal resource.
   */
  public ServicePrincipal createServicePrincipal(CreateServicePrincipalRequest request) {
    return impl.createServicePrincipal(request);
  }

  /**
   * Creates a local user in the Databricks account and returns the created user. A local user is
   * one that is not synced from the customer's identity provider, and can be created whether or not
   * Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. To provision the identity
   * from your identity provider, resolve it by its external ID with ResolveUser; to read an
   * existing external identity, use the ExternalUser resource.
   */
  public User createUser(CreateUserRequest request) {
    return impl.createUser(request);
  }

  /**
   * Creates a workspace assignment for a principal. Entitlements are granted one at a time rather
   * than atomically. If the request fails partway through, the principal stays assigned to the
   * workspace with only some of the requested entitlements. Get the assignment afterwards to
   * confirm which entitlements were granted.
   */
  public WorkspaceAssignment createWorkspaceAssignment(CreateWorkspaceAssignmentRequest request) {
    return impl.createWorkspaceAssignment(request);
  }

  /**
   * Creates a workspace assignment detail for a principal. Entitlements are granted one at a time
   * rather than atomically. If the request fails partway through, the principal stays assigned to
   * the workspace with only some of the requested entitlements. Get the assignment detail
   * afterwards to confirm which entitlements were granted.
   */
  public WorkspaceAssignmentDetail createWorkspaceAssignmentDetail(
      CreateWorkspaceAssignmentDetailRequest request) {
    return impl.createWorkspaceAssignmentDetail(request);
  }

  public void deleteDirectGroupMember(long groupId, long principalId) {
    deleteDirectGroupMember(
        new DeleteDirectGroupMemberRequest().setGroupId(groupId).setPrincipalId(principalId));
  }

  /** Deletes a group membership (unassigns a principal from a group). */
  public void deleteDirectGroupMember(DeleteDirectGroupMemberRequest request) {
    impl.deleteDirectGroupMember(request);
  }

  public void deleteGroup(String groupId) {
    deleteGroup(new DeleteGroupRequest().setGroupId(groupId));
  }

  /** Deletes a group from the Databricks account by its internal ID. */
  public void deleteGroup(DeleteGroupRequest request) {
    impl.deleteGroup(request);
  }

  public void deleteServicePrincipal(String servicePrincipalId) {
    deleteServicePrincipal(
        new DeleteServicePrincipalRequest().setServicePrincipalId(servicePrincipalId));
  }

  /** Deletes a service principal from the Databricks account by its internal ID. */
  public void deleteServicePrincipal(DeleteServicePrincipalRequest request) {
    impl.deleteServicePrincipal(request);
  }

  public void deleteUser(String userId) {
    deleteUser(new DeleteUserRequest().setUserId(userId));
  }

  /** Deletes a user from the Databricks account by its internal ID. */
  public void deleteUser(DeleteUserRequest request) {
    impl.deleteUser(request);
  }

  public void deleteWorkspaceAssignment(long workspaceId, long principalId) {
    deleteWorkspaceAssignment(
        new DeleteWorkspaceAssignmentRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /**
   * Deletes a workspace assignment for a principal, revoking all of its entitlements. Entitlements
   * are revoked one at a time rather than atomically. If the request fails partway through, the
   * principal stays assigned with some of its original entitlements. Retrying is safe.
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

  public DirectGroupMember getDirectGroupMember(long groupId, long principalId) {
    return getDirectGroupMember(
        new GetDirectGroupMemberRequest().setGroupId(groupId).setPrincipalId(principalId));
  }

  /** Gets a provisioned direct member of a group. */
  public DirectGroupMember getDirectGroupMember(GetDirectGroupMemberRequest request) {
    return impl.getDirectGroupMember(request);
  }

  public Group getGroup(String groupId) {
    return getGroup(new GetGroupRequest().setGroupId(groupId));
  }

  /** Fetches a group from the Databricks account by its internal ID. */
  public Group getGroup(GetGroupRequest request) {
    return impl.getGroup(request);
  }

  public ServicePrincipal getServicePrincipal(String servicePrincipalId) {
    return getServicePrincipal(
        new GetServicePrincipalRequest().setServicePrincipalId(servicePrincipalId));
  }

  /** Fetches a service principal from the Databricks account by its internal ID. */
  public ServicePrincipal getServicePrincipal(GetServicePrincipalRequest request) {
    return impl.getServicePrincipal(request);
  }

  public User getUser(String userId) {
    return getUser(new GetUserRequest().setUserId(userId));
  }

  /** Fetches a user from the Databricks account by its internal ID. */
  public User getUser(GetUserRequest request) {
    return impl.getUser(request);
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

  public WorkspaceAssignment getWorkspaceAssignment(long workspaceId, long principalId) {
    return getWorkspaceAssignment(
        new GetWorkspaceAssignmentRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /** Returns the assignment for a principal in a workspace. */
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

  public Iterable<DirectGroupMember> listDirectGroupMembers(long groupId) {
    return listDirectGroupMembers(new ListDirectGroupMembersRequest().setGroupId(groupId));
  }

  /**
   * Lists provisioned direct members of a group with their membership source (internal or from
   * identity provider).
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

  /**
   * Lists the groups in the Databricks account, returning one page per call. Supports filtering by
   * group name or external ID.
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

  /**
   * Lists the service principals in the Databricks account, returning one page per call. Supports
   * filtering by application ID or external ID.
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

  public ListTransitiveParentGroupsResponse listTransitiveParentGroups(long principalId) {
    return listTransitiveParentGroups(
        new ListTransitiveParentGroupsRequest().setPrincipalId(principalId));
  }

  /** Lists all transitive parent groups of a principal. */
  public ListTransitiveParentGroupsResponse listTransitiveParentGroups(
      ListTransitiveParentGroupsRequest request) {
    return impl.listTransitiveParentGroups(request);
  }

  /**
   * Lists the users in the Databricks account, returning one page per call. Supports filtering by
   * username or external ID.
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

  public ListWorkspaceAssignmentsResponse listWorkspaceAssignments(long workspaceId) {
    return listWorkspaceAssignments(
        new ListWorkspaceAssignmentsRequest().setWorkspaceId(workspaceId));
  }

  /**
   * Lists workspace assignments for a workspace. The response omits the per-principal entitlement
   * fields (`entitlements` and `effective_entitlements`). To read the entitlements for a single
   * principal, get that principal's assignment.
   */
  public ListWorkspaceAssignmentsResponse listWorkspaceAssignments(
      ListWorkspaceAssignmentsRequest request) {
    return impl.listWorkspaceAssignments(request);
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
   * Resolves a service principal with the given external ID from the customer's IdP. If the service
   * principal does not exist, it will be created. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
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
   * Updates an existing group in the Databricks account. Only the fields named in the update mask
   * are modified. Returns the updated Group resource.
   *
   * <p>When AIM is enabled and the group is an external identity (its external_id is set), only
   * external_id can be updated; its other fields are sourced from your identity provider.
   */
  public Group updateGroup(UpdateGroupRequest request) {
    return impl.updateGroup(request);
  }

  /**
   * Updates an existing service principal in the Databricks account. Only the fields named in the
   * update mask are modified. Returns the updated ServicePrincipal resource.
   *
   * <p>When AIM is enabled and the service principal is an external identity (its external_id is
   * set), only external_id can be updated; its other fields are sourced from your identity
   * provider.
   */
  public ServicePrincipal updateServicePrincipal(UpdateServicePrincipalRequest request) {
    return impl.updateServicePrincipal(request);
  }

  /**
   * Updates an existing user in the Databricks account and returns the updated user. Only the
   * fields named in the update mask are modified. The updatable fields are fullName.givenName,
   * fullName.familyName, status, and externalId.
   *
   * <p>When AIM is enabled and the user is an external identity (its external_id is set), only
   * external_id can be updated; its other fields are sourced from your identity provider.
   */
  public User updateUser(UpdateUserRequest request) {
    return impl.updateUser(request);
  }

  /**
   * Updates the entitlements of a directly assigned principal in a workspace. Changes are applied
   * one at a time rather than atomically. If the request fails partway through, only some of the
   * requested changes take effect. Get the assignment afterwards to confirm the final state.
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
