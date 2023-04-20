// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

/**
 * Databricks Recipient Activation REST API
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface RecipientActivationService {
  /**
   * Get a share activation URL.
   *
   * <p>Gets an activation URL for a share.
   */
  void getActivationUrlInfo(GetActivationUrlInfoRequest getActivationUrlInfoRequest);

  /**
   * Get an access token.
   *
   * <p>Retrieve access token with an activation url. This is a public API without any
   * authentication.
   */
  RetrieveTokenResponse retrieveToken(RetrieveTokenRequest retrieveTokenRequest);
}
