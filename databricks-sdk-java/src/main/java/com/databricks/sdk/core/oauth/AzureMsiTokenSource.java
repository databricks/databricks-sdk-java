package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.time.Instant;

/**
 * A {@link TokenSource} that fetches OAuth tokens from the Azure Instance Metadata Service (IMDS)
 * endpoint for Managed Service Identity (MSI) authentication.
 *
 * <p>This token source makes HTTP GET requests to the well-known IMDS endpoint at {@code
 * http://169.254.169.254/metadata/identity/oauth2/token} to obtain access tokens for the specified
 * Azure resource.
 */
@InternalApi
public class AzureMsiTokenSource implements TokenSource {

  private static final String IMDS_ENDPOINT =
      "http://169.254.169.254/metadata/identity/oauth2/token";

  private final HttpClient httpClient;
  private final String resource;
  private final String clientId;
  private final ObjectMapper mapper = new ObjectMapper();

  /** Response structure from the Azure IMDS token endpoint. */
  @JsonIgnoreProperties(ignoreUnknown = true)
  static class MsiTokenResponse {
    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_on")
    private String expiresOn;

    Token toToken() {
      if (accessToken == null || accessToken.isEmpty()) {
        throw new DatabricksException("MSI token response missing or empty 'access_token' field");
      }
      if (tokenType == null || tokenType.isEmpty()) {
        throw new DatabricksException("MSI token response missing or empty 'token_type' field");
      }
      if (expiresOn == null || expiresOn.isEmpty()) {
        throw new DatabricksException("MSI token response missing 'expires_on' field");
      }
      long epoch;
      try {
        epoch = Long.parseLong(expiresOn);
      } catch (NumberFormatException e) {
        throw new DatabricksException(
            "Invalid 'expires_on' value in MSI token response: " + expiresOn, e);
      }
      return new Token(accessToken, tokenType, Instant.ofEpochSecond(epoch));
    }
  }

  /**
   * Creates a new AzureMsiTokenSource.
   *
   * @param httpClient The HTTP client to use for requests to the IMDS endpoint.
   * @param resource The Azure resource for which to obtain an access token.
   * @param clientId The client ID of the managed identity to use. May be null for system-assigned
   *     identities.
   */
  public AzureMsiTokenSource(HttpClient httpClient, String resource, String clientId) {
    this.httpClient = httpClient;
    this.resource = resource;
    this.clientId = clientId;
  }

  @Override
  public Token getToken() {
    Request req = new Request("GET", IMDS_ENDPOINT);
    req.withQueryParam("api-version", "2018-02-01");
    req.withQueryParam("resource", resource);
    if (clientId != null && !clientId.isEmpty()) {
      req.withQueryParam("client_id", clientId);
    }
    req.withHeader("Metadata", "true");

    Response resp;
    try {
      resp = httpClient.execute(req);
    } catch (IOException e) {
      throw new DatabricksException(
          "Failed to request MSI token from IMDS endpoint: " + e.getMessage(), e);
    }

    if (resp.getStatusCode() != 200) {
      throw new DatabricksException(
          "Failed to request MSI token: status code "
              + resp.getStatusCode()
              + ", response body: "
              + resp.getDebugBody());
    }

    try {
      MsiTokenResponse msiToken = mapper.readValue(resp.getBody(), MsiTokenResponse.class);
      return msiToken.toToken();
    } catch (IOException e) {
      throw new DatabricksException("Failed to parse MSI token response: " + e.getMessage(), e);
    }
  }
}
