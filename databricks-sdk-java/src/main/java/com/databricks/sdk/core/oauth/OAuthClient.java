package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.HttpClient;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Enables 3-legged OAuth2 flow with PKCE
 *
 * <p>For a regular web app running on a server, it's recommended to use the Authorization Code Flow
 * to obtain an Access Token and a Refresh Token. This method is considered safe because the Access
 * Token is transmitted directly to the server hosting the app, without passing through the user's
 * web browser and risking exposure.
 *
 * <p>To enhance the security of the Authorization Code Flow, the PKCE (Proof Key for Code Exchange)
 * mechanism can be employed. With PKCE, the calling application generates a secret called the Code
 * Verifier, which is verified by the authorization server. The app also creates a transform value
 * of the Code Verifier, called the Code Challenge, and sends it over HTTPS to obtain an
 * Authorization Code. By intercepting the Authorization Code, a malicious attacker cannot exchange
 * it for a token without possessing the Code Verifier.
 */
public class OAuthClient {
  public static class Builder {
    private String host;
    private String clientId;
    private String redirectUrl;
    private List<String> scopes;
    private String clientSecret;
    private HttpClient hc;

    public Builder() {}

    public Builder withHttpClient(HttpClient hc) {
      this.hc = hc;
      return this;
    }

    public Builder withHost(String host) {
      this.host = host;
      return this;
    }

    public Builder withClientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    public Builder withClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
      return this;
    }

    public Builder withRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }

    public Builder withScopes(List<String> scopes) {
      this.scopes = scopes;
      return this;
    }

    public OAuthClient build() throws IOException {
      return new OAuthClient(this);
    }
  }

  private final String clientId;
  private final String clientSecret;
  private final String host;
  private final String redirectUrl;
  private final List<String> scopes;
  private final String tokenUrl;
  private final String authUrl;
  private final HttpClient hc;
  private final SecureRandom random = new SecureRandom();
  private final boolean isAws;
  private final boolean isAzure;

  public OAuthClient(DatabricksConfig config) throws IOException {
    this(
        new Builder()
            .withHttpClient(config.getHttpClient())
            .withClientId(config.getClientId())
            .withClientSecret(config.getClientSecret())
            .withHost(config.getHost())
            .withRedirectUrl(
                config.getOAuthRedirectUrl() != null
                    ? config.getOAuthRedirectUrl()
                    : "http://localhost:8080/callback")
            .withScopes(config.getScopes()));
  }

  private OAuthClient(Builder b) throws IOException {
    this.clientId = Objects.requireNonNull(b.clientId);
    this.clientSecret = b.clientSecret;
    this.redirectUrl = Objects.requireNonNull(b.redirectUrl);
    this.host = b.host;
    this.hc = b.hc;

    DatabricksConfig config = new DatabricksConfig().setHost(b.host).resolve();
    OpenIDConnectEndpoints oidc = config.getOidcEndpoints();
    if (oidc == null) {
      throw new DatabricksException(b.host + " does not support OAuth");
    }

    this.isAws = config.isAws();
    this.isAzure = config.isAzure();
    this.tokenUrl = oidc.getTokenEndpoint();
    this.authUrl = oidc.getAuthorizationEndpoint();

    List<String> scopes = b.scopes;
    if (scopes == null) {
      scopes = Arrays.asList("offline_access", "clusters", "sql");
    }
    if (config.isAzure()) {
      scopes =
          Arrays.asList(
              config.getEffectiveAzureLoginAppId() + "/user_impersonation", "offline_access");
    }
    this.scopes = scopes;
  }

  public String getHost() {
    return host;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public String getRedirectUrl() {
    return redirectUrl;
  }

  public String getTokenUrl() {
    return tokenUrl;
  }

  public String getAuthUrl() {
    return authUrl;
  }

  public List<String> getScopes() {
    return scopes;
  }

  public boolean isAws() {
    return isAws;
  }

  public boolean isAzure() {
    return isAzure;
  }

  private String tokenUrlSafe(int byteLength) {
    byte[] bytes = new byte[byteLength];
    random.nextBytes(bytes);
    return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
  }

  private static byte[] sha256(byte[] input) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      return digest.digest(input);
    } catch (NoSuchAlgorithmException e) {
      throw new DatabricksException("SHA-256 algorithm not found", e);
    }
  }

  private static String urlEncode(String urlBase, Map<String, String> params) {
    String queryParams =
        params.entrySet().stream()
            .map(entry -> entry.getKey() + "=" + entry.getValue())
            .collect(Collectors.joining("&"));
    return urlBase + "?" + queryParams.replaceAll(" ", "%20");
  }

  public Consent initiateConsent() throws MalformedURLException {
    String state = tokenUrlSafe(16);
    String verifier = tokenUrlSafe(32);
    byte[] digest = sha256(verifier.getBytes(StandardCharsets.UTF_8));
    String challenge = Base64.getUrlEncoder().withoutPadding().encodeToString(digest);

    Map<String, String> params = new HashMap<>();
    params.put("response_type", "code");
    params.put("client_id", clientId);
    params.put("redirect_uri", redirectUrl);
    params.put("scope", String.join(" ", scopes));
    params.put("state", state);
    params.put("code_challenge", challenge);
    params.put("code_challenge_method", "S256");

    String url = urlEncode(authUrl, params);

    return new Consent.Builder()
        .withClientId(clientId)
        .withClientSecret(clientSecret)
        .withAuthUrl(url)
        .withTokenUrl(tokenUrl)
        .withRedirectUrl(redirectUrl)
        .withState(state)
        .withVerifier(verifier)
        .withHttpClient(hc)
        .build();
  }
}
