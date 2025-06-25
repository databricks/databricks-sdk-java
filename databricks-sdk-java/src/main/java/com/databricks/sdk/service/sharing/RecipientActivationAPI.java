// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Recipient Activation API is only applicable in the open sharing model where the recipient
 * object has the authentication type of `TOKEN`. The data recipient follows the activation link
 * shared by the data provider to download the credential file that includes the access token. The
 * recipient will then use the credential file to establish a secure connection with the provider to
 * receive the shared data.
 *
 * <p>Note that you can download the credential file only once. Recipients should treat the
 * downloaded credential as a secret and must not share it outside of their organization.
 */
@Generated
public class RecipientActivationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RecipientActivationAPI.class);

  private final RecipientActivationService impl;

  /** Regular-use constructor */
  public RecipientActivationAPI(ApiClient apiClient) {
    impl = new RecipientActivationImpl(apiClient);
  }

  /** Constructor for mocks */
  public RecipientActivationAPI(RecipientActivationService mock) {
    impl = mock;
  }

  public void getActivationUrlInfo(String activationUrl) {
    getActivationUrlInfo(new GetActivationUrlInfoRequest().setActivationUrl(activationUrl));
  }

  /** Gets an activation URL for a share. */
  public void getActivationUrlInfo(GetActivationUrlInfoRequest request) {
    impl.getActivationUrlInfo(request);
  }

  public RetrieveTokenResponse retrieveToken(String activationUrl) {
    return retrieveToken(new RetrieveTokenRequest().setActivationUrl(activationUrl));
  }

  /**
   * Retrieve access token with an activation url. This is a public API without any authentication.
   */
  public RetrieveTokenResponse retrieveToken(RetrieveTokenRequest request) {
    return impl.retrieveToken(request);
  }

  public RecipientActivationService impl() {
    return impl;
  }
}
