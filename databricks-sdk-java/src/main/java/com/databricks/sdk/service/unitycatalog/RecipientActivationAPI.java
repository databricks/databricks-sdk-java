// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Databricks Delta Sharing: Recipient Activation REST API */
public class RecipientActivationAPI {
  private final RecipientActivationService impl;

  /** Regular-use constructor */
  public RecipientActivationAPI(ApiClient apiClient) {
    impl = new RecipientActivationImpl(apiClient);
  }

  /** Constructor for mocks */
  public RecipientActivationAPI(RecipientActivationService mock) {
    impl = mock;
  }

  /**
   * Get a share activation URL.
   *
   * <p>Gets an activation URL for a share.
   */
  public void getActivationUrlInfo(GetActivationUrlInfoRequest request) {
    impl.getActivationUrlInfo(request);
  }

  /**
   * Get an access token.
   *
   * <p>Retrieve access token with an activation url. This is a public API without any
   * authentication.
   */
  public RetrieveTokenResponse retrieveToken(RetrieveTokenRequest request) {
    return impl.retrieveToken(request);
  }

  public RecipientActivationService impl() {
    return impl;
  }
}
