// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tokenmanagement;

/**
 * Enables administrators to get all tokens and delete tokens for other users. Admins can either get
 * every token, get a specific token by ID, or get all tokens for a particular user.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface TokenManagementService {
  /**
   * Create on-behalf token.
   *
   * <p>Creates a token on behalf of a service principal.
   */
  CreateOboTokenResponse createOboToken(CreateOboTokenRequest createOboTokenRequest);

  /**
   * Delete a token.
   *
   * <p>Deletes a token, specified by its ID.
   */
  void delete(Delete delete);

  /**
   * Get token info.
   *
   * <p>Gets information about a token, specified by its ID.
   */
  TokenInfo get(Get get);

  /**
   * List all tokens.
   *
   * <p>Lists all tokens associated with the specified workspace or user.
   */
  ListTokensResponse list(List list);
}
