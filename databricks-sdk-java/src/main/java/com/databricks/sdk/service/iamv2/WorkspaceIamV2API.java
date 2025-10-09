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

  /** TODO: Write description later when this method is implemented */
  public Group createGroupProxy(CreateGroupProxyRequest request) {
    return impl.createGroupProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ServicePrincipal createServicePrincipalProxy(CreateServicePrincipalProxyRequest request) {
    return impl.createServicePrincipalProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public User createUserProxy(CreateUserProxyRequest request) {
    return impl.createUserProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public WorkspaceAccessDetail createWorkspaceAccessDetailLocal(
      CreateWorkspaceAccessDetailLocalRequest request) {
    return impl.createWorkspaceAccessDetailLocal(request);
  }

  public void deleteGroupProxy(long internalId) {
    deleteGroupProxy(new DeleteGroupProxyRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteGroupProxy(DeleteGroupProxyRequest request) {
    impl.deleteGroupProxy(request);
  }

  public void deleteServicePrincipalProxy(long internalId) {
    deleteServicePrincipalProxy(new DeleteServicePrincipalProxyRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteServicePrincipalProxy(DeleteServicePrincipalProxyRequest request) {
    impl.deleteServicePrincipalProxy(request);
  }

  public void deleteUserProxy(long internalId) {
    deleteUserProxy(new DeleteUserProxyRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteUserProxy(DeleteUserProxyRequest request) {
    impl.deleteUserProxy(request);
  }

  public void deleteWorkspaceAccessDetailLocal(long principalId) {
    deleteWorkspaceAccessDetailLocal(
        new DeleteWorkspaceAccessDetailLocalRequest().setPrincipalId(principalId));
  }

  /** TODO: Write description later when this method is implemented */
  public void deleteWorkspaceAccessDetailLocal(DeleteWorkspaceAccessDetailLocalRequest request) {
    impl.deleteWorkspaceAccessDetailLocal(request);
  }

  public Group getGroupProxy(long internalId) {
    return getGroupProxy(new GetGroupProxyRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public Group getGroupProxy(GetGroupProxyRequest request) {
    return impl.getGroupProxy(request);
  }

  public ServicePrincipal getServicePrincipalProxy(long internalId) {
    return getServicePrincipalProxy(
        new GetServicePrincipalProxyRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
  public ServicePrincipal getServicePrincipalProxy(GetServicePrincipalProxyRequest request) {
    return impl.getServicePrincipalProxy(request);
  }

  public User getUserProxy(long internalId) {
    return getUserProxy(new GetUserProxyRequest().setInternalId(internalId));
  }

  /** TODO: Write description later when this method is implemented */
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

  /** TODO: Write description later when this method is implemented */
  public ListGroupsResponse listGroupsProxy(ListGroupsProxyRequest request) {
    return impl.listGroupsProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ListServicePrincipalsResponse listServicePrincipalsProxy(
      ListServicePrincipalsProxyRequest request) {
    return impl.listServicePrincipalsProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ListUsersResponse listUsersProxy(ListUsersProxyRequest request) {
    return impl.listUsersProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ListWorkspaceAccessDetailsResponse listWorkspaceAccessDetailsLocal(
      ListWorkspaceAccessDetailsLocalRequest request) {
    return impl.listWorkspaceAccessDetailsLocal(request);
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
   * Resolves an SP with the given external ID from the customer's IdP. If the SP does not exist, it
   * will be created. If the customer is not onboarded onto Automatic Identity Management (AIM),
   * this will return an error.
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

  /** TODO: Write description later when this method is implemented */
  public Group updateGroupProxy(UpdateGroupProxyRequest request) {
    return impl.updateGroupProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public ServicePrincipal updateServicePrincipalProxy(UpdateServicePrincipalProxyRequest request) {
    return impl.updateServicePrincipalProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public User updateUserProxy(UpdateUserProxyRequest request) {
    return impl.updateUserProxy(request);
  }

  /** TODO: Write description later when this method is implemented */
  public WorkspaceAccessDetail updateWorkspaceAccessDetailLocal(
      UpdateWorkspaceAccessDetailLocalRequest request) {
    return impl.updateWorkspaceAccessDetailLocal(request);
  }

  public WorkspaceIamV2Service impl() {
    return impl;
  }
}
