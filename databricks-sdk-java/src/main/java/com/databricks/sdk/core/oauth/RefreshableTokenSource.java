package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.FormRequest;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Map;
import org.apache.http.HttpHeaders;

/**
 * An OAuth TokenSource which can be refreshed.
 *
 * <p>Calls to getToken() will first check if the token is still valid (currently defined by having
 * at least 10 seconds until expiry). If not, refresh() is called first to refresh the token.
 */
public abstract class RefreshableTokenSource implements TokenSource {
  protected Token token;

  public RefreshableTokenSource() {}

  public RefreshableTokenSource(Token token) {
    this.token = token;
  }

  /**
   * Helper method implementing OAuth token refresh.
   *
   * @param clientId The client ID to authenticate with.
   * @param clientSecret The client secret to authenticate with.
   * @param tokenUrl The authorization URL for fetching tokens.
   * @param params Additional request parameters.
   * @param headers Additional headers.
   * @param position The position of the authentication parameters in the request.
   * @return The newly fetched Token.
   */
  protected static Token retrieveToken(
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
      LocalDateTime expiry = LocalDateTime.now().plus(resp.getExpiresIn(), ChronoUnit.SECONDS);
      return new Token(resp.getAccessToken(), resp.getTokenType(), resp.getRefreshToken(), expiry);
    } catch (Exception e) {
      throw new DatabricksException("Failed to refresh credentials: " + e.getMessage(), e);
    }
  }

  protected abstract Token refresh();

  public synchronized Token getToken() {
    if (token == null || !token.isValid()) {
      token = refresh();
    }
    return token;
  }
}
