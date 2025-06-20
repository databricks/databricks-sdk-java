package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.http.HttpClient;
import com.google.auto.value.AutoValue;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Manages and provides Databricks data plane tokens. This class is responsible
 * for acquiring and caching OAuth tokens that are specific to a particular
 * Databricks data plane service endpoint and a set of authorization details.
 * It utilizes a {@link DatabricksOAuthTokenSource} for obtaining control plane
 * tokens, which may then be exchanged or used to authorize requests for data
 * plane tokens. Cached {@link EndpointTokenSource} instances are used to
 * efficiently reuse tokens for repeated requests to the same endpoint with the
 * same authorization context.
 */
public class DataPlaneTokenSource {
  private final HttpClient httpClient;
  private final TokenSource cpTokenSource;
  private final String host;
  private final ConcurrentHashMap<TokenSourceKey, EndpointTokenSource> sourcesCache;

  /**
   * Caching key for {@link EndpointTokenSource}, based on endpoint and 
   * authorization details. This is a value object that uniquely identifies 
   * a token source configuration.
   */
  @AutoValue
  static abstract class TokenSourceKey {
    abstract String endpoint();
    abstract String authDetails();

    static TokenSourceKey create(String endpoint, String authDetails) {
      return new AutoValue_DataPlaneTokenSource_TokenSourceKey(endpoint, authDetails);
    }
  }

  /**
   * Constructs a DataPlaneTokenSource.
   *
   * @param httpClient The {@link HttpClient} for token requests.
   * @param cpTokenSource The {@link TokenSource} for control plane tokens.
   * @param host The host for the token exchange request.
   * @throws NullPointerException if any parameter is null.
   * @throws IllegalArgumentException if the host is empty.
   */
  public DataPlaneTokenSource(HttpClient httpClient, TokenSource cpTokenSource, String host) {
    this.httpClient = Objects.requireNonNull(httpClient, "HTTP client cannot be null");
    this.cpTokenSource =
        Objects.requireNonNull(cpTokenSource, "Control plane token source cannot be null");
    this.host = Objects.requireNonNull(host, "Host cannot be null");

    if (host.isEmpty()) {
      throw new IllegalArgumentException("Host cannot be empty");
    }
    this.sourcesCache = new ConcurrentHashMap<>();
  }

  /**
   * Retrieves a token for the specified endpoint and authorization details. It uses a cached {@link
   * EndpointTokenSource} if available, otherwise creates and caches a new one.
   *
   * @param endpoint The target data plane service endpoint.
   * @param authDetails Authorization details for the endpoint.
   * @return The dataplane {@link Token}.
   * @throws NullPointerException if either parameter is null.
   * @throws IllegalArgumentException if either parameter is empty.
   * @throws DatabricksException if the token request fails.
   */
  public Token getToken(String endpoint, String authDetails) {
    Objects.requireNonNull(endpoint, "Data plane endpoint URL cannot be null");
    Objects.requireNonNull(authDetails, "Authorization details cannot be null");

    if (endpoint.isEmpty()) {
      throw new IllegalArgumentException("Data plane endpoint URL cannot be empty");
    }
    if (authDetails.isEmpty()) {
      throw new IllegalArgumentException("Authorization details cannot be empty");
    }

    TokenSourceKey key = TokenSourceKey.create(endpoint, authDetails);

    EndpointTokenSource specificSource =
        sourcesCache.computeIfAbsent(
            key,
            k ->
                new EndpointTokenSource(
                    this.cpTokenSource, k.authDetails(), this.httpClient, this.host));

    return specificSource.getToken();
  }
}
