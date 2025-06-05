// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateCustomAppIntegrationPb {
  @JsonProperty("confidential")
  private Boolean confidential;

  @JsonProperty("name")
  private String name;

  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  @JsonProperty("scopes")
  private Collection<String> scopes;

  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  @JsonProperty("user_authorized_scopes")
  private Collection<String> userAuthorizedScopes;

  public CreateCustomAppIntegrationPb setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  public Boolean getConfidential() {
    return confidential;
  }

  public CreateCustomAppIntegrationPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCustomAppIntegrationPb setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public CreateCustomAppIntegrationPb setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public CreateCustomAppIntegrationPb setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  public CreateCustomAppIntegrationPb setUserAuthorizedScopes(
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
    CreateCustomAppIntegrationPb that = (CreateCustomAppIntegrationPb) o;
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
    return new ToStringer(CreateCustomAppIntegrationPb.class)
        .add("confidential", confidential)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("scopes", scopes)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .add("userAuthorizedScopes", userAuthorizedScopes)
        .toString();
  }
}
