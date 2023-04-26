// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreatePublishedAppIntegration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreatePublishedAppIntegration {
  /** app_id of the oauth published app integration. For example power-bi, tableau-deskop */
  @JsonProperty("app_id")
  private String appId;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * <p>Setter for the field <code>appId</code>.</p>
   *
   * @param appId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreatePublishedAppIntegration} object
   */
  public CreatePublishedAppIntegration setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <p>Getter for the field <code>appId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAppId() {
    return appId;
  }

  /**
   * <p>Setter for the field <code>tokenAccessPolicy</code>.</p>
   *
   * @param tokenAccessPolicy a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreatePublishedAppIntegration} object
   */
  public CreatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokenAccessPolicy</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   */
  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePublishedAppIntegration that = (CreatePublishedAppIntegration) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(appId, tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreatePublishedAppIntegration.class)
        .add("appId", appId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
