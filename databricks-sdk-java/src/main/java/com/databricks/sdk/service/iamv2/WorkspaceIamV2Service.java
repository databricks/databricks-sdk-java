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
  /** TODO: Write description later when this method is implemented */
  Group createGroupProxy(CreateGroupProxyRequest createGroupProxyRequest);

  /** TODO: Write description later when this method is implemented */
  ServicePrincipal createServicePrincipalProxy(
      CreateServicePrincipalProxyRequest createServicePrincipalProxyRequest);

  /** TODO: Write description later when this method is implemented */
  User createUserProxy(CreateUserProxyRequest createUserProxyRequest);

  /** TODO: Write description later when this method is implemented */
  WorkspaceAccessDetail createWorkspaceAccessDetailLocal(
      CreateWorkspaceAccessDetailLocalRequest createWorkspaceAccessDetailLocalRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteGroupProxy(DeleteGroupProxyRequest deleteGroupProxyRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteServicePrincipalProxy(
      DeleteServicePrincipalProxyRequest deleteServicePrincipalProxyRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteUserProxy(DeleteUserProxyRequest deleteUserProxyRequest);

  /** TODO: Write description later when this method is implemented */
  void deleteWorkspaceAccessDetailLocal(
      DeleteWorkspaceAccessDetailLocalRequest deleteWorkspaceAccessDetailLocalRequest);

  /** TODO: Write description later when this method is implemented */
  Group getGroupProxy(GetGroupProxyRequest getGroupProxyRequest);

  /** TODO: Write description later when this method is implemented */
  ServicePrincipal getServicePrincipalProxy(
      GetServicePrincipalProxyRequest getServicePrincipalProxyRequest);

  /** TODO: Write description later when this method is implemented */
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

  /** TODO: Write description later when this method is implemented */
  ListGroupsResponse listGroupsProxy(ListGroupsProxyRequest listGroupsProxyRequest);

  /** TODO: Write description later when this method is implemented */
  ListServicePrincipalsResponse listServicePrincipalsProxy(
      ListServicePrincipalsProxyRequest listServicePrincipalsProxyRequest);

  /** TODO: Write description later when this method is implemented */
  ListUsersResponse listUsersProxy(ListUsersProxyRequest listUsersProxyRequest);

  /** TODO: Write description later when this method is implemented */
  ListWorkspaceAccessDetailsResponse listWorkspaceAccessDetailsLocal(
      ListWorkspaceAccessDetailsLocalRequest listWorkspaceAccessDetailsLocalRequest);

  /**
   * Resolves a group with the given external ID from the customer's IdP. If the group does not
   * exist, it will be created in the account. If the customer is not onboarded onto Automatic
   * Identity Management (AIM), this will return an error.
   */
  ResolveGroupResponse resolveGroupProxy(ResolveGroupProxyRequest resolveGroupProxyRequest);

  /**
   * Resolves an SP with the given external ID from the customer's IdP. If the SP does not exist, it
   * will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  ResolveServicePrincipalResponse resolveServicePrincipalProxy(
      ResolveServicePrincipalProxyRequest resolveServicePrincipalProxyRequest);

  /**
   * Resolves a user with the given external ID from the customer's IdP. If the user does not exist,
   * it will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
   */
  ResolveUserResponse resolveUserProxy(ResolveUserProxyRequest resolveUserProxyRequest);

  /** TODO: Write description later when this method is implemented */
  Group updateGroupProxy(UpdateGroupProxyRequest updateGroupProxyRequest);

  /** TODO: Write description later when this method is implemented */
  ServicePrincipal updateServicePrincipalProxy(
      UpdateServicePrincipalProxyRequest updateServicePrincipalProxyRequest);

  /** TODO: Write description later when this method is implemented */
  User updateUserProxy(UpdateUserProxyRequest updateUserProxyRequest);

  /** TODO: Write description later when this method is implemented */
  WorkspaceAccessDetail updateWorkspaceAccessDetailLocal(
      UpdateWorkspaceAccessDetailLocalRequest updateWorkspaceAccessDetailLocalRequest);
}
