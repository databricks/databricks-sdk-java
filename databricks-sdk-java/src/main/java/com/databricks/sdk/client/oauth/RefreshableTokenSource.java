package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.DatabricksException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Map;

import com.databricks.sdk.client.http.FormRequest;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;

public abstract class RefreshableTokenSource implements TokenSource {
  private HttpClient hc;

  private Token token;

  public RefreshableTokenSource(HttpClient hc) {
    this.hc = hc;
  }

  protected Token retrieveToken(
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
      case HEADER:
        String authHeaderValue =
            "Basic " + Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());
        headers.put(HttpHeaders.AUTHORIZATION, authHeaderValue);

    }
    FormRequest req = new FormRequest(tokenUrl, params);
    req.withHeaders(headers);
    try {
      Response rawResp = hc.execute(req);
      OAuthResponse resp = new ObjectMapper().readValue(rawResp.getBody(), OAuthResponse.class);
      if (resp.getErrorCode() != null) {
        throw new IllegalArgumentException(resp.getErrorCode() + ": " + resp.getErrorSummary());
      }
      LocalDateTime expiry = LocalDateTime.now().plus(resp.getExpiresIn(), ChronoUnit.SECONDS);
      return new Token(resp.getAccessToken(), resp.getRefreshToken(), resp.getTokenType(), expiry);
    } catch (Exception e) {
      throw new DatabricksException("Failed to refresh credentials: " + e.getMessage(), e);
    }
  }

  abstract Token refresh();

  @Override
  public synchronized Token getToken() {
    if (token == null || !token.isValid()) {
      token = refresh();
    }
    return token;
  }
}
