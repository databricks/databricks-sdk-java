// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Enables administrators to get all tokens and delete tokens for other users. Admins can either get
 * every token, get a specific token by ID, or get all tokens for a particular user.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TokenManagementService {
  /** Creates a token on behalf of a service principal. */
  CreateOboTokenResponse createOboToken(CreateOboTokenRequest createOboTokenRequest);

  /** Deletes a token, specified by its ID. */
  void delete(DeleteTokenManagementRequest deleteTokenManagementRequest);

  /** Gets information about a token, specified by its ID. */
  GetTokenResponse get(GetTokenManagementRequest getTokenManagementRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetTokenPermissionLevelsResponse getPermissionLevels();

  /** Gets the permissions of all tokens. Tokens can inherit permissions from their root object. */
  TokenPermissions getPermissions();

  /** Lists all tokens associated with the specified workspace or user. */
  ListTokensResponse list(ListTokenManagementRequest listTokenManagementRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  TokenPermissions setPermissions(TokenPermissionsRequest tokenPermissionsRequest);

  /**
   * Updates the permissions on all tokens. Tokens can inherit permissions from their root object.
   */
  TokenPermissions updatePermissions(TokenPermissionsRequest tokenPermissionsRequest);
}
