// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Token API allows you to create, list, and revoke tokens that can be used to authenticate and
 * access Databricks REST APIs.
 */
@Generated
public class TokensAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TokensAPI.class);

  private final TokensService impl;

  /** Regular-use constructor */
  public TokensAPI(ApiClient apiClient) {
    impl = new TokensImpl(apiClient);
  }

  /** Constructor for mocks */
  public TokensAPI(TokensService mock) {
    impl = mock;
  }

  /**
   * Create a user token.
   *
   * <p>Creates and returns a token for a user. If this call is made through token authentication,
   * it creates a token with the same client ID as the authenticated token. If the user's token
   * quota is exceeded, this call returns an error **QUOTA_EXCEEDED**.
   */
  public CreateTokenResponse create(CreateTokenRequest request) {
    return impl.create(request);
  }

  public void delete(String tokenId) {
    delete(new RevokeTokenRequest().setTokenId(tokenId));
  }

  /**
   * Revoke token.
   *
   * <p>Revokes an access token.
   *
   * <p>If a token with the specified ID is not valid, this call returns an error
   * **RESOURCE_DOES_NOT_EXIST**.
   */
  public void delete(RevokeTokenRequest request) {
    impl.delete(request);
  }

  /**
   * List tokens.
   *
   * <p>Lists all the valid tokens for a user-workspace pair.
   */
  public Iterable<TokenInfo> list() {
    return impl.list().getTokenInfos();
  }

  public TokensService impl() {
    return impl;
  }
}
