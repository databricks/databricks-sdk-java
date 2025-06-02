package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client for interacting with an OAuth token endpoint.
 *
 * <p>This class provides a method to request an OAuth token from a token endpoint URL
 * discovered via the DatabricksConfig using the provided HTTP client and request parameters.
 * It handles the HTTP request and parses the JSON response into an {@link OAuthResponse} object.
 */
public final class TokenEndpointClient {
  private static final Logger LOG = LoggerFactory.getLogger(TokenEndpointClient.class);
  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  private final HttpClient httpClient;
  private final DatabricksConfig config;
  private OpenIDConnectEndpoints cachedOidcEndpoints;

  /**
   * Constructs a TokenEndpointClient using the provided DatabricksConfig.
   *
   * @param config The {@link DatabricksConfig} to resolve the OIDC endpoints and provide the HttpClient.
   * @throws NullPointerException if the config or the HttpClient from config is null.
   */
  public TokenEndpointClient(DatabricksConfig config) {
    this.config = Objects.requireNonNull(config, "DatabricksConfig cannot be null");
    this.httpClient = Objects.requireNonNull(config.getHttpClient(), "HttpClient from config cannot be null");
  }

  private synchronized OpenIDConnectEndpoints getCachedOidcEndpoints() throws IOException {
    if (cachedOidcEndpoints == null) {
      cachedOidcEndpoints = Objects.requireNonNull(config.getOidcEndpoints(), "OIDC endpoints cannot be null");
    }
    return cachedOidcEndpoints;
  }

  /**
   * Requests an OAuth token from the resolved token endpoint at request-time (cached after first fetch).
   *
   * @param params A map of parameters to include in the token request.
   * @return An {@link OAuthResponse} containing the token information.
   * @throws DatabricksException if an error occurs during the token request or response parsing.
   * @throws NullPointerException if the parameters map is null.
   */
  public OAuthResponse requestToken(Map<String, String> params) throws DatabricksException {
    Objects.requireNonNull(params, "Request parameters map cannot be null");
    String tokenEndpointUrl;
    try {
      OpenIDConnectEndpoints oidcEndpoints = getCachedOidcEndpoints();
      tokenEndpointUrl = Objects.requireNonNull(oidcEndpoints.getTokenEndpoint(), "Token endpoint cannot be null");
    } catch (IOException e) {
      throw new DatabricksException("Failed to resolve OIDC endpoints: " + e.getMessage(), e);
    }

    Response rawResponse;
    try {
      LOG.debug("Requesting token from endpoint: {}", tokenEndpointUrl);
      rawResponse = httpClient.execute(new FormRequest(tokenEndpointUrl, params));
    } catch (IOException e) {
      LOG.error("Failed to request token from {}: {}", tokenEndpointUrl, e.getMessage(), e);
      throw new DatabricksException(
          String.format("Failed to request token from %s: %s", tokenEndpointUrl, e.getMessage()),
          e);
    }

    OAuthResponse response;
    try {
      response = OBJECT_MAPPER.readValue(rawResponse.getBody(), OAuthResponse.class);
    } catch (IOException e) {
      LOG.error(
          "Failed to parse OAuth response from token endpoint {}: {}",
          tokenEndpointUrl,
          e.getMessage(),
          e);
      throw new DatabricksException(
          String.format(
              "Failed to parse OAuth response from token endpoint %s: %s",
              tokenEndpointUrl, e.getMessage()),
          e);
    }

    if (response.getErrorCode() != null) {
      String errorSummary =
          response.getErrorSummary() != null ? response.getErrorSummary() : "No summary provided.";
      LOG.error(
          "Token request to {} failed with error: {} - {}",
          tokenEndpointUrl,
          response.getErrorCode(),
          errorSummary);
      throw new DatabricksException(
          String.format(
              "Token request failed with error: %s - %s", response.getErrorCode(), errorSummary));
    }
    LOG.debug("Successfully obtained token response from {}", tokenEndpointUrl);
    return response;
  }
}
