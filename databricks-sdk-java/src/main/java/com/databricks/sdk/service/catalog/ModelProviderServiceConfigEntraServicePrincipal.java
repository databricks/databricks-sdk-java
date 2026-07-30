// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Entra ID (Azure AD) service-principal auth: AI Gateway exchanges the `tenant_id` + `client_id`
 * identify the service principal, and the `credential` oneof proves that identity, exchanged for an
 * Entra bearer token on outbound requests via the OAuth2 client-credentials grant. Shared by the
 * Azure OpenAI and Microsoft Foundry provider configs.
 */
@Generated
public class ModelProviderServiceConfigEntraServicePrincipal {
  /** Entra ID client (application) ID. Required on Create. */
  @JsonProperty("client_id")
  private String clientId;

  /** Entra ID client secret. Supplied as inline plaintext via `ProviderSecret.plaintext`. */
  @JsonProperty("client_secret")
  private ModelProviderServiceConfigProviderSecret clientSecret;

  /** Entra ID (Azure AD) tenant ID. Required on Create. */
  @JsonProperty("tenant_id")
  private String tenantId;

  public ModelProviderServiceConfigEntraServicePrincipal setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public ModelProviderServiceConfigEntraServicePrincipal setClientSecret(
      ModelProviderServiceConfigProviderSecret clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getClientSecret() {
    return clientSecret;
  }

  public ModelProviderServiceConfigEntraServicePrincipal setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public String getTenantId() {
    return tenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigEntraServicePrincipal that =
        (ModelProviderServiceConfigEntraServicePrincipal) o;
    return Objects.equals(clientId, that.clientId)
        && Objects.equals(clientSecret, that.clientSecret)
        && Objects.equals(tenantId, that.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, tenantId);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigEntraServicePrincipal.class)
        .add("clientId", clientId)
        .add("clientSecret", clientSecret)
        .add("tenantId", tenantId)
        .toString();
  }
}
