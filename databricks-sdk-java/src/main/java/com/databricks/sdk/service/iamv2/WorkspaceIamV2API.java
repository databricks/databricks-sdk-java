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

  /** Creates a group membership (assigns a principal to a group). */
  public DirectGroupMember createDirectGroupMemberProxy(
      CreateDirectGroupMemberProxyRequest request) {
    return impl.createDirectGroupMemberProxy(request);
  }

  /**
   * Creates a local group in the Databricks account that parents the calling workspace and returns
   * the created group. A local group is one that is not synced from the customer's identity
   * provider, and can be created whether or not Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. To provision the identity
   * from your identity provider, resolve it by its external ID with ResolveGroup; to read an
   * existing external identity, use the ExternalGroup resource.
   */
  public Group createGroupProxy(CreateGroupProxyRequest request) {
    return impl.createGroupProxy(request);
  }

  /**
   * Creates a local service principal in the Databricks account that parents the calling workspace
   * and returns the created service principal. A local service principal is one that is not synced
   * from the customer's identity provider, and can be created whether or not Account Identity
   * Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. To provision the identity
   * from your identity provider, resolve it by its external ID with ResolveServicePrincipal; to
   * read an existing external identity, use the ExternalServicePrincipal resource.
   */
  public ServicePrincipal createServicePrincipalProxy(CreateServicePrincipalProxyRequest request) {
    return impl.createServicePrincipalProxy(request);
  }

  /**
   * Creates a local user in the Databricks account that parents the calling workspace and returns
   * the created user. A local user is one that is not synced from the customer's identity provider,
   * and can be created whether or not Account Identity Management (AIM) is enabled.
   *
   * <p>When AIM is enabled, supplying an external ID returns an error. To provision the identity
   * from your identity provider, resolve it by its external ID with ResolveUser; to read an
   * existing external identity, use the ExternalUser resource.
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
   * Creates a workspace assignment for a principal in the calling workspace. Entitlements are
   * granted one at a time rather than atomically. If the request fails partway through, the
   * principal stays assigned to the workspace with only some of the requested entitlements. Get the
   * assignment afterwards to confirm which entitlements were granted.
   */
  public WorkspaceAssignment createWorkspaceAssignmentProxy(
      CreateWorkspaceAssignmentProxyRequest request) {
    return impl.createWorkspaceAssignmentProxy(request);
  }

  public void deleteDirectGroupMemberProxy(long groupId, long principalId) {
    deleteDirectGroupMemberProxy(
        new DeleteDirectGroupMemberProxyRequest().setGroupId(groupId).setPrincipalId(principalId));
  }

  /** Deletes a group membership (unassigns a principal from a group). */
  public void deleteDirectGroupMemberProxy(DeleteDirectGroupMemberProxyRequest request) {
    impl.deleteDirectGroupMemberProxy(request);
  }

  public void deleteGroupProxy(String groupId) {
    deleteGroupProxy(new DeleteGroupProxyRequest().setGroupId(groupId));
  }

  /**
   * Deletes a group by its internal ID from the Databricks account that parents the calling
   * workspace.
   */
  public void deleteGroupProxy(DeleteGroupProxyRequest request) {
    impl.deleteGroupProxy(request);
  }

  public void deleteServicePrincipalProxy(String servicePrincipalId) {
    deleteServicePrincipalProxy(
        new DeleteServicePrincipalProxyRequest().setServicePrincipalId(servicePrincipalId));
  }

  /**
   * Deletes a service principal by its internal ID from the Databricks account that parents the
   * calling workspace.
   */
  public void deleteServicePrincipalProxy(DeleteServicePrincipalProxyRequest request) {
    impl.deleteServicePrincipalProxy(request);
  }

  public void deleteUserProxy(String userId) {
    deleteUserProxy(new DeleteUserProxyRequest().setUserId(userId));
  }

  /**
   * Deletes a user by its internal ID from the Databricks account that parents the calling
   * workspace.
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

  public void deleteWorkspaceAssignmentProxy(long principalId) {
    deleteWorkspaceAssignmentProxy(
        new DeleteWorkspaceAssignmentProxyRequest().setPrincipalId(principalId));
  }

  /**
   * Deletes a workspace assignment for a principal in the calling workspace, revoking all of its
   * entitlements. Entitlements are revoked one at a time rather than atomically. If the request
   * fails partway through, the principal stays assigned with some of its original entitlements.
   * Retrying is safe.
   */
  public void deleteWorkspaceAssignmentProxy(DeleteWorkspaceAssignmentProxyRequest request) {
    impl.deleteWorkspaceAssignmentProxy(request);
  }

  public DirectGroupMember getDirectGroupMemberProxy(long groupId, long principalId) {
    return getDirectGroupMemberProxy(
        new GetDirectGroupMemberProxyRequest().setGroupId(groupId).setPrincipalId(principalId));
  }

  /** Gets a provisioned direct member of a group. */
  public DirectGroupMember getDirectGroupMemberProxy(GetDirectGroupMemberProxyRequest request) {
    return impl.getDirectGroupMemberProxy(request);
  }

  public ExternalGroup getExternalGroupProxy(String name) {
    return getExternalGroupProxy(new GetExternalGroupProxyRequest().setName(name));
  }

  /**
   * Retrieves an external group with the given external ID from the customer's IdP. If the group
   * does not exist, it will be created in the account. If the customer is not onboarded onto
   * Automatic Identity Management (AIM), this will return an error. Workspace-scoped variant for
   * workspace-authenticated callers.
   */
  public ExternalGroup getExternalGroupProxy(GetExternalGroupProxyRequest request) {
    return impl.getExternalGroupProxy(request);
  }

  public ExternalServicePrincipal getExternalServicePrincipalProxy(String name) {
    return getExternalServicePrincipalProxy(
        new GetExternalServicePrincipalProxyRequest().setName(name));
  }

  /**
   * Retrieves an external service principal with the given external ID from the customer's IdP. If
   * the service principal does not exist, it will be created. If the customer is not onboarded onto
   * Automatic Identity Management (AIM), this will return an error. Workspace-scoped variant for
   * workspace-authenticated callers.
   */
  public ExternalServicePrincipal getExternalServicePrincipalProxy(
      GetExternalServicePrincipalProxyRequest request) {
    return impl.getExternalServicePrincipalProxy(request);
  }

  public ExternalUser getExternalUserProxy(String name) {
    return getExternalUserProxy(new GetExternalUserProxyRequest().setName(name));
  }

  /**
   * Retrieves an external user with the given external ID from the customer's IdP. If the user does
   * not exist, it will be created. If the customer is not onboarded onto Automatic Identity
   * Management (AIM), this will return an error. Workspace-scoped variant for
   * workspace-authenticated callers.
   */
  public ExternalUser getExternalUserProxy(GetExternalUserProxyRequest request) {
    return impl.getExternalUserProxy(request);
  }

  public Group getGroupProxy(String groupId) {
    return getGroupProxy(new GetGroupProxyRequest().setGroupId(groupId));
  }

  /**
   * Fetches a group by its internal ID from the Databricks account that parents the calling
   * workspace.
   */
  public Group getGroupProxy(GetGroupProxyRequest request) {
    return impl.getGroupProxy(request);
  }

  public ServicePrincipal getServicePrincipalProxy(String servicePrincipalId) {
    return getServicePrincipalProxy(
        new GetServicePrincipalProxyRequest().setServicePrincipalId(servicePrincipalId));
  }

  /**
   * Fetches a service principal by its internal ID from the Databricks account that parents the
   * calling workspace.
   */
  public ServicePrincipal getServicePrincipalProxy(GetServicePrincipalProxyRequest request) {
    return impl.getServicePrincipalProxy(request);
  }

  public User getUserProxy(String userId) {
    return getUserProxy(new GetUserProxyRequest().setUserId(userId));
  }

  /**
   * Fetches a user by its internal ID from the Databricks account that parents the calling
   * workspace.
   */
  public User getUserProxy(GetUserProxyRequest request) {
    return impl.getUserProxy(request);
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

  public WorkspaceAssignment getWorkspaceAssignmentProxy(long principalId) {
    return getWorkspaceAssignmentProxy(
        new GetWorkspaceAssignmentProxyRequest().setPrincipalId(principalId));
  }

  /** Returns the assignment for a principal in the calling workspace. */
  public WorkspaceAssignment getWorkspaceAssignmentProxy(
      GetWorkspaceAssignmentProxyRequest request) {
    return impl.getWorkspaceAssignmentProxy(request);
  }

  public WorkspaceIdentityDetail getWorkspaceIdentityDetail(long principalId) {
    return getWorkspaceIdentityDetail(
        new GetWorkspaceIdentityDetailRequest().setPrincipalId(principalId));
  }

  /** Returns the identity details for a principal in a workspace. */
  public WorkspaceIdentityDetail getWorkspaceIdentityDetail(
      GetWorkspaceIdentityDetailRequest request) {
    return impl.getWorkspaceIdentityDetail(request);
  }

  public Iterable<DirectGroupMember> listDirectGroupMembersProxy(long groupId) {
    return listDirectGroupMembersProxy(
        new ListDirectGroupMembersProxyRequest().setGroupId(groupId));
  }

  /**
   * Lists provisioned direct members of a group with their membership source (internal or from
   * identity provider).
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
   * Lists the groups in the Databricks account that parents the calling workspace, returning one
   * page per call. Supports filtering by group name or external ID.
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
   * Lists the service principals in the Databricks account that parents the calling workspace,
   * returning one page per call. Supports filtering by application ID or external ID.
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

  public ListTransitiveParentGroupsResponse listTransitiveParentGroupsProxy(long principalId) {
    return listTransitiveParentGroupsProxy(
        new ListTransitiveParentGroupsProxyRequest().setPrincipalId(principalId));
  }

  /** Lists all transitive parent groups of a principal. */
  public ListTransitiveParentGroupsResponse listTransitiveParentGroupsProxy(
      ListTransitiveParentGroupsProxyRequest request) {
    return impl.listTransitiveParentGroupsProxy(request);
  }

  /**
   * Lists the users in the Databricks account that parents the calling workspace, returning one
   * page per call. Supports filtering by username or external ID.
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
   * Lists workspace assignments for the calling workspace. The response omits the per-principal
   * entitlement fields (`entitlements` and `effective_entitlements`). To read the entitlements for
   * a single principal, get that principal's assignment.
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
   * Updates an existing group in the Databricks account that parents the calling workspace. Only
   * the fields named in the update mask are modified. Returns the updated Group resource.
   *
   * <p>When AIM is enabled and the group is an external identity (its external_id is set), only
   * external_id can be updated; its other fields are sourced from your identity provider.
   */
  public Group updateGroupProxy(UpdateGroupProxyRequest request) {
    return impl.updateGroupProxy(request);
  }

  /**
   * Updates an existing service principal in the Databricks account that parents the calling
   * workspace. Only the fields named in the update mask are modified. Returns the updated
   * ServicePrincipal resource.
   *
   * <p>When AIM is enabled and the service principal is an external identity (its external_id is
   * set), only external_id can be updated; its other fields are sourced from your identity
   * provider.
   */
  public ServicePrincipal updateServicePrincipalProxy(UpdateServicePrincipalProxyRequest request) {
    return impl.updateServicePrincipalProxy(request);
  }

  /**
   * Updates an existing user in the Databricks account that parents the calling workspace and
   * returns the updated user. Only the fields named in the update mask are modified. The updatable
   * fields are fullName.givenName, fullName.familyName, status, and externalId.
   *
   * <p>When AIM is enabled and the user is an external identity (its external_id is set), only
   * external_id can be updated; its other fields are sourced from your identity provider.
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
   * Updates the entitlements of a directly assigned principal in the calling workspace. Changes are
   * applied one at a time rather than atomically. If the request fails partway through, only some
   * of the requested changes take effect. Get the assignment afterwards to confirm the final state.
   */
  public WorkspaceAssignment updateWorkspaceAssignmentProxy(
      UpdateWorkspaceAssignmentProxyRequest request) {
    return impl.updateWorkspaceAssignmentProxy(request);
  }

  /** Updates a workspace identity detail for a principal. */
  public WorkspaceIdentityDetail updateWorkspaceIdentityDetail(
      UpdateWorkspaceIdentityDetailRequest request) {
    return impl.updateWorkspaceIdentityDetail(request);
  }

  public WorkspaceIamV2Service impl() {
    return impl;
  }
}
