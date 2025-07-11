// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The Token API allows you to create, list, and revoke tokens that can be used to authenticate and
 * access Databricks REST APIs.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface TokensService {
  /**
   * Creates and returns a token for a user. If this call is made through token authentication, it
   * creates a token with the same client ID as the authenticated token. If the user's token quota
   * is exceeded, this call returns an error **QUOTA_EXCEEDED**.
   */
  CreateTokenResponse create(CreateTokenRequest createTokenRequest);

  /**
   * Revokes an access token.
   *
   * <p>If a token with the specified ID is not valid, this call returns an error
   * **RESOURCE_DOES_NOT_EXIST**.
   */
  void delete(RevokeTokenRequest revokeTokenRequest);

  /** Lists all the valid tokens for a user-workspace pair. */
  ListPublicTokensResponse list();
}
