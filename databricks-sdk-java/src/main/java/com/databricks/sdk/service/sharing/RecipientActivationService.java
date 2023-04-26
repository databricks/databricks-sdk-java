// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

/**
 * Databricks Recipient Activation REST API
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface RecipientActivationService {
  /**
   * Get a share activation URL.
   *
   * <p>Gets an activation URL for a share.
   *
   * @param getActivationUrlInfoRequest a {@link com.databricks.sdk.service.sharing.GetActivationUrlInfoRequest} object
   */
  void getActivationUrlInfo(GetActivationUrlInfoRequest getActivationUrlInfoRequest);

  /**
   * Get an access token.
   *
   * <p>Retrieve access token with an activation url. This is a public API without any
   * authentication.
   *
   * @param retrieveTokenRequest a {@link com.databricks.sdk.service.sharing.RetrieveTokenRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.RetrieveTokenResponse} object
   */
  RetrieveTokenResponse retrieveToken(RetrieveTokenRequest retrieveTokenRequest);
}
