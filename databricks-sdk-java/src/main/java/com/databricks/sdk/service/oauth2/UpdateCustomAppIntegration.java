// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdateCustomAppIntegration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateCustomAppIntegration {
  /** The oauth app integration ID. */
  private String integrationId;

  /** List of oauth redirect urls to be updated in the custom oauth app integration */
  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  /** Token access policy to be updated in the custom oauth app integration */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * <p>Setter for the field <code>integrationId</code>.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.UpdateCustomAppIntegration} object
   */
  public UpdateCustomAppIntegration setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>integrationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getIntegrationId() {
    return integrationId;
  }

  /**
   * <p>Setter for the field <code>redirectUrls</code>.</p>
   *
   * @param redirectUrls a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.oauth2.UpdateCustomAppIntegration} object
   */
  public UpdateCustomAppIntegration setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  /**
   * <p>Getter for the field <code>redirectUrls</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  /**
   * <p>Setter for the field <code>tokenAccessPolicy</code>.</p>
   *
   * @param tokenAccessPolicy a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   * @return a {@link com.databricks.sdk.service.oauth2.UpdateCustomAppIntegration} object
   */
  public UpdateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    UpdateCustomAppIntegration that = (UpdateCustomAppIntegration) o;
    return Objects.equals(integrationId, that.integrationId)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(integrationId, redirectUrls, tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateCustomAppIntegration.class)
        .add("integrationId", integrationId)
        .add("redirectUrls", redirectUrls)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
