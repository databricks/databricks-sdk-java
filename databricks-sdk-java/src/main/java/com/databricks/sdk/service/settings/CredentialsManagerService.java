// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Credentials manager interacts with with Identity Providers to to perform token exchanges using
 * stored credentials and refresh tokens.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CredentialsManagerService {
  /**
   * Exchange token.
   *
   * <p>Exchange tokens with an Identity Provider to get a new access token. It allowes specifying
   * scopes to determine token permissions.
   */
  ExchangeTokenResponse exchangeToken(ExchangeTokenRequest exchangeTokenRequest);
}
