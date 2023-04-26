// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Token API allows you to create, list, and revoke tokens that can be used to authenticate and
 * access Databricks REST APIs.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TokensAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TokensAPI.class);

  private final TokensService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public TokensAPI(ApiClient apiClient) {
    impl = new TokensImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.settings.TokensService} object
   */
  public TokensAPI(TokensService mock) {
    impl = mock;
  }

  /**
   * Create a user token.
   *
   * <p>Creates and returns a token for a user. If this call is made through token authentication,
   * it creates a token with the same client ID as the authenticated token. If the user's token
   * quota is exceeded, this call returns an error **QUOTA_EXCEEDED**.
   *
   * @param request a {@link com.databricks.sdk.service.settings.CreateTokenRequest} object
   * @return a {@link com.databricks.sdk.service.settings.CreateTokenResponse} object
   */
  public CreateTokenResponse create(CreateTokenRequest request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param tokenId a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.settings.RevokeTokenRequest} object
   */
  public void delete(RevokeTokenRequest request) {
    impl.delete(request);
  }

  /**
   * List tokens.
   *
   * <p>Lists all the valid tokens for a user-workspace pair.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PublicTokenInfo> list() {
    return impl.list().getTokenInfos();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.settings.TokensService} object
   */
  public TokensService impl() {
    return impl;
  }
}
