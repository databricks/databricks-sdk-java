// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CreateCustomAppIntegration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateCustomAppIntegration {
  /** indicates if an oauth client-secret should be generated */
  @JsonProperty("confidential")
  private Boolean confidential;

  /** name of the custom oauth app */
  @JsonProperty("name")
  private String name;

  /** List of oauth redirect urls */
  @JsonProperty("redirect_urls")
  private Collection<String> redirectUrls;

  /** Token access policy */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * <p>Setter for the field <code>confidential</code>.</p>
   *
   * @param confidential a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegration} object
   */
  public CreateCustomAppIntegration setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  /**
   * <p>Getter for the field <code>confidential</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getConfidential() {
    return confidential;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegration} object
   */
  public CreateCustomAppIntegration setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>redirectUrls</code>.</p>
   *
   * @param redirectUrls a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegration} object
   */
  public CreateCustomAppIntegration setRedirectUrls(Collection<String> redirectUrls) {
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
   * @return a {@link com.databricks.sdk.service.oauth2.CreateCustomAppIntegration} object
   */
  public CreateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    CreateCustomAppIntegration that = (CreateCustomAppIntegration) o;
    return Objects.equals(confidential, that.confidential)
        && Objects.equals(name, that.name)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(confidential, name, redirectUrls, tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateCustomAppIntegration.class)
        .add("confidential", confidential)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
