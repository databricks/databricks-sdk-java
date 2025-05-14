package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
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
   * @throws IllegalArgumentException if any of the required parameters are null or empty.
   */
  public static OAuthResponse requestToken(
      HttpClient httpClient, String tokenEndpointUrl, Map<String, String> params)
      throws DatabricksException {
    if (httpClient == null) {
      LOG.error("HttpClient cannot be null for requestToken");
      throw new IllegalArgumentException("HttpClient cannot be null");
    }
    if (tokenEndpointUrl == null || tokenEndpointUrl.isEmpty()) {
      LOG.error("Token endpoint URL cannot be null or empty");
      throw new IllegalArgumentException("Token endpoint URL cannot be null or empty");
    }
    if (params == null) {
      LOG.error("Request parameters map cannot be null");
      throw new IllegalArgumentException("Request parameters map cannot be null");
    }

    Response rawResponse;
    try {
      LOG.debug("Requesting token from endpoint: {} via static client method", tokenEndpointUrl);
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
