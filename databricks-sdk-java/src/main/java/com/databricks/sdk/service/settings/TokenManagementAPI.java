// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
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

  /** Creates a token on behalf of a service principal. */
  public CreateOboTokenResponse createOboToken(CreateOboTokenRequest request) {
    return impl.createOboToken(request);
  }

  public void delete(String tokenId) {
    delete(new DeleteTokenManagementRequest().setTokenId(tokenId));
  }

  /** Deletes a token, specified by its ID. */
  public void delete(DeleteTokenManagementRequest request) {
    impl.delete(request);
  }

  public GetTokenResponse get(String tokenId) {
    return get(new GetTokenManagementRequest().setTokenId(tokenId));
  }

  /** Gets information about a token, specified by its ID. */
  public GetTokenResponse get(GetTokenManagementRequest request) {
    return impl.get(request);
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetTokenPermissionLevelsResponse getPermissionLevels() {
    return impl.getPermissionLevels();
  }

  /** Gets the permissions of all tokens. Tokens can inherit permissions from their root object. */
  public TokenPermissions getPermissions() {
    return impl.getPermissions();
  }

  /** Lists all tokens associated with the specified workspace or user. */
  public Iterable<TokenInfo> list(ListTokenManagementRequest request) {
    return new Paginator<>(
        request, impl::list, ListTokensResponse::getTokenInfos, response -> null);
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public TokenPermissions setPermissions(TokenPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Updates the permissions on all tokens. Tokens can inherit permissions from their root object.
   */
  public TokenPermissions updatePermissions(TokenPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public TokenManagementService impl() {
    return impl;
  }
}
