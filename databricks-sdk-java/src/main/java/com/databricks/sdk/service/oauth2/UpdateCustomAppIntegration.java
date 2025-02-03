// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateCustomAppIntegration {
  /** */
  @JsonIgnore private String integrationId;

  /** List of OAuth redirect urls to be updated in the custom OAuth app integration */
  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  /**
   * List of OAuth scopes to be updated in the custom OAuth app integration, similar to redirect
   * URIs this will fully replace the existing values instead of appending
   */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  /** Token access policy to be updated in the custom OAuth app integration */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * Scopes that will need to be consented by end user to mint the access token. If the user does
   * not authorize the access token will not be minted. Must be a subset of scopes.
   */
  @JsonProperty("user_authorized_scopes")
  private Collection<String> userAuthorizedScopes;

  public UpdateCustomAppIntegration setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public UpdateCustomAppIntegration setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public UpdateCustomAppIntegration setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public UpdateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  public UpdateCustomAppIntegration setUserAuthorizedScopes(
      Collection<String> userAuthorizedScopes) {
    this.userAuthorizedScopes = userAuthorizedScopes;
    return this;
  }

  public Collection<String> getUserAuthorizedScopes() {
    return userAuthorizedScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCustomAppIntegration that = (UpdateCustomAppIntegration) o;
    return Objects.equals(integrationId, that.integrationId)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy)
        && Objects.equals(userAuthorizedScopes, that.userAuthorizedScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        integrationId, redirectUrls, scopes, tokenAccessPolicy, userAuthorizedScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCustomAppIntegration.class)
        .add("integrationId", integrationId)
        .add("redirectUrls", redirectUrls)
        .add("scopes", scopes)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .add("userAuthorizedScopes", userAuthorizedScopes)
        .toString();
  }
}
