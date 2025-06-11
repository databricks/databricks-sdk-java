package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.time.Instant;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import org.apache.http.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client for interacting with an OAuth token endpoint.
 *
 * <p>This class provides a method to request an OAuth token from a specified token endpoint URL
 * using the provided HTTP client and request parameters. It handles the HTTP request and parses the
 * JSON response into an {@link OAuthResponse} object.
 */
public final class TokenEndpointClient {
  private static final Logger LOG = LoggerFactory.getLogger(TokenEndpointClient.class);
  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  private TokenEndpointClient() {}

  /**
   * Requests an OAuth token from the specified token endpoint.
   *
   * @param httpClient The {@link HttpClient} to use for making the request.
   * @param tokenEndpointUrl The URL of the token endpoint.
   * @param params A map of parameters to include in the token request.
   * @return An {@link OAuthResponse} containing the token information.
   * @throws DatabricksException if an error occurs during the token request or response parsing.
   * @throws IllegalArgumentException if the token endpoint URL is empty.
   * @throws NullPointerException if any of the parameters are null.
   */
  public static OAuthResponse requestToken(
      HttpClient httpClient, String tokenEndpointUrl, Map<String, String> params)
      throws DatabricksException {
    Objects.requireNonNull(httpClient, "HttpClient cannot be null");
    Objects.requireNonNull(params, "Request parameters map cannot be null");
    Objects.requireNonNull(tokenEndpointUrl, "Token endpoint URL cannot be null");

    if (tokenEndpointUrl.isEmpty()) {
      throw new IllegalArgumentException("Token endpoint URL cannot be empty");
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

  /**
   * Helper method implementing OAuth token refresh.
   *
   * @param hc The {@link HttpClient} to use for making the request.
   * @param clientId The client ID to authenticate with.
   * @param clientSecret The client secret to authenticate with.
   * @param tokenUrl The authorization URL for fetching tokens.
   * @param params Additional request parameters.
   * @param headers Additional headers.
   * @param position The position of the authentication parameters in the request.
   * @return The newly fetched Token.
   * @throws DatabricksException if the refresh fails.
   * @throws IllegalArgumentException if the OAuth response contains an error.
   */
  public static Token retrieveToken(
      HttpClient hc,
      String clientId,
      String clientSecret,
      String tokenUrl,
      Map<String, String> params,
      Map<String, String> headers,
      AuthParameterPosition position) {
    switch (position) {
      case BODY:
        if (clientId != null) {
          params.put("client_id", clientId);
        }
        if (clientSecret != null) {
          params.put("client_secret", clientSecret);
        }
        break;
      case HEADER:
        String authHeaderValue =
            "Basic "
                + Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());
        headers.put(HttpHeaders.AUTHORIZATION, authHeaderValue);
        break;
    }
    headers.put("Content-Type", "application/x-www-form-urlencoded");
    Request req = new Request("POST", tokenUrl, FormRequest.wrapValuesInList(params));
    req.withHeaders(headers);
    try {
      ApiClient apiClient = new ApiClient.Builder().withHttpClient(hc).build();
      OAuthResponse resp = apiClient.execute(req, OAuthResponse.class);
      if (resp.getErrorCode() != null) {
        throw new IllegalArgumentException(resp.getErrorCode() + ": " + resp.getErrorSummary());
      }
      Instant expiry = Instant.now().plusSeconds(resp.getExpiresIn());
      return new Token(resp.getAccessToken(), resp.getTokenType(), resp.getRefreshToken(), expiry);
    } catch (Exception e) {
      throw new DatabricksException("Failed to refresh credentials: " + e.getMessage(), e);
    }
  }
}
