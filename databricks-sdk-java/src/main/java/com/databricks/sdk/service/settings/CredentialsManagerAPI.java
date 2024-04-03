// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Credentials manager interacts with with Identity Providers to to perform token exchanges using
 * stored credentials and refresh tokens.
 */
@Generated
public class CredentialsManagerAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CredentialsManagerAPI.class);

  private final CredentialsManagerService impl;

  /** Regular-use constructor */
  public CredentialsManagerAPI(ApiClient apiClient) {
    impl = new CredentialsManagerImpl(apiClient);
  }

  /** Constructor for mocks */
  public CredentialsManagerAPI(CredentialsManagerService mock) {
    impl = mock;
  }

  public ExchangeTokenResponse exchangeToken(
      PartitionId partitionId, Collection<TokenType> tokenType, Collection<String> scopes) {
    return exchangeToken(
        new ExchangeTokenRequest()
            .setPartitionId(partitionId)
            .setTokenType(tokenType)
            .setScopes(scopes));
  }

  /**
   * Exchange token.
   *
   * <p>Exchange tokens with an Identity Provider to get a new access token. It allows specifying
   * scopes to determine token permissions.
   */
  public ExchangeTokenResponse exchangeToken(ExchangeTokenRequest request) {
    return impl.exchangeToken(request);
  }

  public CredentialsManagerService impl() {
    return impl;
  }
}
