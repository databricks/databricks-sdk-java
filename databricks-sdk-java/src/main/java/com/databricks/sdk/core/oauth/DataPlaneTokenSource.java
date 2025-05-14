package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.http.HttpClient;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Manages and provides Databricks data plane tokens. This class is responsible for acquiring and
 * caching OAuth tokens that are specific to a particular Databricks data plane service endpoint and
 * a set of authorization details. It utilizes a {@link DatabricksOAuthTokenSource} for obtaining
 * control plane tokens, which may then be exchanged or used to authorize requests for data plane
 * tokens. Cached {@link EndpointTokenSource} instances are used to efficiently reuse tokens for
 * repeated requests to the same endpoint with the same authorization context.
 */
public class DataPlaneTokenSource {
  private final HttpClient httpClient;
  private final DatabricksOAuthTokenSource cpTokenSource;
  private ConcurrentHashMap<TokenSourceKey, EndpointTokenSource> sourcesCache;

  /** Caching key for {@link EndpointTokenSource}, based on endpoint and authorization details. */
  private static final class TokenSourceKey {
    /** The target service endpoint URL. */
    private final String endpoint;
    /** Specific authorization details (e.g., scope) for the endpoint. */
    private final String authDetails;

    /**
     * Constructs a TokenSourceKey.
     *
     * @param endpoint The target service endpoint URL.
     * @param authDetails Specific authorization details.
     */
    public TokenSourceKey(String endpoint, String authDetails) {
      this.endpoint = endpoint;
      this.authDetails = authDetails;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      TokenSourceKey that = (TokenSourceKey) o;
      return Objects.equals(endpoint, that.endpoint)
          && Objects.equals(authDetails, that.authDetails);
    }

    @Override
    public int hashCode() {
      return Objects.hash(endpoint, authDetails);
    }
  }

  /**
   * Constructs a DataPlaneTokenSource.
   *
   * @param httpClient The {@link HttpClient} for token requests.
   * @param cpTokenSource The {@link DatabricksOAuthTokenSource} for control plane tokens.
   */
  public DataPlaneTokenSource(HttpClient httpClient, DatabricksOAuthTokenSource cpTokenSource) {
    this.httpClient = httpClient;
    this.cpTokenSource = cpTokenSource;
    this.sourcesCache = new ConcurrentHashMap<>();
  }

  /**
   * Retrieves a token for the specified endpoint and authorization details. It uses a cached {@link
   * EndpointTokenSource} if available, otherwise creates and caches a new one.
   *
   * @param endpoint The target data plane service endpoint.
   * @param authDetails Authorization details for the endpoint.
   * @return The dataplane {@link Token}.
   */
  public Token getToken(String endpoint, String authDetails) {
    TokenSourceKey key = new TokenSourceKey(endpoint, authDetails);

    EndpointTokenSource specificSource =
        sourcesCache.computeIfAbsent(
            key, k -> new EndpointTokenSource(this.cpTokenSource, k.authDetails, this.httpClient));

    return specificSource.getToken();
  }
}
