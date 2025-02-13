// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateCustomAppIntegration {
  /**
   * This field indicates whether an OAuth client secret is required to authenticate this client.
   */
  @JsonProperty("confidential")
  private Boolean confidential;

  /** Name of the custom OAuth app */
  @JsonProperty("name")
  private String name;

  /** List of OAuth redirect urls */
  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  /**
   * OAuth scopes granted to the application. Supported scopes: all-apis, sql, offline_access,
   * openid, profile, email.
   */
  @JsonProperty("scopes")
  private Collection<String> scopes;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * Scopes that will need to be consented by end user to mint the access token. If the user does
   * not authorize the access token will not be minted. Must be a subset of scopes.
   */
  @JsonProperty("user_authorized_scopes")
  private Collection<String> userAuthorizedScopes;

  public CreateCustomAppIntegration setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  public Boolean getConfidential() {
    return confidential;
  }

  public CreateCustomAppIntegration setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCustomAppIntegration setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public CreateCustomAppIntegration setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public CreateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  public CreateCustomAppIntegration setUserAuthorizedScopes(
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
    CreateCustomAppIntegration that = (CreateCustomAppIntegration) o;
    return Objects.equals(confidential, that.confidential)
        && Objects.equals(name, that.name)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy)
        && Objects.equals(userAuthorizedScopes, that.userAuthorizedScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidential, name, redirectUrls, scopes, tokenAccessPolicy, userAuthorizedScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomAppIntegration.class)
        .add("confidential", confidential)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("scopes", scopes)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .add("userAuthorizedScopes", userAuthorizedScopes)
        .toString();
  }
}
