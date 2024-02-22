// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Enables administrators to get all tokens and delete tokens for other users. Admins can either get
 * every token, get a specific token by ID, or get all tokens for a particular user.
 */
@Generated
public class TokenManagementAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TokenManagementAPI.class);

  private final TokenManagementService impl;

  /** Regular-use constructor */
  public TokenManagementAPI(ApiClient apiClient) {
    impl = new TokenManagementImpl(apiClient);
  }

  /** Constructor for mocks */
  public TokenManagementAPI(TokenManagementService mock) {
    impl = mock;
  }

  public CreateOboTokenResponse createOboToken(String applicationId) {
    return createOboToken(new CreateOboTokenRequest().setApplicationId(applicationId));
  }

  /**
   * Create on-behalf token.
   *
   * <p>Creates a token on behalf of a service principal.
   */
  public CreateOboTokenResponse createOboToken(CreateOboTokenRequest request) {
    return impl.createOboToken(request);
  }

  public DeleteResponse delete(String tokenId) {
    return delete(new DeleteTokenManagementRequest().setTokenId(tokenId));
  }

  /**
   * Delete a token.
   *
   * <p>Deletes a token, specified by its ID.
   */
  public DeleteResponse delete(DeleteTokenManagementRequest request) {
    return impl.delete(request);
  }

  public GetTokenResponse get(String tokenId) {
    return get(new GetTokenManagementRequest().setTokenId(tokenId));
  }

  /**
   * Get token info.
   *
   * <p>Gets information about a token, specified by its ID.
   */
  public GetTokenResponse get(GetTokenManagementRequest request) {
    return impl.get(request);
  }

  /**
   * Get token permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetTokenPermissionLevelsResponse getPermissionLevels() {
    return impl.getPermissionLevels();
  }

  /**
   * Get token permissions.
   *
   * <p>Gets the permissions of all tokens. Tokens can inherit permissions from their root object.
   */
  public TokenPermissions getPermissions() {
    return impl.getPermissions();
  }

  /**
   * List all tokens.
   *
   * <p>Lists all tokens associated with the specified workspace or user.
   */
  public Iterable<TokenInfo> list(ListTokenManagementRequest request) {
    return impl.list(request).getTokenInfos();
  }

  /**
   * Set token permissions.
   *
   * <p>Sets permissions on all tokens. Tokens can inherit permissions from their root object.
   */
  public TokenPermissions setPermissions(TokenPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Update token permissions.
   *
   * <p>Updates the permissions on all tokens. Tokens can inherit permissions from their root
   * object.
   */
  public TokenPermissions updatePermissions(TokenPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public TokenManagementService impl() {
    return impl;
  }
}
