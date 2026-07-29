// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Direct form of Azure OpenAI provider config. Exactly one of three mutually-exclusive auth modes
 * must be supplied on Create: - API key: set `api_key`, leave the Entra fields and
 * `service_credential` unset. - Entra ID (service principal): set all of `tenant_id`, `client_id`,
 * and `client_secret`, leave `api_key` and `service_credential` unset. - UC service credential: set
 * `service_credential.name` to the AIP-122 resource-name form `credentials/{name}`, leave `api_key`
 * and all Entra fields unset. The credential value lives in UC and is referenced by name, not held
 * on this message. Only supported on Azure-hosted workspaces. Setting more than one mode, or an
 * incomplete Entra triple, is rejected.
 */
@Generated
public class ModelProviderServiceConfigAzureOpenAiProviderDirectConfig {
  /**
   * Azure OpenAI API key. Mutually exclusive with the Entra fields. Supplied as inline plaintext
   * via `ProviderSecret.plaintext`.
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
   * Entra ID client (application) ID for service-principal auth. Set together with `tenant_id` and
   * `client_secret`; mutually exclusive with `api_key` and `service_credential`.
   */
  @JsonProperty("client_id")
  private String clientId;

  /**
   * Entra ID client secret for service-principal auth. Set together with `tenant_id` and
   * `client_id`; mutually exclusive with `api_key` and `service_credential`. Supplied as inline
   * plaintext via `ProviderSecret.plaintext`.
   */
  @JsonProperty("client_secret")
  private ModelProviderServiceConfigProviderSecret clientSecret;

  /**
   * Reference to a UC service credential authorizing Azure OpenAI requests. On Create the caller
   * supplies `service_credential.name` in the AIP-122 resource-name form `credentials/{name}`.
   * Required on Create when using UC-service-credential auth; mutually exclusive with `api_key` and
   * with the Entra triple (tenant_id + client_id + client_secret). The credential is referenced by
   * name; its value is not carried here. On read the resolved `id` and `is_deleted` are also
   * populated. Only supported on Azure-hosted workspaces; Create requests from other clouds are
   * rejected with INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("service_credential")
  private ModelProviderServiceConfigServiceCredential serviceCredential;

  /**
   * Entra ID (Azure AD) tenant ID for service-principal auth. Set together with `client_id` and
   * `client_secret`; mutually exclusive with `api_key` and `service_credential`.
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
        && Objects.equals(serviceCredential, that.serviceCredential)
        && Objects.equals(tenantId, that.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, baseUrl, clientId, clientSecret, serviceCredential, tenantId);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAzureOpenAiProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("baseUrl", baseUrl)
        .add("clientId", clientId)
        .add("clientSecret", clientSecret)
        .add("serviceCredential", serviceCredential)
        .add("tenantId", tenantId)
        .toString();
  }
}
