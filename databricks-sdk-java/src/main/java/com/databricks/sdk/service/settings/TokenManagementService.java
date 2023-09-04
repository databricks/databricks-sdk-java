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
  /**
   * Create on-behalf token.
   *
   * <p>Creates a token on behalf of a service principal.
   */
  CreateOboTokenResponse createOboToken(CreateOboTokenRequest createOboTokenRequest);

  /**
   * Delete a token.
   *
   * <p>Deletes a token, specified by its ID.
   */
  void delete(DeleteTokenManagementRequest deleteTokenManagementRequest);

  /**
   * Get token info.
   *
   * <p>Gets information about a token, specified by its ID.
   */
  TokenInfo get(GetTokenManagementRequest getTokenManagementRequest);

  /**
   * Get token permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetTokenPermissionLevelsResponse getPermissionLevels();

  /**
   * Get token permissions.
   *
   * <p>Gets the permissions of all tokens. Tokens can inherit permissions from their root object.
   */
  TokenPermissions getPermissions();

  /**
   * List all tokens.
   *
   * <p>Lists all tokens associated with the specified workspace or user.
   */
  ListTokensResponse list(ListTokenManagementRequest listTokenManagementRequest);

  /**
   * Set token permissions.
   *
   * <p>Sets permissions on all tokens. Tokens can inherit permissions from their root object.
   */
  TokenPermissions setPermissions(TokenPermissionsRequest tokenPermissionsRequest);

  /**
   * Update token permissions.
   *
   * <p>Updates the permissions on all tokens. Tokens can inherit permissions from their root
   * object.
   */
  TokenPermissions updatePermissions(TokenPermissionsRequest tokenPermissionsRequest);
}
