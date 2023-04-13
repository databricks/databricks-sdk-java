// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdatePublishedAppIntegration {
  /** The oauth app integration ID. */
  private String integrationId;

  /** Token access policy to be updated in the published oauth app integration */
  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public UpdatePublishedAppIntegration setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public UpdatePublishedAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    UpdatePublishedAppIntegration that = (UpdatePublishedAppIntegration) o;
    return Objects.equals(integrationId, that.integrationId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePublishedAppIntegration.class)
        .add("integrationId", integrationId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
