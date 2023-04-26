package com.databricks.sdk.client.oauth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.MalformedURLException;

/**
 * Data class modelling the set of OpenID Connect endpoints, as defined in <a
 * href="https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderConfigurationRequest">the
 * OIDC spec</a>.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenIDConnectEndpoints {
  private String tokenEndpoint;

  private String authorizationEndpoint;

  /**
   * <p>Constructor for OpenIDConnectEndpoints.</p>
   *
   * @param tokenEndpoint a {@link java.lang.String} object
   * @param authorizationEndpoint a {@link java.lang.String} object
   * @throws java.net.MalformedURLException if any.
   */
  public OpenIDConnectEndpoints(
      @JsonProperty("token_endpoint") String tokenEndpoint,
      @JsonProperty("authorization_endpoint") String authorizationEndpoint)
      throws MalformedURLException {
    this.tokenEndpoint = tokenEndpoint;
    this.authorizationEndpoint = authorizationEndpoint;
  }

  /**
   * <p>Getter for the field <code>tokenEndpoint</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  /**
   * <p>Getter for the field <code>authorizationEndpoint</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }
}
