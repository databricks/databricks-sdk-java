// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Enables administrators to get all tokens and delete tokens for other users. Admins can either get
 * every token, get a specific token by ID, or get all tokens for a particular user.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TokenManagementAPI {
  private static final Logger LOG = LoggerFactory.getLogger(TokenManagementAPI.class);

  private final TokenManagementService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public TokenManagementAPI(ApiClient apiClient) {
    impl = new TokenManagementImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.settings.TokenManagementService} object
   */
  public TokenManagementAPI(TokenManagementService mock) {
    impl = mock;
  }

  /**
   * <p>createOboToken.</p>
   *
   * @param applicationId a {@link java.lang.String} object
   * @param lifetimeSeconds a long
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenResponse} object
   */
  public CreateOboTokenResponse createOboToken(String applicationId, long lifetimeSeconds) {
    return createOboToken(
        new CreateOboTokenRequest()
            .setApplicationId(applicationId)
            .setLifetimeSeconds(lifetimeSeconds));
  }

  /**
   * Create on-behalf token.
   *
   * <p>Creates a token on behalf of a service principal.
   *
   * @param request a {@link com.databricks.sdk.service.settings.CreateOboTokenRequest} object
   * @return a {@link com.databricks.sdk.service.settings.CreateOboTokenResponse} object
   */
  public CreateOboTokenResponse createOboToken(CreateOboTokenRequest request) {
    return impl.createOboToken(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param tokenId a {@link java.lang.String} object
   */
  public void delete(String tokenId) {
    delete(new DeleteTokenManagementRequest().setTokenId(tokenId));
  }

  /**
   * Delete a token.
   *
   * <p>Deletes a token, specified by its ID.
   *
   * @param request a {@link com.databricks.sdk.service.settings.DeleteTokenManagementRequest} object
   */
  public void delete(DeleteTokenManagementRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param tokenId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo get(String tokenId) {
    return get(new GetTokenManagementRequest().setTokenId(tokenId));
  }

  /**
   * Get token info.
   *
   * <p>Gets information about a token, specified by its ID.
   *
   * @param request a {@link com.databricks.sdk.service.settings.GetTokenManagementRequest} object
   * @return a {@link com.databricks.sdk.service.settings.TokenInfo} object
   */
  public TokenInfo get(GetTokenManagementRequest request) {
    return impl.get(request);
  }

  /**
   * List all tokens.
   *
   * <p>Lists all tokens associated with the specified workspace or user.
   *
   * @param request a {@link com.databricks.sdk.service.settings.ListTokenManagementRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PublicTokenInfo> list(ListTokenManagementRequest request) {
    return impl.list(request).getTokenInfos();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.settings.TokenManagementService} object
   */
  public TokenManagementService impl() {
    return impl;
  }
}
