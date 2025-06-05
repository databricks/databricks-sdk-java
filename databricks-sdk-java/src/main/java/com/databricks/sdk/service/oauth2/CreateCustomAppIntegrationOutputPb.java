// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateCustomAppIntegrationOutputPb {
  @JsonProperty("client_id")
  private String clientId;

  @JsonProperty("client_secret")
  private String clientSecret;

  @JsonProperty("integration_id")
  private String integrationId;

  public CreateCustomAppIntegrationOutputPb setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public CreateCustomAppIntegrationOutputPb setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public CreateCustomAppIntegrationOutputPb setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCustomAppIntegrationOutputPb that = (CreateCustomAppIntegrationOutputPb) o;
    return Objects.equals(clientId, that.clientId)
        && Objects.equals(clientSecret, that.clientSecret)
        && Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomAppIntegrationOutputPb.class)
        .add("clientId", clientId)
        .add("clientSecret", clientSecret)
        .add("integrationId", integrationId)
        .toString();
  }
}
