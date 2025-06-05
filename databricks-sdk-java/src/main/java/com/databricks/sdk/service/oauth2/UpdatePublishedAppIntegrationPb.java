// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdatePublishedAppIntegrationPb {
  @JsonIgnore private String integrationId;

  @JsonProperty("token_access_policy")
  private TokenAccessPolicy tokenAccessPolicy;

  public UpdatePublishedAppIntegrationPb setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public UpdatePublishedAppIntegrationPb setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
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
    UpdatePublishedAppIntegrationPb that = (UpdatePublishedAppIntegrationPb) o;
    return Objects.equals(integrationId, that.integrationId)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, tokenAccessPolicy);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdatePublishedAppIntegrationPb.class)
        .add("integrationId", integrationId)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .toString();
  }
}
