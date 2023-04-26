// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Databricks Recipient Activation REST API
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RecipientActivationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RecipientActivationAPI.class);

  private final RecipientActivationService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public RecipientActivationAPI(ApiClient apiClient) {
    impl = new RecipientActivationImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sharing.RecipientActivationService} object
   */
  public RecipientActivationAPI(RecipientActivationService mock) {
    impl = mock;
  }

  /**
   * <p>getActivationUrlInfo.</p>
   *
   * @param activationUrl a {@link java.lang.String} object
   */
  public void getActivationUrlInfo(String activationUrl) {
    getActivationUrlInfo(new GetActivationUrlInfoRequest().setActivationUrl(activationUrl));
  }

  /**
   * Get a share activation URL.
   *
   * <p>Gets an activation URL for a share.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.GetActivationUrlInfoRequest} object
   */
  public void getActivationUrlInfo(GetActivationUrlInfoRequest request) {
    impl.getActivationUrlInfo(request);
  }

  /**
   * <p>retrieveToken.</p>
   *
   * @param activationUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RetrieveTokenResponse} object
   */
  public RetrieveTokenResponse retrieveToken(String activationUrl) {
    return retrieveToken(new RetrieveTokenRequest().setActivationUrl(activationUrl));
  }

  /**
   * Get an access token.
   *
   * <p>Retrieve access token with an activation url. This is a public API without any
   * authentication.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.RetrieveTokenRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.RetrieveTokenResponse} object
   */
  public RetrieveTokenResponse retrieveToken(RetrieveTokenRequest request) {
    return impl.retrieveToken(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.RecipientActivationService} object
   */
  public RecipientActivationService impl() {
    return impl;
  }
}
