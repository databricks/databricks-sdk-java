// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

/**
 * Enables administrators to get all tokens and delete tokens for other users. Admins can either get
 * every token, get a specific token by ID, or get all tokens for a particular user.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface TokenManagementService {
  /**
   * Create on-behalf token.
   *
   * <p>Creates a token on behalf of a service principal.
   *
   * @param createOboTokenRequest a {@link com.databricks.sdk.service.settings.CreateOboTokenRequest} object
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenResponse} object
   */
  CreateOboTokenResponse createOboToken(CreateOboTokenRequest createOboTokenRequest);

  /**
   * Delete a token.
   *
   * <p>Deletes a token, specified by its ID.
   *
   * @param deleteTokenManagementRequest a {@link com.databricks.sdk.service.settings.DeleteTokenManagementRequest} object
   */
  void delete(DeleteTokenManagementRequest deleteTokenManagementRequest);

  /**
   * Get token info.
   *
   * <p>Gets information about a token, specified by its ID.
   *
   * @param getTokenManagementRequest a {@link com.databricks.sdk.service.settings.GetTokenManagementRequest} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  TokenInfo get(GetTokenManagementRequest getTokenManagementRequest);

  /**
   * List all tokens.
   *
   * <p>Lists all tokens associated with the specified workspace or user.
   *
   * @param listTokenManagementRequest a {@link com.databricks.sdk.service.settings.ListTokenManagementRequest} object
   * @return a {@link com.databricks.sdk.service.settings.ListTokensResponse} object
   */
  ListTokensResponse list(ListTokenManagementRequest listTokenManagementRequest);
}
