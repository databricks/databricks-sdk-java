// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tokens;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * The Token API allows you to create, list, and revoke tokens that can be used to authenticate and
 * access Databricks REST APIs.
 */
public class TokensAPI {
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
  public ListTokensResponse list() {
    return impl.list();
  }

  public TokensService impl() {
    return impl;
  }
}
