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
  /**
   * Returns the access details for a principal in the current workspace. Allows for checking access
   * details for any provisioned principal (user, service principal, or group) in the current
   * workspace. * Provisioned principal here refers to one that has been synced into Databricks from
   * the customer's IdP or added explicitly to Databricks via SCIM/UI. Allows for passing in a
   * "view" parameter to control what fields are returned (BASIC by default or FULL).
   */
  WorkspaceAccessDetail getWorkspaceAccessDetailLocal(
      GetWorkspaceAccessDetailLocalRequest getWorkspaceAccessDetailLocalRequest);

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
}
