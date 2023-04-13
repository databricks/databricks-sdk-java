package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.DatabricksException;
import com.databricks.sdk.client.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public abstract class RefreshableTokenSource implements TokenSource {
  private HttpClient hc;

  private Token token;

  public RefreshableTokenSource(HttpClient hc) {
    this.hc = hc;
  }

  public Token retrieveToken(
      String clientId,
      String clientSecret,
      String tokenUrl,
      Map<String, String> params,
      boolean useParams,
      boolean useHeader,
      Map<String, String> headers) {
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
    try {
      List<NameValuePair> formParams = new ArrayList<>();
      for (Map.Entry<String, String> e : params.entrySet()) {
        formParams.add(new BasicNameValuePair(e.getKey(), e.getValue()));
      }
      UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams);

      post.setEntity(entity);
      for (Map.Entry<String, String> entry : headers.entrySet()) {
        post.setHeader(entry.getKey(), entry.getValue());
      }
      OAuthResponse resp = hc.execute(post, OAuthResponse.class);
      if (resp.getErrorCode() != null) {
        throw new IllegalArgumentException(resp.getErrorCode() + ": " + resp.getErrorSummary());
      }
      LocalDateTime expiry = LocalDateTime.now().plus(resp.getExpiresIn(), ChronoUnit.SECONDS);
      return new Token(
          resp.getAccessToken(), resp.getRefreshToken(), resp.getTokenType(), expiry);
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
