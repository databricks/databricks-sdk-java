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
 * `api_key` and `service_credential` unset. - Unity Catalog service credential: set
 * `service_credential.name` to the resource name `credentials/{name}`, leave `api_key` and
 * `entra_service_principal` unset. The credential value lives in Unity Catalog and is referenced by
 * name, not held on this message. Only supported on Azure-hosted workspaces. Setting more than one
 * mode is rejected.
 */
@Generated
public class ModelProviderServiceConfigAzureOpenAiProviderDirectConfig {
  /**
   * Azure OpenAI API key. Supply the value in `api_key.plaintext`. Mutually exclusive with Entra ID
   * and Unity Catalog service credential authentication.
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
   * Entra ID service-principal authentication. Set `tenant_id`, `client_id`, and
   * `client_secret.plaintext`. Mutually exclusive with `api_key` and `service_credential`.
   */
  @JsonProperty("entra_service_principal")
  private ModelProviderServiceConfigEntraServicePrincipal entraServicePrincipal;

  /**
   * Reference to a Unity Catalog service credential authorizing Azure OpenAI requests. On Create,
   * supply `service_credential.name` in the form `credentials/{name}`. Required on Create when
   * using service-credential authentication; mutually exclusive with `api_key` and
   * `entra_service_principal`. The credential is referenced by name; its value is not carried here.
   * Only supported on Azure-hosted workspaces.
   */
  @JsonProperty("service_credential")
  private ModelProviderServiceConfigServiceCredential serviceCredential;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAzureOpenAiProviderDirectConfig that =
        (ModelProviderServiceConfigAzureOpenAiProviderDirectConfig) o;
    return Objects.equals(apiKey, that.apiKey)
        && Objects.equals(baseUrl, that.baseUrl)
        && Objects.equals(entraServicePrincipal, that.entraServicePrincipal)
        && Objects.equals(serviceCredential, that.serviceCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, baseUrl, entraServicePrincipal, serviceCredential);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAzureOpenAiProviderDirectConfig.class)
        .add("apiKey", apiKey)
        .add("baseUrl", baseUrl)
        .add("entraServicePrincipal", entraServicePrincipal)
        .add("serviceCredential", serviceCredential)
        .toString();
  }
}
