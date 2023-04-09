// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class UpdateCustomAppIntegration {
  /** The oauth app integration ID. */
  private String integrationId;

  /** List of oauth redirect urls to be updated in the custom oauth app integration */
  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  /** Token access policy to be updated in the custom oauth app integration */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

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

  public UpdateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCustomAppIntegration that = (UpdateCustomAppIntegration) o;
    return Objects.equals(integrationId, that.integrationId)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, redirectUrls, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCustomAppIntegration.class)
        .add("integrationId", integrationId)
        .add("redirectUrls", redirectUrls)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
