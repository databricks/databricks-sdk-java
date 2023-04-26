// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdatePublishedAppIntegration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdatePublishedAppIntegration {
  /** The oauth app integration ID. */
  private String integrationId;

  /** Token access policy to be updated in the published oauth app integration */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * <p>Setter for the field <code>integrationId</code>.</p>
   *
   * @param integrationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.oauth2.UpdatePublishedAppIntegration} object
   */
  public UpdatePublishedAppIntegration setIntegrationId(String integrationId) {
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
   * <p>Setter for the field <code>tokenAccessPolicy</code>.</p>
   *
   * @param tokenAccessPolicy a {@link com.databricks.sdk.service.oauth2.TokenAccessPolicy} object
   * @return a {@link com.databricks.sdk.service.oauth2.UpdatePublishedAppIntegration} object
   */
  public UpdatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    UpdatePublishedAppIntegration that = (UpdatePublishedAppIntegration) o;
    return Objects.equals(integrationId, that.integrationId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(integrationId, tokenAccessPolicy);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdatePublishedAppIntegration.class)
        .add("integrationId", integrationId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
