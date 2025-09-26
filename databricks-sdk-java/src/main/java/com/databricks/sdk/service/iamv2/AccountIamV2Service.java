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
  /** TODO: Write description later when this method is implemented */
  Group createGroup(CreateGroupRequest createGroupRequest);

  /** TODO: Write description later when this method is implemented */
  ServicePrincipal createServicePrincipal(
      CreateServicePrincipalRequest createServicePrincipalRequest);

  /** TODO: Write description later when this method is implemented */
  User createUser(CreateUserRequest createUserRequest);

  /** TODO: Write description later when this method is implemented */
  WorkspaceAccessDetail createWorkspaceAccessDetail(
      CreateWorkspaceAccessDetailRequest createWorkspaceAccessDetailRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteGroup(DeleteGroupRequest deleteGroupRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteServicePrincipal(DeleteServicePrincipalRequest deleteServicePrincipalRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteUser(DeleteUserRequest deleteUserRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteWorkspaceAccessDetail(
      DeleteWorkspaceAccessDetailRequest deleteWorkspaceAccessDetailRequest);

  /** TODO: Write description later when this method is implemented */
  Group getGroup(GetGroupRequest getGroupRequest);

  /** TODO: Write description later when this method is implemented */
  ServicePrincipal getServicePrincipal(GetServicePrincipalRequest getServicePrincipalRequest);

  /** TODO: Write description later when this method is implemented */
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

  /** TODO: Write description later when this method is implemented */
  ListGroupsResponse listGroups(ListGroupsRequest listGroupsRequest);

  /** TODO: Write description later when this method is implemented */
  ListServicePrincipalsResponse listServicePrincipals(
      ListServicePrincipalsRequest listServicePrincipalsRequest);

  /** TODO: Write description later when this method is implemented */
  ListUsersResponse listUsers(ListUsersRequest listUsersRequest);

  /** TODO: Write description later when this method is implemented */
  ListWorkspaceAccessDetailsResponse listWorkspaceAccessDetails(
      ListWorkspaceAccessDetailsRequest listWorkspaceAccessDetailsRequest);

  /**
   * Resolves a group with the given external ID from the customer's IdP. If the group does not
   * exist, it will be created in the account. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  ResolveGroupResponse resolveGroup(ResolveGroupRequest resolveGroupRequest);

  /**
   * Resolves an SP with the given external ID from the customer's IdP. If the SP does not exist, it
   * will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  ResolveServicePrincipalResponse resolveServicePrincipal(
      ResolveServicePrincipalRequest resolveServicePrincipalRequest);

  /**
   * Resolves a user with the given external ID from the customer's IdP. If the user does not exist,
   * it will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  ResolveUserResponse resolveUser(ResolveUserRequest resolveUserRequest);

  /** TODO: Write description later when this method is implemented */
  Group updateGroup(UpdateGroupRequest updateGroupRequest);

  /** TODO: Write description later when this method is implemented */
  ServicePrincipal updateServicePrincipal(
      UpdateServicePrincipalRequest updateServicePrincipalRequest);

  /** TODO: Write description later when this method is implemented */
  User updateUser(UpdateUserRequest updateUserRequest);

  /** TODO: Write description later when this method is implemented */
  WorkspaceAccessDetail updateWorkspaceAccessDetail(
      UpdateWorkspaceAccessDetailRequest updateWorkspaceAccessDetailRequest);
}
