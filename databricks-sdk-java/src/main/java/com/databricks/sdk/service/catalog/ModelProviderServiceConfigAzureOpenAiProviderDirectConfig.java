// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct form of Azure OpenAI provider config. Exactly one of three mutually-exclusive auth modes
 * must be supplied on Create: - API key: set `api_key`, leave `entra_service_principal` and
 * `service_credential` unset. - Entra ID (service principal): set `entra_service_principal`, leave
 * `api_key` and `service_credential` unset. - UC service credential: set `service_credential.name`
 * to the AIP-122 resource-name form `credentials/{name}`, leave `api_key` and
 * `entra_service_principal` unset. The credential value lives in UC and is referenced by name, not
 * held on this message. Only supported on Azure-hosted workspaces. Setting more than one mode is
 * rejected.
 */
@Generated
public class ModelProviderServiceConfigAzureOpenAiProviderDirectConfig {
  /**
   * Azure OpenAI API key. Mutually exclusive with the Entra and service-credential modes. Supplied
   * as inline plaintext via `ProviderSecret.plaintext`.
   */
  @JsonProperty("api_key")
  private ModelProviderServiceConfigProviderSecret apiKey;

  /**
   * Full Azure OpenAI endpoint base URL, e.g. `https://myresource.openai.azure.com`. Required on
   * Create.
   */
  @JsonProperty("base_url")
  private String baseUrl;

  /**
   * Deprecated flat Entra client ID. Superseded by `entra_service_principal.client_id`. Kept for
   * one migration cycle; the handler mirrors it to/from `entra_service_principal`.
   */
  @JsonProperty("client_id")
  private String clientId;

  /**
   * Deprecated flat Entra client secret. Superseded by `entra_service_principal.client_secret`.
   * Kept for one migration cycle; the handler mirrors it to/from `entra_service_principal`.
   * Supplied as inline plaintext via `ProviderSecret.plaintext`.
   */
  @JsonProperty("client_secret")
  private ModelProviderServiceConfigProviderSecret clientSecret;

  /**
   * Entra ID (service principal) auth. Mutually exclusive with `api_key` and `service_credential`.
   * Supersedes the flat `tenant_id` / `client_id` / `client_secret` fields.
   */
  @JsonProperty("entra_service_principal")
  private ModelProviderServiceConfigEntraServicePrincipal entraServicePrincipal;

  /**
   * Reference to a UC service credential authorizing Azure OpenAI requests. On Create the caller
   * supplies `service_credential.name` in the AIP-122 resource-name form `credentials/{name}`.
   * Required on Create when using UC-service-credential auth; mutually exclusive with `api_key` and
   * `entra_service_principal`. The credential is referenced by name; its value is not carried here.
   * On read the resolved `id` and `is_deleted` are also populated. Only supported on Azure-hosted
   * workspaces; Create requests from other clouds are rejected with INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("service_credential")
  private ModelProviderServiceConfigServiceCredential serviceCredential;

  /**
   * Deprecated flat Entra tenant ID. Superseded by `entra_service_principal.tenant_id`. Kept for
   * one migration cycle; the handler mirrors it to/from `entra_service_principal`.
   */
  @JsonProperty("tenant_id")
  private String tenantId;

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig setApiKey(
      ModelProviderServiceConfigProviderSecret apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getApiKey() {
    return apiKey;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig setClientSecret(
      ModelProviderServiceConfigProviderSecret clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public ModelProviderServiceConfigProviderSecret getClientSecret() {
    return clientSecret;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig setEntraServicePrincipal(
      ModelProviderServiceConfigEntraServicePrincipal entraServicePrincipal) {
    this.entraServicePrincipal = entraServicePrincipal;
    return this;
  }

  public ModelProviderServiceConfigEntraServicePrincipal getEntraServicePrincipal() {
    return entraServicePrincipal;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig setServiceCredential(
      ModelProviderServiceConfigServiceCredential serviceCredential) {
    this.serviceCredential = serviceCredential;
    return this;
  }

  public ModelProviderServiceConfigServiceCredential getServiceCredential() {
    return serviceCredential;
  }

  public ModelProviderServiceConfigAzureOpenAiProviderDirectConfig setTenantId(String tenantId) {
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
    ModelProviderServiceConfigAzureOpenAiProviderDirectConfig that =
        (ModelProviderServiceConfigAzureOpenAiProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey)
        && Objects.equals(baseUrl, that.baseUrl)
        && Objects.equals(clientId, that.clientId)
        && Objects.equals(clientSecret, that.clientSecret)
        && Objects.equals(entraServicePrincipal, that.entraServicePrincipal)
        && Objects.equals(serviceCredential, that.serviceCredential)
        && Objects.equals(tenantId, that.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiKey,
        baseUrl,
        clientId,
        clientSecret,
        entraServicePrincipal,
        serviceCredential,
        tenantId);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAzureOpenAiProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("baseUrl", baseUrl)
        .add("clientId", clientId)
        .add("clientSecret", clientSecret)
        .add("entraServicePrincipal", entraServicePrincipal)
        .add("serviceCredential", serviceCredential)
        .add("tenantId", tenantId)
        .toString();
  }
}
