// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

/**
 * The Token API allows you to create, list, and revoke tokens that can be used to authenticate and
 * access Databricks REST APIs.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface TokensService {
  /**
   * Create a user token.
   *
   * <p>Creates and returns a token for a user. If this call is made through token authentication,
   * it creates a token with the same client ID as the authenticated token. If the user's token
   * quota is exceeded, this call returns an error **QUOTA_EXCEEDED**.
   *
   * @param createTokenRequest a {@link com.databricks.sdk.service.settings.CreateTokenRequest} object
   * @return a {@link com.databricks.sdk.service.settings.CreateTokenResponse} object
   */
  CreateTokenResponse create(CreateTokenRequest createTokenRequest);

  /**
   * Revoke token.
   *
   * <p>Revokes an access token.
   *
   * <p>If a token with the specified ID is not valid, this call returns an error
   * **RESOURCE_DOES_NOT_EXIST**.
   *
   * @param revokeTokenRequest a {@link com.databricks.sdk.service.settings.RevokeTokenRequest} object
   */
  void delete(RevokeTokenRequest revokeTokenRequest);

  /**
   * List tokens.
   *
   * <p>Lists all the valid tokens for a user-workspace pair.
   *
   * @return a {@link com.databricks.sdk.service.settings.ListTokensResponse} object
   */
  ListTokensResponse list();
}
