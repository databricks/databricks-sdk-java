// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;

/**
 * The Recipient Activation API is only applicable in the open sharing model where the recipient
 * object has the authentication type of `TOKEN`. The data recipient follows the activation link
 * shared by the data provider to download the credential file that includes the access token. The
 * recipient will then use the credential file to establish a secure connection with the provider to
 * receive the shared data.
 *
 * <p>Note that you can download the credential file only once. Recipients should treat the
 * downloaded credential as a secret and must not share it outside of their organization.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface RecipientActivationService {
  /** Gets an activation URL for a share. */
  void getActivationUrlInfo(GetActivationUrlInfoRequest getActivationUrlInfoRequest);

  /**
   * Retrieve access token with an activation url. This is a public API without any authentication.
   */
  RetrieveTokenResponse retrieveToken(RetrieveTokenRequest retrieveTokenRequest);
}
