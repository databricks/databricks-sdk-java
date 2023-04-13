package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Token {
  private String accessToken;
  private String tokenType;
  private String refreshToken;
  private LocalDateTime expiry;

  public Token(String accessToken, String tokenType, String refreshToken, LocalDateTime expiry) {
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.refreshToken = refreshToken;
    this.expiry = expiry;
  }

  public boolean isExpired() {
    if (expiry == null) {
      return false;
    }
    LocalDateTime potentiallyExpired = expiry.minus(10, ChronoUnit.SECONDS);
    LocalDateTime now = LocalDateTime.now();
    return potentiallyExpired.isBefore(now);
  }

  public boolean isValid() {
    return accessToken != null && !isExpired();
  }

  public Map<String, String> asDict() {
    Map<String, String> raw = new HashMap<>();
    raw.put("access_token", accessToken);
    raw.put("token_type", tokenType);
    if (expiry != null) {
      raw.put("expiry", expiry.toString());
    }
    if (refreshToken != null) {
      raw.put("refresh_token", refreshToken);
    }
    return raw;
  }

  public static Token fromDict(Map<String, Object> raw) {
    return new Token(
        (String) raw.get("access_token"),
        (String) raw.get("token_type"),
        (String) raw.get("refresh_token"),
        Optional.ofNullable((String) raw.get("expiry")).map(LocalDateTime::parse).orElse(null));
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public static Token retrieveToken(
      String clientId,
      String clientSecret,
      String tokenUrl,
      Map<String, String> params,
      boolean useParams,
      boolean useHeader,
      Map<String, String> headers) {
    System.out.println("Retrieving token for " + clientId);
    if (useParams) {
      if (clientId != null) {
        params.put("client_id", clientId);
      }
      if (clientSecret != null) {
        params.put("client_secret", clientSecret);
      }
    }
    if (useHeader) {
      String authHeaderValue =
          "Basic " + Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());
      headers.put(HttpHeaders.AUTHORIZATION, authHeaderValue);
    }
    HttpPost post = new HttpPost(tokenUrl);
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      StringEntity stringEntity =
          new StringEntity(objectMapper.writeValueAsString(params), ContentType.APPLICATION_JSON);
      post.setEntity(stringEntity);
      for (Map.Entry<String, String> entry : headers.entrySet()) {
        post.setHeader(entry.getKey(), entry.getValue());
      }
      try (CloseableHttpClient httpClient = HttpClients.createDefault();
          CloseableHttpResponse response = httpClient.execute(post)) {
        int statusCode = response.getStatusLine().getStatusCode();
        String responseBody = EntityUtils.toString(response.getEntity());
        if (statusCode != HttpStatus.SC_OK) {
          OAuthErrorResponse err = objectMapper.readValue(responseBody, OAuthErrorResponse.class);
          throw new IllegalArgumentException(err.getErrorCode() + ": " + err.getErrorSummary());
        }
        OAuthTokenResponse resp = objectMapper.readValue(responseBody, OAuthTokenResponse.class);
        LocalDateTime expiry = LocalDateTime.now().plus(resp.getExpiresIn(), ChronoUnit.SECONDS);
        return new Token(
            resp.getAccessToken(), resp.getRefreshToken(), resp.getTokenType(), expiry);
      }
    } catch (Exception e) {
      throw new UnsupportedOperationException("Not supported yet: " + e.getMessage(), e);
    }
  }
}
