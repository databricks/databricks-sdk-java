package com.databricks.sdk.client.oauth;

/**
 * A resource which can produce an OAuth token.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface TokenSource {
  /**
   * <p>getToken.</p>
   *
   * @return a {@link com.databricks.sdk.client.oauth.Token} object
   */
  Token getToken();
}
