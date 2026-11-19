// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreatePublishedAppIntegration {
  /**
   * ID of the published OAuth app to enable, as returned in app_id by the list of published OAuth
   * apps. The short legacy IDs of the original published apps, such as power-bi and
   * tableau-desktop, are also accepted. The request fails if the app is already enabled for the
   * account.
   */
  @JsonProperty("app_id")
  private String appId;

  /**
   * Lifetimes of the tokens issued to the app. If omitted, the app's default token lifetimes apply.
   * If set, both TTL fields are required.
   */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public CreatePublishedAppIntegration setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public CreatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    CreatePublishedAppIntegration that = (CreatePublishedAppIntegration) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePublishedAppIntegration.class)
        .add("appId", appId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
