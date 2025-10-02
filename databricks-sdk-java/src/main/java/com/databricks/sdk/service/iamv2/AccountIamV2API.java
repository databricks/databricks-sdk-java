// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  /** TODO: Write description later when this method is implemented */
  public Group createGroup(CreateGroupRequest request) {
    return impl.createGroup(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ServicePrincipal createServicePrincipal(CreateServicePrincipalRequest request) {
    return impl.createServicePrincipal(request);
  }

  /** TODO: Write description later when this method is implemented */
  public User createUser(CreateUserRequest request) {
    return impl.createUser(request);
  }

  /** TODO: Write description later when this method is implemented */
  public WorkspaceAccessDetail createWorkspaceAccessDetail(
      CreateWorkspaceAccessDetailRequest request) {
    return impl.createWorkspaceAccessDetail(request);
  }

  public void deleteGroup(long internalId) {
    deleteGroup(new DeleteGroupRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteGroup(DeleteGroupRequest request) {
    impl.deleteGroup(request);
  }

  public void deleteServicePrincipal(long internalId) {
    deleteServicePrincipal(new DeleteServicePrincipalRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteServicePrincipal(DeleteServicePrincipalRequest request) {
    impl.deleteServicePrincipal(request);
  }

  public void deleteUser(long internalId) {
    deleteUser(new DeleteUserRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteUser(DeleteUserRequest request) {
    impl.deleteUser(request);
  }

  public void deleteWorkspaceAccessDetail(long workspaceId, long principalId) {
    deleteWorkspaceAccessDetail(
        new DeleteWorkspaceAccessDetailRequest()
            .setWorkspaceId(workspaceId)
            .setPrincipalId(principalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteWorkspaceAccessDetail(DeleteWorkspaceAccessDetailRequest request) {
    impl.deleteWorkspaceAccessDetail(request);
  }

  public Group getGroup(long internalId) {
    return getGroup(new GetGroupRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public Group getGroup(GetGroupRequest request) {
    return impl.getGroup(request);
  }

  public ServicePrincipal getServicePrincipal(long internalId) {
    return getServicePrincipal(new GetServicePrincipalRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public ServicePrincipal getServicePrincipal(GetServicePrincipalRequest request) {
    return impl.getServicePrincipal(request);
  }

  public User getUser(long internalId) {
    return getUser(new GetUserRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
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

  /** TODO: Write description later when this method is implemented */
  public ListGroupsResponse listGroups(ListGroupsRequest request) {
    return impl.listGroups(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ListServicePrincipalsResponse listServicePrincipals(ListServicePrincipalsRequest request) {
    return impl.listServicePrincipals(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ListUsersResponse listUsers(ListUsersRequest request) {
    return impl.listUsers(request);
  }

  public ListWorkspaceAccessDetailsResponse listWorkspaceAccessDetails(long workspaceId) {
    return listWorkspaceAccessDetails(
        new ListWorkspaceAccessDetailsRequest().setWorkspaceId(workspaceId));
  }

  /** TODO: Write description later when this method is implemented */
  public ListWorkspaceAccessDetailsResponse listWorkspaceAccessDetails(
      ListWorkspaceAccessDetailsRequest request) {
    return impl.listWorkspaceAccessDetails(request);
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
   * Resolves an SP with the given external ID from the customer's IdP. If the SP does not exist, it
   * will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
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

  /** TODO: Write description later when this method is implemented */
  public Group updateGroup(UpdateGroupRequest request) {
    return impl.updateGroup(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ServicePrincipal updateServicePrincipal(UpdateServicePrincipalRequest request) {
    return impl.updateServicePrincipal(request);
  }

  /** TODO: Write description later when this method is implemented */
  public User updateUser(UpdateUserRequest request) {
    return impl.updateUser(request);
  }

  /** TODO: Write description later when this method is implemented */
  public WorkspaceAccessDetail updateWorkspaceAccessDetail(
      UpdateWorkspaceAccessDetailRequest request) {
    return impl.updateWorkspaceAccessDetail(request);
  }

  public AccountIamV2Service impl() {
    return impl;
  }
}
